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
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.List;

import pddl4j.exp.type.Type;
import pddl4j.exp.term.Constant;

import pddl4j.exp.fexp.FHead;
import pddl4j.exp.action.ActionDef;
import pddl4j.exp.AtomicFormula;
import pddl4j.*;
import pddl4j.exp.*;

/**
 * Class which contains both a domain and a problem.
 *
 * @author Jennifer Buehler 
 */
public class DomainAndProblem extends PDDLBase {

	protected Domain domain;
	protected Problem problem;

	public DomainAndProblem(Domain dom, Problem prob) {
		super(dom.getDomainName());
		domain=dom;
		problem=prob;
		mergeConstants(domain,problem);
	 }

	public Problem getProblem() {
		return problem;
	}


	public void addRequirement(RequireKey r) {
		domain.addRequirement(r);
		problem.addRequirement(r);
	}

	public int hashCode() {
		return this.domain.getDomainName().hashCode();
	}

	public Set<Constant> getTypedDomainHierarchical(Type type) {
		
		Collection<Type> allTypes=getAllChildTypes(type);
		allTypes.add(type);
		
		Set<Constant> constants=domain.getTypedDomain(allTypes);
		constants.addAll(problem.getTypedDomain(allTypes));	
		return constants;
	}

	public Iterator<AtomicFormula> predicatesIterator(){
		return this.domain.predicatesIterator();
	}
	public Iterator<ActionDef> actionsIterator(){
		return this.domain.actionsIterator();
	}

	/**
	 * @return an iterator over the requirements of this pddl object.
	 */
	public Iterator<RequireKey> requirementsIterator(){
		return this.domain.requirementsIterator();
	}

	/**
	 * @return an iterator over the constants defined in this pddl object.
	 */
	/*Iterator<Constant> constantsIterator(){
		return this.constants.values().iterator();
	}*/

	public Exp getGoal(){
		return problem.getGoal();
	}

	public List<InitEl> getInit(){
		return problem.getInit();
	}

	/**
	 * Returns the name of the domain.
	 * @return the name of the domain.
	 */
	public String getDomainName()  {
		return domainName;
	}

	public void setDomainName(String name) {
		domain.setDomainName(name);
		problem.setDomainName(name);
	}
	
	/*public final Constant getConstant(String name) {
		Constant c = problem.getConstant(name);
		if (c==null) {
			c = domain.getConstant(name);
		} else {
			//just a consistency check:
			Constant c2 = domain.getConstant(name);
			if ((c2!=null) && ((c!=c2) || !c.getType().equals(c2.getType()))){
				throw new RuntimeException("Constant "+c+" are different or have different types in Domain and Problem!");
			}
		}
		return c;
	}
	public boolean hasConstant(String c) {
		return problem.hasConstant(c) || domain.hasConstant(c);
	}
*/
	public boolean addConstant(Constant c) {
		throw new UnsupportedOperationException("Constant should be added explicitly to domain or problem");
	}

	public boolean addConstant(String constName, Type cType) {
		throw new UnsupportedOperationException("Constant should be added explicitly to domain or problem");
	}

	public String toString() {
		return "------------------- Domain ---------------\n"+domain
		      +"------------------- Problem ---------------\n"+problem;
	}
	public FHead getFunction(String name) throws UnsupportedOperationException {
		return domain.getFunction(name);
	}
	public AtomicFormula getPredicate(String name) throws UnsupportedOperationException {
		return domain.getPredicate(name);
	}
	public ActionDef getAction(String name) throws UnsupportedOperationException {
		return domain.getAction(name);
	}

	public boolean hasFunction(String name) throws UnsupportedOperationException {
		return domain.hasFunction(name);
	}
	public boolean hasPredicate(String name) throws UnsupportedOperationException {
		return domain.hasPredicate(name);
	}
	public boolean hasAction(String a) throws UnsupportedOperationException {
		return domain.hasAction(a);
	}

	public Type getType(String type) throws UnsupportedOperationException{
		return domain.getType(type);
	}

	public boolean hasType(String type)throws UnsupportedOperationException {
		return domain.hasType(type);
	}

  public Collection<Type> getAllChildTypes(Type t) throws UnsupportedOperationException{
		return domain.getAllChildTypes(t);
	}

  /**
   * Merges the constants of the given domain and the problem into this instance.
   */
	private void mergeConstants(Domain domain, Problem problem){
		constants.putAll(problem.constants);
		constants.putAll(domain.constants); 
		for (Map.Entry<String,Constant> entry: domain.constants.entrySet()) {
			Constant c=entry.getValue();
			//just a consistency check:
			Constant c2 = getConstant(c.getImage());
			if ((c2!=null) && ((c!=c2) || !c.getType().equals(c2.getType()))){
				throw new RuntimeException("Constant "+c+" are different or have different types in Domain and Problem!");
			}
			if (c2==null) constants.put(entry.getKey(),c);
		}
		
		for (Map.Entry<String,Type> t: domain.fullTypes.entrySet()){
			Type type=t.getValue();
			Collection<Type> allTypes=domain.getAllChildTypes(type);
			allTypes.add(type);
			Set<Constant> c1=problem.getTypedDomain(allTypes);
			Set<Constant> c2=domain.getTypedDomain(allTypes);
			Set<Constant> merged=c1;
			merged.addAll(c2);
			typeDomains.put(type,merged);
		}
	}

}
