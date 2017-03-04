package PDDL4J.antlr_parser;


import java.io.*;
import java.util.*;
import java.util.logging.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import pddl4j.*;
import pddl4j.exp.*;
import pddl4j.exp.term.*;
import pddl4j.exp.type.*;
import pddl4j.exp.fexp.*;
import pddl4j.exp.fcomp.*;
import pddl4j.exp.assign.*;
import pddl4j.exp.time.*;

import PDDL4J.antlr_gen.*;
import static PDDL4J.antlr_gen.PddlParser.*;


/**
 * Base class for building problem and domain descriptions.
 *
 * A note to all parentVars parameters: All variables that are bound by parent expressions have to be contained,
 * to ensure type consistency. If this is set to null, it means that in case this expression is to be evaluated on an existing
 * predicate/function, the variables bound by this predicate are to be used.
 *
 * @author Jennifer Buehler, modified and based on code written by Zeyn Saigol
 * http://www.zeynsaigol.com/software/graphplanner.html
 */
public abstract class ANTLRBuilder
{
	private static final Logger logger = Logger.getLogger(ANTLRBuilder.class.getName());
	
	protected File pddlFile;
	protected CommonTree docRoot;
	
	public ANTLRBuilder(File pddlFile)
	{
		this.pddlFile = pddlFile;
	}
	
	protected void parseDocument() throws IOException, PDDLSyntaxException
	{
		//logger.info("Parsing PDDL file '" + pddlFile + "'");
		
		CharStream input = new ANTLRFileStream(pddlFile.getPath());
		PddlLexer lex = new PddlLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lex);

		PddlParser parser = new PddlParser(tokens);
		
		try {
			PddlParser.pddlDoc_return t = parser.pddlDoc();
			docRoot = (CommonTree) t.getTree();
			
			if (parser.invalidGrammar()) {
				throw new PDDLSyntaxException();
			}
			
		} catch (RecognitionException e) {
			// This won't generally happen, as @rulecatch {} is not defined in the grammar file,
			// so the default ANTLR exception handler will be used and exceptions quashed.
			throw new PDDLSyntaxException(e);
		}
		//System.out.println("PDDL "+pddlFile+" parsed."); 
		//logger.fine("PDDL "+pddlFile+" parsed."); 
	}

	protected void addRequirements(Tree reqs, PDDLBase pddlObj)
	{
		for (int i=0; i < reqs.getChildCount(); i++) {
			final Tree req = reqs.getChild(i);
			pddlObj.addRequirement(RequireKey.getRequireKey(req.getText()));
		}
		//System.out.println("Require: "+pddlObj);
		logger.fine("Requirements=" + pddlObj);
	}

	protected abstract AtomicFormula findPredicate(final String predName, PDDLBase dom) throws InvalidPDDLElementException;
	protected abstract Constant findConstant(final String cName, final PDDLBase dom);
	protected abstract FHead findFunction(final String funcName, PDDLBase dom) throws InvalidPDDLElementException;

	protected Exp buildLogicExpr(Tree gdNode, PDDLBase dom, Set<Variable> parentVars) throws InvalidPDDLElementException
	{
		//System.out.println("Build logic"+gdNode.getText());
		Exp ret=null;
		final int type = gdNode.getType();
		switch (type) {
		case PRED_HEAD:
			//System.out.println("Predicate for ----------------"+gdNode.getText());
			ret=buildPredicateGoal(gdNode,dom,parentVars);
			break;
		case COMPARISON_EXP:
			//System.out.println("Comparison for ----------------"+gdNode.getText());
			ret=buildComparisonLogicExpr(gdNode,dom,parentVars);
			break;
		case AND_EXP:
		case AND_EFFECT:
			//System.out.println("AND for ----------------"+gdNode.getText());
			ret=buildListedLogicExpr(gdNode,dom,parentVars,true);
			break;
		case OR_EXP:
			ret=buildListedLogicExpr(gdNode,dom,parentVars,false);
			break;
		case NOT_EXP:
			//System.out.println("NOT for ----------------"+gdNode.getText());
			ret=buildNegatedLogicExpr(gdNode,dom,parentVars);
			break;
		case IMPLY_EXP:
			ret=buildImplyLogicExpr(gdNode,dom,parentVars);
			break;
		case EXISTS_EXP:
			ret=buildQuantifiedLogicExpr(gdNode,dom,parentVars,false);
			break;
		case FORALL_EXP:
			ret=buildQuantifiedLogicExpr(gdNode,dom,parentVars,true);
			break;
		case WHEN_EXP:
			ret=buildWhenExpr(gdNode,dom,parentVars);
			break;
		default:
			throw new InvalidPDDLElementException("Unknown LogicExpr node: " + gdNode.getText());
		}
			
		logger.fine("Logic expression: "+ret);   
		return ret; 
	}

	protected Exp buildDurativeLogicExpr(Tree gdNode, PDDLBase dom, Set<Variable> parentVars) throws InvalidPDDLElementException
	{
		Exp ret=null;
		final int type = gdNode.getType();
		switch (type) {
		case TIMED_EXP:
			int numChilds=gdNode.getChildCount();
			if (numChilds<3) 
				throw new InvalidPDDLElementException("Timed expression must have 3 or more children! Has "+numChilds+": line "+gdNode.getLine());
			Tree nameC=gdNode.getChild(0);
			Tree timeOp=gdNode.getChild(1);
			Tree timeExp=gdNode.getChild(2);
			String name="";
			if (nameC.getChildCount()!=0) {
				name=nameC.getChild(0).getText();
				//System.out.println("With name "+name);
			}
			Exp e=buildLogicExpr(timeExp,dom,parentVars);
			String timeSpec=timeOp.getText();	
			if (timeSpec.equals("start")) {
				ret=new AtStartTimedExp(e);
			}else if (timeSpec.equals("end")) {
				ret=new AtEndTimedExp(e);
			}else if (timeSpec.equals("all")) {
				ret=new OverAllTimedExp(e);
			}else{		
				throw new InvalidPDDLElementException("Unknown time specifier "+timeSpec);
			}	
			//System.out.println("Timed exp: "+timeSpec+", "+ret);
			break;
		case AND_EXP:
			if (gdNode.getChildCount()==0) throw new InvalidPDDLElementException("Timed AND expression has no children"+": line "+gdNode.getLine());
			AndExp and=new AndExp();
			for (int i=0; i<gdNode.getChildCount(); ++i) {
				Exp exp=buildDurativeLogicExpr(gdNode.getChild(i),dom,parentVars);
				and.add(exp);
			}
			ret=and;
			break;
		case FORALL_EXP:
			if (gdNode.getChildCount()==0) throw new InvalidPDDLElementException("Timed FORALL expression has no children"+": line "+gdNode.getLine());
			throw new RuntimeException("FORALL not supported yet! "+getClass().getName());
		case WHEN_EXP:
			ret=buildDurativeWhenEffect(gdNode, dom, parentVars);
			break;
		default:
			throw new InvalidPDDLElementException("Unknown LogicExpr node: " + gdNode.getText());
		}
		
		logger.fine("Logic expression: "+ret);   
		return ret; 
	}

	protected WhenExp buildWhenExpr(Tree gdNode, PDDLBase base, Set<Variable> parentVars) throws InvalidPDDLElementException
	{
		if (gdNode.getChildCount()!=2) 
			throw new InvalidPDDLElementException("WHEN not well defined ("+gdNode.getChildCount()+", line "+gdNode.getLine());

		Tree logicNode1=gdNode.getChild(0);
		Exp head = buildLogicExpr(logicNode1,base,parentVars);

		Tree logicNode2=gdNode.getChild(1);
		Exp body = buildEffect(logicNode2,base,parentVars);
		
		WhenExp ret=new WhenExp(head, body);		

		//System.out.println("When built: "+ret.toTypedString());
		logger.fine("WhenExpr=" + ret);
		return ret;
	}

	protected ImplyExp buildImplyLogicExpr(Tree gdNode, PDDLBase base, Set<Variable> parentVars) throws InvalidPDDLElementException
	{
		if (gdNode.getChildCount()!=2) 
			throw new InvalidPDDLElementException("Imply not well defined ("+gdNode.getChildCount()+", line "+gdNode.getLine());
		Tree logicNode1=gdNode.getChild(0);
		Exp head = buildLogicExpr(logicNode1,base,parentVars);

		Tree logicNode2=gdNode.getChild(1);
		Exp body = buildLogicExpr(logicNode2,base,parentVars);

		
		ImplyExp ret=new ImplyExp(head, body);		

		//System.out.println("Imply built: "+ret.toTypedString());
		logger.fine("ImplyExpr=" + ret);
		return ret;
	}

	//@param all if set to true, it is a forall statement, otherwise it is an exists statement
	protected QuantifiedExp buildQuantifiedLogicExpr(Tree gdNode, PDDLBase base, Set<Variable> parentVars, boolean all) throws InvalidPDDLElementException
	{
		if (gdNode.getChildCount()!=2) 
			throw new InvalidPDDLElementException("QuantifiedExpr not well defined ("+gdNode.getChildCount()+", line "+gdNode.getLine());

		Tree paramNode=gdNode.getChild(0);
		if (paramNode.getType()!=PARAMS) {
			throw new InvalidPDDLElementException("QuantifiedExpr not a PARAM node (but "+gdNode.getText()+" - "+paramNode.getText()+", line "+gdNode.getLine());
		}

		
		QuantifiedExp ret=null;
		if (all) ret=new ForallExp();		
		else ret=new ExistsExp();

		//System.out.println("Quant "+paramNode.getText()+": parent vars "+parentVars);
	
		
		//copy parent variables as we might need to add more to pass to the body of the expression
		Set<Variable> newParentVars=new LinkedHashSet<Variable>();
		List<Term> arguments=absTermParameterListTypeChecked(paramNode,base,parentVars,newParentVars);
	
		for (Term arg : arguments) {
			if (arg.getTermID()!=TermID.VARIABLE) {
				throw new InvalidPDDLElementException("Only variables supported for FORALL expressions");
			}
			Variable argCopy=(Variable) arg;
			ret.add(argCopy);
		}

		Tree logicNode=gdNode.getChild(1);

		Exp body = buildLogicExpr(logicNode,base,newParentVars);

		ret.setExp(body);

		//System.out.println("Quantified built: "+ret.toTypedString());
		logger.fine("QuantifiedExpr=" + ret);
		return ret;
	}

	protected AtomicFormula buildPredicateGoal(Tree gdNode, PDDLBase base, Set<Variable> parentVars) throws InvalidPDDLElementException
	{
		if (gdNode.getChildCount()!=2) 
			throw new InvalidPDDLElementException("Predicate not well defined"+" line "+gdNode.getLine());


		String name = gdNode.getChild(0).getText();
		name = Domain.CASE_SENSITIVE ? name : name.toLowerCase();

		Tree paramNode=gdNode.getChild(1);
		AtomicFormula origPredicate = findPredicate(name,base);
		if (origPredicate==null) throw new InvalidPDDLElementException("original predicate "+name+" not found. "+" line "+gdNode.getLine());
	
		if (paramNode.getChildCount() != origPredicate.getArity()) {
			throw new InvalidPDDLElementException("Wrong number of arguments (in child node) used for predicate "+ 
				name + ": "+paramNode.getChildCount()+", expected: "+origPredicate.getArity()+" line "+paramNode.getLine());
		}

		AtomicFormula ret=new AtomicFormula(name);

		if (parentVars==null) parentVars=origPredicate.getFreeVariables();	
		
		//System.out.println("Goal predicate: "+origPredicate+" parent vars "+parentVars);
	
		List<Term> arguments=absTermParameterList(paramNode, base,parentVars);
	
		Iterator<Term> oaIt=origPredicate.iterator();
		//Already have made sure that arguments are of same size than original. Now just do type checks as well.
		for (Term arg : arguments) {
			//System.out.println("Arg: "+arg.toTypedString());
			if (!oaIt.hasNext()) throw new InvalidPDDLElementException("Wrong number of arguments. "+" line "+gdNode.getLine()); 
			Type origType=oaIt.next().getType();
			Term argCopy=arg.clone();
			Type argType=arg.getType();
			if ((argType.equals(Type.NUMBER) || argType.isSubTypeOf(Type.NUMBER)) && origType.isSubTypeOf(Type.NUMBER)){
				// XXX added the || argType.isSubTypeOf() so that predicates of number type are ALWAYS the parent predicates
				// FIX: absTermParameterList at this stage is not able to do type checks for numbers so we might have to enforce
				// number types here
				// System.out.println("Goal predicate: Enforcing right number type "+origType+", line "+gdNode.getLine());
				argCopy.setType(origType);
			}else if (!compatibleType(origType,arg.getType())) {
				throw new InvalidPDDLElementException("Argument '"+arg.toTypedString()+"' is not of right type in predicate "
					+name+", should be type "+origType+" or subtype of it. parent vars: "+parentVars+". Line "+gdNode.getLine()); 
			}
			//argCopy.setType(origType);
			ret.add(argCopy);
		}

		//System.out.println("Predicate built: "+ret.toTypedString());

		logger.fine("PredicateExpr=" + ret);
		return ret;
	}

	protected FExp buildFunctionExpr(Tree gdNode, PDDLBase pddlBase, Set<Variable> parentVars) throws InvalidPDDLElementException
	{
		if (gdNode.getChildCount()<1) 
			throw new InvalidPDDLElementException("Function not well defined "+" line "+gdNode.getLine());

	
		String name = gdNode.getChild(0).getText();
		name = Domain.CASE_SENSITIVE ? name : name.toLowerCase();
		//System.out.println("Find function "+name);	
		FHead function = findFunction(name, pddlBase);
		if (function==null)
			throw new InvalidPDDLElementException("Function "+ name+" not defined. "+" line "+gdNode.getLine());

		if (gdNode.getChildCount()==2) {
			Tree paramNode=gdNode.getChild(1);
			if (paramNode.getChildCount() != function.getArity()) {
				throw new InvalidPDDLElementException("Wrong number of arguments used for function "+ name + ": "
					+paramNode.getChildCount()+", expected: "+function.getArity()+" line "+gdNode.getLine());
			}
		}	

		if (gdNode.getChildCount()<2) 
			throw new InvalidPDDLElementException("Malformed function expression, expect a child node: line "+gdNode.getLine());
		FExp ret=buildFunctionHeaderOrInstance(gdNode.getChild(1),function,pddlBase,parentVars);
		logger.fine("Function=" + ret);
		//System.out.println("FunctionExpr=" + ret);
		return ret;
	}


	//scans a list of arguments that is supposed to match a function origFunction. The list of parameters
	//is expected to be a list of objects or a list of variables. In objects (constants) are described in gdNode, 
	//it is checked whether such objects (constants) exist. Otherwise, just a type consistency check is peformed.
	protected FHead buildFunctionHeaderOrInstance(Tree gdNode, final FHead origFunction, PDDLBase base, Set<Variable> parentVars) 
		throws InvalidPDDLElementException {

		FHead ret=new FHead(origFunction.getImage(),origFunction.getType());

		//read the argument list:
		if (parentVars==null) parentVars=origFunction.getFreeVariables();	

		List<Term> arguments=absTermParameterList(gdNode, base, parentVars);

		if (arguments.size()!=origFunction.getArity()) 
			throw new InvalidPDDLElementException("Wrong number of arguments used for function "+ origFunction.getImage() + ": "
				+arguments.size()+", expected: "+origFunction.getArity()+" line "+gdNode.getLine());

		for (int i=0; i<arguments.size(); ++i) {
			Term arg=arguments.get(i);
			if (arg==null) throw new InvalidPDDLElementException("arguments is null?!"+" line "+gdNode.getLine());

			//we have to enforce the type to be of the one in the function, 
			//as the scanning via absTermParameterList could have assumed default object type
			Type absTermType=arg.getType();
			if (absTermType==null) throw new InvalidPDDLElementException("Argument inconsistent type!"+" line "+gdNode.getLine());
			Term origFuncTerm=(Term)origFunction.get(i);
			if (origFuncTerm==null) throw new InvalidPDDLElementException("Original function inconsistent type!"+" line "+gdNode.getLine());

			Type origFuncType=origFuncTerm.getType();
			if (origFuncType==null) throw new InvalidPDDLElementException("Original function null type!"+" line "+gdNode.getLine());
		
			Term argCopy=arg.clone();	

			if (!absTermType.isSubTypeOf(origFuncType)){
				System.out.println("Enforcing type "+absTermType+" to be the original funcions parameter's "
					+origFuncType+". Function: "+origFunction+". Line: "+gdNode.getLine());
				argCopy.setType(origFuncType);
			}
			ret.add(argCopy);
		}
		return ret;
	}

	private Exp buildComparisonLogicExpr(Tree node, PDDLBase dom, Set<Variable> parentVars) 
		throws InvalidPDDLElementException
	{
		String operator = node.getChild(0).getText().toLowerCase();
		Term firstOperand = buildFExp(node.getChild(1),dom,parentVars,null);
		Term secondOperand = buildFExp(node.getChild(2),dom,parentVars,null);
		//check for a type incompatibility of terms:
		Type t1=null;
		Type t2=null;
		if (firstOperand instanceof AbstractTerm) {
			AbstractTerm op1=(AbstractTerm) firstOperand;
			t1=op1.getType();	
		}
		if (secondOperand instanceof AbstractTerm) {
			AbstractTerm op2=(AbstractTerm) firstOperand;
			t2=op2.getType();
		}
		if ((t1!=null) && (t2==null))
			throw new InvalidPDDLElementException("Incompatible types for expressions "+firstOperand+", "+secondOperand+"=nullType"+" line "+node.getLine()); 
		else if ((t2!=null) && (t1==null))
			throw new InvalidPDDLElementException("Incompatible types for expressions "+firstOperand+"=nullType, "+secondOperand+" line "+node.getLine()); 

		else if ((t1!=null) && (t2!=null)){
			if (!t1.equals(t2) && !firstOperand.equals(Constant.UNDEFINED) && !secondOperand.equals(Constant.UNDEFINED)){
				throw new InvalidPDDLElementException("Incompatible types:  for expressions "+firstOperand+"="+t1+" , "+secondOperand+"="+t2+" line "+node.getLine());
			}

			//XXX because we have a comparison expression, we'll have to do a cast of the number type which is the more specific, to ensure validity...			
	
			//System.out.println("Types for comparison: "+t1+", "+t2+". Line "+node.getLine()); 

			if (!compatibleType(t1,t2) && !compatibleType(t2,t1)) {
				throw new InvalidPDDLElementException("Incompatible types for comparison: "+t1+", "+t2+". Line "+node.getLine()); 
			}


		}else {
			throw new InvalidPDDLElementException("Both expressions have no type?!! "+firstOperand+"=nullType, "+secondOperand+" line "+node.getLine()); 
		}

		//System.out.println("Operator:  "+operator+ "expr1 "+firstOperand+" expr2 "+secondOperand);
		Exp ret=null;
		//System.out.println("Op num:"+op);
		if (operator.equals(">"))
			ret=new GreaterComp(firstOperand,secondOperand);
		else if (operator.equals("<"))
			ret=new LessComp(firstOperand,secondOperand);
		else if (operator.equals(">="))
			ret=new GEqualComp(firstOperand,secondOperand);
		else if (operator.equals("<="))
			ret=new LEqualComp(firstOperand,secondOperand);
		else if (operator.equals("="))
			ret=new EqualComp(firstOperand,secondOperand);
		else
			throw new InvalidPDDLElementException("Unknown operator: " + operator+" line "+node.getLine());
		logger.fine("Comparison logic expression: "+ret);   
		return ret;
	}
	
	//@param and if set to true, it is a conjunction, otherwise a disjunction
	private Exp buildListedLogicExpr(Tree gdNode, PDDLBase dom, Set<Variable> parentVars, boolean and) 
		throws InvalidPDDLElementException
	{
		ListExp res=null;
		if (and) res=new AndExp();
		else res=new OrExp();

		for (int i = 0; i < gdNode.getChildCount(); i++) {
			final Tree subNode = gdNode.getChild(i);
			res.add(buildLogicExpr(subNode,dom, parentVars));
		}
		logger.fine("list expression: "+res);  
		return res;
	}
 
	private Exp buildNegatedLogicExpr(Tree node, PDDLBase dom, Set<Variable> parentVars) throws InvalidPDDLElementException{
		Exp subGoal = buildLogicExpr(node.getChild(0),dom, parentVars);
		return new NotExp(subGoal);
	}



	//builds fExp instances
	//@param optEnforceNumType if the expression is a number, enforce this type of number for it
	protected Term buildFExp(Tree exprNode, PDDLBase dom, Set<Variable> parentVars, Type optEnforceNumType) 
		throws InvalidPDDLElementException
	{
		final int type = exprNode.getType();
		Term t=null;
		switch (type) {
			case VARIABLE:
				String varName=exprNode.getText();
				varName = Domain.CASE_SENSITIVE ? varName : varName.toLowerCase();

				//see first if we have to copy the parent elements variable (incl. its type)
				Variable var = null;
				for (Variable v: parentVars) {
					if (v.getImage().equals(varName)) {
						var=v.clone();
						break;
					}
				}

				//System.out.println("VAR "+varName);
				if (exprNode.getChildCount() == 0) {
					// No type
					//System.out.println("..No type");
					if (var==null) { //parent has no such variable, so create a new
						Type ty=dom.getType(Type.OBJECT_SYMBOL); //assume object symbol
						if (ty==null) throw new InvalidPDDLElementException("Object type not known. line " +exprNode.getLine());
						t = new Variable(varName,ty);
					}else{
						t=var;
					}
				}else{
					Type ty=constructType(exprNode,dom);
					if (ty==null)
						throw new InvalidPDDLElementException("Variable \"" + varName + "\" has unknown type. line "+exprNode.getLine());
					if (var!=null) { //parent already has a variable, so just check here if we have a consistent type
						Variable subVar = new Variable(varName, ty);
						if (!compatibleType(subVar,var))
							throw new InvalidPDDLElementException("Variable \"" + varName + "\" has incompatible type. "+" line "+exprNode.getLine());
						t=var;
					}else{
						t = new Variable(varName, ty);
					}
				}
				break;
			case NAME:
 				String constName=exprNode.getText();
				constName = Domain.CASE_SENSITIVE ? constName : constName.toLowerCase();
				Constant c = findConstant(constName,dom);
				if (c==null) 
					throw new InvalidPDDLElementException("Unknown constant \"" + constName+" line "+exprNode.getLine());
				t=c;
				break;	
			case NUMBER:
				Type numT=Type.NUMBER;
				if (optEnforceNumType!=null) {
					if (!optEnforceNumType.isSubTypeOf(Type.NUMBER)) 
						throw new RuntimeException("Can't enforce a number type "+optEnforceNumType+" which is not a number");
					numT=optEnforceNumType;
				}
				t=new pddl4j.exp.fexp.Number(Float.parseFloat(exprNode.getText()),numT);
				break;
			case BINARY_OP:
				t=buildBinaryOpExpr(exprNode,dom,parentVars); 
				break;
			case UNARY_MINUS:
				throw new InvalidPDDLElementException("Unary expression not supported yet: " + exprNode.getText()+" line "+exprNode.getLine());
				//t=buildUnaryMinusExpr(exprNode, lookup, context);
			case FUNC_HEAD:
				//XXX FIX: a function with no parameters can be mixed up with a constant here.
				//With the current grammar, this can't be distinguished. If we want to support object fluents,
				//we'll have to check here first if there is a constant which matches this name. If there is, we assume
				//it is a constant we are looking for, not a function, because we assume that no constants have the same
				//names as functions.
				if (exprNode.getChildCount()<1) 
					throw new InvalidPDDLElementException("Expression not well defined. "+" line "+exprNode.getLine());
				String cName = exprNode.getChild(0).getText();
				cName = Domain.CASE_SENSITIVE ? cName : cName.toLowerCase();
				t=findConstant(cName,dom);
				if (t==null) t=buildFunctionExpr(exprNode,dom,parentVars);
				break;
			case UNDEFINED:
				t=Constant.UNDEFINED;
				break;
			default:
				throw new InvalidPDDLElementException("Unknown fExp type: " + exprNode.getText()+" line "+exprNode.getLine());
		}
		logger.fine("Numeric expression: "+t);   
		return t;
	}


	//builds fExpDA
	protected Term buildDurativeFExp(Tree exprNode, PDDLBase dom, Set<Variable> parentVars, Type optEnforceNumType) 
		throws InvalidPDDLElementException
	{
		final int type = exprNode.getType();
		Term t=null;
		switch (type) {
			case VARIABLE: //this must be ?duration
				String varName=exprNode.getText();
				varName = Domain.CASE_SENSITIVE ? varName : varName.toLowerCase();
				//if (!varName.equals("?duration")) throw new InvalidPDDLElementException("Variable should be ?duration");
				if (varName.equals("?duration")) {
					t=new Variable(varName,Type.NUMBER);
				}else{
					for (Variable v: parentVars) {
						if (v.getImage().equals(varName)) {
							t=v.clone();
						}
					}
				}
				if (t==null) throw new InvalidPDDLElementException("Variable should be ?duration or another valid name. "+" line "+exprNode.getLine());
				break;
			case BINARY_OP:
				t=buildDurativeBinaryOpExpr(exprNode,dom,parentVars); 
				break;
			case UNARY_MINUS:
				throw new InvalidPDDLElementException("Unary expression not supported yet: " + exprNode.getText()+" line "+exprNode.getLine());
				//t=buildUnaryMinusExpr(exprNode, lookup, context);
			case CONTINUOUS_EXP:
				if (exprNode.getChildCount()==2){
					Tree timeVar=exprNode.getChild(0);
					Variable v=null;
					if (timeVar.getType()==TIMEVAR) v=new Variable(Variable.CONTINOUS_VARIABLE,Type.NUMBER);
					else v=new Variable(Variable.TIMESTEP_VARIABLE,Type.NUMBER);
					t=new BinaryMultiply(buildFExp(exprNode.getChild(1),dom,parentVars,Type.NUMBER),v);
				}else if (exprNode.getChildCount()==1){
					Tree timeVar=exprNode.getChild(0);
					if (timeVar.getType()==TIMEVAR) t=new Variable(Variable.CONTINOUS_VARIABLE,Type.NUMBER);
					else t=new Variable(Variable.TIMESTEP_VARIABLE,Type.NUMBER);
				}else{
					throw new InvalidPDDLElementException("1 or 2 children required for CONTINUOUS_EXP"+" line "+exprNode.getLine());
				}
				break;
			default:
				t=buildFExp(exprNode,dom,parentVars,optEnforceNumType);
				if (t==null) throw new NullPointerException("No sub expression found"+" line "+exprNode.getLine());
		}
		logger.fine("Numeric expression: "+t);   
		return t;
	}

	private Term buildDurativeBinaryOpExpr(Tree exprNode, PDDLBase dom, Set<Variable> parentVars) 
		throws InvalidPDDLElementException
	{
		String operator = exprNode.getChild(0).getText().toLowerCase();
		Term firstOperand = buildDurativeFExp(exprNode.getChild(1),dom,parentVars,null);
		Term secondOperand = buildDurativeFExp(exprNode.getChild(2),dom,parentVars,null);
		//System.out.println("BIN Operator:  "+operator+ "expr1 "+firstOperand+" expr2 "+secondOperand);
		Term op=null;
		if (operator.equals("+"))
			op=new BinaryAdd(firstOperand, secondOperand);
		else if (operator.equals("-"))
			op=new BinarySubstract(firstOperand, secondOperand);
		else if (operator.equals("*"))
			op=new BinaryMultiply(firstOperand, secondOperand);
		else if (operator.equals("/"))
			op=new BinaryDivide(firstOperand, secondOperand);
		else throw new InvalidPDDLElementException("Unknown binary op type: " + operator+" line "+exprNode.getLine());
		logger.fine("Binary op expression: "+op);   
		return op;
	}
	
	private Term buildBinaryOpExpr(Tree exprNode, PDDLBase dom, Set<Variable> parentVars) 
		throws InvalidPDDLElementException
	{
		String operator = exprNode.getChild(0).getText().toLowerCase();
		Term firstOperand = buildFExp(exprNode.getChild(1),dom,parentVars,null);
		Term secondOperand = buildFExp(exprNode.getChild(2),dom,parentVars,null);
		//System.out.println("BIN Operator:  "+operator+ "expr1 "+firstOperand+" expr2 "+secondOperand);
		

		Term op=null;
		if (operator.equals("+"))
			op=new BinaryAdd(firstOperand, secondOperand);
		else if (operator.equals("-"))
			op=new BinarySubstract(firstOperand, secondOperand);
		else if (operator.equals("*"))
			op=new BinaryMultiply(firstOperand, secondOperand);
		else if (operator.equals("/"))
			op=new BinaryDivide(firstOperand, secondOperand);
		else throw new InvalidPDDLElementException("Unknown binary op type: " + operator+" line "+exprNode.getLine());
		logger.fine("Binary op expression: "+op);   
		return op;
	}


	//like absTermParameterList(), but does additional type checks and alters parent variable set (after doing type checks) and returns it
	//in parameter newParentVars. All the variables parsed from paramNode are added to newParentVars as well, which is useful to pass to child
	//nodes of paramNode. newParentVars should be an empty set upon call of this funciton.
	private List<Term> absTermParameterListTypeChecked(final Tree paramNode, PDDLBase base, Set<Variable> parentVars, Set<Variable> newParentVars) 
		throws InvalidPDDLElementException{

	
		List<Term> arguments=absTermParameterList(paramNode,base,parentVars);
	
		List<Term> ret = new ArrayList<Term>();
		
		//copy parent variables as we might need to add more to pass to the body of the expression
		newParentVars.addAll(parentVars);		
	
		//Already have made sure that arguments are of same size than original. Now just do type checks as well.
		for (Term arg : arguments) {
			//System.out.println("Arg: "+arg.toTypedString());

			Type forceType=null;
			if (arg.getTermID()!=TermID.VARIABLE) {
				throw new InvalidPDDLElementException("Only variables supported for FORALL expressions");
			}
			
			//see if we have a parent variable with same name
			for (Variable v: parentVars) {
				if (v.getImage().equals(arg.getImage())) {
					forceType=(Type) v.getType().clone();
				}else{
					newParentVars.add((Variable)arg.clone());
				}
			}
			Variable argCopy=(Variable) arg.clone();
			if (forceType!=null) {
				if (arg.getType().equals(Type.NUMBER) && forceType.isSubTypeOf(Type.NUMBER)){
					//FIX: absTermParameterList at this stage is not able to do type checks for numbers so we might have to enforce
					//number types here
					//System.out.println("Goal predicate: Enforcing right number type "+forceType+", line "+paramNode.getLine());
					argCopy.setType(forceType);
				}else if (!compatibleType(forceType,arg.getType())) {
					throw new InvalidPDDLElementException("Argument '"+arg.toTypedString()+"' is not of right type "
						+", should be type "+forceType+" or subtype of it. Line "+paramNode.getLine());
				} 
			}
			ret.add(argCopy);
		}
	
		return ret;
	}


	/*
	 * Extracts a list of variables/constants/numbers form the child nodes of the tree. Variables can have a type (not mandatory), but constants
	 * can't have a type here. Instead, it is checked whether the constant specified in the list exists in the domain.
	 */
	protected List<Term> absTermParameterList(final Tree tree, PDDLBase dom, Set<Variable> parentVars) 
		throws InvalidPDDLElementException{


		if (tree==null) throw new NullPointerException("Passing null for tree!"+" line "+tree.getLine());

		if (parentVars==null) throw new RuntimeException("Check: You have passed null parentVars. Pass at least empty set!"+" line "+tree.getLine());

		LinkedList<Term> tl=new LinkedList<Term>();
		for (int i = 0; i < tree.getChildCount(); i++) {
			final Tree cn = tree.getChild(i);
			final int type = cn.getType();
			//System.out.println("Child  "+cn+" and type "+type);
			switch (type) {
			case VARIABLE:
				//System.out.println("VAR");
				String varName=cn.getText();
				varName = Domain.CASE_SENSITIVE ? varName : varName.toLowerCase();
				//see first if we have to copy the parent elements variable (incl. its type)
				Variable var = null;
				for (Variable v: parentVars) {
					if (v.getImage().equals(varName)) {
						var=v.clone();
						break;
					}
				}

				//System.out.println("VAR "+varName);
				if (cn.getChildCount() == 0) {
					// No type
					//System.out.println("..No type");
					if (var==null) { //parent has no such variable, so create a new
						Type t=dom.getType(Type.OBJECT_SYMBOL); //assume object symbol
						if (t==null) throw new InvalidPDDLElementException("Object type not known. line " +cn.getLine());
						var = new Variable(varName,t);
					}
					//if (tl.contains(var)) throw new InvalidPDDLElementException("Variable \"" + varName + "\": duplicated definition. line "+cn.getLine());
					tl.add(var);
				}else{
					Type t=constructType(cn,dom);
					//System.out.println("..Type "+t);
					if (t==null)
						throw new InvalidPDDLElementException("Variable \"" + varName + "\" has unknown type. line "+cn.getLine());
					if (var!=null) { //parent already has a variable, so just check here if we have a consistent type
						Variable subVar = new Variable(varName, t);
						if (!compatibleType(subVar,var))
							throw new InvalidPDDLElementException("Variable \"" + varName + "\" has incompatible type. "+" line "+cn.getLine());
					}else{
						var = new Variable(varName, t);
					}
					
					if (tl.contains(var))
						throw new InvalidPDDLElementException("Variable \"" + varName + "\" duplicated definition. line "+cn.getLine());
					
					tl.add(var);
				}
				break;
			case NAME:
				//XXX this could be mixed up with a function?

				String constName=cn.getText();
				constName = Domain.CASE_SENSITIVE ? constName : constName.toLowerCase();
				//System.out.println("Constant: "+constName);
				Constant c = findConstant(constName,dom);
				if (c==null) 
					throw new InvalidPDDLElementException("Unknown constant \"" + constName+" line "+cn.getLine());
				//System.out.println("Constant: "+c.toTypedString());
				tl.add(c);
				break;
			case NUMBER:
				Term n=new pddl4j.exp.fexp.Number(Float.parseFloat(cn.getText()));
				if (n==null) 
					throw new InvalidPDDLElementException("Bad number \"" + cn.getText()+" line "+cn.getLine());
				tl.add(n);
				break;
			case FUNC_HEAD:
				//XXX FIX: a function with no parameters can be mixed up with a constant here.
				//With the current grammar, this can't be distinguished. If we want to support object fluents,
				//we'll have to check here first if there is a constant which matches this name. If there is, we assume
				//it is a constant we are looking for, not a function, because we assume that no constants have the same
				//names as functions.
				if (cn.getChildCount()<1) 
					throw new InvalidPDDLElementException("Expression not well defined."+" line "+cn.getLine());
				String cName = cn.getChild(0).getText();
				cName = Domain.CASE_SENSITIVE ? cName : cName.toLowerCase();
				Term t=findConstant(cName,dom);
				if (t==null) t=buildFunctionExpr(cn,dom,parentVars);
				tl.add(t);
				break;
			default:
				throw new InvalidPDDLElementException("Invalid argument type "+type+" for abstract parameter list."+" line "+cn.getLine()); 
			}
		}
		//System.out.println("TYPELIST: "+tl);
		return tl;
	}

	/**
	 * Extracts a list of constants which can be typed. Throws an InvalidPDDLElementException if
	 * a type other than Constant is found.
	 */
	protected List<Constant> constantList(final Tree tree, final PDDLBase dom) 
		throws InvalidPDDLElementException{
		
		List<Constant> tl=new LinkedList<Constant>();
		for (int i = 0; i < tree.getChildCount(); i++) {
			final Tree cn = tree.getChild(i);
			final int type = cn.getType();
			//System.out.println("Child  "+cn+" and type "+type);
			switch (type) {
			case NAME:
				String cName=cn.getText();
				cName = Domain.CASE_SENSITIVE ? cName : cName.toLowerCase();
				//System.out.println("CONST "+cName);
				if (cn.getChildCount() == 0) {
					// No type
					//System.out.println("..No type");
					Type t=dom.getType(Type.OBJECT_SYMBOL);
					if (t==null)
						throw new InvalidPDDLElementException("Constant \"" + cName + "\" has unknown type. line "+cn.getLine());
					Constant c = new Constant(cName,t);
					if (tl.contains(c))
						throw new InvalidPDDLElementException("Constant \"" + cName + "\" duplicated definition.line "+cn.getLine());
					tl.add(c);
				}else{
					Type t=constructType(cn,dom);
					if (t==null)
						throw new InvalidPDDLElementException("Constant \"" + cName + "\" has unknown type. line "+cn.getLine());
					Constant c = new Constant(cName, t);
					if (tl.contains(c))
						throw new InvalidPDDLElementException("Constant \"" + cName + "\" duplicated definition. line "+cn.getLine());
					tl.add(c);
				}
				break;
			default:
				throw new InvalidPDDLElementException("Unsupported node \"" + cn.getText()+" line "+cn.getLine());
			
			}
		}
		//System.out.println("TYPELIST: "+tl);
		return tl;
	}


	//for a list of several nodes (children of typeNode) with typenames, constructs a merged type
	//(a type which is a set of all of those types).
	//Only works if the types of the domain have been added and finalised.
	protected Type constructType(Tree typeNode, PDDLBase dom) throws InvalidPDDLElementException{
		if (typeNode.getChildCount()==0) { //error
			return null;
		}

		if (typeNode.getChild(0).getType()==EITHER_TYPE) {
			if (typeNode.getChildCount()!=1) throw new RuntimeException("Thinking error: We lose information here!");
			typeNode=typeNode.getChild(0); //recurse down one level
		}

		if (typeNode.getChildCount()==1) { //simple case: only one type
			String typename=typeNode.getChild(0).getText();
			typename = Domain.CASE_SENSITIVE ? typename : typename.toLowerCase();
			//System.out.println("Type: "+typename+" / "+typeNode.getChildCount());
			return dom.getType(typename);
		}

		//we have a set of types, so construct an anonymous type

		Set<Type> eitherTypes=new LinkedHashSet<Type>();
		for (int k=0; k<typeNode.getChildCount(); ++k) {
			String typename=typeNode.getChild(k).getText();
			typename = Domain.CASE_SENSITIVE ? typename : typename.toLowerCase();
			//System.out.println("Type: "+typename+" / "+typeNode.getChildCount());
			Type subType=dom.getType(typename);
			if (subType==null) {
				throw new InvalidPDDLElementException("Unknown type "+typename+" line "+typeNode.getLine());
			}
			eitherTypes.add(subType); //this type itself is going to be a parent type of this anonymous type
		}	

		return new TypeSet(eitherTypes);	
	}

	protected Exp buildEffect(Tree effectNode, PDDLBase dom, Set<Variable> parentVars) throws InvalidPDDLElementException{
		final int type = effectNode.getType();
		Exp ret=null;
		switch (type) {
			case PRED_HEAD:
				ret=buildPredicateGoal(effectNode,dom,parentVars);
				break;
			case NOT_EFFECT:
				final Tree negationPred = effectNode.getChild(0);
				Exp notEff=buildPredicateGoal(negationPred, dom,parentVars);
				ret=new NotExp(notEff);
				break;
			case ASSIGN_EFFECT:
				ret=buildAssignEffect(effectNode, dom,parentVars);
				break;
			case AND_EFFECT:
				ret=buildConjunctionEffect(effectNode,dom,parentVars);
				break;
			case WHEN_EXP:
				ret=buildWhenEffect(effectNode, dom, parentVars);
				break;
			case FORALL_EXP:
				ret=buildQuantifiedLogicExpr(effectNode,dom,parentVars,true);
				break;
			default:
				throw new InvalidPDDLElementException("Unknown type of effect: " + effectNode.getText());
		}
		return ret;
	}

	protected Exp buildWhenEffect(Tree effectNode,PDDLBase dom, Set<Variable> parentVars) 
		throws InvalidPDDLElementException
	{
		Exp condition = buildLogicExpr(effectNode.getChild(0), dom,parentVars);
		Exp condEffect = buildEffect(effectNode.getChild(1), dom,parentVars);
		return new WhenExp(condition, condEffect);
	}

	protected Exp buildDurativeWhenEffect(Tree effectNode,PDDLBase dom, Set<Variable> parentVars) 
		throws InvalidPDDLElementException
	{
		Exp condition = buildDurativeLogicExpr(effectNode.getChild(0), dom,parentVars);
		Exp condEffect = buildTimedEffect(effectNode.getChild(1), dom,parentVars);
		return new WhenExp(condition, condEffect);
	}


	//@param all if set to true, it is a forall statement, otherwise it is an exists statement
	protected QuantifiedExp buildDurativeForallEffect(Tree gdNode, PDDLBase base, Set<Variable> parentVars) throws InvalidPDDLElementException
	{
		if (gdNode.getChildCount()!=2) 
			throw new InvalidPDDLElementException("QuantifiedExpr not well defined ("+gdNode.getChildCount()+", line "+gdNode.getLine());

		Tree paramNode=gdNode.getChild(0);
		if (paramNode.getType()!=PARAMS) {
			throw new InvalidPDDLElementException("QuantifiedExpr not a PARAM node (but "+gdNode.getText()+" - "+paramNode.getText()+", line "+gdNode.getLine());
		}
		
		QuantifiedExp ret=new ForallExp();		

		//System.out.println("Quant "+paramNode.getText()+": parent vars "+parentVars);
	
		Set<Variable> newParentVars=new LinkedHashSet<Variable>();
		List<Term> arguments=absTermParameterListTypeChecked(paramNode,base,parentVars,newParentVars);
		for (Term arg : arguments) {
			if (arg.getTermID()!=TermID.VARIABLE) {
				throw new InvalidPDDLElementException("Only variables supported for FORALL expressions");
			}
			Variable argCopy=(Variable) arg;
			ret.add(argCopy);
		}


	
		Tree logicNode=gdNode.getChild(1);

		Exp body = buildDurativeLogicExpr(logicNode,base,newParentVars);

		ret.setExp(body);

		//System.out.println("Quantified built: "+ret.toTypedString());
		logger.fine("QuantifiedExpr=" + ret);
		return ret;
	}

	protected Exp buildTimedAssignEffect(Tree effectNode, PDDLBase dom, Set<Variable> parentVars) 
		throws InvalidPDDLElementException
	{
		String operator = effectNode.getChild(0).getText().toLowerCase();
		//System.out.println("Build function expr: "+effectNode.getChild(1)+", "+effectNode.getChild(2));
		Term target = buildFunctionExpr(effectNode.getChild(1), dom,parentVars);
		//System.out.println("Target: "+target);
		Term value = buildDurativeFExp(effectNode.getChild(2), dom,parentVars,target.getType());
		//System.out.println("Val: "+value);
		Exp ret=null;
		if (operator.equals("scale-up"))
			ret=new ScaleUp(target,value);
		else if (operator.equals("scale-down"))
			ret=new ScaleDown(target,value);
		else if (operator.equals("assign"))
			ret=new Assign(target,value);
		else if (operator.equals("increase"))
			ret=new Increase(target,value);
		else if (operator.equals("decrease"))
			ret=new Decrease(target,value);
		else
			throw new InvalidPDDLElementException("Unknown operator: " + operator);


		return ret;
	}


	protected Exp buildTimedEffect(Tree effectNode, PDDLBase dom, Set<Variable> parentVars) throws InvalidPDDLElementException{
		final int type = effectNode.getType();
		Exp ret=null;
		switch (type) {
			case ASSIGN_EFFECT:
				ret=buildTimedAssignEffect(effectNode,dom,parentVars);	
				break;
			case TIMED_EFFECT:
				if (effectNode.getChildCount()!=2) 
				throw new InvalidPDDLElementException("Timed expression must have 2 children!"+": line "+effectNode.getLine());
				Tree timeOp=effectNode.getChild(0);
				Tree timeExp=effectNode.getChild(1);

				Exp e=null;
				if (timeExp.getType()==ASSIGN_EFFECT) {
					e=buildTimedAssignEffect(timeExp,dom,parentVars);	
				}else{ //must be condEffect
					e=buildEffect(timeExp,dom,parentVars);	
				}				

				String timeSpec=timeOp.getText();	
				if (timeSpec.equals("start")) {
					ret=new AtStartTimedExp(e);
				}else if (timeSpec.equals("end")) {
					ret=new AtEndTimedExp(e);
				}else if (timeSpec.equals("all")) {
					ret=new OverAllTimedExp(e);
				}else{		
					throw new InvalidPDDLElementException("Unknown time specifier "+timeSpec+": line "+effectNode.getLine());
				}	
				//System.out.println("Timed exp: "+timeSpec+", "+ret);
				break;
			default:
				throw new InvalidPDDLElementException("Unknown type of effect: " + effectNode.getText()+": line "+effectNode.getLine());
		}
		return ret;
	}

	protected Exp buildDurativeEffect(Tree effectNode, PDDLBase dom, Set<Variable> parentVars) throws InvalidPDDLElementException{
		final int type = effectNode.getType();
		Exp ret=null;
		switch (type) {
			case AND_EFFECT:
				ret=buildDurativeConjunctionEffect(effectNode,dom,parentVars);
				break;
			case WHEN_EXP:
				ret=buildDurativeWhenEffect(effectNode, dom, parentVars);
				break;
			case FORALL_EXP:
				ret=buildDurativeForallEffect(effectNode, dom, parentVars);
				break;
			default:
				ret=buildTimedEffect(effectNode,dom,parentVars);
		}
		return ret;
	}

	protected Exp buildAssignEffect(Tree effectNode, PDDLBase dom, Set<Variable> parentVars) 
		throws InvalidPDDLElementException
	{
		String operator = effectNode.getChild(0).getText().toLowerCase();
		//System.out.println("Build function expr: "+effectNode.getChild(1)+", "+effectNode.getChild(2));
		Term target = buildFunctionExpr(effectNode.getChild(1), dom,parentVars);
		//System.out.println("Target: "+target);
		Term value = buildFExp(effectNode.getChild(2), dom,parentVars,target.getType());
		//System.out.println("Val: "+value);
		Exp ret=null;
		if (operator.equals("scale-up"))
			ret=new ScaleUp(target,value);
		else if (operator.equals("scale-down"))
			ret=new ScaleDown(target,value);
		else if (operator.equals("assign"))
			ret=new Assign(target,value);
		else if (operator.equals("increase"))
			ret=new Increase(target,value);
		else if (operator.equals("decrease"))
			ret=new Decrease(target,value);
		else
			throw new InvalidPDDLElementException("Unknown operator: " + operator+": line "+effectNode.getLine());


		return ret;
	}
	
	protected Exp buildConjunctionEffect(Tree effectNode, PDDLBase dom, Set<Variable> parentVars) 
		throws InvalidPDDLElementException
	{
		AndExp exp=new AndExp();
		for (int i = 0; i < effectNode.getChildCount(); i++) {
			final Tree subNode = effectNode.getChild(i);
			exp.add(buildEffect(subNode,dom,parentVars));
		}
		return exp;
	}

	protected Exp buildDurativeConjunctionEffect(Tree effectNode, PDDLBase dom, Set<Variable> parentVars) 
		throws InvalidPDDLElementException
	{
		AndExp exp=new AndExp();
		for (int i = 0; i < effectNode.getChildCount(); i++) {
			final Tree subNode = effectNode.getChild(i);
			exp.add(buildDurativeEffect(subNode,dom,parentVars));
		}
		return exp;
	}

	// returns true if term t2 type is comabible with type t1, that is we could assign t1=t2
	private static boolean compatibleType(Term t1, Term t2) {
		return compatibleType(t1.getType(),t2.getType());
	}

	// returns true if t2 type is comabible with type t1, that is we could assign t1=t2
	private static boolean compatibleType(Type t1, Type t2) {
		//System.out.println("Terms: "+t1.toTypedString()+", "+t2.toTypedString());
		//System.out.println("Terms: "+t1+", "+t2);
		//return t1.getType().getSubTypes().containsAll(t2.getType().getSubTypes());
		return t2.isSubTypeOf(t1);
	}
}
