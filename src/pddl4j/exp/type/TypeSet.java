package pddl4j.exp.type;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.Stack;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.ArrayList;


/**
 * This is a composition of several types, so an object with this type
 * can be either of the types in this set 
 */
public final class TypeSet extends Type {

    private Collection<Type> types;

    /**
     * Creates a new type set consisting of these types.
     */
    public TypeSet(Collection<Type> _types) {
	super("CompilerFix"); //have to call empty constructor of superclass first thing. Though we are going to construct its parents here.

        if (_types == null) 
            throw new NullPointerException();
	if (_types.size()<=1){
	    throw new RuntimeException("Inconsistency, we would not want a typeset of only "+_types.size()+" size");
	}

	Set<Type> allParents=new LinkedHashSet<Type>();
	//construct anonymous typename:
	String _image=new String("");
	for (Type t: _types) {
		if (t instanceof TypeSet) throw new RuntimeException("don't make a TypeSet of TypeSets! "+_types);
		_image+=t+"_";
		allParents.addAll(t.getParentTypes());
	}

	types=new ArrayList();
	types.addAll(_types);

	setImage(_image);
	setParentTypes(allParents);
    }
    
    private TypeSet(String _image) {
	super(_image);
	types=new ArrayList();
    }
       
    public Object clone() {
	Type supClone=(Type)super.clone(); 
	
	TypeSet cloneT = new TypeSet(this.getImage());
	cloneT.setParentTypes(supClone.getParentTypes());
	for (Type t: types) cloneT.types.add((Type)t.clone());

	return cloneT;
    }

    //returns true if this type is either the same, or a subtype
    //of the other.
    public boolean isSubTypeOf(Type other){
	if (isSameType(other)) return true;

	if (other instanceof TypeSet) {
		System.out.println("This happens! "+this+" , "+other+" - "+getClass().getName());
		TypeSet otherTypeSet=(TypeSet) other;
		for (Type ot: otherTypeSet.types) {
			for (Type t: types) {
				if (t.isSubTypeOf(ot)) return true;
			}
		}
	}else{
		System.out.println("!This happens!!! "+this+" , "+other+" - "+getClass().getName());
		for (Type t: types) {
			//System.out.println("Checking if "+t+" is subset of "+other);
			if (t.isSubTypeOf(other)) return true;
		}
	}
	return false;
    }

    //helper function for isSubTypeOf
    protected boolean containedInParents(Set<Type> parentsSet) {
	//System.out.println("See if  "+this+" is contained in parents "+parentsSet);
	for (Type t: types) {
		if (parentsSet.contains(t)) return true;	
	}	
	return false;
    }
   
    protected boolean isSameType(Type other) {
        if (other.getClass().equals(this.getClass()) && this.getImage().equals(other.getImage())) return true;
	for (Type t: types) {
		if (t.isSameType(other)) return true;	
	}
	return false;	
    } 
   
    public boolean equals(Object obj) {
        if ((obj == null) || !obj.getClass().equals(this.getClass())) return false;
	TypeSet other=(TypeSet) obj;
	if (this.types.size()!=other.types.size()) return false;

	Iterator<Type> it1=this.types.iterator();
	Iterator<Type> it2=other.types.iterator();
	while (it1.hasNext()) {
		Type t1=it1.next();	
		Type t2=it2.next();	
		if (!t1.equals(t2)) return false;
	}
        return true;
    }


    public String toString() {
        StringBuffer str = new StringBuffer();
	str.append("Set:");
        str.append(this.getImage());
        return str.toString();
    }
    

     public String toDetailedString() {
        StringBuffer str = new StringBuffer();
        str.append(this.getImage());
	str.append(" { ");
	for (Type t: types) {
		str.append(t.toDetailedString());
	}
	str.append(" } ");
        return str.toString();
    }

    
    protected Collection<Type> getAllTypes(){
	return types;
    }
   
}
