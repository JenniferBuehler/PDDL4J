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

package pddl4j;

import java.io.File;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;

import pddl4j.exp.Exp;
import pddl4j.exp.Exp;
import pddl4j.exp.AndExp;
import pddl4j.exp.InitEl;
import pddl4j.exp.metric.MetricExp;
import pddl4j.exp.term.Constant;
import pddl4j.exp.type.Type;

import pddl4j.exp.fexp.FHead;
import pddl4j.exp.action.ActionDef;
import pddl4j.exp.AtomicFormula;
/**
 * This interface defines the accessible methods from a problem.
 * 
 * @author Damien Pellier, significant modifications by Jennifer Buehler
 */
public class Problem extends PDDLBase {

	//The initial state.
	protected ArrayList<InitEl> init;

	//The goal.
	protected Exp goal;

	// The metric specification.
	protected MetricExp metric;

	protected String problemName;

	public Problem(String _domainName, String _problemName) {
		super(_domainName);
		this.problemName = _problemName;
		this.init = new ArrayList<InitEl>();
		this.goal = new AndExp();
		this.metric = null;
	}


	public int hashCode() {
		return this.domainName.hashCode() + this.problemName.hashCode();
	}


	/**
	 * @return the metric of the PDDL object.
	 */
	public MetricExp getMetric(){
		return this.metric;
	}

	public void setMetric(MetricExp m){
		this.metric=m;
	}

	/**
	 * @return the goal of the PDDL object.
	 */
	public Exp getGoal(){
		return this.goal;
	}

	public void setGoal(Exp g) {
		this.goal=g;
	}

	/**
	 * @return the initial state of the PDDL object.
	 */
	public List<InitEl> getInit(){
		return this.init;
	}
	
	public List<Exp> getInitAsExp(){
		List<Exp> ret=new ArrayList<Exp>();
		for (InitEl elem: this.init) {
			Exp a= (Exp) elem;
			if (elem==null) throw new RuntimeException("All elements in init statement must be of type Exp!!");
			ret.add(a);
		}
		return ret;
	}



	public void addInit(InitEl init){
		this.init.add(init);
	}

	public String toString(){
		String ret="Problem: "+problemName+"\n";
		ret+=super.toString();
		ret+="Goal: "+this.goal;
		ret+="\nInit: \n";
		for (InitEl i: this.init){
			ret+="    "+i+"\n";
		}
		ret+="Metric: "+this.metric;
		return ret;	
	}

	public String toTypedString(){
		String ret="Problem: "+problemName+"\n";
		ret+=super.toTypedString();
		ret+="Goal: "+this.goal.toTypedString();
		ret+="\nInit: \n";
		for (InitEl i: this.init){
			ret+="    "+i.toTypedString()+"\n";
		}
		if (this.metric!=null) ret+="Metric: "+this.metric.toTypedString();
		return ret;	
	}


	/**
	 * @return the name of the problem.
	 */
	String getProblemName(){
		return problemName;
	}

	public FHead getFunction(String name) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("function not supported in problem");
	}
	public AtomicFormula getPredicate(String name) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("predicate not supported in problem");
	}
	public ActionDef getAction(String name) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("action not supported in problem");
	}

	public boolean hasFunction(String name) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("function not supported in problem");
	}
	public boolean hasPredicate(String name) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("predicate not supported in problem");
	}
	public boolean hasAction(String a) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("action not supported in problem");
	}

	public Type getType(String type) throws UnsupportedOperationException{
		throw new UnsupportedOperationException("type not supported in problem");
	}

	public boolean hasType(String type)throws UnsupportedOperationException {
		throw new UnsupportedOperationException("type not supported in problem");
	}

        public Collection<Type> getAllChildTypes(Type t) throws UnsupportedOperationException{
		throw new UnsupportedOperationException("type not supported in problem");
	}


}