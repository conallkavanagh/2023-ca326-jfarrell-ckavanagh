#!/bin/bash

cat test/expression_test | xargs -n1 java -Xmx500M -cp "/usr/local/lib/antlr-4.11.1-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig placeholder expression -tree
