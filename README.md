# Installation

1. Install JAVA (at least v 1.6)

For example on Ubuntu:

``sudo apt-get install default-jdk``

set the ``JAVA_HOME`` environment variable

- Get path where Java is installed (and where you can find javac too): ``sudo update-alternatives --config javac``. Take the path before the *bin* directory: ``<path>/bin/javac``
- Set it in your ``.bashrc`` (or put it in ``/etc/environment`` instead): ``echo 'export JAVA_HOME="<your path to javac>"' >> ~/.bashrc``
- ``source ~/.bashrc``


2. Install Apache ANT for a more convenient build

- ``sudo apt-get install ant``
- test with ``ant -version``

3. Install ANTLR



# Building

1. Build PDDL4J

```
cd PDDL4J
ant
```
