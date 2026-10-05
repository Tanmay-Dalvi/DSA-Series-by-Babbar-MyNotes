Lecture 6: Data Types in Java & Type Casting  
## What is a Data Type?  
What: An entity that defines what kind of data a variable will store and work with.  

Why: It tells the computer how much memory to allocate (size) and what type of data to expect (e.g., text vs. numbers).  

## Categories of Data Types  
Primitive Data Types: Pre-defined by Java (e.g., int, char, boolean). They are the basic building blocks.  

Non-Primitive Data Types: Created by the programmer or refer to objects (e.g., Strings, Arrays, Classes). (To be covered later with OOPs).  

## 3. Primitive Data Types Overview

| Data Type | Size | Range / Description |
|-----------|------|---------------------|
| `byte` | 1 byte | -128 to 127 |
| `short` | 2 bytes | -32,768 to 32,767 |
| `int` | 4 bytes | Standard integer (~ -2B to 2B) |
| `long` | 8 bytes | Large integer (requires `L` at the end) |
| `float` | 4 bytes | ~6–7 decimal points (requires `f` at the end, e.g., `3.14f`) |
| `double` | 8 bytes | ~15 decimal points (higher precision) |
| `char` | 2 bytes | Single character, enclosed in single quotes (e.g., `'A'`) |
| `boolean` | 1 bit | `true` or `false` (Java does **NOT** accept `1` or `0`) |


## Characters & ASCII Values  
Every character (like 'A', 'a', *) is mapped to a numeric value in the computer's memory, called an **ASCII** value.  

Example: 'a' maps to 97, 'A' maps to 65.  

Math with Chars: If you do 'A' + 2, the system adds 2 to 65 (getting 67). You must type-cast it back to a char to get 'C'.  

## Type Casting (Conversion)  
What: Converting one data type into another.  

- Implicit Conversion (Widening)  

What: Automatically converting a smaller data type into a larger one.  

Rule: No data loss.  

Example:  

byte a = **100**;  

long b = a; // Perfectly fine, b has plenty of room for **100**.  

- Explicit Conversion (Narrowing)  

What: Manually forcing a larger data type into a smaller one.  

Rule: Requires manual effort by putting the target type in parentheses (). High risk of data loss if the value exceeds the smaller type's limit.  

Example:  

long largeNum = **12345**;  

int smallNum = (int) largeNum; // Manually casting long to int.  