# Technical Manual

** This document contains the general outline that you should adopt for your Functional Specification **

> Michael: Feel free to add your own cover page, including fancy logo of the project 

  

## Table of contents

A table of contents with pages numbers indicated for all sections / headings should be included.

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
Provides an overview of the business organization sponsoring the development of this system / product or in which the system / product will / could be deployed. Note - may not be applicable to all projects 

  

Michael: this may not be relevant to some projects, if it is relevant, talk about why , potential user base, why this is an issue that need to be addressed. Also talk about how it would work in the real world, e.g. is it deployed on campus, is it a cloud b2b application, is it an on-premises application

  

If it is not a business-y application, talk about how it could be used in production, societal benefits, or even how your application could be used or further developed. 


Programming is hard. It is especially difficult when starting out, having all these new concepts to learn, and a brand new language on top of that. Our language is designed to help people starting out with programming, with a simple syntax. It can be used to ease people in to programming and can be a transition from very simple, graphical languages such as Scratch [1] or Blockly [2], and to real, text-based programming languages such as Java or Python.

Our language could be used in schools to teach programming basics and will be a benefit to the tech industry as more people will learn to code. It could be further developed in the future by adding other features such as Classes, user input, recursive functions and other features commonly found in most programming languages.

### 1.3 Glossary  
Define and technical terms used in this document. Only include those with which the reader may not be familiar.

All strange terms, if you can supplement them with links even better, should either be bullet points, or a table

E.g. SQL – Structured Query Language used to interact with relational databases

Parser
Interpreter
Visitor
Abstract Syntax Tree (AST)


## 2. General Description

### 2.1 Product / System Functions  
Describes the general functionality of the system / product. 

This should be a bullet point list, in more detail than what was shown in section 1 overview 

E,g,

-   Register
-   Login in 
-   Do X
-   Do Y 
-   Etc…

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
Describes the features of the user community, including their expected expertise with software systems and the application domain. Explain the objectives and requirements for the system from the user's perspective. It may include a "wish list" of desirable characteristics, along with more feasible solutions that are in line with the business objectives.

Who are the intended users, older people, students etc… what is their technical ability (modest, adequate etc..) 

Users of the language will generally be complete beginners to programming of all ages. Their technical ability should be fairly novice, but be relatively proficient in using their computer, and be able to run programs from the command line.

  

### 2.3 Operational Scenarios  
This section should describe a set of scenarios that illustrate, from the user's perspective, what will be experienced when utilizing the system under various situations. 

In the article Inquiry-Based Requirements Analysis (IEEE Software, March 1994), scenarios are defined as follows:  
In the broad sense, a scenario is simply a proposed specific use of the system. More specifically, a scenario is a description of one or more end-to-end transactions involving the required system and its environment. Scenarios can be documented in different ways, depending up on the level of detail needed. The simplest form is a use case, which consists merely of a short description with a number attached. More detailed forms are called scripts.  

Describe a “use case” for the system. E,g, A user wants to do X, they log in and do..what ? 


Use case 1: I want to print hello world to the screen.

The user opens a text editor and saves a file which has the following contents:
```java
say "Hello World!";
```

They then run the file using the interpreter by typing `java placeholder filename` which then outputs:
```
Hello World!
```


### 2.4 Constraints  
Lists general constraints placed upon the design team, including speed requirements, industry protocols, hardware platforms, and so forth. 

Time to complete the project is not a constraint!

It is possible you have no constraints, but think of 

-   Software versions – e.g. Python 3.x
	- Java v17.x
	- ANTLR v4.x
-   OS
	- Linux only
-   Specific hardware requires (e.g. raspberry pi)

## 3. Functional Requirements

Use case diagram goes here, showing all functional reqs and how they interact

This section lists the functional requirements in ranked order. Functional requirements describes the possible effects of a software system, in other words, what the system must accomplish. Other kinds of requirements (such as interface requirements, performance requirements, or reliability requirements) describe how the system accomplishes its functional requirements. 

As an example, each functional requirement could be specified in a format similar to the following:

-   Description - A full description of the requirement.
-   Criticality - Describes how essential this requirement is to the overall system.
-   Technical issues - Describes any design or implementation issues involved in satisfying this requirement.
-   Dependencies with other requirements - Describes interactions with other requirements.
-   Others as appropriate

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

| Requirement                          | Return statements                                                                                                                                 |
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

Do not forget to include the boilerplate functional reqs, e.g. log in, log out etc…

For some applications installation may be a functional req 

## 4. System Architecture

This section describes a high-level overview of the anticipated system architecture showing the distribution functions across (potential) system modules. Architectural components that are reused or 3rd party should be highlighted.

Show system arch diagram, one tip to make them look nice, if you’re using a mysql database , include the mysql logo, same for Django, etc…



## 5. High-Level Design

This section should set out the high-level design of the system. It should include one or more system models showing the relationship between system components and the systems and its environment. These might be object models, DFD, etc.

Data flow diagrams, class diagrams (if applicable) and sequence diagrams go here !

## 6. Preliminary Schedule

This section provides an initial version of the project plan, including the major tasks to be accomplished, their interdependencies, and their tentative start/stop dates. The plan also includes information on hardware, software, and wetware resource requirements. 

The project plan should be accompanied by one or more PERT or GANTT charts. 

Make sure to leave time for testing in gantt chart

## 7. Appendices

Specifies other useful information for understanding the requirements.