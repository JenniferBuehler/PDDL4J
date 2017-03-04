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

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import pddl4j.exp.term.Substitution.Binding;
//import pddl4j.DeepCloneable;


/**
 * This class implements a substitution.
 * 
 * @author Damien Pellier
 * @version 1.0 
 */
public final class Substitution implements Serializable, Cloneable, Iterable<Binding> {
    
    /**
     * The serial version id of the class.
     */
    private static final long serialVersionUID = 419929317756003422L;
    
    /**
     * The list of binding contained in the substitution.
     */
    private Map<Variable, Term> binding;
    
    /**
     * Creates a new substitution.
     */
    public Substitution() {
        this.binding = new LinkedHashMap<Variable, Term>();
    }
   

    /**
     * removes from this substitution all entries which have the same key as the substitutions in s.
     */
    public void subtractAll(Substitution s) {
        for (Map.Entry<Variable, Term> e : s.binding.entrySet()) {
            removeBinding(e.getKey());
        }
    }
 
    /**
     * Bind a specified variable to an other term in this substitution. If the
     * substitution previously contained a mapping term for the variable, the
     * old term value is replaced.
     * 
     * @param var the variable to bind.
     * @param term the term to be bound to <code>var</code>.
     * @return the previous term value associated with <code>var</code>,
     *         or <tt>null</tt> if there was no mapping term for <code>var</code>.
     * @throws NullPointerException if <code>var == null || term == null</code>.
     */
    public Term bind(final Variable var, final Term term) {
        if (var == null || term == null) 
            throw new NullPointerException();
        //if (!var.getType().getSubTypes().containsAll(term.getType().getSubTypes())) {
        if (!term.getType().isSubTypeOf(var.getType())) {
            throw new BindingException("[\"" + var.toTypedString() + "\" = \"" + term.toTypedString() + "\"]");
        }
        Term oldBinding = this.binding.get(var);
        this.binding.put(var, term);
        return oldBinding;
    }

    public boolean removeBinding(final Variable var) {
        if (var == null) 
            throw new NullPointerException();
        Term oldBinding = this.binding.remove(var);
	if (oldBinding==null) return false;
	return true;
    }

    
    /**
     * Returns <code>true</code> if a specified variable occurs in this
     * substitution.
     * 
     * @param var the variable to be tested.
     * @return <code>true</code> if a specified variable occurs in this
     *         substitution; <code>false</code> otherwise.
     */
    public boolean occurs(Variable var) {
        return this.binding.get(var) != null;
    }
    
    /**
     * Composes this substitution with an other one. 
     * 
     * @param sigma the substitution to compose.
     * @throws NullPointerException if <code>sigma == null</code>.
     */
   public void compose(final Substitution sigma) {
       if (sigma == null) 
           throw new NullPointerException();
        for (Map.Entry<Variable, Term> e : this.binding.entrySet()) {
           this.binding.put(e.getKey(), e.getValue().apply(sigma));
        } 
        this.binding.putAll(sigma.binding);
    }
    
    /**
     * Returns the term to which a specific variable is bound.
     *
     * @param var the exp bound.
     * @return <tt>null</tt> if the variable is not bound or the binding exp.
     * @throws NullPointerException if <code>var == null</code>.
     */
    public Term getBinding(final Variable var) {
        if (var == null) 
            throw new NullPointerException();
        return this.binding.get(var);   
    }
    
    /**
     * Returns a deep copy of the subtitution.
     * 
     * @return a deep copy of the subtitution.
     */
    public Substitution deepClone() {
        try {
            Substitution other = (Substitution) super.clone();
            other.binding = new LinkedHashMap<Variable, Term>();
            for (Map.Entry<Variable, Term> e : this.binding.entrySet()) {
                other.binding.put(e.getKey().clone(), e.getValue().clone());
            }
            return other;
        } catch (CloneNotSupportedException e) {
            throw new Error();
        }
    }
    public Substitution shallowClone() {
        try {
            Substitution other = (Substitution) super.clone();
            other.binding = new LinkedHashMap<Variable, Term>();
	    other.binding.putAll(this.binding);
            return other;
        } catch (CloneNotSupportedException e) {
            throw new Error();
        }
    }

    
    /**
     * Returns a string representation of the substitution.
     * 
     * @return a string representation of the substitution.
     */
    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("[");
        if (!this.binding.isEmpty()) {
            Iterator<Map.Entry<Variable, Term>> i = this.binding.entrySet().iterator();
            Map.Entry<Variable, Term> e = i.next();
            str.append(e.getKey() + "/" + e.getValue().toString());
            while (i.hasNext()) {
                e = i.next();
                str.append(", " + e.getKey() + "/" + e.getValue().toString());
            }
        } 
        str.append("]");
        return str.toString();
        
    }
    
    /**
     * Returns a typed string representation of the substitution.
     * 
     * @return a typed string representation of the substitution.
     */
    public String toTypedString() {
        StringBuffer str = new StringBuffer();
        str.append("[");
        if (!this.binding.isEmpty()) {
            Iterator<Map.Entry<Variable, Term>> i = this.binding.entrySet().iterator();
            Map.Entry<Variable, Term> e = i.next();
            str.append(e.getKey() + ":" + e.getKey().getType() + "/"
                            + e.getValue().toString() + ":"
                            + e.getValue().getType());
            while (i.hasNext()) {
                e = i.next();
                str.append(", " + e.getKey() + ":" + e.getKey().getType() + "/"
                            + e.getValue().toString() + ":"
                            + e.getValue().getType());
            }
        } 
        str.append("]");
        return str.toString();
        
    }
    
    /**
     * Returns the size of the substitution.
     * 
     * @return the size of the substitution.
     */
    public int size() {
        return this.binding.size();
    }

    /**
     * Returns an iterator over the binding of the substitution.
     * 
     * @return an iterator over the binding of the substitution.
     * @see java.lang.Iterable#iterator()
     */
    public Iterator<Binding> iterator() {
        Set<Binding> bindings = new LinkedHashSet<Binding>();
        for (Map.Entry<Variable, Term> e : this.binding.entrySet()) {
            bindings.add(new Binding(e.getKey(), e.getValue()));
        }
        return bindings.iterator();
    }

    // XXX Had to add this method to allow for checking double Substitution entries in the map!!
    public int hashCode() {
            return this.binding.hashCode();
    }


    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(this.getClass())) {
	    Substitution otherSub=(Substitution)obj;
            if (binding.equals(otherSub.binding)) return true;
        }
	return false;
    }
    
    /**
     * This inner class defines a binding between a variable and a term.
     * 
     * @author Damien Pellier
     * @version 1.0 
     */
    public final class Binding implements Serializable {

        /**
         * The serial version id of the class.
         */
        private static final long serialVersionUID = -3705403616252264846L;
        
        /**
         * The variable.
         */
        private Variable var;
        
        /**
         * The term.
         */
        private Term term;
        
        /**
         * Creates a new binding term.
         * 
         * @param var the binding variable.
         * @param term the binding value.
         * @throws NullPointerException if <code>var == null || term == null</code.
         */
        private Binding(Variable var, Term term) {
            this.var = var;
            this.term = term;
        }
        
        /**
         * Returns the binding variable.
         * 
         * @return the binding variable.
         */
        public Variable getVariable() {
            return this.var;
        }
        
        /**
         * Returns the binding term value.
         * 
         * @return the binding term value.
         */
        public Term getTerm() {
            return this.term;
        }
        
        /**
         * Returns <code>true</code> if this binding is equal to a other
         * object. This method return <code>true</code> if the object is a not
         * <code>null</code> instance of the class <code>Binding</code> and
         * the both attribute of the class are equal.
         * 
         * @param obj the object to be tested.
         * @return <code>true</code> if this binding is equal to a other
         *         object; <code>false</code> otherwise.
         */
        public boolean equals(Object obj) {
            if (obj != null && obj.getClass().equals(this.getClass())) {
                Binding other = (Binding) obj;
                return this.var.equals(other.var)
                            && this.term.equals(other.term);
            }
            return false;
        }
        
        /**
         * Returns the hash code value this binding.
         * 
         * @return the hash code value this binding.
         */
        public int hashCode() {
            return this.var.hashCode() ^ this.term.hashCode();
        }
        
        /**
         * Returns a string representation of this binding.
         * 
         * @return a string representation od this binding.
         */
        public String toString() {
            return this.var.toString() + "/" + this.term.toString();
        }
    }
}
