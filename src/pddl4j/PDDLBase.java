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

import pddl4j.exp.type.Type;
import pddl4j.exp.term.Constant;
import pddl4j.exp.fexp.FHead;
import pddl4j.exp.action.ActionDef;
import pddl4j.exp.AtomicFormula;

/**
 * Base class for PDDL domains and problems.
 *
 * Contains common fields needed for both, such as requirements,
 * constants and types, and defines an interface which needs
 * to be implemented by domains and problems.
 *
 * @author Jennifer Buehler 
 */
public abstract class PDDLBase implements Serializable {

	 /**
	 * The domain name of this PDDL object.
	 */
	protected String domainName;

	/**
	 * The require table of this PDDL object.
	 */
	protected LinkedHashSet<RequireKey> requirements;   

	protected Map<String, Constant> constants;

	//The map used to store for each type its associated constants.
	protected Map<Type, Set<Constant>> typeDomains;

	public PDDLBase(String _domainName) {
		domainName=_domainName;
		this.requirements = new LinkedHashSet<RequireKey>();
		this.requirements.add(RequireKey.STRIPS);
		this.constants = new LinkedHashMap<String, Constant>();
		this.typeDomains = new LinkedHashMap<Type, Set<Constant>>();

	 }

	public boolean hasRequirement(RequireKey r){
		return requirements.contains(r);
	}

	public void addRequirement(RequireKey r) {
		requirements.add(r);
	}

	public int hashCode() {
		return this.domainName.hashCode();
	}

	/**
	 * @return an iterator over the requirements of this pddl object.
	 */
	public Iterator<RequireKey> requirementsIterator(){
		return this.requirements.iterator();
	}

	/**
	 * @return an iterator over the constants defined in this pddl object.
	 */
	public Iterator<Constant> constantsIterator(){
		return this.constants.values().iterator();
	}

	/**
	 * Returns the name of the domain.
	 * 
	 * @return the name of the domain.
	 */
	public String getDomainName()  {
		return domainName;
	}

	public void setDomainName(String name) {
		domainName=name;
	}
	

	public Constant getConstant(String name) {
		return constants.get(name);
	}
	public boolean hasConstant(String c) {
		return constants.containsKey(c);
	}
	public boolean hasConstant(Constant c) {
		return hasConstant(c.getImage());
	}

	private void registerTypeDomain(Constant c, Type cType){
		Set<Constant> dom=typeDomains.get(cType);
		if (dom==null) { //add new entry
 			dom=new LinkedHashSet<Constant>(); //new map entry
 			typeDomains.put(cType,dom); //new map entry
		}else if (dom.contains(c)) {
			throw new RuntimeException("Constant "+c+" already registered in type map");
		}
		dom.add(c);
	}

	public Map<Type, Set<Constant>> getTypedConstants(){
		return typeDomains;
	}

	public boolean addConstant(Constant c) {
		if (hasConstant(c)) return false;
		//Type cType=c.getOnlyType();
		//if (cType==null) return false;
		constants.put(c.getImage(),c);
		registerTypeDomain(c,c.getType());
		return true;
	}


	public boolean addConstant(String constName, Type cType) {
		if (hasConstant(constName)) return false;
		Constant c=new Constant(constName,cType);
		constants.put(constName,c);
		registerTypeDomain(c,cType);
		return true;
	}


	/**
	 * Returns the set of constants associated to a specified type.
	 * 
	 * @param type the type.
	 * @return the set of constants associated to a type or <code>null</code>
	 *		 if the type is not defined in the pddl object.
	 */
	/*public Set<Constant> getTypedDomain(Type type) {
		return this.typeDomains.get(type);
	}*/
	 
	public Set<Constant> getTypedDomain(Collection<Type> types) {
		Set<Constant> dom =  new LinkedHashSet<Constant>();
		for (Type st : types) {
			Set<Constant> tmp = this.typeDomains.get(st);
			if (tmp != null) dom.addAll(tmp);
		}
		return dom;
	}

	public String toTypedString() {
		String ret = "Domain: "+domainName+" - Requirements: "+requirements+"\n";
		if (constants.size()>0){	
			ret+="Constants: \n    ";
			for (Map.Entry<String, Constant> c: constants.entrySet()) 
				ret+=c.getValue().toTypedString()+" ";
			ret+="\n";
		}
		return ret;

	}

	public String toString() {
		String ret = "Domain: "+domainName+" - Requirements: "+requirements+"\n";
		if (constants.size()>0){	
			ret+="Constants: \n    ";
			for (Map.Entry<String, Constant> c: constants.entrySet()) 
				ret+=c.getKey()+" ";
			ret+="\n";
		}
		return ret;
	}

	public abstract Collection<Type> getAllChildTypes(Type t) throws UnsupportedOperationException;
	public abstract FHead getFunction(String name) throws UnsupportedOperationException;
	public abstract AtomicFormula getPredicate(String name) throws UnsupportedOperationException;
	public abstract ActionDef getAction(String name) throws UnsupportedOperationException;
	public abstract boolean hasFunction(String name) throws UnsupportedOperationException;
	public abstract boolean hasPredicate(String name) throws UnsupportedOperationException;
	public abstract boolean hasAction(String a) throws UnsupportedOperationException;
	public abstract Type getType(String type) throws UnsupportedOperationException;
	public abstract boolean hasType(String type)throws UnsupportedOperationException;
}
