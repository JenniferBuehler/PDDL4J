/*
 * Copyright Dept. of Mathematics & Computer Science Univ. Paris-Descartes
 *
 * This software is governed by the CeCILL  license under French law and
 * abiding by the rules of distribution of free software.  You can  use,
 * modify and/ or redistribute the software under the terms of the CeCILL
 * license as circulated by CEA, CNRS and INRIA at the following URL
 * "http://www.cecill.info".
 *
 * As a counterpart to the access to the source code and  rights to copy,
 * modify and redistribute granted by the license, users are provided only
 * with a limited warranty  and the software's author,  the holder of the
 * economic rights,  and the successive licensors  have only  limited
 * liability.
 *
 * In this respect, the user's attention is drawn to the risks associated
 * with loading,  using,  modifying and/or developing or reproducing the
 * software by the user in light of its specific status of free software,
 * that may mean  that it is complicated to manipulate,  and  that  also
 * therefore means  that it is reserved for developers  and  experienced
 * professionals having in-depth computer knowledge. Users are therefore
 * encouraged to load and test the software's suitability as regards their
 * requirements in conditions enabling the security of their systems and/or
 * data to be ensured and,  more generally, to use and operate it in the
 * same conditions as regards security.
 *
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL license and that you accept its terms.
 */

package pddl4j.exp.action;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Iterator;

import pddl4j.exp.Exp;
import pddl4j.exp.ExpID;
import pddl4j.exp.ListExp;
import pddl4j.exp.term.Term;
import pddl4j.exp.term.Substitution;
import pddl4j.exp.time.TimedExp;
import pddl4j.exp.time.AtStartTimedExp;
import pddl4j.exp.time.AtEndTimedExp;
import pddl4j.exp.time.OverTimedExp;

/**
 * This class implements a durative action of the PDDl language.
 * 
 * @author Damien Pellier, modifications by Jennifer Buehler
 * @version 1.0 
 */
public class DurativeAction extends AbstractActionDef {

    /**
     * The serial version id of the class.
     */
    private static final long serialVersionUID = 7123555664571927698L;
    
    /**
     * The duration constraint of the action.
     */
    private Exp constraint;
    
    /**
     * The condition of the durative action.
     */
    private Exp condition;
    
    /**
     * The effect of the durative action.
     */
    private Exp effect;
    
    /**
     * Creates a new durative action with a specific name.
     * 
     * @param name the name of the durative action. The name must a not null
     *            reference.
     * @throws NullPointerException if <code>name == null</code>.           
     */
    public DurativeAction(String name) {
        super(ActionID.DURATIVE_ACTION, name);   
    }


   /*
    public int hashCode(){
	return super.hashCode();// ^ constraint.hashCode() ^ condition.hashCode() ^ effect.hashCode();
    } 

    public boolean equals(Object obj) {
        if ((obj != null) && (obj instanceof DurativeAction)) {
            DurativeAction other = (DurativeAction) obj;
            return this.getName().equals(other.getName()) 
			&& this.condition.equals(other.condition) 
			&& this.effect.equals(other.effect)
			&& this.constraint.equals(other.constraint);
        }
        return false;
    }*/


    public boolean isDurative(){ 
	return true;
    }
   
    public ActionDef apply(Substitution sigma){
	DurativeAction copy=(DurativeAction)super.apply(sigma);
	copy.condition=condition.apply(sigma);
	copy.effect=effect.apply(sigma);
	copy.constraint=constraint.apply(sigma);
	return copy;
    }
 
    /**
     * Returns the duration constraint of the durative action. 
     * 
     * @return the duration constraint of the durative action.
     */
    public final Exp getConstraint() {
        return this.constraint;
    }
    
    /**
     * Sets the new duration constraint of the durative action.
     * 
     * @param cons the new duration constraint of the durative action.
     * @throws NullPointerException if <code>cons == null</code>.
     */
    public final void setConstraint(Exp cons) {
        if (cons == null)
            throw new NullPointerException();
        this.constraint = cons;
    }
    
    /**
     * Returns the condition of the durative action. 
     * 
     * @return the condition of the durative action.
     */
    public final Exp getCondition() {
        return this.condition;
    }
    
    /**
     * Sets the new condition of the durative action.
     * 
     * @param cond the new condition of the durative action.
     * @throws NullPointerException if <code>cond == null</code>.
     */
    public final void setCondition(Exp cond) {
        if (cond == null)
            throw new NullPointerException();
        this.condition = cond;
    }
    
    /**
     * Returns the effect of the durative action. 
     * 
     * @return the effect of the durative action.
     */
    public final Exp getEffect() {
        return this.effect;
    }
    
    /**
     * Sets the new effect of the durative action.
     * 
     * @param effect the new effect of the durative action.
     * @throws NullPointerException if <code>effect == null</code>.
     */
    public final void setEffect(Exp effect) {
        if (effect == null) 
            throw new NullPointerException();
        this.effect = effect;
    }
    
    /**
     * Standardizes all occurrences of the variables that occur in this
     * expression. a standardized copy of this expression.
     * 
     * @return a standardized copy of this expression.
     */
    public DurativeAction standardize() {
        Map<String,String> images = new LinkedHashMap<String, String>();
        DurativeAction other = (DurativeAction) this.clone();
        other.parameters.clear();
        for (Term param : this.parameters) {
            other.add(param.standardize(images));
        }
        other.constraint = this.constraint.standardize(images);
        other.condition = this.condition.standardize(images);
        other.effect = this.effect.standardize(images);
        return other;
    }
    
    /**
     * Normalize this action. This method returns a copy of this action where:
     * <ul>
     * <li> each variable is standardized,</li>
     * <li> duration constraints expression is convert into conjunctive prenex
     * normal form and</li>
     * <li> condition expression is convert into disjunctive prenex normal form
     * and</li>
     * <li> effect expression is is convert into conjunctive prenex normal form.</li>
     * <ul>
     * 
     * @return a normalize copy of this action.
     * @see pddl4j.exp.Exp#toPrenexNormaForm()
     * @see pddl4j.exp.Exp#toConjunctiveNormalForm()
     * @see pddl4j.exp.Exp#toDisjunctiveNormalForm()
     */
    public DurativeAction normalize() {
        DurativeAction other = (DurativeAction) this.standardize();
        other.constraint = other.constraint.moveQuantifierOutward()
                    .toConjunctiveNormalForm();
        other.condition = other.condition.moveQuantifierOutward()
                    .toDisjunctiveNormalForm();
        other.effect = other.effect.moveQuantifierOutward()
                    .toConjunctiveNormalForm();
        return other;
    }
    
    /**
     * Returns <code>true</code> if the expression is ground.
     * 
     * @return <code>true</code> if the expression is ground;
     *         <code>false</code>otherwise.
     * @see pddl4j.exp.Exp#isGround()
     */
    public boolean isGround() {
	 return super.isGround() 
		&& this.constraint.isGround()
		&& this.condition.isGround()
		&& this.effect.isGround();
    }
    
    /**
     * Creates and returns a copy of this expression.
     * 
     * @return a clone of this expression instance.
     * @see pddl4j.exp.Exp#clone()
     */
    public Object clone() {
        DurativeAction other = (DurativeAction) super.clone();
        other.constraint = this.constraint.clone();
        other.condition = this.condition.clone();
        other.effect = this.effect.clone();
        return other;
    }
    
    /**
     * Returns a string representation of the durative action.
     * 
     * @return a string representation of the durative action.
     */
    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("(:durative-action ");
        str.append(this.getName());
        str.append(":parameters ");
        str.append("(");
        if (!this.parameters.isEmpty()) {
            Iterator<Term> i = this.parameters.iterator();
            str.append(i.next().toString());
            while (i.hasNext()) {
                str.append(" " + i.next().toString());
            }
        }
        str.append(")");
        if (this.constraint!=null) {
		str.append("\n:duration ");
	        str.append(this.constraint.toString());
	}
	if (this.condition!=null) {
	        str.append("\n:condition ");
       		str.append(this.condition.toString());
	}
        if (this.effect != null) {
		str.append("\n:effect ");
        	str.append(this.effect.toString());
	}
        str.append(")");
        return str.toString();
    }
    
    /**
     * Returns a typed string representation of the durative action.
     * 
     * @return a typed string representation of the durative action.
     */
    public String toTypedString() {
        StringBuffer str = new StringBuffer();
        str.append("(:durative-action ");
        str.append(this.getName());
        str.append(":parameters ");
        str.append("(");
        if (!this.parameters.isEmpty()) {
            Iterator<Term> i = this.parameters.iterator();
            str.append(i.next().toTypedString());
            while (i.hasNext()) {
                str.append(" " + i.next().toTypedString());
            }
        }
        str.append(")");
        str.append("\n:duration ");
        str.append(this.constraint.toTypedString());
        str.append("\n:condition ");
        str.append(this.condition.toTypedString());
        str.append("\n:effect ");
        str.append(this.effect.toTypedString());
        str.append(")");
        return str.toString();
    }

 
    //returns the condition c only if it is valid at start.
    //works only if e is not a list expression
    private Exp getStartExp(Exp c){
	if (c.getExpID()!=ExpID.TIMED_EXP) return c; //assume if there's no tag, it is always valid! //throw new RuntimeException("Timed expressions expected! "+c);
	if (c instanceof AtStartTimedExp) return ((TimedExp)c).getExp();
	return null;
    } 

    //returns the condition c only if it is valid during the action.
    //works only if e is not a list expression
    private Exp getOverExp(Exp c){
	if (c.getExpID()!=ExpID.TIMED_EXP) return c; //assume if there's no tag, it is always valid! //throw new RuntimeException("Timed expressions expected! "+c);
	if (c instanceof OverTimedExp) return ((TimedExp)c).getExp();
	return null;
    } 

    //returns the condition c only if it is valid at start, or during the action.
    //works only if e is not a list expression
    private Exp getStartOrOverExp(Exp c){
	if (c.getExpID()!=ExpID.TIMED_EXP) return c; //assume if there's no tag, it is always valid! //throw new RuntimeException("Timed expressions expected! "+c);
	if ((c instanceof OverTimedExp) || (c instanceof AtStartTimedExp)) return ((TimedExp)c).getExp();
	return null;
    } 

    //returns the condition c only if it is valid at start, or during the action.
    //works only if e is not a list expression
    private Exp getEndOrOverExp(Exp c){
	if (c.getExpID()!=ExpID.TIMED_EXP) return c; //assume if there's no tag, it is always valid! //throw new RuntimeException("Timed expressions expected! "+c);
	if ((c instanceof OverTimedExp) || (c instanceof AtEndTimedExp)) return ((TimedExp)c).getExp();
	return null;
    } 




    //returns the condition c only if it is valid at end.
    //works only if e is not a list expression
    private Exp getEndExp(Exp c){
	if (c.getExpID()!=ExpID.TIMED_EXP) return c; //assume if there's no tag, it is always valid! //throw new RuntimeException("Timed expressions expected! "+c);
	if (c instanceof AtEndTimedExp) return ((TimedExp)c).getExp();
	return null;
    } 


    public Exp getStartAndOverConditions(){
	//Preconditions will be actions which occur only at start
	if (condition instanceof ListExp){ //we have a list expression
		ListExp _cond=(ListExp) condition;
		ListExp cond=_cond.clone();
		cond.clearElems();
		for (Exp c: _cond){
			Exp sub=getStartOrOverExp(c);
			if (sub!=null) cond.add(sub);
		}
		return cond;
	}
	//it is a simple element only
	Exp c=getStartOrOverExp(condition);
	if (c==null) return null;
	return c;
    }




    public Exp getStartCondition(){
	//Preconditions will be actions which occur only at start
	if (condition instanceof ListExp){ //we have a list expression
		ListExp _cond=(ListExp) condition;
		ListExp cond=_cond.clone();
		cond.clearElems();
		for (Exp c: _cond){
			Exp sub=getStartExp(c);
			if (sub!=null) cond.add(sub);
		}
		return cond;
	}
	//it is a simple element only
	Exp c=getStartExp(condition);
	if (c==null) return null;
	return c;
    }

    public Exp getOverCondition(){
	//Preconditions will be actions which occur only at start
	if (condition instanceof ListExp){ //we have a list expression
		ListExp _cond=(ListExp) condition;
		ListExp cond=_cond.clone();
		cond.clearElems();
		for (Exp c: _cond){
			Exp sub=getOverExp(c);
			if (sub!=null) cond.add(sub);
		}
		return cond;
	}
	//it is a simple element only
	Exp c=getOverExp(condition);
	if (c==null) return null;
	return c;
    }


    public Exp getStartAndOverCondition(){
	//Preconditions will be actions which occur only at start
	if (condition instanceof ListExp){ //we have a list expression
		ListExp _cond=(ListExp) condition;
		ListExp cond=_cond.clone();
		cond.clearElems();
		for (Exp c: _cond){
			Exp sub=getStartOrOverExp(c);
			if (sub!=null) cond.add(sub);
		}
		return cond;
	}
	//it is a simple element only
	Exp c=getStartOrOverExp(condition);
	if (c==null) return null;
	return c;
    }

    public Exp getEndAndOverCondition(){
	//Preconditions will be actions which occur only at start
	if (condition instanceof ListExp){ //we have a list expression
		ListExp _cond=(ListExp) condition;
		ListExp cond=_cond.clone();
		cond.clearElems();
		for (Exp c: _cond){
			Exp sub=getEndOrOverExp(c);
			if (sub!=null) cond.add(sub);
		}
		return cond;
	}
	//it is a simple element only
	Exp c=getEndOrOverExp(condition);
	if (c==null) return null;
	return c;
    }




    public Exp getEndCondition(){
	//Preconditions will be actions which occur only at start
	if (condition instanceof ListExp){ //we have a list expression
		ListExp _cond=(ListExp) condition;
		ListExp cond=_cond.clone();
		cond.clearElems();
		for (Exp c: _cond){
			Exp sub=getEndExp(c);
			if (sub!=null) cond.add(sub);
		}
		return cond;
	}
	//it is a simple element only
	Exp c=getEndExp(condition);
	if (c==null) return null;
	return c;
    }



     //returns immediate effect after ending this action
    public Exp getEndEffect(){
	//Preconditions will be actions which occur only at start
	if (effect instanceof ListExp){ //we have a list expression
		ListExp _eff=(ListExp) effect;
		ListExp eff=_eff.clone();
		eff.clearElems();
		for (Exp c: _eff){
			Exp sub=getEndExp(c);
			if (sub!=null) eff.add(sub);
		}
		return eff;
	}
	//it is a simple element only
	Exp e=getEndExp(effect);
	if (e==null) return null;
	return e;
    }

     //returns immediate effect after starting this action
     public Exp getStartEffect(){
	//Preconditions will be actions which occur only at start
	if (effect instanceof ListExp){ //we have a list expression
		ListExp _eff=(ListExp) effect;
		ListExp eff=_eff.clone();
		eff.clearElems();
		for (Exp c: _eff){
			Exp sub=getStartExp(c);
			if (sub!=null) eff.add(sub);
		}
		return eff;
	}
	//it is a simple element only
	Exp e=getStartExp(effect);
	if (e==null) return null;
	return e;
    }

     //returns immediate effect after starting this action
     public Exp getOverEffect(){
	//Preconditions will be actions which occur only at start
	if (effect instanceof ListExp){ //we have a list expression
		ListExp _eff=(ListExp) effect;
		ListExp eff=_eff.clone();
		eff.clearElems();
		for (Exp c: _eff){
			Exp sub=getOverExp(c);
			if (sub!=null) eff.add(sub);
		}
		return eff;
	}
	//it is a simple element only
	Exp e=getOverExp(effect);
	if (e==null) return null;
	return e;
    }



      //returns immediate effect after starting this action
     public Exp getStartAndOverEffect(){
	//Preconditions will be actions which occur only at start
	if (effect instanceof ListExp){ //we have a list expression
		ListExp _eff=(ListExp) effect;
		ListExp eff=_eff.clone();
		eff.clearElems();
		for (Exp c: _eff){
			Exp sub=getStartOrOverExp(c);
			if (sub!=null) eff.add(sub);
		}
		return eff;
	}
	//it is a simple element only
	Exp e=getStartOrOverExp(effect);
	if (e==null) return null;
	return e;
    }
 



}
