/**
 * PDDL grammar for ANTLR v3
 * Zeyn Saigol
 * School of Computer Science
 * University of Birmingham
 *
 * $Id: Pddl.g 120 2008-10-02 14:59:50Z zas $
 */
grammar Pddl;
options {
    output=AST;
    backtrack=true;
    //k=4;
}

tokens {
    DOMAIN;
    DOMAIN_NAME;
    REQUIREMENTS;
    TYPES;
    EITHER_TYPE;
    CONSTANTS;
    FUNCTIONS;
    PREDICATES;
    PRED_NAME;
    ACTION;
    PARAMS;
    DURATIVE_ACTION;
    PROBLEM;
    PROBLEM_NAME;
    PROBLEM_DOMAIN;
    OBJECTS;
    INIT;
    FUNC_HEAD;
    FUNC_TYPE;
    FUNC_SKEL;
    FUNC_LIST;
    PRECONDITION;
    VARS;
    EFFECT;
    AND_EXP;
    OR_EXP;
    NOT_EXP;
    IMPLY_EXP;
    EXISTS_EXP;
    FORALL_EXP;
    WHEN_EXP;
    COMPARISON_EXP;
    AND_EFFECT;
    ASSIGN_EFFECT;
    NOT_EFFECT;
    PRED_HEAD;
    FEXP;
    GOAL;
    BINARY_OP;
    UNARY_MINUS;
    INIT_EQ;
    INIT_AT;
    NOT_PRED_INIT;
    PRED_INST;
    PROBLEM_CONSTRAINT;
    PROBLEM_METRIC;
    MULTIOP_METRIC;
    NUMBER_METRIC;
    TIME_METRIC;
    VIOLATED_METRIC;
    DUR_VALUE;
    DUR_INDEFINITE;
    DUR_CONSTRAINTS;
    DURATION;
    CONDITION;
    TIMED_EFFECT;
    TIMED_EXP;
    CONTINUOUS_EXP;
    LOGIC_EXP;
    EXP_NAME;
}

@parser::header {package PDDL4J.antlr_gen;}

@parser::members {
private boolean wasError = false;
public void reportError(RecognitionException e) {
	wasError = true;
	super.reportError(e);
}
public boolean invalidGrammar() {
	return wasError;
}
}
// Standard way of disabling the default error handler, and throwing Exceptions instead:
//@rulecatch { }
//@members {
// // raise exception, rather than recovering, on mismatched token within alt
// protected void mismatch(IntStream input, int ttype, BitSet follow)
//   throws RecognitionException
// {
//   throw new MismatchedTokenException(ttype, input);
// }
//}

@lexer::header {package PDDL4J.antlr_gen;}


/************* Start of grammar *******************/

pddlDoc : domain | problem;

/************* DOMAINS ****************************/

domain
    : '(' 'define' domainName
      requireDef?
      typesDef?
      constantsDef?
      predicatesDef?
      functionsDef?
      constraints?
      structureDef*
      ')'
      -> ^(DOMAIN domainName requireDef? typesDef?
                constantsDef? predicatesDef? functionsDef?
                constraints? structureDef*)
    ;

domainName
    : '(' 'domain' NAME ')'
    	-> ^(DOMAIN_NAME NAME)
    ;

requireDef
	: '(' ':requirements' REQUIRE_KEY+ ')'
	-> ^(REQUIREMENTS REQUIRE_KEY+)
	;

typesDef
	: '(' ':types' typedNameList ')'
	  -> ^(TYPES typedNameList)
	;

// If have any typed names, they must come FIRST!
typedNameList
    : (NAME* | singleTypeNameList+ NAME*)
    ;

singleTypeNameList
    : (NAME+ '-' t=type)
	  -> ^(NAME $t)+
	;

type
	: ( '(' 'either' primType+ ')' )
	  -> ^(EITHER_TYPE primType+)
	| primType
	;

primType : NUMBER_STR | NAME;

functionsDef
	: '(' ':functions' functionList ')'
	-> ^(FUNCTIONS functionList)
	;


//typedFunctionList
//    :  (atomicFunctionSkeleton* -> ^(FUNC_SKEL atomicFunctionSkeleton*)
//	| singleFuncNameList+ atomicFunctionSkeleton* -> singleFuncNameList+ ^(FUNC_SKEL atomicFunctionSkeleton*))
//    ;


functionList
    :  ( (typedFunctionList | untypedFunctionList)+ )
    ;

untypedFunctionList
    :  (atomicFunctionSkeleton+ -> ^(FUNC_LIST ^(FUNC_SKEL atomicFunctionSkeleton+))
       )
    ;


typedFunctionList
    : (atomicFunctionSkeleton+ '-' functionType)
	  -> ^(FUNC_LIST ^(FUNC_SKEL atomicFunctionSkeleton+) ^(FUNC_TYPE functionType))
	;


//typedFunctionList
//	: (atomicFunctionSkeleton+ ('-' functionType)? )*
//	;

//atomicFunctionSkeleton
//	: '(' functionSymbol typedVariableList ')'
//	-> ^(functionSymbol typedVariableList)
//	;


atomicFunctionSkeleton
	: '('! functionSymbol^ typedVariableList ')'!
	;

functionSymbol : NAME ;

functionType : NUMBER_STR | NAME | type; 

constantsDef
	: '(' ':constants' typedNameList ')'
	-> ^(CONSTANTS typedNameList)
	;

predicatesDef
	: '(' ':predicates' atomicFormulaSkeleton+ ')'
	-> ^(PREDICATES atomicFormulaSkeleton+)
	;

atomicFormulaSkeleton
	: '('! predicate^ typedVariableList ')'!
	;


predicate : NAME | 'at'; //reserved keywords should also work as a predicate name?

// If have any typed variables, they must come FIRST!
typedVariableList
    : (VARIABLE* | singleTypeVarList+ VARIABLE*)
    ;

singleTypeVarList
    : (VARIABLE+ '-' t=type)
      -> ^(VARIABLE $t)+
    ;

constraints
	: '('! ':constraints'^ conGD ')'!
	;

structureDef
	: actionDef
	| durativeActionDef
	| derivedDef
	;


/************* ACTIONS ****************************/

actionDef
	: '(' ':action' actionSymbol actionParams actionDefBody ')'
        -> ^(ACTION actionSymbol actionParams actionDefBody)
    	;

actionSymbol : NAME ;

actionParams
	: (':parameters' '(' typedVariableList ')')?
	-> ^(PARAMS typedVariableList)
	;



// Should allow preGD instead of logicExpr for preconditions -
// but I can't get the LL(*) parsing to work
// This means 'preference' preconditions cannot be used
actionDefBody
	: ( ':vars' '(' typedVariableList ')')?
	  ( ':precondition' (('(' ')') | logicExpr))?
	  ( ':effect' (('(' ')') | effect))?
	  -> ^(PRECONDITION logicExpr?) ^(EFFECT effect?) ^(VARS typedVariableList?)
	;

//preGD
//	: prefGD
//	| '(' 'and' preGD* ')'
//	| '(' 'forall' '(' typedVariableList ')' preGD ')'
//	;
//
//prefGD
//	: '(' 'preference' NAME? logicExpr ')'
//	| logicExpr
//	;

logicExpr
	: atomicTermFormula
	| '(' 'and' logicExpr* ')'
	          -> ^(AND_EXP logicExpr*)
	| '(' 'or' logicExpr* ')'
	          -> ^(OR_EXP logicExpr*)
	| '(' 'not' logicExpr ')'
	          -> ^(NOT_EXP logicExpr)
	| '(' 'imply' logicExpr logicExpr ')'
	          -> ^(IMPLY_EXP logicExpr logicExpr)
	| '(' 'exists' '(' typedVariableList ')' logicExpr ')'
	          -> ^(EXISTS_EXP ^(PARAMS typedVariableList) logicExpr)
	| '(' 'forall' '(' typedVariableList ')' logicExpr ')'
	          -> ^(FORALL_EXP ^(PARAMS typedVariableList) logicExpr)
	| condWhenExpr
        | fComp   -> ^(COMPARISON_EXP fComp)
;


condWhenExpr
	: '(' 'when' logicExpr whenCondEffect ')'
	-> ^(WHEN_EXP logicExpr whenCondEffect)
	;

wEffect
	: '(' 'not' atomicTermFormula ')'
	  -> ^(NOT_EFFECT atomicTermFormula)
	| atomicTermFormula
	;

whenCondEffect
	: '(' 'and' wEffect* ')' -> ^(AND_EFFECT wEffect*)
	| wEffect
	;







fComp
	: '('! '=' fCompExp (term | UNDEFINED) ')'!
	| '('! binaryComp fCompExp fCompExp ')'!
	;

fCompExp
	: fExp | VARIABLE | singleTypeVarList
	;

atomicTermFormula
	: '(' predicate term* ')' -> ^(PRED_HEAD predicate ^(PARAMS term*) )
	;

term : NAME | VARIABLE | fHead | NUMBER;

/************* DURATIVE ACTIONS ****************************/

durativeActionDef
	: '(' ':durative-action' actionSymbol
	       actionParams 
               daDefBody ')'
       -> ^(DURATIVE_ACTION actionSymbol actionParams daDefBody)
    ;



daDefBody
	: ':duration' durationConstraint
	  ( ':condition' ( ('(' ')') | daLogicExpr ) )?
          (':effect' ( ('(' ')') | daEffect ) )
	-> ^(DURATION durationConstraint) ^(CONDITION daLogicExpr?) ^(EFFECT daEffect)
    ;




daLogicExpr
	: 
	prefTimedGD
	| '(' 'and' daLogicExpr* ')' 
	  -> ^(AND_EXP daLogicExpr*)
	| '(' 'forall' '(' typedVariableList ')' daLogicExpr ')'
	  -> ^(FORALL_EXP ^(PARAMS typedVariableList) daLogicExpr)
	;


prefTimedGD
	: timedExp -> ^(TIMED_EXP ^(EXP_NAME UNDEFINED) timedExp) 
	| '(' 'preference' NAME? timedExp ')' -> ^(TIMED_EXP ^(EXP_NAME NAME?) timedExp)
	;

timedExp
	: '('! 'at'! timeSpecifier logicExpr ')'!
	| '('! 'over'! interval logicExpr ')'!
	;

timeSpecifier : 'start' | 'end' ;
interval : 'all' ;

/************* DERIVED DEFINITIONS ****************************/

derivedDef
	: '('! ':derived'^ typedVariableList logicExpr ')'!
	;

/************* EXPRESSIONS ****************************/

fExp
	: NUMBER
	| '(' binaryOp fExp fExp2 ')' -> ^(BINARY_OP binaryOp fExp fExp2)
	| '(' '-' fExp ')' -> ^(UNARY_MINUS fExp)
	| fHead
	;

// This is purely a workaround for an ANTLR bug in tree construction
// http://www.antlr.org/wiki/display/ANTLR3/multiple+occurences+of+a+token+mix+up+the+list+management+in+tree+rewrites
fExp2 : fExp ;

fHead
	: '(' functionSymbol term* ')' -> ^(FUNC_HEAD functionSymbol ^(PARAMS term*) )
	| functionSymbol -> ^(FUNC_HEAD functionSymbol)
	;


effect
	: '(' 'and' cEffect* ')' -> ^(AND_EFFECT cEffect*)
	| cEffect
	;

cEffect
	: '(' 'forall' '(' typedVariableList ')' effect ')'
	  -> ^(FORALL_EXP ^(PARAMS typedVariableList) effect)
	| '(' 'when' logicExpr condEffect ')'
	  -> ^(WHEN_EXP logicExpr condEffect)
	| pEffect
	;

pEffect
	: '(' 'not' atomicTermFormula ')'
	  -> ^(NOT_EFFECT atomicTermFormula)
	| atomicTermFormula
	| '(' assignOp fHead fExp ')'
	  -> ^(ASSIGN_EFFECT assignOp fHead fExp)
	| '(' assignOp fHead term ')'
	  -> ^(ASSIGN_EFFECT assignOp fHead term)
	| '(' assignOp fHead UNDEFINED ')'
	  -> ^(ASSIGN_EFFECT assignOp fHead UNDEFINED)
	;

condEffect
	: '(' 'and' pEffect* ')' -> ^(AND_EFFECT pEffect*)
	| pEffect
	;

binaryOp : '*' | '+' | '-' | '/' ;

binaryComp : '>' | '<' | '=' | '>=' | '<=' ;

assignOp : 'assign' | 'scale-up' | 'scale-down' | 'increase' | 'decrease' ;


/************* DURATIONS  ****************************/

durationConstraint
	: 
	'(' 'and' simpleDurationConstraint+ ')' 
	| 
	'(' ')'
	  -> ^(DUR_INDEFINITE)
	| simpleDurationConstraint
	;

simpleDurationConstraint
	: '(' durOp '?duration' fExp ')' -> ^(DUR_VALUE durOp fExp)
	| '(' 'at' timeSpecifier simpleDurationConstraint ')' -> ^(DUR_CONSTRAINTS timeSpecifier simpleDurationConstraint)
	;

durOp : '<=' | '>=' | '=' ;

daEffect
	: 
	timedEffect
	| '(' 'and' daEffect* ')'  
	   ->  ^(AND_EFFECT daEffect*)
	| '(' 'forall' '(' typedVariableList ')' daEffect ')'
	  -> ^(FORALL_EXP ^(PARAMS typedVariableList) daEffect)
	| '(' 'when' daLogicExpr timedEffect ')'
	  -> ^(WHEN_EXP daLogicExpr timedEffect)
//	| '(' assignOp fHead fExpDA ')'  //XXX not in PDDL3.1 ?!
	;

timedEffect
	: '(' 'at' timeSpecifier condEffect2 ')' 
		-> ^(TIMED_EFFECT timeSpecifier condEffect2) 
	| '(' 'over' interval condEffect ')' 
		-> ^(TIMED_EFFECT interval condEffect) 
	| '(' assignOpT fHead fExpT ')' 
		-> ^(ASSIGN_EFFECT assignOpT fHead fExpT)
	;


condEffect2
	: '(' 'and' cEffect* ')' -> ^(AND_EFFECT cEffect*)
	| cEffect
	;



fAssignDA
	: '(' assignOp fHead fExpDA ')'
		-> ^(ASSIGN_EFFECT assignOp fHead fExpDA)
	;

//expression which can be assigned to a function within an ASSIGN statement of
//a durative action 
fExpDA
	: '(' binaryOp fExpDA fExpDA ')'
		-> ^(BINARY_OP binaryOp fExpDA fExpDA)
	| '(' '-' fExpDA ')'
		-> ^(UNARY_MINUS fExpDA)
	| '?duration'
		-> ^(VARIABLE '?duration')
	| fExp
	;

assignOpT
	: 'increase' | 'decrease';

fExpT
	: '(' '*' fExp timeVar ')'	
		-> ^(CONTINUOUS_EXP timeVar ^(FEXP fExp))
	| '(' '*' timeVar fExp ')'
		-> ^(CONTINUOUS_EXP timeVar ^(FEXP fExp))
	| timeVar 
		-> ^(CONTINUOUS_EXP timeVar)
	;

timeVar: TIMEVAR | TIMESTEPVAR;

/************* PROBLEMS ****************************/

problem
	: '(' 'define' problemDecl
	  problemDomain
      requireDef?
      objectDecl?
      init
      goal
      probConstraints?
      metricSpec?
      // lengthSpec? This is not defined anywhere in the BNF spec
      ')'
      -> ^(PROBLEM problemDecl problemDomain requireDef? objectDecl?
      		init goal probConstraints? metricSpec?)
    ;

problemDecl
    : '(' 'problem' NAME ')'
    -> ^(PROBLEM_NAME NAME)
    ;

problemDomain
	: '(' ':domain' NAME ')'
	-> ^(PROBLEM_DOMAIN NAME)
	;

objectDecl
	: '(' ':objects' typedNameList ')'
	-> ^(OBJECTS typedNameList)
	;

init
	: '(' ':init' initEl* ')'
	-> ^(INIT initEl*)
	;

initEl
	: nameLiteral
	| '(' '=' fHead NUMBER ')'         -> ^(INIT_EQ fHead NUMBER)
	| '(' '=' fHead NAME ')'         -> ^(INIT_EQ fHead NAME)
	| '(' 'at' NUMBER nameLiteral ')'  -> ^(INIT_AT NUMBER nameLiteral)
	;

nameLiteral
	: atomicNameFormula
	| '(' 'not' atomicNameFormula ')' -> ^(NOT_PRED_INIT atomicNameFormula)
	;

atomicNameFormula
	: '(' predicate nameOrNumber* ')' -> ^(PRED_INST predicate ^(PARAMS nameOrNumber*) )
	;

nameOrNumber
	: NAME | NUMBER 
	;

// Should allow preGD instead of logicExpr -
// but I can't get the LL(*) parsing to work
// This means 'preference' preconditions cannot be used
//goal : '(' ':goal' preGD ')'  -> ^(GOAL preGD);
goal : '(' ':goal' logicExpr ')' -> ^(GOAL logicExpr) ;

probConstraints
	: '(' ':constraints'  prefConGD ')'
	  -> ^(PROBLEM_CONSTRAINT prefConGD)
	;

prefConGD
	: '(' 'and' prefConGD* ')'
	| '(' 'forall' '(' typedVariableList ')' prefConGD ')'
	| '(' 'preference' NAME? conGD ')'
	| conGD
	;

metricSpec
	: '(' ':metric' optimization metricFExp ')'
	  -> ^(PROBLEM_METRIC optimization metricFExp)
	;

optimization : 'minimize' | 'maximize' ;

/** XXX TODO this might still have to be debugged! */
metricFExp
	: '(' binaryOp metricFExp metricFExp ')'
	  -> ^(BINARY_OP metricFExp metricFExp)
	| '(' '*' metricFExp metricFExp+ ')'
	  -> ^(MULTIOP_METRIC '*' metricFExp metricFExp+)
	| '(' '/' metricFExp metricFExp+ ')'
	  -> ^(MULTIOP_METRIC '/' metricFExp metricFExp+)
	| '(' '-' metricFExp ')'
	  -> ^(UNARY_MINUS metricFExp)
	| NUMBER
	  -> ^(NUMBER_METRIC NUMBER)
	| '(' 'is-violated' NAME ')'
	  -> ^(VIOLATED_METRIC NAME)
    	| '(' 'total-time' ')'
	  -> ^(TIME_METRIC)
	| '(' functionSymbol NAME* ')'
	  -> ^(FUNC_HEAD functionSymbol ^(PARAMS NAME*))
	;

/************* CONSTRAINTS ****************************/

conGD
	: '(' 'and' conGD* ')'
	| '(' 'forall' '(' typedVariableList ')' conGD ')'
	| '(' 'at' 'end' logicExpr ')'
    | '(' 'always' logicExpr ')'
	| '(' 'sometime' logicExpr ')'
 	| '(' 'within' NUMBER logicExpr ')'
	| '(' 'at-most-once' logicExpr ')'
	| '(' 'sometime-after' logicExpr logicExpr ')'
	| '(' 'sometime-before' logicExpr logicExpr ')'
	| '(' 'always-within' NUMBER logicExpr logicExpr ')'
	| '(' 'hold-during' NUMBER NUMBER logicExpr ')'
	| '(' 'hold-after' NUMBER logicExpr ')'
	;



/************* LEXER ****************************/


REQUIRE_KEY
    : ':strips'
    | ':typing'
    | ':negative-preconditions'
    | ':disjunctive-preconditions'
    | ':equality'
    | ':existential-preconditions'
    | ':universal-preconditions'
    | ':quantified-preconditions'
    | ':conditional-effects'
    | ':fluents'
    | ':adl'
    | ':durative-actions'
    | ':derived-predicates'
    | ':timed-initial-literals'
    | ':preferences'
    | ':constraints'
    | ':object-fluents'
    | ':numeric-fluents'
    | ':action-costs'
    | ':interval-separated'
    ;

NUMBER_STR: 'number';

UNDEFINED: 'undefined';

TIMEVAR: '#t';
TIMESTEPVAR: '#ts';

NAME:    LETTER ANY_CHAR* ;

fragment LETTER:	'a'..'z' | 'A'..'Z';

fragment ANY_CHAR: LETTER | '0'..'9' | '-' | '_';

VARIABLE : '?' LETTER ANY_CHAR* ;

NUMBER : DIGIT+ ('.' DIGIT+)? ;

fragment DIGIT: '0'..'9';

LINE_COMMENT
    : ';' ~('\n'|'\r')* '\r'? '\n' { $channel = HIDDEN; }
    ;

WHITESPACE
    :   (   ' '
        |   '\t'
        |   '\r'
        |   '\n'
        )+
        { $channel = HIDDEN; }
    ;
