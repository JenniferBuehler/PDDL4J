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
import java.util.Collection;
import java.util.Stack;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.ArrayList;


/**
 * Specialization of Type which is a composition of several types.
 * @author Damien Pellier, modifications by Jennifer Buehler
 * @version 1.0can be either of the types in this set
 */
public final class TypeSet extends Type {

  private Collection<Type> types;

  /**
   * Creates a new type set consisting of these types.
   */
  public TypeSet(Collection<Type> _types) {
  // have to call empty constructor of superclass for compiler.
  // Though we are going to construct its parents here.
    super("CompilerFix"); 

      if (_types == null) 
       throw new NullPointerException();
      if (_types.size()<=1){
        throw new RuntimeException("Inconsistency, we would not want a typeset of only "+_types.size()+" size");
      }

      Set<Type> allParents=new LinkedHashSet<Type>();
      //construct anonymous type name:
      String _image=new String("");
      for (Type t: _types) {
        if (t instanceof TypeSet)
           throw new RuntimeException("don't make a TypeSet of TypeSets! "+_types);
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

  // returns true if this type is either the same, or a subtype
  // of the other.
  public boolean isSubTypeOf(Type other){
    if (isSameType(other)) return true;

    if (other instanceof TypeSet) {
      TypeSet otherTypeSet=(TypeSet) other;
      for (Type ot: otherTypeSet.types) {
        for (Type t: types) {
          if (t.isSubTypeOf(ot)) return true;
        }
      }
    } else {
      for (Type t: types) {
        // System.out.println("Checking if "+t+" is subset of "+other);
        if (t.isSubTypeOf(other)) return true;
      }
    }
    return false;
  }

  // overwriting of superclass
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
