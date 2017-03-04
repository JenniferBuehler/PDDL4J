package PDDL4J.antlr_parser;

import static PDDL4J.antlr_gen.PddlParser.*;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import org.antlr.runtime.tree.*;
import pddl4j.*;
import pddl4j.exp.*;
import pddl4j.exp.term.*;
import pddl4j.exp.type.Type;
import pddl4j.exp.metric.*;
import pddl4j.exp.fcomp.*;
import pddl4j.exp.fexp.*;

/**
 * Builds a {@link PDDL4J.domain.Domain Domain} object by parsing a
 * PDDL file using ANTLR, and then walking the ANTLR syntax tree to create the
 * appropriate strongly-typed objects.
 *
 * @author Jennifer Buehler
 */
public class ANTLRProblemBuilder extends ANTLRBuilder
{
	private static final Logger logger = Logger.getLogger(ANTLRProblemBuilder.class.getName());
	
	private Domain domain;

	public ANTLRProblemBuilder(Domain domain, File pddlFile) throws IOException, PDDLSyntaxException
	{
		super(pddlFile);
		this.domain = domain;
		parseDocument();
	}
 
	public Problem buildProblem() throws InvalidPDDLElementException
	{
		Problem problem=null;
		System.out.println("###############        Build problem in ANTLR    #############################");
		int type = docRoot.getType();
		if (type == PROBLEM) {
			problem = buildPDDLProblem(docRoot);
		} else {
			throw new InvalidPDDLElementException("The file " + pddlFile + " does not contain a PDDL domain");
		}
		//System.out.println("Problem built. \n"+problem);
		return problem;
	}
	private Problem buildPDDLProblem(Tree problemNode) throws InvalidPDDLElementException
	{
		logger.fine("Building a PDDL Problem");		
		if (domain==null) throw new RuntimeException("No valid domain initialized for ANTLRProblemBuilder!");
	
		String problemName=null;
		Problem problem=null;
		// Iterate over all the immediate children of the DOMAIN node
		for (int i=0; i < problemNode.getChildCount(); i++) {
			final Tree child = problemNode.getChild(i);
			final int type = child.getType();
			switch (type) {
				case PROBLEM_NAME:
					problemName = child.getChild(0).getText();
					problemName = Domain.CASE_SENSITIVE ? problemName : problemName.toLowerCase();
					logger.fine("Problem name=" + problemName);
					break;
				case PROBLEM_DOMAIN:
					String domainName = child.getChild(0).getText();
					if ((Domain.CASE_SENSITIVE && !domain.getDomainName().equals(domainName))
							|| !domain.getDomainName().equalsIgnoreCase(domainName)) {
						throw new InvalidPDDLElementException("Domain name for problem (" + domainName+ ") does not match specified Domain object ("+ domain.getDomainName() + ")");
					}
					logger.fine("Problem's domain=" + domainName);
					if (problemName==null) 
						throw new InvalidPDDLElementException("Problem name not specified yet");
					problem=new Problem(domainName,problemName);
					break;
				case REQUIREMENTS:
					if (problem==null) throw new RuntimeException("problem not initialized yet"+child.getLine());
					addRequirements(child,problem);
					break;
				case OBJECTS:
					if (problem==null) throw new RuntimeException("problem not initialized yet"+child.getLine());
					addObjects(child,problem);
					break;
				case INIT:
					if (problem==null) throw new RuntimeException("problem not initialized yet"+child.getLine());
					addInitialState(child,problem,domain);
					break;
				case GOAL:
					if (problem==null) throw new RuntimeException("problem not initialized yet"+child.getLine());
					Exp goal = buildLogicExpr(child.getChild(0),new DomainAndProblem(domain,problem),null);
					problem.setGoal(goal);
					logger.fine("Problem goal=" + goal);
					break;
				case PROBLEM_CONSTRAINT:
					//if (problem==null) throw new RuntimeException("problem not initialized yet"+child.getLine());
					throw new UnsupportedOperationException("Constraints not supported yet");
				case PROBLEM_METRIC:
					if (problem==null) throw new RuntimeException("problem not initialized yet"+child.getLine());
					MetricExp metric=buildMetric(child,domain,problem);
					if (metric==null) throw new RuntimeException("no metric parsed");
					problem.setMetric(metric);
					break;
				default:
					throw new UnsupportedOperationException("Unsupported :problem child element - " + child.getText());
			}
		}
		return problem;
	}

	private MetricExp buildMetric(Tree mNode, Domain dom, Problem prob) throws InvalidPDDLElementException {
		if (mNode.getChildCount()!=2) throw new InvalidPDDLElementException("Metric must have 2 children! Has "+mNode.getChildCount());
		
		Tree optNode=mNode.getChild(0);
		Optimization opt=Optimization.MAXIMIZE;
		if (optNode.getText().toLowerCase().equals("minimize")) opt=Optimization.MINIMIZE;

		Term metricTerm=null;
	
		Tree child=mNode.getChild(1);
		final int type = child.getType();
		switch (type) {
			case BINARY_OP:
				// metricFExp metricFExp
				throw new RuntimeException("Implement me! "+type);
			case MULTIOP_METRIC: // ('*'|'/') metricFExp metricFExp+
				throw new RuntimeException("Implement me! "+type);
			case UNARY_MINUS: // metricFExp
				throw new RuntimeException("Implement me! "+type);
			case NUMBER_METRIC: //NUMBER
				throw new RuntimeException("Implement me! "+type);
			case FUNC_HEAD: //functionSymbol ^(PARAMS NAME*))
				metricTerm=buildMetricFunctionExp(child,dom,prob);
				break;
			case TIME_METRIC:
				metricTerm=new Constant(Variable.TOTAL_TIME,Type.NUMBER);
				break;
			case VIOLATED_METRIC: // NAME
				throw new RuntimeException("Implement me! "+type);
			default:
				throw new InvalidPDDLElementException("Metric "+child+" ("+type+") not supported!");
		}
	
		if (metricTerm==null) {
			throw new RuntimeException("Failed to initialize metric expression");
		}

		MetricExp metr= (opt==Optimization.MINIMIZE) ? new MinimizeExp(metricTerm) : new MaximizeExp(metricTerm);

		//System.out.println("Result metric: "+metr);

		return metr;
	}

	//builds a FHead instance based on a function metric
	private FHead buildMetricFunctionExp(Tree funcNode, Domain dom, Problem prob) throws InvalidPDDLElementException {

		if (funcNode.getChildCount()!=2) 
			throw new InvalidPDDLElementException("Func must have 2 funcNoderen! Has "+funcNode.getChildCount());
		
		Tree funcNameNode=funcNode.getChild(0);
		String funcName=funcNameNode.getText();
		funcName = Domain.CASE_SENSITIVE ? funcName : funcName.toLowerCase();

		//System.out.println("Func name node: "+funcNameNode+", "+funcNameNode.getChildCount());
		Tree paramNode=funcNode.getChild(1);
		//System.out.println("Param node: "+paramNode+", "+paramNode.getChildCount());
		if (paramNode.getType()!=PARAMS) 
			throw new InvalidPDDLElementException("Child must be PARAMS, is "+paramNode.getType());
	
		Set<Variable> funcVars=null;
		FHead func=dom.getFunction(funcName);
		if (func==null)
			throw new InvalidPDDLElementException("Function/Pred. "+funcName+" not found");
			
		funcVars=func.getFreeVariables();

		if (func.getArity()!=paramNode.getChildCount())	
			throw new InvalidPDDLElementException("Unequal arity! "+func.getArity()+", "+paramNode.getChildCount());

		FHead funcInst=new FHead(funcName,func.getType());
		if (func.getArity()>0) {//read parameters
			List<Term> terms=absTermParameterList(paramNode,dom,funcVars);
			for (Term arg : terms) {
				System.out.println("FUNC METRIC Params: "+arg);
				funcInst.add(arg);
			}
		}

		return funcInst;
	}
	
	private void addObjects(Tree objectsNode, Problem prob) throws InvalidPDDLElementException
	{
		List<Constant> consts=constantList(objectsNode,domain);
		//System.out.println("Objects: "+consts);
		for (Constant c: consts) {
			if (!prob.addConstant(c))
				throw new InvalidPDDLElementException("Could not add constant "+c);
		}
		logger.fine("Objects=" + consts);
	}

	private void addInitialState(Tree initNode, Problem prob, Domain dom) throws InvalidPDDLElementException
	{
		for (int i=0; i < initNode.getChildCount(); i++) {
			final Tree child = initNode.getChild(i);
			final int type = child.getType();
			switch (type) {
				case INIT_EQ:
					addFuncLiteral(child,prob,dom);
					break;
				case PRED_INST:
					addPredLiteral(child, true,prob,dom);
					break;
				case NOT_PRED_INIT:
					addPredLiteral(child.getChild(0), false,prob,dom);
					break;
				case INIT_AT:
					throw new UnsupportedOperationException("'at' init elements not supported yet");
				default:
					throw new InvalidPDDLElementException("Unknown init element: " + child.getText());
			}
		}
		logger.fine("Literals scanned.");
	}

	private void addFuncLiteral(Tree initNode, Problem prob, Domain dom) throws InvalidPDDLElementException
	{
		if (initNode.getChildCount()!=2) throw new InvalidPDDLElementException("Init node needs 2 children!");
		
		Tree funcNode = initNode.getChild(0);
		FExp func = buildFunctionExpr(funcNode,new DomainAndProblem(dom,prob),null);
		if (!func.isGround()) {
			throw new InvalidPDDLElementException("Term "+func+" in function literal is not ground");
		}
		if (!(func instanceof FHead)) throw new InvalidPDDLElementException("Only accept function heads here! "+func);
		FHead funcH=(FHead)func;

		if (dom.getFunction(funcH.getImage())==null) throw new InvalidPDDLElementException("Function "+funcH+" not defined!");

		Type funcType=(Type)dom.getFunction(funcH.getImage()).getType().clone();
		if (funcType==null) throw new NullPointerException("NULL function Type in domain! "+funcH);

		funcH.setType(funcType);

		Term t=null;
		Tree termNode = initNode.getChild(1);
		final int type = termNode.getType();
		switch (type) {
			case NUMBER:
				//System.out.println("Parse number: "+termNode.getText()+" for func "+funcH);
				//int value = Integer.parseInt(termNode.getText());
				float value = Float.parseFloat(termNode.getText());
				//System.out.println("Check:: Number by default is double... hard to compare also in Java?");
				//System.out.println("Adding function ("+funcH.getImage()+") term value "+value+" with type "+funcType);
				t=new pddl4j.exp.fexp.Number(value,funcType);
				break;
			case NAME:
				//System.out.println("find constant: "+termNode.getText());
				String name = Domain.CASE_SENSITIVE ? termNode.getText() : termNode.getText().toLowerCase();
				t=findConstant(name,prob);
				if (t==null) t=findConstant(name,dom);
				if (t==null) throw new RuntimeException("Could not find constant! "+name+"\n problem: "+prob);
				break;
			default:
				throw new InvalidPDDLElementException("Expect number or constant, found "+termNode);
		}
		if (t==null) throw new InvalidPDDLElementException("Could not find valid term assignment for init operation! ");
		prob.addInit(new EqualComp(funcH,t));
	}

	private void addPredLiteral(Tree predNode, boolean value, Problem prob, Domain dom) throws InvalidPDDLElementException
	{
		AtomicFormula pred = buildPredicateGoal(predNode, new DomainAndProblem(dom,prob),null);
		//System.out.println("Scanned pred:"+pred);
		if (!pred.isGround()) {
			throw new InvalidPDDLElementException("Expression "+pred+" in predicate literal is not ground");
		}
		if (value) prob.addInit(pred);
		else prob.addInit(new NotAtomicFormula(pred));
	}

 
	protected FHead findFunction(final String funcName, PDDLBase dom) 
		throws InvalidPDDLElementException
	{
		FHead func = dom.getFunction(funcName);
		if (func == null) {
			throw new InvalidPDDLElementException("Function " + funcName + " is not declared");
		}
		return func;
	}

	protected AtomicFormula findPredicate(final String predName, PDDLBase dom) 
		throws InvalidPDDLElementException
	{
		final AtomicFormula pred = dom.getPredicate(predName);
		if (pred == null) {
			throw new InvalidPDDLElementException("Predicate " + predName +" is not declared");
		}
		return pred;
	}
  
	protected Constant findConstant(final String cName, PDDLBase dom){
		final Constant c = dom.getConstant(cName);
		return c;
	}
}
