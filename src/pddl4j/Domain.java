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
import java.util.Set;
import java.util.Stack;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;

import pddl4j.exp.AtomicFormula;
import pddl4j.exp.action.ActionDef;
import pddl4j.exp.Exp;
import pddl4j.exp.type.Type;
import pddl4j.exp.fexp.FHead;
import pddl4j.exp.DerivedPredicate;
import pddl4j.exp.term.Constant;

/**
 */
public class Domain extends PDDLBase {

	public static final boolean CASE_SENSITIVE = false;



	protected Map<String,AtomicFormula> predicates;

	protected Map<String,FHead> functions;

	protected Set<Exp> constraints;

	protected Map<String, ActionDef> actions;

	protected File domainFile;

	//The axioms predicates table of this PDDL object.
	protected Set<DerivedPredicate> axioms;


	protected Map<String, Set<String>> types;
	protected Map<String, Type> fullTypes;



	public Domain(String name) {
		super(name);
		this.predicates = new LinkedHashMap<String,AtomicFormula>();
		this.functions = new LinkedHashMap<String,FHead>();
		this.constraints = new LinkedHashSet<Exp>();
		this.actions = new LinkedHashMap<String, ActionDef>();
		//this.axioms = new LinkedHashSet<DerivedPredicate>();
		this.types = new LinkedHashMap<String, Set<String>>();
		this.fullTypes = new LinkedHashMap<String, Type>();
		
		Set<String> objChildren=new LinkedHashSet<String>();
		objChildren.add(Type.NUMBER_SYMBOL);
		this.types.put(Type.OBJECT_SYMBOL, objChildren);
		this.types.put(Type.NUMBER_SYMBOL, new LinkedHashSet<String>());

		Set<Type> numberParents=new LinkedHashSet<Type>();
		numberParents.add(Type.OBJECT);
		this.fullTypes.put(Type.NUMBER_SYMBOL, new Type(Type.NUMBER_SYMBOL,numberParents));
		this.fullTypes.put(Type.OBJECT_SYMBOL, Type.OBJECT);
	}

	public Map<String,AtomicFormula> getPredicates() {
		return predicates;
	}
	public Map<String,FHead> getFunctions() {
		return functions;
	}
	public Map<String,ActionDef> getActions() {
		return actions;
	}
	public Collection<ActionDef> getActionList() {
		return actions.values();
	}

	private String typesString() {
		if (types.size()==0) return "";

		String ret="Types: \n";
		for (Map.Entry<String, Set<String>> t: types.entrySet()) {
			ret+="  "+t.getKey()+" -> ";
			Set<String> subSet=t.getValue();
			for (String st: subSet)  
				ret+=st+" ";
			ret+="\n";
		}
		return ret;
	}

	public String toTypedString() {
		
		String ret=super.toTypedString()+"\n";
		ret+=typesString();


		if (predicates.size()>0){	
			ret+="\nPredicates: \n\n";
			for (Map.Entry<String, AtomicFormula> c: predicates.entrySet()) 
				ret+=c.getValue().toTypedString()+"\n";
			ret+="\n";
		}

		if (functions.size()>0){	
			ret+="\nFunctions: \n\n";
			for (Map.Entry<String, FHead> c: functions.entrySet()) 
				ret+="    "+c.getValue().toTypedString()+"\n";
			ret+="\n";
		}

		if (actions.size()>0){	
			ret+="Actions: \n";
			for (Map.Entry<String, ActionDef> c: actions.entrySet()) 
				ret+="\n"+c.getValue().toTypedString()+"\n";
			ret+="\n";
		}

		return ret;	
	}


	public String toString() {
		
		String ret=super.toString()+"\n";
		ret+=typesString();
		if (predicates.size()>0){	
			ret+="\nPredicates: \n\n";
			for (Map.Entry<String, AtomicFormula> c: predicates.entrySet()) 
				ret+=c.getValue()+"\n";
			ret+="\n";
		}

		if (functions.size()>0){	
			ret+="\nFunctions: \n\n";
			for (Map.Entry<String, FHead> c: functions.entrySet()) 
				ret+="    "+c.getValue()+"\n";
			ret+="\n";
		}

		if (actions.size()>0){	
			ret+="Actions: \n";
			for (Map.Entry<String, ActionDef> c: actions.entrySet()) 
				ret+="\n"+c.getValue()+"\n";
			ret+="\n";
		}

		return ret;	
	}

	public int hashCode() {
		return this.domainName.hashCode();
	}

	public boolean addFunction(String fName, FHead f) {
		if (hasFunction(fName)) return false;
		functions.put(fName,f);
		return true;
	}
	public boolean addPredicate(String pName, AtomicFormula p) {
		if (hasPredicate(pName)) return false;
		predicates.put(pName,p);
		return true;
	}
	public boolean addAction(String aName, ActionDef a) {
		if (hasAction(aName)) return false;
		actions.put(aName,a);
		return true;
	}
	
	public FHead getFunction(String name) throws UnsupportedOperationException {
		return functions.get(name);
	}
	public AtomicFormula getPredicate(String name) throws UnsupportedOperationException {
		return predicates.get(name);
	}
	public ActionDef getAction(String name) throws UnsupportedOperationException {
		return actions.get(name);
	}

	public boolean hasFunction(String name) throws UnsupportedOperationException {
		return functions.containsKey(name);
	}
	public boolean hasPredicate(String name) throws UnsupportedOperationException {
		return predicates.containsKey(name);
	}
	public boolean hasAction(String a) throws UnsupportedOperationException {
		return actions.containsKey(a);
	}

	//@return an iterator over the actions defined in this pddl object.
	public Iterator<ActionDef> actionsIterator(){	
		return this.actions.values().iterator();	
	}

	/**
	 * @return an iterator over the functions defined in this pddl object.
	 */
	public Iterator<FHead> functionsIterator() {
		return this.functions.values().iterator();
	}

	/**
	 * @return an iterator over the types defined in this pddl object.
	 */
	//Iterator<Type> typesIterator();

	//@return an iterator over the predicates defined in this pddl object.
	public Iterator<AtomicFormula> predicatesIterator(){
		return this.predicates.values().iterator();
	}


	//after successively adding types, call finaliseTypes() so that internal
	//optimized structures can be built.
	public boolean addType(String typeName, String parentType) {
		/*if (hasType(typeName)) {
			System.out.println("Type "+typeName+" already exists.");
			return false;
		}*/
		if (!hasType(parentType)) {
			//assume that a new parent type (inheriting from object) is being added.
			throw new UnsupportedOperationException("Have to add parent types before child types! "+typeName+", "+parentType);
			/*if (!addType(parentType,Type.OBJECT_SYMBOL))
				throw new RuntimeException("Could not add new type "+parentType+" inheriting object");*/
		}
		Set<String> children=types.get(parentType);
		if (children.contains(typeName)) 
			throw new UnsupportedOperationException("Parent type "+parentType+" already registered for "+typeName);

		children.add(typeName);
		
		//it could be that this type already exists, and we just registered another parent for it.
		//that's why we should only add types here if they are not already in the map.
		if (!hasType(typeName)) types.put(typeName,new LinkedHashSet<String>());

		return true;
	}

	public void finaliseTypes(){
		Map<String,Set<Type>> parentsMap=createParentsMap();
		for (Map.Entry<String,Set<Type>> entry: parentsMap.entrySet()) {
			Type t=new Type(entry.getKey(),entry.getValue());
			//System.out.println("Adding full type "+t.toDetailedString());
			
			fullTypes.put(entry.getKey(),t);
		}
		//System.out.println("Finalized orig types: \n"+types);
		//System.out.println("Finalized full types: \n"+fullTypes);
	}

	//creates a map of all types found in the hierarchy and for each type adds a set of all its parent types
	private Map<String,Set<Type>> createParentsMap(){
		Map<String,Set<Type>> result= addAllParents(Type.OBJECT_SYMBOL,new LinkedHashSet<Type>());
		//System.out.println("Overall Result: "+result);
		return result;
	}

	/**
	 * Creates a map of all types found in the hierarchy starting from current typename, 
	 * and for each type adds a set of all its parent types.
	 * @param existing call this function with an empty set, this is a parameter that is needed for recursion to keep
	 * track of all parents found so far for a type.
	 */
	private Map<String,Set<Type>> addAllParents(String typename, Set<Type> existing){
		
		Set<String> children=types.get(typename);
		if (children==null) throw new RuntimeException("Type "+typename+" not defined in hierarchy");

		//System.out.println("Children of "+typename+": "+children);
		//
		if (children.isEmpty()) {
			Map<String,Set<Type>> result=new LinkedHashMap<String,Set<Type>>();
			Set<Type> parent=new LinkedHashSet<Type>();
			parent.addAll(existing);
			result.put(typename,existing);
			return result;
		}
			
		Map<String,Set<Type>> allResult=new LinkedHashMap<String,Set<Type>>();

		//recurse down to children
		for (String child: children) {
			Set<Type> existCopy=new LinkedHashSet<Type>();
			existCopy.addAll(existing);
			existCopy.add(new Type(typename,existing));
			Map<String,Set<Type>> result=addAllParents(child,existCopy);
			//System.out.println("All parents result  for "+child+": "+result+" exist: "+existCopy);
			allResult.put(child,existCopy);
			allResult.putAll(result);	
		}
		return allResult;

	}
	public Type getType(String type){
		return fullTypes.get(type);
	}

	public Collection<Type> getAllChildTypes(Type t) throws UnsupportedOperationException {
		//Map<String, Set<String>> types;
		//recurse down the hierarchy:
		Collection<String> children=new ArrayList<String>();
		getAllChildTypes(t.getImage(),children);

		Collection<Type> ret=new ArrayList<Type>(); 
		
		if (children.isEmpty()) return ret; //return empty set
		
		for (String child: children) {
			Type childT=fullTypes.get(child);
			if (childT==null) throw new RuntimeException("Inconsistency in types detected");
			ret.add(childT);
		}
		return ret;
	}

	public boolean hasType(String type){
		return types.containsKey(type);
	}



	/**
	 * Checks the consistence of the type hierarchy. A type hierarchy is
	 * consistent if the hierarchy does not contain cycle and all types
	 * inherite from object except the primitive type number.
	 * 
	 * @param hierarchy the type hierarchy.
	 * @return <code>true</code> if the type hierarchy is consistant;
	 *		 <code>false</code> otherwise.
	 */
	public boolean checkTypeHierarchy() {
		Set<String> explored = new LinkedHashSet<String>();
		if (!types.containsKey(Type.OBJECT_SYMBOL)) return false;
		Stack<String> stack = new Stack<String>();
		stack.push(Type.OBJECT_SYMBOL);
		Set<String> prefix = new LinkedHashSet<String>();
		boolean consistent = true;
		while (!stack.isEmpty() && consistent) {
			String type = stack.pop();
			explored.add(type);
			Set<String> children = types.get(type);
			if (children.isEmpty()) {
				prefix.remove(type);
			} else {
				consistent = prefix.add(type);
				if (!consistent) {
				}
				for (String child : children) {
					stack.push(child);

				}
			}
		}
		Set<String> allTypes = new LinkedHashSet<String>(types.keySet());
		allTypes.removeAll(explored);
		return consistent && (allTypes.isEmpty() || ((allTypes.size() == 1) && allTypes.contains(Type.NUMBER_SYMBOL)));
	}
		

	public Set<Constant> getTypedDomainHierarchical(Type type) {
		Collection<Type> allTypes=getAllChildTypes(type);
		allTypes.add(type);
		return getTypedDomain(allTypes);
	}


	/**
	 * Returns the domain file where the PDDL object is defined.
	 * 
	 * @return the domain file where the PDDL object is defined.
	 */
	public File getDomainFile(){
		return this.domainFile;
	}

	//collects all child types of this type down the hierarchy and adds them to
	//the collection
	private void getAllChildTypes(String type, Collection<String> c){
		Set<String> childTypes=types.get(type);
		c.addAll(childTypes);
		for (String child: childTypes) {
			getAllChildTypes(child,c);
		}
	}


}
