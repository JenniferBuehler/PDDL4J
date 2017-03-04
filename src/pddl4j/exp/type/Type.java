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

package pddl4j.exp.type;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.Map.Entry;
import java.util.Iterator;

/**
 * This class implements a type.
 * 
 * @author Damien Pellier, modified by Jennifer Buehler
 * @version 1.0
 */
public class Type implements Serializable, Cloneable {

    /**
     * The serial version id of the class.
     */
    private static final long serialVersionUID = -3938534221059491043L;

    /**
     * The object type symbol.
     */
    public static final String OBJECT_SYMBOL = "object";

    /**
     * The number type symbol.
     */
    public static final String NUMBER_SYMBOL = "number";

    /**
     * The number primitive type.
     */
    public static final Type OBJECT = new Type(Type.OBJECT_SYMBOL);
    public static final Type NUMBER = new Type(Type.NUMBER_SYMBOL,asSet(OBJECT));

    /**
     * The image of this type.
     */
    private String image;

    /**
     * The list of super types of this types.
     */
    private Set<Type> parentTypes;

    /**
     * Creates a new type with a specific image and parent types. 
     * 
     * @param image the image of the type.
     * @param parents the set of parent types.
     * @throws NullPointerException if <code>image == null</code> or
     *             <code>hierarchy == null</code>.
     * @throws TypingException if the type hierarchy specified is not
     *             consistant. A type hierarchy is consistant if it does not
     *             contain cycle and all types inherite from object except the
     *             primitive type number.
     */
    public Type(String image, Set<Type> parents) {
        if (image == null || parents == null) 
            throw new NullPointerException();
        this.image = image;
        this.parentTypes = parents;
    }
    
    /**
     * Creates a new type with a specific image. This type is considered as a
     * primitive type because no type hierarchy is specified. Consequencely, 
     * this type has no sub type and no super type and is final. 
     * 
     * @param image the image of the type.
     * @throws NullPointerException if <code>image == null</code>.
     */
    protected Type(String image) {
        this.image = image;
        this.parentTypes = new LinkedHashSet<Type>();
    }
   
    public Object clone() {
        Set<Type> parents = (Set<Type>) ((LinkedHashSet<Type>)parentTypes).clone();
	return new Type(new String(this.image),parents);	
    }

 
    /**
     * Returns the image of this type.
     * 
     * @return the image of this type.
     */
    public String getImage() {
        return this.image;
    }
    final protected void setImage(String s){
	this.image=s;
    }

    //returns true if this type is either the same, or a subtype
    //of the other.
    public boolean isSubTypeOf(Type other){
	// it is necessary to use isSameType(), and containedIn(),
        // instead of parentTypes.contains(), because
	// "other" could be of another type which has to do a different check
	return (other.isSameType(this)) || other.containedInParents(parentTypes);
    }

    //helper function for isSubTypeOf
    protected boolean containedInParents(Set<Type> parentsSet){
	return parentsSet.contains(this);	
    }

    /**
     * Checks if the types are equal. This is not as equal(), as it might check for some other
     * criteria which determine two types to be equal (by subclass implementations).
     * In particular, it isdesigned for use as a helper function in isSubTypeOf().
     */
    protected boolean isSameType(Type other) {
        if ((other != null) && other.getClass().equals(this.getClass())) {
            return this.image.equals(other.image);
        }
        return false;
    }


    /**
     * Returns the type which is a common parent type of this type and the other,
     * or null if there is no such common type. This function is useful if no
     * type is a subtype of the other, but a common parent might exist.
     */
    public Type getCommonParentWith(Type other){
	Set<Type> intersect = new LinkedHashSet(this.getParentTypes());
        intersect.retainAll(other.getParentTypes());
	if (intersect.isEmpty()) return null;
	
	Type ret=null;
	//return the parent lowest in the hierarchy from the intersection
	int maxHier=-1;
	for (Type t: intersect){
		if (t.parentTypes.size()>maxHier){
			maxHier=t.parentTypes.size();
			ret=t;
		}
	}
	return ret;
    }

    /**
     * @return the set of parent types of this type.
     */
    public Set<Type> getParentTypes() {
	return parentTypes;
    }

    final protected void setParentTypes(Set<Type> p) {
	parentTypes=p;
    }   
     
    /**
     * Returns <code>true</code> if this type is equals to an other object.
     * This method return <code>true</code> if the object is a not null
     * instance of the class <code>Type</code> and both type have the same
     * image.
     * 
     * @param obj the object to compare.
     * @return <code>true</code> if this type is equals to an other object;
     *         <code>false</code> otherwise.
     */
    public boolean equals(Object obj) {
        if ((obj != null) && obj.getClass().equals(this.getClass())) {
		return isSameType((Type)obj);
	}
	return false;
    }

    /**
     * Returns the hash code value of this type. This method is supported
     * for the benefit of hashtables such as those provided by
     * <code>java.util.Hashtable</code>.
     * 
     * @return the hash code value of this type.
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        return this.image.hashCode();
    }
    
    /**
     * Returns a string representation of this type.
     * 
     * @return a string representation of this type.
     */
    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append(this.image);
        return str.toString();
    }
    

     public String toDetailedString() {
        StringBuffer str = new StringBuffer();
        str.append(this.image);
        str.append("[");
        if (!this.parentTypes.isEmpty()) {
            Iterator<Type> i = this.parentTypes.iterator();
            str.append(i.next().image);
            while (i.hasNext()) {
                str.append(" " + i.next().image);
            }
        }
        str.append("]");
        return str.toString();
    }

 
    private static Set<Type> asSet(Type t){
	Set<Type> ret=new LinkedHashSet<Type>();
	ret.add(t);
	return ret;
    }
   
   
}
