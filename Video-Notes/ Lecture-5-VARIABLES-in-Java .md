Lecture 5: **VARIABLES** in Java  

## What is a Variable?  
What: A named storage location in the computer's memory.  

Why: You need a name (variable) to easily find, read, update, or delete data stored in memory.  

## Variable Syntax  
Example: int age = 5;  

int: Data Type (Specifies that this memory block will store an integer).  

age: Variable Name (The name given to the memory location).  

=: Assignment Operator (Assigns the value on the right to the variable on the left).  

5: The actual value being stored.  

## Declaration vs. Initialization  
Declaration: Creating a variable without assigning a value (e.g., int age;). Note: Printing this before assigning a value throws an error.  

Initialization: Creating a variable and assigning a value at the exact same time (e.g., int totalMarks = 20;).  

## Variable Naming Rules  
Case Sensitivity: Java is case-sensitive. age, Age, and **AGE** are treated as completely different variables.  

Starting Characters: Variable names must start with:  

A lowercase letter (a-z)  

An uppercase letter (A-Z)  

An underscore (_)  

A dollar sign ($)  

(Cannot start with a digit)  

Subsequent Characters: After the first character, you can use letters, digits (0-9), underscores, or dollar signs.  

No Reserved Keywords: You cannot use Java keywords (like class, static, int, public) as variable names because they have predefined meanings in Java.  

Length/Meaning: There is no strict length limit, but names should be intuitive and meaningful (e.g., height instead of h).  

## Naming Conventions (Best Practices)  
Constants: If a value will never change, write the variable name in all **UPPERCASE** (e.g., DAYS_IN_YEAR).  

Camel Case: Used for joining multiple words into one variable name.  

Rule: The first word is completely lowercase. The first letter of every subsequent word is capitalized.  

Example: my name is love babbar becomes myNameIsLoveBabbar.  

Example: total marks becomes totalMarks.  