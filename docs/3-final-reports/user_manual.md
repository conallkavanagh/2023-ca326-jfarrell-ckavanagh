# Natural Language Programming Language User Manual 
### Created by Jack Farrell and Conall Kavanagh

**Table of Contents**
- Setting up the language.
- The commands.
- Example problems / solutions.
---
## Setting up the Enviroment

In order for the computer to recognise the language and be able to execute the code we need to download a few things.

if you are on a linux machine then all that is neede is to set up antlr4 on your machine, this can be done by following the guide [here](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md#installation).

For windows users it is recommended to set up Windows Subsytem for Linux. By following the guide [here](https://pureinfotech.com/install-windows-subsystem-linux-2-windows-10/) it should be ready to go. Once it is up and running follow the instructions for linux machines to set up antlr4.

## Setting up the language

Once you cloned the repo and have antlr4 installed move to the directory src/code. it is here where your files should be written. it is also possible to create a seperate directory here to store all the programms that you make.
`~/2023-ca326-jfarrell-ckavanagh$ cd src/code`

Now that we have the blueprints of the language we need to run the run.sh file found here. this can be done by typing into the console `./run.sh` you will know it has worked when the following appears 
`java org.antlr.v4.gui.TestRig GrammarName startRuleName`
  `[-tokens] [-tree] [-gui] [-ps file.ps] [-encoding encodingname]`
 `[-trace] [-diagnostics] [-SLL]`
`[input-filename(s)]`

once you see that it is time to start making your own programms.

## Commands 

There are a lot of commands each with their own use and ways of being written. This guide will give you an overview on each of the commands and some examples to show how each one works.

Here is the order of commands and features that will be covered in the guide
	
	1. Strings, Numbers and Bools
	2. Say
	3. Assigning Variables
	4. Lists
	5. Loops
	6. If Statement
	7. Functions
	8. Comments

