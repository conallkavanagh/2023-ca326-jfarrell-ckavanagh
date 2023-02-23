# Technical Manual



## Table of contents

A table of contents with pages numbers indicated for all sections / headings should be included.
1) Introduction
	- 1.1 Overview
	- 1.2 Business Context
	- 1.3 Glossary
2) General Description
	- 2.1 Product / System Functions
	- 2.2 User Characteristics and Objectives
	- 2.3 Operational Scenarios
	- 2.4 Constraints
3) Functional Requirements
4) System Architecture
5) High Level Design
6) Preliminary Schedule
7) Appendices

## 1. Introduction

### 1.1 Overview  

Provides a brief overview of the system / product to be developed. It should include a description of the need for the system, briefly describe its functions and explain how it will work with other systems (if appropriate).

We have developed a programming language that is meant to be easy to learn by beginners. We designed the language to use grammer from natural language as a way to make it easier for beginners to understand what is going on. The language is dynamically typed and imperative. It supports variables, loops, if statements and functions.

Michael: here you talk overall about the system, like a dragons den pitch, list what a user can do on your platform (pref as bullet points) 

e.g. 

the features of our programming language include:
- variables, with dynamic typing
	- supports numbers (floaing point), strings, booleans and arrays
- loops
- if statements for control flow
- functions / procedures
- comments, which are prepended with a #

### 1.2 Business Context  

Programming is hard. It is especially difficult when starting out, having all these new concepts to learn, and a brand new language on top of that. Our language is designed to help people starting out with programming, with a simple syntax. It can be used to ease people in to programming and can be a transition from very simple, graphical languages such as Scratch or Blockly, and to real, text-based programming languages such as Java or Python.

Our language could be used in schools to teach programming basics and will be a benefit to the tech industry as more people will learn to code. It could be further developed in the future by adding other features such as Classes, user input, recursive functions and other features commonly found in most programming languages.

### 1.3 Glossary  
Define and technical terms used in this document. Only include those with which the reader may not be familiar.

All strange terms, if you can supplement them with links even better, should either be bullet points, or a table

E.g. SQL – Structured Query Language used to interact with relational databases

Parser - A program that parses text input from the user into tokens in a language.
Interpreter - A program that goes through the tokens produced by the parser in the AST and executes them line by line.
Visitor - A design pattern used as a standard way to traverse the AST.
Abstract Syntax Tree (AST) - A tree representation of the different tokens in the language and their semantic meaning.


## 2. General Description

### 2.1 Product / System Functions  

- variables, with dynamic typing
	- supports numbers (floaing point), strings, booleans and lists
	- lists support holding data of multiple types at once
	- variables can be reassigned to hold a different datatype than the one they originally started with
- loops
- if statements for control flow
	- includes `if`, `else if` and `else`statement
- functions / procedures
	- separate scopes for functions
- comments, which are prepended with a #
- common mathematical operators
- string concatenation

### 2.2 User Characteristics and Objectives  
Users of the language will generally be complete beginners to programming of all ages. Their technical ability should be fairly novice, but be relatively proficient in using their computer, and be able to run programs from the command line.

  

### 2.3 Operational Scenarios  
> This section should describe a set of scenarios that illustrate, from the user's perspective, what will be experienced when utilizing the system under various situations. 

> In the article Inquiry-Based Requirements Analysis (IEEE Software, March 1994), scenarios are defined as follows:  
In the broad sense, a scenario is simply a proposed specific use of the system. More specifically, a scenario is a description of one or more end-to-end transactions involving the required system and its environment. Scenarios can be documented in different ways, depending up on the level of detail needed. The simplest form is a use case, which consists merely of a short description with a number attached. More detailed forms are called scripts.  

> Describe a “use case” for the system. E,g, A user wants to do X, they log in and do..what ? 


Use case 1: I want to print hello world to the screen.

The user opens a text editor and saves a file which has the following contents:
```java
say "Hello World!";
```

They then run the file using the interpreter by typing `java placeholder filename` which then outputs:
```
Hello World!
```


Use Case 2: I want to assign a value to a variable
The user writes the following code:
```java
x = 5;
```

This will assign a number value of 5 to the variable x.

Use Case 3: I want to add my name to the output
The user can store their name in a variable and print it like so
```java
my_name = "Ada";
output = "Hello " + my_name;
say output;
```

Use Case 4: I want to repeat some code multiple times
The user can repeat code using loops
```java
loop 5 times {
	say "hello world";
}
```

Use Case 5: I want to add my items to a list to use later
```java
x is [1, 2, 3, 4, 5];
x = x + 6;
```

this will make x a list, and append the value 6 to x.

### 2.4 Constraints  
- Java v17.x
- ANTLR v4.x
- OS - Linux only

## 3. Functional Requirements

| Requirement                          | Variables                                                                                                                                                                  |
| ------------------------------------ | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Description                          | Variables that can store values of any type described by the language                                                                                                      |
| Criticality                          | High                                                                                                                                                                       |
| Technical issues                     | Need to validate that the values are of a valid type, and needs to support expressions, which will get evaluated at runtime, should not be callable outside of their scope |
| Dependencies with other requirements | Data types supported by language, functions, which should have a separate scope.                                                                                           |

| Requirement                          | Loops                                                      |
| ------------------------------------ | ---------------------------------------------------------- |
| Description                          | Loops that can repeat things for a certain number of steps |
| Criticality                          | High                                                       |
| Technical issues                     | Need to work with either a number literal or a variable    |
| Dependencies with other requirements | N/A                                                        |

| Requirement                          | Procedure Definition                                                                                                                                                                                                                           |
| ------------------------------------ | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Description                          | Define procedures in the code for code reuse                                                                                                                                                                                                   |
| Criticality                          | medium                                                                                                                                                                                                                                         |
| Technical issues                     | Procedures need their own scope and have to be passed parameters which are copied to the local scope. They should end on a return statement and return its body, or if there isnt one, on the end of the function body they should return null |
| Dependencies with other requirements | Scoping, return statement                                                                                                                                                                                                                     |

| Requirement                          | Procedure Invocation                                                                           |
| ------------------------------------ | ---------------------------------------------------------------------------------------------- |
| Description                          | Procedure that have been previously defined shall be able to be invoked                        |
| Criticality                          | medium                                                                                         |
| Technical issues                     | Must return the value in the procedure to the outer scope and output must be able to be stored |
| Dependencies with other requirements | Procedure definition, return statement, scoping                                                |

| Requirement                          | If statements                                                                                                                                                                                                                                                                                                                                                                            |
| ------------------------------------ | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Description                          | If statements are control flow which run a block if an expression evaluates to true                                                                                                                                                                                                                                                                                                      |
| Criticality                          | High                                                                                                                                                                                                                                                                                                                                                                                     |
| Technical issues                     | If statement can have any number of `else if` statement and may optionally be followed by an `else`. all further else blocks mustn't be evaluated if one is found true and we need to separate the blocks in a way that we can unambigously determine which if statement they are a part of. It needs to be unambigous which If statement an `else` is a part of (dangling else problem) |
| Dependencies with other requirements | Booleans, expressions                                                                                                                                                                                                                                                                                                                                                                                         |

| Requirement                          | Expressions                                                                                                                |
| ------------------------------------ | -------------------------------------------------------------------------------------------------------------------------- |
| Description                          | Expressions are combinations of terms and operators that will evaluate to a token in one of the language's datatypes       |
| Criticality                          | High - needed for any mathematical logic                                                                                   |
| Technical issues                     | Need to ensure that all terms in an expression are of compatible datatypes. Need to ensure the correct order of operations |
| Dependencies with other requirements | Booleans, Strings, Numbers, Lists                                                                                          |

| Requirement                          | Strings                                                                                 |
| ------------------------------------ | --------------------------------------------------------------------------------------- |
| Description                          | Strings are a combination of characters used to represent text                          |
| Criticality                          | High                                                                                    |
| Technical issues                     | Need to ensure that they are not used in expressions with other incompatible data types |
| Dependencies with other requirements | Expressions, Say command                                                                |

| Requirement                          | Numbers                                                                                                                                                   |
| ------------------------------------ | --------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Description                          | Numbers in our programming language. All stored as floats internally so users dont have to distinguish between ints and floats                            |
| Criticality                          | High                                                                                                                                                      |
| Technical issues                     | Need to ensure that they are not used in expressions with other incompatible data types. When printed if they are a whole number, we shouldn't print `.0` |
| Dependencies with other requirements | Expressions                                                                                                                                               |

| Requirement                          | Booleans                                                               |
| ------------------------------------ | ---------------------------------------------------------------------- |
| Description                          | True or False values                                                   |
| Criticality                          | High - needed for boolean logic                                        |
| Technical issues                     | Need to ensure the correct order of operations for boolean expressions |
| Dependencies with other requirements | Expressions                                                            |

| Requirement                          | Scoping                                                                                                                                                                              |
| ------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| Description                          | Variables in separate scopes (procedure bodies) should not be able to be accessed outside of the scope                                                                               |
| Criticality                          | medium                                                                                                                                                                               |
| Technical issues                     | Requires a stack in order to separate different scopes in memory. when we go into a new scope we need to push to a stack and when we go out of a scope we need to pop from the stack |
| Dependencies with other requirements | Function definition, function invocation                                                                                                                                             |

| Requirement                          | Return statements  https://scratch.mit.edu/                                                                                                                               |
| ------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------- |
| Description                          | Return a value and exit the procedure body                                                                                                        |
| Criticality                          | medium                                                                                                                                            |
| Technical issues                     | need to differentiate between return statements and other statements in function bodies so we know to exit the function body and return the value |
| Dependencies with other requirements | function definition, function invocation                                                                                                          |


| Requirement                          | Print statements                                      |
| ------------------------------------ | ----------------------------------------------------- |
| Description                          | print to the screen a string or variable given to it  |
| Criticality                          | high                                                  |
| Technical issues                     | Need to make a string representation of all datatypes |
| Dependencies with other requirements | all datatypes                                         |

| Requirement                          | Operators                                                                                                                                     |
| ------------------------------------ | --------------------------------------------------------------------------------------------------------------------------------------------- |
| Description                          | common mathematical, boolean and comparison operators                                                                                         |
| Criticality                          | High                                                                                                                                          |
| Technical issues                     | need to ensure order of operations, must check that terms are of compatible data types. operators may work differently depending on the types |
| Dependencies with other requirements | Expressions, data types                                                                                                                       |

| Requirement                          | Installation                                   |
| ------------------------------------ | ---------------------------------------------- |
| Description                          | Installing the interpreter                     |
| Criticality                          | High                                           |
| Technical issues                     | Requires installing dependencies (Java, ANTLR) |
| Dependencies with other requirements | Java v17.x, ANTLR v4.X                         |


## 4. System Architecture

> This section describes a high-level overview of the anticipated system architecture showing the distribution functions across (potential) system modules. Architectural components that are reused or 3rd party should be highlighted.

> Show system arch diagram, one tip to make them look nice, if you’re using a mysql database , include the mysql logo, same for Django, etc…



## 5. High-Level Design

> This section should set out the high-level design of the system. It should include one or more system models showing the relationship between system components and the systems and its environment. These might be object models, DFD, etc.

> Data flow diagrams, class diagrams (if applicable) and sequence diagrams go here !

## 6. Preliminary Schedule

The initial project plan was to create a basic language in the first 2 weeks. We would then, once we had an interpreter up and running expand on our language during weeks 3 and 4, and do most of our user testing in the final 2 weeks of the project, and do any modification based on user feedback in those final weeks.

We used ANLTR4 in order to create our parser. Which is a domain specific language for writing parsers and it can generate code for you based on the parser rules you give it.
For our interpreter we were going to write it in Python originally, but after a talk with our supervisor he suggested Java would be a better option. We decided on using Java in the end after careful consideration.

### GANTT Chart
![](https://lh3.googleusercontent.com/TXNeD1n3e9R3B3377ir71XZTdpzvjagqTBz_9TPffzWqm9prsNyuneVSei4SvPf_z13Wsmkp5FTIdj2RaRbCLM2krABSlTVrV66ruCl7OLLf026fp45XMamI3iB9imiyEjDlzCBKjBFAQK8CoTzf1AQ)

### PERT Chart
![](https://lh4.googleusercontent.com/TQayf0cpbgulEpvqxW38bjsBZpEdu2ZZGjmRMO4Y0hsNAyM3MOAUve-uMMlp9FgyFP1OyD6xlyyHZqpLBVTCn1EQe9WF5EDjZHETlCZfUJtPJzsrrCtpqusdjWKycgJ3ttbXiL63xBpbuuQYwmc6QhU)

## 7. Appendices

- Language Implementation Patterns - Terence Parr
- The Definitive ANLTR4 Guide - Terence Parr
- Crafting Interpreters https://craftinginterpreters.com/contents.html
- Blockly: https://blockly.games
- Scratch: https://scratch.mit.edu/

Some inspirations:
- Applescript: https://developer.apple.com/library/archive/documentation/AppleScript/Conceptual/AppleScriptLangGuide/introduction/ASLR_intro.html
- Lua: https://www.lua.org/
- Python: https://www.python.org/