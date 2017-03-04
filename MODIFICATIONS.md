# Modifications

This is a summary of the changeset applied to the [older version of PDDL4j in this fork](https://github.com/gerryai/PDDL4J).

The modifications discard the lexer and pddl domains (

- Deleted pddl directory ``pddl`` with the pddl domains
- Deleted all parser-related code using javacc (new version uses ANTLR), which deletes the old directories  ``dev`` and ``lexer`` and deleted following files:
  * src/pddl4j/Parser.java
  * src/pddl4j/ParserException.java
  * src/pddl4j/ErrorManager.java (Only needed in Parser.java and Lexer.java)
  * src/pddl4j/PDDLObject.java (only needed in Parser.java)
  * src/pddl4j/Source.java (only used in Parser.java and PDDLObject.java)
  * pddl4j/tests/Test.java (needs the old parser)
- Deleted following files which are not needed any more:
  * src/overview.html
  * src/pddl4j/package.html
  * src/pddl4j/InvalidExpException.java ( not actually used anywhere)

