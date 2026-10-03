Lecture 4: Write your **FIRST** Java Program 

## Functions (Methods) in Java 

What: A block of code designed to perform a single, specific task (e.g., adding two numbers).

Why: Takes inputs, processes them, and returns an output, making code reusable and organized.

Return Type: Defines what the function gives back.

int: Returns an integer.

String: Returns text.

void: Returns absolutely nothing (just performs an action, like printing).

## The main Function

What: The starting point (entry point) of any Java application.

Why: Regardless of how many thousands of lines of code exist, the **JVM** looks for main to start execution.

Syntax: void main() { ... } (Basic) or public static void main(String[] args) { ... } (Classical).

## Printing Output

System.out.println(*Text*): Prints the text and moves the cursor to the next line.

System.out.print(*Text*): Prints the text but keeps the cursor on the same line.

Strings: Any text enclosed in double quotes (e.g., *Hello World*).

Concatenation: Using the + operator to join two strings together (e.g., *Hello* + *World*).

Expressions: Writing mathematical operations without quotes (e.g., 4 + 3) will evaluate to 7 before printing.

## Basic Syntax Rules

Curly Brackets { }: Defines a *block of code*. Anything inside belongs to the function or class preceding it.

Semicolon ;: Acts as a line terminator. Every instruction statement must end with it.

## Comments

What: Text in the code that the compiler ignores. Used for notes, explanations, or disabling code.

Single-line Comment: // Your comment here (Shortcut: Ctrl + / or Cmd + /).

Multi-line Comment: /* Your multi-line comment here */.

## Classical Java Boilerplate (Assumptions)

public class ClassName: A container holding all your code.

public static void main(String[] args): The standard entry point required in professional/classical Java setups.