Lecture 8: User Input & Garbage Collector in Java  
## Taking Input in Java  
What: Unlike C++ (cin) or C (scanf), Java uses the Scanner class to read user input.  

Why: To make programs dynamic rather than relying on hardcoded values.  

Prerequisite: You must import the Scanner class at the top of your file (import java.util.Scanner;).  

## Scanner Object Creation  
Logic/Syntax:  

Java  
Scanner sc = new Scanner(System.in);  
Explanation: You are creating an object sc from the Scanner blueprint. System.in tells the Scanner to take input from the standard input stream (keyboard).  

## Reading Different Data Types  
You use specific methods attached to your Scanner object (sc) to read different types of data:  

Integer: int num = sc.nextInt();  

Float: float decimal = sc.nextFloat();  

Boolean: boolean flag = sc.nextBoolean();  

Short: short smallNum = sc.nextShort();  

BigInteger: BigInteger bigNum = sc.nextBigInteger(); (Requires importing java.math.BigInteger)  

## Closing the Scanner  
Logic/Syntax:  

Java  
sc.close();  
Why: Best practice. It prevents resource leaks by closing the input stream once you are completely done taking inputs in your program.  

## Java Garbage Collector (GC)  
What: An automated memory management entity in Java.  

Why: In languages like C++, you must manually free heap memory (free keyword) after dynamically allocating objects. If you forget, it causes a Memory Leak (wasted, blocked memory).  

How it works: Java automatically detects *unreachable* or unused objects in the heap memory and deallocates them for you, preventing memory leaks and optimizing performance.  