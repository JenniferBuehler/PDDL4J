package pddl4j;

import pddl4j.exp.ListExp;
import pddl4j.exp.term.Constant;
import pddl4j.exp.term.Variable;
import pddl4j.exp.fexp.FExp;
import pddl4j.exp.NotExp;
import pddl4j.exp.AtomicFormula;
import pddl4j.exp.QuantifiedExp;
import pddl4j.exp.fcomp.FCompExp;
import pddl4j.exp.assign.AssignOpExp;
import pddl4j.exp.WhenExp;
import pddl4j.exp.ImplyExp;

/**
 * Base class for expression visitors.
 *
 * @author Jennifer Buehler 
 */
public interface ExpVisitor {
	public Object visitAtomicFormula(AtomicFormula f, Object arg);

	public Object visitWhenExp(WhenExp when, Object arg);

	public Object visitImplyExp(ImplyExp imply, Object arg);

	public Object visitCompExp(FCompExp exp, Object arg);

	public Object visitAssignOpExp(AssignOpExp exp, Object arg);

	public Object visitVariable(Variable variable, Object arg);

	public Object visitConstant(Constant constant, Object arg);

	public Object visitFExp(FExp fexp, Object arg);

	public Object visitNotExp(NotExp sentence, Object arg);

	public Object visitListExp(ListExp listExp, Object arg);

	public Object visitQuantifiedExp(QuantifiedExp exp, Object arg);
}
