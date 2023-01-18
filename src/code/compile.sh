#!/usr/bin/env bash

java -Xmx500M -cp "/usr/local/lib/antlr-4.11.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool -Dlanguage=Python3 placeholder.g4
