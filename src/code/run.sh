#!/bin/bash

# usage: ./run.sh rule test.txt -flag
set -e

# antlr4
java -Xmx500M -cp "/usr/local/lib/antlr-4.12.0-complete.jar:$CLASSPATH" org.antlr.v4.Tool placeholder.g4 -no-listener -visitor

javac *.java 
#grun
java -Xmx500M -cp "/usr/local/lib/antlr-4.12.0-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig placeholder "$@"

