package PDDL4J.antlr_parser;

import static PDDL4J.antlr_gen.PddlParser.*;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import org.antlr.runtime.tree.*;

import pddl4j.*;
import pddl4j.exp.*;
import pddl4j.exp.term.*;
import pddl4j.exp.fcomp.*;
import pddl4j.exp.time.*;
import pddl4j.exp.type.*;
import pddl4j.exp.action.*;
import pddl4j.exp.fexp.*;
import pddl4j.exp.assign.*;


/**
 * Builds a {@link PDDL4J.domain.Domain Domain} object by parsing a
 * PDDL file using ANTLR, and then walking the ANTLR syntax tree to create the
 * appropriate strongly-typed objects.
 *
 * @author Jennifer Buehler
 */
public class ANTLRDomainBuilder extends ANTLRBuilder
{
	private static final Logger logger = Logger.getLogger(ANTLRDomainBuilder.class.getName());
	
	public ANTLRDomainBuilder(File pddlFile) throws IOException, PDDLSyntaxException
	{
		super(pddlFile);
		parseDocument();
	}

	public Domain buildDomain() throws InvalidPDDLElementException
	{
		int type = docRoot.getType();
		if (type == DOMAIN) {
			return buildPDDLDomain(docRoot);
		} else {
			throw new InvalidPDDLElementException("The file " + pddlFile + " does not contain a PDDL domain");
		}
	}


	private Domain buildPDDLDomain(Tree domainNode) throws InvalidPDDLElementException
	{
		logger.fine("Building a PDDL Domain");
		Domain dom = new Domain("NoName");
		// Iterate over all the immediate children of the DOMAIN node
		for (int i=0; i < domainNode.getChildCount(); i++) {
			final Tree child = domainNode.getChild(i);
			final int type = child.getType();
			switch (type) {
			case DOMAIN_NAME:
				String _name = child.getChild(0).getText();
				_name = Domain.CASE_SENSITIVE ? _name : _name.toLowerCase();
				dom.setDomainName(_name);
				logger.fine("Domain name=" + _name);
				break;
			case REQUIREMENTS:
				addRequirements(child,dom);
				break;
			case TYPES:
				addTypes(child,dom);
				break;
			case CONSTANTS:
				//System.out.println("Add constants");
				addConstants(child,dom); //throw new UnsupportedOperationException("Constants not supported yet");
				break;
			case PREDICATES:
				addPredicates(child,dom);
				break;
			case FUNCTIONS:
				addFunctions(child,dom);
				break;
			case ACTION:
				//System.out.println("Add action");
				addAction(child,dom);
				break;
			case DURATIVE_ACTION:
				//System.out.println("Add action");
				addDurativeAction(child,dom);
				break;
			default:
				// DURATIVE_ACTION, ':derived', ':constraints'
				throw new UnsupportedOperationException("Unsupported :domain child element - " + child.getText()+": line "+child.getLine());
			}
		}
		//System.out.println("Domain: "+dom);
		logger.fine("Domain parsed from ANTLRDomainBuilder:\n"+dom);
		return dom;
	}

	private void addTypes(Tree typeNodes, Domain dom) throws InvalidPDDLElementException
	{
		for (int i=0; i < typeNodes.getChildCount(); i++) {
			final Tree type = typeNodes.getChild(i);
			final String typeName = type.getText();
			final String lookupName = Domain.CASE_SENSITIVE ? typeName : typeName.toLowerCase();
			//System.out.println("The type "+typeName);
			if (type.getChildCount() == 0) {
				// No parent type specified, so parent is OBJECT
				//System.out.println("NO TYPE: ");
				if (!dom.addType(lookupName,Type.OBJECT_SYMBOL)){
					throw new InvalidPDDLElementException("Error adding type " + lookupName+":"+typeNodes.getLine());
				}
			} else {
				for (int k=0; k < type.getChildCount(); k++) {
					//System.out.println("Parent type name: "+type.getChild(k).getText());
					String parentTypeName = type.getChild(k).getText();
					parentTypeName = Domain.CASE_SENSITIVE ? parentTypeName : parentTypeName.toLowerCase();
					if (!dom.addType(lookupName,parentTypeName))
						throw new InvalidPDDLElementException("Error adding type " + lookupName+": line "+typeNodes.getLine());
				}
			}
		}

		if (!dom.checkTypeHierarchy()){
			throw new InvalidPDDLElementException("Inconsistent type specification"+": line "+typeNodes.getLine());
		}
		dom.finaliseTypes();

		logger.fine("Types read");
	}

	private void addConstants(Tree constantNodes, Domain dom) throws InvalidPDDLElementException
	{
		for (int i=0; i < constantNodes.getChildCount(); i++) {
			final Tree constant = constantNodes.getChild(i);
			String constantName = constant.getText();
			constantName = Domain.CASE_SENSITIVE ? constantName : constantName.toLowerCase();
			if (constant.getChildCount() == 0) {
				// No typed constant
				Type t=dom.getType(Type.OBJECT_SYMBOL);
				if (t==null) throw new InvalidPDDLElementException("Could not find object type"+": line "+constantNodes.getLine());
				if (!dom.addConstant(constantName,t))
					throw new InvalidPDDLElementException("Error adding constant " + constantName+": line "+constantNodes.getLine());
			} else {
				Type t=constructType(constant,dom);
				/*final String typeName = constant.getChild(0).getText();
				final String lookupName = Domain.CASE_SENSITIVE ? typeName : typeName.toLowerCase();
				Type t=dom.getType(lookupName);*/
				if (t==null) 
					throw new InvalidPDDLElementException("Unknown type for constant " + constantName+": line "+constantNodes.getLine());
				//System.out.println("Constant "+constantName+" type "+typeName);
				if (!dom.addConstant(constantName,t))
					throw new InvalidPDDLElementException("Error adding constant " + constantName+": line "+constantNodes.getLine());
			}
		}
		logger.fine("Constants read.");
	}

	private void addPredicates(Tree preds, Domain dom) throws InvalidPDDLElementException
	{
		for (int i=0; i < preds.getChildCount(); i++) {
			final Tree pred = preds.getChild(i);
			final String predName = pred.getText();
			final String lookupName = Domain.CASE_SENSITIVE ? predName : predName.toLowerCase();

			if (dom.hasPredicate(predName)) 
				throw new InvalidPDDLElementException("Duplicate predicate "+predName+": line "+pred.getLine());

			//System.out.println("Pred name: "+predName);

			AtomicFormula predicate = new AtomicFormula(lookupName);
			List<Term> vars=absTermParameterList(pred,dom,new LinkedHashSet<Variable>());

			for (Term arg : vars) {
				//System.out.println("Arg: "+arg.toTypedString()+" type "+arg.getType().getParentTypes());
				predicate.add(arg);
			}
			if (!dom.addPredicate(lookupName,predicate))
				throw new InvalidPDDLElementException("Could not add predicate "+predName+": line "+pred.getLine());
			//System.out.println("Predicate: "+predicate);
		}
		logger.fine("Predicates=" + dom.getPredicates());
	}

	private void addFunctions(Tree funcs, Domain dom) throws InvalidPDDLElementException
	{
		for (int i=0; i < funcs.getChildCount(); i++) {
			final Tree func = funcs.getChild(i);

			Type funcType=null;
			
			//System.out.println("f num child: "+func.getChildCount());

			if (func.getType()!=FUNC_LIST) throw new InvalidPDDLElementException("Expected FUNC_LIST node"+": line "+func.getLine());
 
			Map<String,List<Term> > funcMap=new LinkedHashMap<String,List<Term> >();

			for (int j=0; j < func.getChildCount(); j++) { //iterate through all typed / untyped function lists
				final Tree funcSet = func.getChild(j);
				if (funcSet.getType()==FUNC_TYPE) { 
					//we have a type declaration
					if (funcType!=null)
						throw new InvalidPDDLElementException("Only one FUNC_TYPE supported per node!"+": line "+funcSet.getLine());
					if (funcSet.getChildCount()!=1) 
						throw new InvalidPDDLElementException("FUNC_TYPE supposed to have exactly one child, has "
							+funcSet.getChildCount()+": line "+funcSet.getLine());
					funcType=constructType(funcSet,dom);
					if (funcType==null) 
						throw new InvalidPDDLElementException("Type not available for function, line "+funcSet.getLine());
					//System.out.println("Type: "+funcType);
				}else if (funcSet.getType()==FUNC_SKEL) { 
					//we have a function declaration (list)
					
					//System.out.println("Skeleton: "+funcSet.getText()+" / "+funcSet.getChildCount());
					for (int k=0; k < funcSet.getChildCount(); k++) { //iterate through all function skeletons
						final Tree funcSkel = funcSet.getChild(k);
						String funcName=funcSkel.getText();
						funcName = Domain.CASE_SENSITIVE ? funcName : funcName.toLowerCase();
						//System.out.println("Name: "+funcName+" / "+funcSkel.getChildCount());
						List<Term> args=absTermParameterList(funcSkel,dom,new LinkedHashSet<Variable>());
						funcMap.put(funcName,args);
					}
				} else {
					throw new InvalidPDDLElementException("Expected FUNC_TYPE or FUNC_SKEL node"+": line "+funcSet.getLine());
				}

			}
			
			if (funcType==null) funcType=dom.getType(Type.NUMBER_SYMBOL);
			if (funcType==null) 	
				throw new InvalidPDDLElementException("Object type "+Type.NUMBER_SYMBOL+" not available for function"+": line "+func.getLine());
				
			//System.out.println("Creataing all functions of type "+funcType);
			for (Map.Entry<String, List<Term> > f: funcMap.entrySet()) {
				final String lookupName = Domain.CASE_SENSITIVE ? f.getKey() : f.getKey().toLowerCase();
				FHead theFunc = new FHead(lookupName,funcType);
				for (Term arg : f.getValue()) {
					theFunc.add(arg);
				}
				//System.out.println("Func: "+theFunc);
				if (!dom.addFunction(lookupName,theFunc))
					throw new InvalidPDDLElementException("Could not add function - " + lookupName+": line "+func.getLine());

			}
		}
		logger.fine("Functions=" + dom.getFunctions());
		//System.out.println("Functions=" + dom.getFunctions());
	}

	private void addAction(Tree actionNode, Domain dom) throws InvalidPDDLElementException
	{		
		String name = actionNode.getChild(0).getText();
		name = Domain.CASE_SENSITIVE ? name : name.toLowerCase();

		Action action = new Action(name); 
		//System.out.println("Adding action "+name);

		Set<Variable> actionVariables=new LinkedHashSet<Variable>();

		for (int i = 1; i < actionNode.getChildCount(); i++) {
			final Tree child = actionNode.getChild(i);
			final int type = child.getType();
			switch (type) {
			case VARS:
				if (child.getChildCount()>0) {
					//for now, we only append the variables specified here to the actions parameters.
					//Action implementation does not support separate variable lists yet.
					List<Term> var=absTermParameterList(child,dom,actionVariables);
					for (Term arg : var) {
						System.out.println(arg.toTypedString());
						if (arg.getTermID()==TermID.VARIABLE) {
							actionVariables.add((Variable) arg);
						}else {
							throw new UnsupportedOperationException("Only variables accepted as term parameter list in action!");
						}
					}
				}
				break;
			case PRECONDITION:
				//System.out.println("##Precondition "+child.getText()+", "+child.getChildCount());
				//System.out.println("--Action variables for "+name+": line "+actionVariables);
				Exp precond=null;
				if (child.getChildCount()==0) precond=new AndExp(); //empty precondition
				else precond = buildLogicExpr(child.getChild(0),dom,actionVariables);
				action.setPrecondition(precond);
				break;
			case EFFECT:
				//System.out.println("##Effect "+child.getText());
				if (child.getChildCount()==0) throw new InvalidPDDLElementException("Action has to have an effect! "+name);
				Exp effect = buildEffect(child.getChild(0),dom,actionVariables);
				action.setEffect(effect);
				break;
			case PARAMS:
				//Action variables:	
				//System.out.println("##Params "+child.getText());
				List<Term> vars=absTermParameterList(child,dom,actionVariables);
				for (Term arg : vars) {
					action.add(arg);
					if (arg.getTermID()==TermID.VARIABLE) {
						actionVariables.add((Variable) arg);
					}else {
						throw new UnsupportedOperationException("Only variables accepted as term parameter list in action!");
					}
				}
				//System.out.println("Action variables for "+name+": line "+actionVariables);
				break;
			default:
				throw new InvalidPDDLElementException("Invalid action child node: " + child.getText());
			}
		}
		//System.out.println("Action result: "+action.toTypedString());
		logger.fine("Action=" + action);
		dom.addAction(name,action);
	}

	private void addDurativeAction(Tree actionNode, Domain dom) throws InvalidPDDLElementException
	{		
		String name = actionNode.getChild(0).getText();
		name = Domain.CASE_SENSITIVE ? name : name.toLowerCase();

		//System.out.println("Adding durative action "+name+", children: "+actionNode.getChildCount());
		DurativeAction action = new DurativeAction(name); 

		Set<Variable> actionVariables=new LinkedHashSet<Variable>();

		for (int i = 1; i < actionNode.getChildCount(); i++) {
			final Tree child = actionNode.getChild(i);
			final int type = child.getType();
			switch (type) {
			case CONDITION:
				//contains daLogicExpr
				//System.out.println("##Condition "+child.getText()+", "+child.getChildCount());
				//System.out.println("--Action variables for "+name+": line "+actionVariables);
				Exp cond=null;
				if (child.getChildCount()==0) {
					cond=new AndExp(); //empty condition
				} else {
					cond = buildDurativeLogicExpr(child.getChild(0),dom,actionVariables);
				}
				//System.out.println("Condition: "+cond);
				action.setCondition(cond);
				break;
			case DURATION: //list of simpleDuratoinContraint (or empty)
				//System.out.println("## Duration!! "+child.getText());
				if (child.getChildCount()>0) { 
					Exp timeConstraint=buildDurationConstraint(child,dom,actionVariables);
					if (timeConstraint!=null) action.setConstraint(timeConstraint);
					//System.out.println("Duration constraint: "+timeConstraint);
				}
				break;
			case EFFECT:
				//System.out.println("##Effect "+child.getText());
				if (child.getChildCount()==0) throw new InvalidPDDLElementException("Action has to have an effect! "+name);
				Exp effect = buildDurativeEffect(child.getChild(0),dom,actionVariables);
				action.setEffect(effect);
				//System.out.println("Effect: "+effect);
				break;
			case PARAMS:
				//Action variables:	
				//System.out.println("##Params "+child.getText());
				List<Term> vars=absTermParameterList(child,dom,actionVariables);
				for (Term arg : vars) {
					action.add(arg);
					if (arg.getTermID()==TermID.VARIABLE) actionVariables.add((Variable) arg);
				}
				//System.out.println("Action variables for "+name+": line "+actionVariables);
				break;
			default:
				throw new InvalidPDDLElementException("Invalid action child node: " + child.getText());
			}
		}
		//System.out.println("Action result: "+action.toTypedString());
		logger.fine("Action=" + action);
		dom.addAction(name,action);
	}

	protected Exp buildDurationConstraint(Tree node, PDDLBase dom, Set<Variable> parentVars) throws InvalidPDDLElementException
	{
		AndExp list = new AndExp();
		for (int i=0; i<node.getChildCount(); ++i) {
			Tree child=node.getChild(i);
			final int type = child.getType();
			switch (type) {
			case DUR_CONSTRAINTS:
				System.out.println("DURCONST: ");
				if (child.getChildCount()!=2) throw new InvalidPDDLElementException("DUR_CONSTRAINTS must have 2 children"+": line "+child.getLine());
				Tree rec=child.getChild(1);
				Exp e = buildDurationConstraint(rec,dom,parentVars);
				if (e==null) throw new NullPointerException("Could not construct duration constraint"+": line "+child.getLine());
				String timeSpec=child.getChild(0).getText();	
				Exp ret=null;
				if (timeSpec.equals("start")) {
					ret=new AtStartTimedExp(e);
				}else if (timeSpec.equals("end")) {
					ret=new AtEndTimedExp(e);
				}else if (timeSpec.equals("all")) {
					ret=new OverAllTimedExp(e);
				}else{		
					throw new InvalidPDDLElementException("Unknown time specifier "+timeSpec);
				}	
				list.add(ret);
				break;
			case DUR_VALUE:
				if (child.getChildCount()!=2) throw new InvalidPDDLElementException("DUR_CONSTRAINTS must have no children"+": line "+child.getLine());
				String operator = child.getChild(0).getText().toLowerCase();
				//System.out.println("Operator: "+operator+", "+child.getChild(1));

				Term firstOperand=Variable.DURATIVE_VARIABLE_INST; //Constant.DURATION; //new Variable(Variable.DURATIVE_VARIABLE,Type.NUMBER);
				Term secondOperand = buildFExp(child.getChild(1),dom,parentVars,Type.NUMBER);

				Exp cmp=null;
				if (operator.equals(">="))
					cmp=new GEqualComp(firstOperand,secondOperand);
				else if (operator.equals("<="))
					cmp=new LEqualComp(firstOperand,secondOperand);
				else if (operator.equals("="))
					cmp=new EqualComp(firstOperand,secondOperand);
				else throw new InvalidPDDLElementException("Unknown operator: " + operator);

				list.add(cmp);
				break;
			case DUR_INDEFINITE:
				break;
			default:
				throw new InvalidPDDLElementException("Unknown DurationConstraint child: " + child.getText()+": line "+child.getLine());
			}
		}
		//if (list.size()==0) return null;
		
		logger.fine("Logic expression: "+list);   

		if (list.size()==1) return list.iterator().next();
		return list; 
	}

	protected Constant findConstant(final String cName, final PDDLBase dom)
	{
		String name = Domain.CASE_SENSITIVE ? cName : cName.toLowerCase();
		final Constant constant = dom.getConstant(name);
		return constant;
	}

	protected AtomicFormula findPredicate(final String predName, final PDDLBase dom) throws InvalidPDDLElementException
	{
		final String lookupName = Domain.CASE_SENSITIVE ? predName : predName.toLowerCase();
		final AtomicFormula pred = dom.getPredicate(lookupName);
		if (pred == null) {
			throw new InvalidPDDLElementException("Predicate " + predName + " is not declared");
		}
		return pred;
	}
	protected FHead findFunction(final String funcName, PDDLBase dom) throws InvalidPDDLElementException
	{
		final String lookupName = Domain.CASE_SENSITIVE ? funcName : funcName.toLowerCase();
		final FHead func = dom.getFunction(lookupName);
		if (func == null) {
				throw new InvalidPDDLElementException("Function " + funcName+ " is not declared");
		}
		return func;
	}
}
