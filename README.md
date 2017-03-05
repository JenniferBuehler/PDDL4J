# PDDL4J

Modification of an older PDDL4J version which still was using the expression structure (``class Exp`` types)
including ``class Substitution`` which allowed for substituting variables in expressions.

A few extensions were made, including support for PDDL 3.1, parsing with ANTLR generated files
and fixing a few bugs. For a detailed list of modifications please refer to [MODIFICATIONS.md](MODIFICATIONS.md).

# Installation

## 1. Install JAVA (at least v 1.6)

For example on Ubuntu:

``sudo apt-get install default-jdk``

set the ``JAVA_HOME`` environment variable

- Get path where Java is installed (and where you can find javac too): ``sudo update-alternatives --config javac``. Take the path before the *bin* directory: ``<path>/bin/javac``
- Set it in your ``.bashrc`` (or put it in ``/etc/environment`` instead): ``echo 'export JAVA_HOME="<your path to javac>"' >> ~/.bashrc``
- ``source ~/.bashrc``

## 2. Install Apache ANT for a more convenient build

- ``sudo apt-get install ant``
- Test it's properly installed with ``ant -version``

# Building

Build PDDL4J with ant:

```
cd <your-path-to-this-repo>/PDDL4J
ant
```


# Optional: Re-generating the parser files with ANTLR

For parsing PDDL files, parser code can be generated
with [ANTLR](https://github.com/antlr/).
The parser provided in ``src/antlr_parser`` will need the files generated by ANTLR for
the Pddl grammar, which is defined in [Pddl.g](Pddl.g)
(a modified version of
[the Pddl.g by Zeyn Saigol](https://github.com/antlr/grammars-v3/blob/master/pddl/Pddl.g)
which has been adapted to support newer PDDL 3.1 elements).

The directory ``src/antlr_gen`` already contains the files generated
by ANTLR. However if you want to change something in the grammar, you will need
to re-generate the files using ANTLR.

Currently, version 3.5 of ANTLR is required
(version 4 is not supported for the PDDL domain provided yet... PRs for this are very welcome!).

You can get ANTLR from [www.antlr3.org](http://www.antlr3.org/download.html).
You will need download the "complete Java binaries jar" file
(you won't need the version with the legacy code).
Or, simply use the copy of the library provided with this repository
in the *libs/jar* directory (which the approach taken in the following).


To generate the parser code:

```
cd <your-path-to-this-repo>/PDDL4J
java -jar libs/jar/antlr-3.5.2-complete-no-st3.jar -o antlr_gen Pddl.g``
```

(or use your other antlr library instead of the provided one)

This will have generate the parser code and put it in the directory ``antlr_gen``.


# Usage

## Simple API test

A very simple test file is provided in the file [pddl4j/tests/TestCNF.java](src/pddl4j/tests/TestCNF.java).
This is a file with some simple examples which you can modify to play around with the API a little.

```
cd build
java pddl4j.tests.TestCNF
```


## Parse a PDDL file

You can use the test parser in the file [antlr_parser/TestParser.java](src/antlr_parser/TestParser.java) which
just parses a PDDL domain and problem file and prints it on the screen.


```
cd build
java -cp ../libs/jar/antlr-3.5.2-complete-no-st3.jar:PDDL4J.jar\
       PDDL4J.antlr_parser.TestParser \
       <domain-file>.pddl <problem-file>.pddl
```

For example, parse the blocks world:

```
java -cp ../libs/jar/antlr-3.5.2-complete-no-st3.jar:PDDL4J.jar \
      PDDL4J.antlr_parser.TestParser \
      ../pddl/blockworld/blocksworld.pddl \
      ../pddl/blockworld/pb2.pddl
```

You can of course shorten the command by putting the directories of ``PDDL4J.jar`` and the
antlr library (in this example ``antlr-3.5.2-complete-no-st3.jar``) into your ``CLASSPATH``,
or moving the .jar files to a directory which is in your ``CLASSPATH``.
