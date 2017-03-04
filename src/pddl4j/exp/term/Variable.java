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

package pddl4j.exp.term;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import pddl4j.exp.type.Type;
import pddl4j.exp.Exp;
import pddl4j.ExpVisitor;

/**
 * This class implements a variable.
 * 
 * @author Damien Pellier
 * @version 1.0 
 */
public class Variable extends AbstractTerm {
    
    /**
     * The default class version id.
     */
    private static final long serialVersionUID = -6404872183241547003L;

    /**
     * The timed variable symbol.
     */
    public static final String DURATIVE_VARIABLE = "?duration";
    public static final Variable DURATIVE_VARIABLE_INST = new Variable(DURATIVE_VARIABLE,Type.NUMBER);
    
    /**
     * The continus variable symbol.
     */
    public static final String CONTINOUS_VARIABLE = "#t";
    public static final Variable CONTINOUS_VARIABLE_INST = new Variable(CONTINOUS_VARIABLE,Type.NUMBER);
    
    public static final String TIMESTEP_VARIABLE = "#ts";
    public static final Variable TIMESTEP_VARIABLE_INST = new Variable(TIMESTEP_VARIABLE,Type.NUMBER);
    
    /**
     * The metric variable symbol.
     */
    public static final String TOTAL_TIME = "?total-time";
    
    /**
     * The violated preference variable symbol.
     */
    public static final String VIOLATED_PREF_VARIABLE = "?violated-pref-";
   
    /**
     * Creates a new variable with a specified image and type.
     * 
     * @param image the image of the variable.
     * @param type the type of this variable.
     * @throws NullPointerException if <code>image == null</code> or
     *        <code>type == null</code>.
     */
    public Variable(String image, Type type) {
        super(TermID.VARIABLE, image, type);
    }


    public Object accept(ExpVisitor v, Object obj){
	return v.visitVariable(this,obj);
    }
   
    /**
     * Returns the binding term to this variable in the specified substitution
     * or this variable is the variable is not bind the substitution.
     * 
     * @param sigma the substitution.
     * @return the substituted term or a copy of this variable if there is no
     *         binding term for this variable in the substitution.
     * @throws NullPointerException if <code>sigma == null</code>.
     */
    public Term apply(Substitution sigma) {
        if (sigma == null) 
            throw new NullPointerException();
        Term value = sigma.getBinding(this);
        return value != null ? value : this.clone();
    }
    
    /**
     * Sets a new type of this variable.
     * 
     * @param type the type to set.
     * @throws NullPointerException if <code>type == null</code>.
     */
    public void setType(Type type) {
        super.setType(type);
    }
    
    /**
     * Returns <code>true</code> if a term occurs in this term. This method
     * returns <code>true</code> if and only if the term is equal to this
     * variable.
     * 
     * @param term the term to be tested.
     * @return <code>true</code> if and only if the term is equal to this
     *         variable; <code>false</code> otherwise.
     * @throws NullPointerException if <code>term == null</code>.        
     */
    public boolean occurs(Term term) {
        if (term == null) 
            throw new NullPointerException();
        return this.equals(term);
    }
        
    /**
     * Returns <code>true</code> if this variable is ground.
     * 
     * @return <code>true</code> if this variable is ground; <code>false</code>
     *         otherwise.
     */
    public boolean isGround() {
        return false;
    }
 
    /**
     * Unify this variable with an other specified term. Note, called unify does
     * not modify the parameters of this method.
     * 
     * @param term the term to unify with.
     * @return The substitution that defines the binding constraints needed to
     *         unify this term with the other term or <code>null</code> if no
     *         binding constraints allows to unify the two terms.
     * @throws BindingException if the term to unify with this variable is a
     *             variable with the same symbol as this variable and has an
     *             incompatible type
     * @see pddl4j.exp.term.Term#unify(Term, Substitution)
     */
    public Substitution unify(Term term) {
        return this.unify(term, new Substitution());
    }

    /**
     * Unify this variable with an other specified term by taking into account a
     * specified set of binding constraints. Note, called unify does not modify
     * the parameters of this method.
     * 
     * @param term the term to unify with this variable.
     * @param sigma the substitution containing the binding constraints.
     * @return The substitution that defines the binding constraints needed to
     *         unify this term with the other term or <code>null</code> if no
     *         binding constraints allows to unify the two terms.
     * @throws BindingException if the term to unify with this variable is a
     *             variable with the same symbol as this variable and has an
     *             incompatible type
     */
    public Substitution unify(final Term term, final Substitution sigma) {
        Substitution theta = sigma.shallowClone();
        Term binding = theta.getBinding(this);
        if (binding != null) {
             // System.out.println(" Exist Bind "+term.toTypedString()+" and "+this.toTypedString()+". Binding: "+binding.toTypedString());
	     // Check if existing binding is compatible!
       	     Type thisType=getType();
	     Type termType=term.getType();
	     Type bindingType=binding.getType();
             // if ( binding.getType().equals(term.getType()) ||
             //      term.getType().isSubTypeOf(binding.getType())) {
	     if ( bindingType.equals(termType) ||
                  termType.isSubTypeOf(bindingType) ||
                  bindingType.isSubTypeOf(termType)) {
                 // NOTE: the commented condition was the first correct one,
                 // but there were problems unifying two variables of same
                 // type (both unbound still) for an existing binding to a
                 // more specific type... (e.g. (?v1 -tBase) with (?v2 - tBase)
                 // and a binding to ?v1 - tSpecific)
                 return binding.unify(term, sigma);
	    }
	    /*else{
		System.out.println("Not compatible");
	    }*/
        } else {
            if (term.getTermID().equals(TermID.VARIABLE)) {
		// we have another variable to bind with 
                if (term.getImage().equals(this.getImage())) {
                    if (this.getType().equals(term.getType())) {
                        // NOTE: maybe it's enough to check for common parent here?
                        return theta;
                    } else {
                        throw new BindingException("cannot bind "
                                    + this.toTypedString() + " with "
                                    + term.toTypedString()
                                    + ": imcompatible type");
                    }
                } else {
                    // bind a variable with a different name.
                    // Find a common parent type, and if there is one,
                    // bind the term with this type.
                    // System.out.println("Bind "+term+" and "+this);
                    Type commonParent=this.getType().getCommonParentWith(term.getType());
                    if (commonParent!=null) {
                        Variable var = (Variable) term.clone();
                        var.setType(commonParent);
                        theta.bind(this, var);
                        return theta;
                    }  // if the intersection set is empty, we can't unify!
                }
            } else {
		// System.out.println("Bind "+term.toTypedString()+" and "+this.toTypedString());
                if (!term.occurs(this)) {
                    if (term.getType().isSubTypeOf(this.getType())){
                        theta.bind(this, term);
                        return theta;
                    }
                }
            }
        }
        return null;
    }
    
    /**
     * Standardize this variable.
     * 
     * @return this expression.
     */
    public Variable standardize() {
        return this.standardize(new LinkedHashMap<String, String>());
    }
    
    /**
     * Standardizes a quantified variable.
     * 
     * @param images the object that maps old variable images to the standardize
     *            image.
     * @return this expression.
     * @throws NullPointerException if <code>images == null</code>.           
     */
    public Variable standardizeQuantifiedVariable(Map<String, String> images) {
        if (images == null)
            throw new NullPointerException();
        String newImage = images.get(this.getImage());
        if (newImage == null) {
            String oldImage = this.getImage();
            newImage = Variable.getStandardizedImage(oldImage);
            images.put(oldImage, newImage);
        } else {
            String oldImage = newImage;
            newImage = Variable.getStandardizedImage(oldImage);
            images.put(this.getImage(), newImage);
        }
        Variable var = this.clone();
        var.setImage(newImage);
        return var;
    }
    
    /**
     * Standardizes this variable. 
     * 
     * @param images the object that maps old variable images to the standardize
     *            image.
     * @return this expression.
     * @throws NullPointerException if <code>images == null</code>.           
     */
    public Variable standardize(Map<String, String> images) {
        if (images == null)
            throw new NullPointerException();
        String newImage = images.get(this.getImage());
        if (newImage == null) {
            String oldImage = this.getImage();
            newImage = Variable.getStandardizedImage(oldImage);
            images.put(oldImage, newImage);
        } 
        Variable var = this.clone();
        var.setImage(newImage);
        return var;
    }
    
    /**
     * Returns the standardized name of a variable from its specified image.
     * 
     * @param image the image.
     * @return the standardized name of a variable from its specified image.
     */
    public static String getStandardizedImage(String image) {
        String newImage = new String();
        String[] str = image.split("_");
        if (str.length == 2) {
            long index = Long.parseLong(str[1]);
            index++;
            newImage = str[0] + "_" + index;
            
        } else {
            newImage = str[0] + "_0";
        }
        return newImage;
    }
    
    /**
     * Returns the set of free variables of this expression.
     * 
     * @return the set of free variables of this expression.
     */
    public Set<Variable> getFreeVariables() {
        Set<Variable> vars = new LinkedHashSet<Variable>();
        vars.add(this);
        return vars;
    }
    
    /**
     * Returns <code>true</code> if this variable is equals to an other
     * object. This method return <code>true</code> if the object is a not
     * null instance of the class <code>Variable</code> and both variable have
     * the same image.
     * 
     * @param obj the object to compare.
     * @return <code>true</code> if this variable is equals to an other
     *         object; <code>false</code> otherwise.
     */
    public boolean equals(final Object obj) {
        if (obj != null && obj instanceof Variable) {
            return super.equals(obj);
        }
        return false;
    }
    
    /**
     * Return a deep copy of this variable.
     * 
     * @return a deep copy of this variable.
     * @see pddl4j.exp.term.AbstractTerm#clone()
     */
    public Variable clone() {
        return (Variable) super.clone();        
    }
    
    /**
     * Returns a string representation of this variable.
     * 
     * @return a string representation of this variable.
     */
    public String toString() {
        return this.getImage();
    }
    
    /**
     * Returns typed string representation of this variable.
     * 
     * @return typed string representation of this variable.
     */
    public final String toTypedString() {
        return this.getImage() + " - " + this.getType().toString();
    }
    
}