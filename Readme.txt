PDDL4J library (version 1.0)
Date: 14/01/2008

1. Contact 

Damien Pellier (damien.pellier@parisdescartes.fr)
htt://www-math-info.univ-paris5.fr/~pellier

2. Description 

PDDL4J is an open source library under licence CECILL (http://www.cecill.info/). 
The purpose of the PDDL4J is to facilitate the  java implementation of planners 
based on the PDDL (Planning Description Language). The library contains a 
parser on the last version of PDDL 3.0 and all the classes need to manipulate its 
concepts. The parser can be configured to accept only specified requirements of 
PDDL langage. The list of requirements accepted are as follow:

:strips - Basic STRIPS-style.
:typing - Allows type names in declaration of variables
:negative-preconditions - Allows not in goal and preconditions descriptions.
:disjunctive-preconditions - Allows or in goal and preconditions descriptions.
:equality - Supports = as built-in predicate.
:existential-preconditions - Allows exists in goal and preconditions descriptions.
:universal-preconditions - Allows forall in goal and preconditions descriptions.
:quantified-preconditions - Is equivalent to :existential-preconditions + 
	:universal-preconditions.
:conditional-effects - Allows when clause in actionCtx effects.
:fluents - Allows function definitions and use of effects using assignement 
	operators and numeric preconditions.
:adl - Is equivalent to :strips + :typing + :negative-preconditions + 
	:disjunctive-preconditions + :equality + :quantified-preconditions + 
	:conditional-effects.
:durative-actions - Allows durative actions. Note that this does note imply 
	:fluents.
:derived-predicate - Allows predicates whose truth value is defined by a formula.
:time-initial-literals - Allows the initial state to specify literals that will
	 become true at a specified time point implies durative-actions.
:preferences - Allows use of preferences in actionCtx preconditions and goals.
:constraints - Allows use of constraints fields in domain and problem description.
	 These may contain modal operator supporting trajectory constraints.

PDDL was originally developed by Drew McDermott and the 1998 planning competition
committee. It was inspired by the need to encourage the empirical comparison of 
planning systems and the exchange of planning benchmarks within the community. 
Its development improved the communication of research results and triggered an
 explosion in performance, expressivity and robustness of planning systems.

PDDL has now been used in all 3 planning competitions, undergoing various 
revisions for each. In the most recent competition PDDL was extended by Maria Fox,
Derek Long and the 2002 committee to handle time and duration (PDDL2.1). Further 
enrichments to the modelling of hybrid and real-time systems (PDDL+) were proposed,
 while another committee is currently investigating extensions to probabilistic 
planning.

PDDL has become a de facto standard language for describing planning domains, 
not only for the competition but more widely, as it offers an opportunity to carry 
out empirical evaluation of planning systems on a growing collection of generally 
adopted standard benchmark domains. The emergence of a language standard will have
 an impact on the entire field, influencing what is seen as central and what 
peripheral in the development of planning systems. 

3. How to use the PDDL4J library ?

3.1 Use binary distribution

The pddl4j library can be used as a jar file called "pddl4j.jar" in the "lib" 
directory of the release. Therefore, include the jar in our classpath and enjoy it.

All the documentation are contained in the doc directory.

3.2 Compiling from sources

The pddl4j library is package with "ant". If ant is not installed on your computer,
go to http://ant.apache.org/, then juste type "and rebuild" at the root of the 
pddl4j distribution.

3.3 Code examples  

Examples are available on the "examples" directory of the distribution. Below, we 
give simple example of how to use the ADL parser:

 public static void main(String[] args) {
     // Checks the command line
     if (args.length != 2) {
         System.err.println("Invalid command line");
     } else {
         // Creates an instance of the java pddl parser
         Parser parser = new Parser(options);
         Domain domain = parser.parse(new File(args[0]));
         Problem problem = parser.parse(new File(args[1]));
         PDDLObject obj = parser.link(domain, problem);
         // Gets the error manager of the pddl parser
         ErrorManager mgr = parser.getErrorManager();
         // If the parser produces errors we print it and stop
         if (mgr.contains(Message.ERROR)) {
             mgr.print(Message.ALL);
         } // else we print the warnings
         else {
             mgr.print(Message.WARNING);
             System.out.println("\nParsing domain \"" + domain.getDomainName()
                         + "\" done successfully ...");
             System.out.println("Parsing problem \"" + problem.getProblemName()
                         + "\" done successfully ...\n");
         }
     }
 }
         