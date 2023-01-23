#!/bin/bash

# usage: ./run.sh test.txt -flag
set -e

java -Xmx500M -cp "/usr/local/lib/antlr-4.11.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool placeholder.g4 
javac *.java 
java -Xmx500M -cp "/usr/local/lib/antlr-4.11.1-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig placeholder prog "$@"

