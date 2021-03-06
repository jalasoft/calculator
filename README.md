# Calculator

A command line application performing arithmetical operations described in an external file.

## How to build the application

Invoke maven phase `package`: 

```maven
mvn package
```

and use the newly created jar file `Calculator-1.0-SNAPSHOT.jar` to run the application, that is placed in 
directory `target`.

## How to run the application

The application is based on *Spring* *Boot*. It uses several external libraries. Exception the *Spring*
 it depends on *SLF4J* (Simple Logging Framework for Java) and *Logback* (Logging provider): 
 
All of the dependencies are packed in the jar file. So the only jar that is needed to run the application 
is the jar of the application itself.

Use the following command to start the application:

```java
java -jar Calculator-1.0-SNAPSHOT.jar --input=instructions.txt
```

If no `input` parameter is provided, the application does nothing, it only informs the user about no file.

## Mandatory parameters

   * `--input=<FILE>` a path to a file containing arithmetical instructions.
    
## Optional parameters
    
The application is based on *Spring* *Boot* so there are many others parameters automatically available.
    
   * `--logging.level.root=<LEVEL>` enables printing additional info from loggers enabled for log level <LEVEL> which can be TRACE, DEBUG, INFO, WARN, ERROR or FATAL.
   * `--debug` is similar to previous one but allows printing Spring internal messages regarding configuration of the app and many other types of messages. 

## Format of an external file

A list of instructions. Every instruction is placed on separate line consisting of two 
parts:

   * instruction - can be any of the following operations: add, subtract, divide, multiply
   * operand - any integer number
    
The last line of the file must be a special command - `apply` followed by an integer that
represents a starting number that will be used as a first operand of the arithmetic instruction
on the firsr line. Result of the operation is used as an operand of the second instruction etc.
until one operand remains which is the final result.

example:

```
add 4
multiply 2
subtract 2
divide 3
multiply 5
multiply 3
add 133
apply 6
```