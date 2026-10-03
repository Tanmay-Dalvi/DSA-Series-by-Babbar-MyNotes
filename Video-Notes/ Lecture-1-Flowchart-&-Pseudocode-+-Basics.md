Lecture 1: Flowchart & Pseudocode + Basics ## Core Definitions Programming: Feeding a set of instructions to a computer to perform a task and get an output.

Algorithm: A step-by-step logical sequence of instructions to solve a problem.

## Problem-Solving Approach

Understand the problem: Know exactly what needs to be solved.

Note Given Values: Write down the inputs provided.

Formulate Algorithm: Think of the step-by-step logic before writing code.

## Flowcharts & Components

What: A diagrammatic representation of an algorithm.

Why: Visualizes the logic and execution flow clearly.

Components:

Terminator (Oval/Pill): Used to Start or End the program.

Input/Output (Parallelogram): Used to take inputs or print outputs (e.g., Input A, B).

Processing (Rectangle): Used for calculations or assigning values (e.g., Sum = A + B).

Decision Making (Diamond): Evaluates a condition and splits the flow (True / False).

Arrows: Shows the direction of execution.

## Pseudocode

What: *Fake code* written in simple human language (like English).

Why: Helps structure logic roughly without worrying about strict coding syntax.

Example Logic (Sum of A and B):

Start

Input A, B

Sum = A + B

### Print Sum

End

## Decision Making

What: Branching logic based on a condition (Diamond block in flowcharts).

Example Logic (Positive, Negative, or Zero):

Input num

If num > 0 → Print *Positive* → End

If num < 0 → Print *Negative* → End

Else → Print *Zero* → End

## Looping

What: Repeating a specific block of steps until a terminal condition is met.

Why: Avoids writing the exact same code multiple times.

Example Logic (Print 1 to N):

Input N

Initialize i = 1

If i > N → Stop

Else → Print i

i = i + 1 (Move to next step)

Go back to Step 3

Example Logic (Add N User Inputs):

Input N

Initialize Sum = 0, i = 1

If i > N → Print Sum → Stop

Else → Input a num

Sum = Sum + num

i = i + 1

Go back to Step 3