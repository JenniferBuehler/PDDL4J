package PDDL4J.antlr_parser;

import java.io.*;
import java.util.*;
// import java.util.logging.*;

import PDDL4J.antlr_parser.*;

import pddl4j.*;
import pddl4j.exp.*;
import pddl4j.exp.assign.*;
import pddl4j.exp.term.*;
import pddl4j.exp.fexp.*;
import pddl4j.exp.fcomp.*;
import pddl4j.exp.type.*;
import pddl4j.exp.action.*;

/**
 * Produce plan using brute-force search (e.g. A*) in the tree
 */
public class TestParser 
{

// private static final Logger logger = Logger.getLogger(TestParser.class.getName());

private final Domain domain;
private final Problem problem;

public TestParser(pddl4j.Domain dom,
                  pddl4j.Problem prob) throws IllegalArgumentException {
	if (dom == null || prob == null) {
  	throw new IllegalArgumentException("null domain/problem");
	}
	this.domain = dom;
	this.problem = prob;
}

public static void main(String[] args) {
	if (args.length < 2) {
		usage();
    return;
	}

	File domainFile = new File(args[0]);
	if (!domainFile.exists()) {
		System.err.println("Unable to find PDDL domain file " + args[0]);
		usage();
    return;
	}
	File problemFile = new File(args[1]);
	if (!problemFile.exists()) {
		System.err.println("Unable to find PDDL problem file " + args[1]);
		usage();
    return;
	}

	try {
		ANTLRDomainBuilder domBuilder = new ANTLRDomainBuilder(domainFile);
		Domain domain = domBuilder.buildDomain();

		System.out.println("Domain parsing finished.");

		ANTLRProblemBuilder probBuilder = new ANTLRProblemBuilder(domain, problemFile);
		Problem problem = probBuilder.buildProblem();
		
    System.out.println("Problem parsing finished.");


		System.out.println(" %%%%%%  Domain %%%%%%%%%%");
		// System.out.println(domain.toTypedString());
		System.out.println(domain);
		System.out.println(" %%%%%%  Problem %%%%%%%%%%");
		// System.out.println(problem.toTypedString());
		System.out.println(problem);

	} catch (IOException e) {
		System.err.println("Error reading PDDL file(s): " + e);
		e.printStackTrace();
	} catch (PDDLSyntaxException e) {
		System.err.println("Syntax errors found in the PDDL file(s).");
		e.printStackTrace();
	} catch (InvalidPDDLElementException e) {
		System.err.println("Invalid semantics in the PDDL file(s): " + e);
		e.printStackTrace();
	}
}

private static void usage() 
{
	System.err.println("usage: java PDDL4J.antlr_parser.TestPARSER <domain-pddl-file> <problem-pddl-file>");
}

}
