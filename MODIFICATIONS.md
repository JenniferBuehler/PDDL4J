# Modifications

List of modifications made by Jennifer Buehler, 2014.

This is a summary of the changes applied to the [older version of PDDL4j in this fork](https://github.com/gerryai/PDDL4J).

The modifications discard the lexer/parser as this is replaced by using ANTLR.
This entails the following changes:

- Deleted all parser-related code using javacc (new version now uses ANTLR), which deletes the old directories  ``dev`` and ``lexer``
- Deleted following files related to parsing:
  * src/pddl4j/Parser.java
  * src/pddl4j/ParserException.java
  * src/pddl4j/ErrorManager.java (Only needed in Parser.java and Lexer.java)
  * src/pddl4j/PDDLObject.java (only needed in Parser.java)
  * src/pddl4j/Source.java (only used in Parser.java and PDDLObject.java)
  * pddl4j/tests/Test.java (needs the old parser)
- Deleted following files which are not needed any more:
  * src/overview.html
  * src/pddl4j/package.html
  * src/pddl4j/exp/package.html
  * src/pddl4j/InvalidExpException.java ( not actually used anywhere)


## Overview of main changes

- ``Substitution`` instances can now be applied to all expression types
  * Addition of function ``apply(Substitution)`` in the expressions (see more details below)
- At several places, the return type of ``clone()`` was the class type itself. This does not support the ``Object`` interface (I believe this was a bug in the old code?). Fixed this.
- Added support for start, end and over conditions and effects in DurativeAction
- Added support for a visitor pattern to visit expressions.
  * Addition of function ``Object accept(ExpVisitor, Object)`` in many expressions.
- In many ``hashCode()`` functions, the hash code was generated with ``+`` while it should be with ``^`` to be more unique.
- Imporved type usage (incl consistency checks)
    * New type support added in type/Type.java allows sub-types, like in traditional inheritance-fashion.
      This allows for example to check whether a variable of type A can be bound to a term of type B, which is only legal
      if B is a subtype (or same type) of A.
    * Support of "either" types.
    * For more information about the changes, refer to the files change list of
      *exp/type/Type.java* and *exp/type/TypeSet.java* below, and/or the source.
- A few additional minor bug fixes are described in the per-file changes list below.

## List of specific changes per file

- pddl4j/exp/action/ActionDef.java
  * Added function ``apply(Substitution)`` to interface so that substitutions can be applied to expressions
  * Added function ``isDurative()`` to interface so it can support durative actions
  * ``clone()``: Returns Object instead of ActionDef to satisfy the Object interface
- pddl4j/exp/action/AbstractActionDef.java
  * Added function ``apply(Substitution)``
  * ``equals()``: Removed "final" statement so that it may be overwritten, and used AbstractActoinDef instead of ActionDef.
    Also comparing the parameters of the action for equality.
  * ``hashCode()``: include the parameters in generating the hash code
  * ``clone()``: Returns Object instead of AbstractActionDef to satisfy the Object interface
- pddl4j/exp/action/Action.java
  * Added function ``hashCode()`` and ``equals()``, though it is not used at the moment (commented - I cannot remember why but I probably had a reason to not use it?)
  * Added function ``isDurative()``, returns false
  * Added function ``apply(Substitution)``
  * ``clone()``: Returns Object instead of Action to satisfy the Object interface
- pddl4j/exp/action/DurativeAction.java
  * Added function ``hashCode()`` and ``equals()``, though it is not used at the moment (commented - I cannot remember why but I probably had a reason to not use it?)
  * Added function ``isDurative()``, returns true 
  * Added function ``apply(Substitution)``
  * ``clone()``: Returns Object instead of DuativeAction to satisfy the Object interface
  * Added functions to support start, end and over conditions/expressions:
    - added ``getStartExp(Exp)``
    - added ``getOverExp(Exp)``
    - added ``getStartOrOverExp(Exp)``
    - added ``getEndOrOverExp(Exp)``
    - added ``getEndExp(Exp)``
    - added ``getStartAndOverExp(Exp)``
    - added ``getStartCondition``
    - added ``getOverCondition``
    - added ``getStartAndOverCondition``
    - added ``getEndAndOverCondition``
    - added ``getEndAndOverCondition``
    - added ``getEndCondition``
    - added ``getStartEffect``
    - added ``getEndEffect``
    - added ``getOverEffect``
    - added ``getStartAndOverEffect``

- pddl4j/exp/assign/AssingOpExp.java
  * Added function to accept visitors: ``Object accept(ExpVisitor, Object)``
  * In ``hashCode()``: the hash code was generated with ``+`` while it should be with ``^`` to be more unique.

- pddl4j/exp/cond/AlwaysWithinExp.java
  * In ``hashCode()``: the hash code was generated with ``+`` while it should be with ``^`` to be more unique.
- pddl4j/exp/cond/BinaryCondExp.java
  * In ``hashCode()``: the hash code was generated with ``+`` while it should be with ``^`` to be more unique.
- pddl4j/exp/cond/CondExp.java
  * In ``hashCode()``: the hash code was generated with ``+`` while it should be with ``^`` to be more unique.
- pddl4j/exp/cond/HoldAfterExp.java
  * In ``hashCode()``: the hash code was generated with ``+`` while it should be with ``^`` to be more unique.
- pddl4j/exp/cond/HoldDuringExp.java
  * In ``hashCode()``: the hash code was generated with ``+`` while it should be with ``^`` to be more unique.
- pddl4j/exp/cond/UnaryCondExp.java
  * In ``hashCode()``: the hash code was generated with ``+`` while it should be with ``^`` to be more unique.
- pddl4j/exp/cond/WithinExp.java
  * In ``hashCode()``: the hash code was generated with ``+`` while it should be with ``^`` to be more unique.


- pddl4j/exp/fcomp/EqualComp.java
  * Bug fix line 160: ``op2 = (Number) = this.getArg1()`` should be ``op2 = (Number) = this.getArg2()`` 
- pddl4j/exp/fcomp/FCompExp.java
  * Added function to accept visitors: ``Object accept(ExpVisitor, Object)``
  * In ``hashCode()``: the hash code was generated with ``+`` while it should be with ``^`` to be more unique.
- pddl4j/exp/fcomp/GEqualComp.java
  * Bug fix line 159: ``op2 = (Number) = this.getArg1()`` should be ``op2 = (Number) = this.getArg2()`` 
- pddl4j/exp/fcomp/GreaterComp.java
  * Bug fix line 157: ``op2 = (Number) = this.getArg1()`` should be ``op2 = (Number) = this.getArg2()`` 
- pddl4j/exp/fcomp/LEqualComp.java
  * Bug fix line 157: ``op2 = (Number) = this.getArg1()`` should be ``op2 = (Number) = this.getArg2()`` 
- pddl4j/exp/fcomp/LessComp.java
  * Bug fix line 157: ``op2 = (Number) = this.getArg1()`` should be ``op2 = (Number) = this.getArg2()`` 


- pddl4j/exp/fexp/BinaryAdd.java
  * Line 107: ``new Number(arg1.getValue() + arg2.getValue())`` replaced by ``new Number(arg1.getValue() + arg2.getValue(),Number.getCompatibleType(arg1,arg2))``
- pddl4j/exp/fexp/BinaryDivide.java
  * Line 107: ``new Number(arg1.getValue() / arg2.getValue())`` replaced by ``new Number(arg1.getValue() / arg2.getValue(), Number.getCompatibleType(arg1,arg2))``
- pddl4j/exp/fexp/Multiply.java
  * Line 107: ``new Number(arg1.getValue() * arg2.getValue())`` replaced by ``new Number(arg1.getValue() * arg2.getValue(), Number.getCompatibleType(arg1,arg2))``
- pddl4j/exp/fexp/Substract.java
  * Line 107: ``new Number(arg1.getValue() - arg2.getValue())`` replaced by ``new Number(arg1.getValue() - arg2.getValue(), Number.getCompatibleType(arg1,arg2))``
- pddl4j/exp/fexp/FExp.java
  * Removed ``TypeSet`` datatype usage and now only using``Type`` according to changes in term/AbstractTerm.java
  * Removed constructor which does not specify a type, in accordance with changes in term/AbstractTerm.java
  * Added function to return arguments, ``ArrayList<Term> getArguments()``
  * Added function ``boolean addAll(Collection<? extends Term> arg)`` which can be used to add agruments to the list
  * Added function `clearArgs`` which can be used to clear the arguments
  * Added function to accept visitors: ``Object accept(ExpVisitor, Object)``
  * Line 276: Expression like ``this.getTypeSet().getSubTypes().containsAll(...)`` changed to support new Type support, and become ``this.getType().isSubTypeOf(...)``
  * Line 278: shallow cloning of sigma is sufficient (I think I did that because I had space issues at some point)
  * In ``hashCode()``: the hash code was generated with ``+`` while it should be with ``^`` to be more unique.
- pddl4j/exp/fexp/FHead.java
  * Removed ``TypeSet`` datatype usage and now only using``Type`` according to changes in fexp/FExp.java
  * Added function ``addAll(Collection<? extends Term> arg)`` to call new ``FExp::addAll()``
  * Added function ``clearArgs`` to call ``FExp::clearArgs()``
- pddl4j/exp/fexp/NArityAdd.java
  * Removed ``TypeSet`` datatype usage and now only using``Type`` according to changes in fexp/FExp.java
    - in particular reflects in function ``evaluate()`` which takes sub-types into consideration and catches
      returning NULL numbers as an error (this must have been a bug fix a while back)
- pddl4j/exp/fexp/NArityMultiply.java
  * Same as fexp/NArityAdd.java
- pddl4j/exp/fexp/Number.java
  * Removed ``TypeSet`` datatype usage and now only using``Type`` according to changes in fexp/FExp.java
  * Added helper function ``static Type getCompatibleType(Number n1, Number n2)`` which returns the common parent type of both numbers
- pddl4j/exp/fexp/OpExp.java
  * Removed ``TypeSet`` datatype usage and now only using``Type`` according to changes in fexp/FExp.java

- pddl4j/exp/metric/MetricExp.java
  * In ``hashCode()``: the hash code was generated with ``+`` while it should be with ``^`` to be more unique.

- pddl4j/exp/term/AbstractTerm.java
  * Swapped ``TypeSet`` against ``Type`` (see modifications in type/Type.java)
  * removed constructor which does not pass a type to the term, thereby making it compulsory to specify a type.
  * make function ``setType(Type)`` public so the type can be changed from outside. This is needed in the parser code.
  * In ``hashCode()``: the hash code was generated with ``+`` while it should be with ``^`` to be more unique.
- pddl4j/exp/term/Constant.java
  * Removed ``TypeSet`` datatype usage and now only using``Type`` according to changes in fexp/FExp.java
  * Removed constructor which does not specify a type, in accordance with changes in term/AbstractTerm.java
  * Added UNDEFINED_SYMBOL for an undefined constant
  * Added function to accept visitors: ``Object accept(ExpVisitor, Object)``
- pddl4j/exp/term/Substitution.java
  * Removed ``TypeSet`` datatype usage and now only using``Type`` according to changes in type/Type.java
  * Added function ``subtractAll(Substitution s)`` which removes from this substitution all entries which
    have the same key as the substitutions in s.
  * In function ``bind(Variable var, Term term)``: throw a BindingException if the type of *term* is not a sub-type of *var*
  * Added function ``boolean removeBinding(final Variable var)`` which removes a variable binding from the binding map.
  * Changed function ``Substitution clone()`` and renamed to ``Substitution deepClone()``, and added a separate function
    ``shallowClone()``, so that a distinction can be made. Old version was able to only to deep clone in ``clone()``.
  * Added method ``hashCode()`` which allows for checking double Substitution entries in the map.
  * Added method ``equals``
  * In subclass Substitution::Binding:
    - in ``hashCode()``: the hash code was generated with ``+`` while it should be with ``^`` to be more unique.
- pddl4j/exp/term/Term.java
  * Removed ``TypeSet`` datatype usage and now only using``Type`` according to changes in type/Type.java
- pddl4j/exp/term/Variable.java
  * Removed ``TypeSet`` datatype usage and now only using``Type`` according to changes in term/AbstractTerm.java
  * Added new constant:
      - ``TIMESTEP_VARIABLE``
  * Added constants to use for variables which are already an instantiation of Variable instead of just a string:
      - ``DURATIVE_VARIABLE_INST``
      - ``CONTINUOUS_VARIABLE_INST``
      - ``TIMESTEP_VARIABLE_INST``
  * Constructors don't name variables starting with ``?`` any more
  * Removed constructor which does not specify the type
  * Removed constructor which takes TypeSet (because it was removed)
  * Added function to accept visitors: ``Object accept(ExpVisitor, Object)``
  * In function ``unify(Term, Substitution)``:
    - Checking for type safety when binding, according to newn implementation in type/Type.java

- pddl4j/exp/time/AtTimedExp.java
  * In ``hashCode()``: the hash code was generated with ``+`` while it should be with ``^`` to be more unique.
- pddl4j/exp/time/OverTimedExp.java
  * In ``hashCode()``: the hash code was generated with ``+`` while it should be with ``^`` to be more unique.
- pddl4j/exp/time/TimedExp.java
  * Added function to accept visitors: ``Object accept(ExpVisitor, Object)``
  * In ``hashCode()``: the hash code was generated with ``+`` while it should be with ``^`` to be more unique.
- pddl4j/exp/time/TimedLiteral.java
  * In ``hashCode()``: the hash code was generated with ``+`` while it should be with ``^`` to be more unique.


- pddl4j/exp/type/Type.java
  * Is now Cloneable as well, so added function ``Object clone()``
  * Added OBJECT constant
  * Removed ``subTypes`` and ``superTypes`` map and replaced with a set of parent types ``parentTypes``
  * Constructor does not take type hierarchy any more, but instead takes a set of parent types
  * Added function ``setImage(String)`` (protected) which allows to change the type name
  * Removed functions:
    - ``isFinal()``
    - ``getSuperTypes()``
    - ``getSubTypes()``
    - ``getAllSubTypes()``
    - ``checkTypeHierarchy()``
  * Added public functions (protected helper functions not listed here):
    - ``isSubTypeOf(Type type)``, checks whether this type is a sub-type of *type*
    - ``getCommonParentWith(Type type)``, returns type which is a common parent of this and *type* (if it exists)
    - ``getParentTypes()`` return all parent types (as passed in constructor)
    - ``toDetailedString()`` to print more information (incl parent types) than ``toString()`` does.
- pddl4j/exp/type/TypeSet.java
    * has pretty much been re-written. A TypeSet is a Type which is a composition of
      several types (for constructing "either" PDDL types).

- pddl4j/exp/AbstractExp.java
  * Added function to accept visitors: ``Object accept(ExpVisitor, Object)``
- pddl4j/exp/AtomicFormula.java
  * Added constructor which takes an FExp as argument
  * Added function to accept visitors: ``Object accept(ExpVisitor, Object)``
  * Added function to return arguments, ``ArrayList<Term> getArguments()``, and ``Term getArg(int)`` to return a specific one.
  * Added function ``boolean addAll(Collection<? extends Term> arg)`` which can be used to add agruments to the list
  * Added function `clearTerms`` which can be used to clear the arguments
  * In ``Substitution match(AtomicFormula, Substitution)``: swapped order of checking conditions for performance benefits
  * In ``hashCode()``: the hash code was generated with ``+`` while it should be with ``^`` to be more unique.
- pddl4j/exp/DerivedPredicate.java
  * In ``hashCode()``: the hash code was generated with ``+`` while it should be with ``^`` to be more unique.
- pddl4j/exp/Exp.java
  * Added function to accept visitors: ``Object accept(ExpVisitor, Object)``
- pddl4j/exp/Imply.java
  * Added function to accept visitors: ``Object accept(ExpVisitor, Object)``
  * In ``hashCode()``: the hash code was generated with ``+`` while it should be with ``^`` to be more unique.
- pddl4j/exp/ListExp.java
  * Added function to accept visitors: ``Object accept(ExpVisitor, Object)``
  * In ``hashCode()``: the hash code was generated with ``+`` while it should be with ``^`` to be more unique.
  * Added functions:
    - ``trimToSize()`` calls elements.trimToSize()
    - ``Collection<Exp> getElements()`` returns the *elements*
    - ``ArrayList<Exp> getElementsArray()`` returns the *elements* as ArrayList
    - ``boolean contains(Exp)`` checks whether *elements* contains the expression
    - ``boolean containsAll(ListExp)`` checks whether *elements* contains all the expressions
    - ``boolean addAll(Collection<? extends Term> arg)`` which can be used to add agruments to the list
    - ``clearElems()`` which can be used to clear the arguments
    - ``setElems(ArrayList)`` which can be used to set the elements of the list
    - ``isEmpty()`` which checks whether *elements* is empty.
- pddl4j/exp/NotExp.java
  * Added function to accept visitors: ``Object accept(ExpVisitor, Object)``
  * In ``hashCode()``: the hash code was generated with ``+`` while it should be with ``^`` to be more unique.
- pddl4j/exp/PrefExp.java
  * In ``hashCode()``: the hash code was generated with ``+`` while it should be with ``^`` to be more unique.
- pddl4j/exp/QuantifiedExp.java
  * Added function to accept visitors: ``Object accept(ExpVisitor, Object)``
  * In ``hashCode()``: the hash code was generated with ``+`` while it should be with ``^`` to be more unique.
  * Added function ``boolean add(Collection<? extends Term> arg)`` which can be used to add variables to the list
  * Added function ``clearVariables`` to clear the variables list
  * Added function ``getVars`` to return variables
  * In function ``apply(Substitution sigma)``: Now always returns the substituted expression and does not remove
    unbound variables. Reason: If that was somethign the caller would like to do, they should do this outside.
    We may want to get the substituted expression even if not all variables were part of *sigma*.
    The original definition of ``apply`` in interface ``Exp`` also does not mention anything about returning
    only ground expressions.
- pddl4j/exp/WhenExp.java
  * Added function to accept visitors: ``Object accept(ExpVisitor, Object)``
  * In ``hashCode()``: the hash code was generated with ``+`` while it should be with ``^`` to be more unique.


* pddl4j/Domain.java
  - Now is not only an interface any more, but a class deriving from PDDLBase
  - Methods related to constants, types and requirements have moved to the new class PDDLBase
  - Serves as a container for everything in the domain, incl. predicates, functions, constraints, actions, axioms and types.
  - Can be used to add types with ``addType`` and check type consistency with ``checkTypeHierarchy()``.
    Convenience functions such as ``getAllChildTypes(Type)`` are provided.
* pddl4j/Problem.java
  - Now is not only an interface any more, but a class deriving from PDDLBase
  - Methods related to constants and requirements have moved to the new class PDDLBase
  - Serves as a container for everything in the problem, incl. metric, goal, and initial state.
* pddl4j/RequireKey.java
  - Added constants:
      * ``OBJECT_FLUENTS(":object-fluents")``
      * ``NUMERIC_FLUENTS(":numeric-fluents")``
      * ``ACTION_COSTS(":action-costs")``
      * ``INTERVAL_SEPARATED(":interval-separated")`` (for durative actions, if this requirement is set, the "over all" statement refers to the time while the action is running ONLY, and NOT the start and end times)


## Addition of new files:

- pddl4j/PDDLBase.java
  * New base class for Problem and Domain, contains common fields and defines functions which need to be supported by both.
- pddl4j/ExpVisitor.java
  * Base class for all expression visitors
- pddl4j/DomainAndProblem.java
  * Container with a domain and a problem, for convenience.


