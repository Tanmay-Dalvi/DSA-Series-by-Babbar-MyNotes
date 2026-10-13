# Lecture 10: Loops in Java

## 1. What is a Loop?

* **What:** A programming construct that repeats a specific block of code multiple times.
* **Why:** To avoid writing the same code repeatedly (DRY - Don't Repeat Yourself principle) and to easily iterate over large sets of data.

## 2. `for` Loop

* **What:** Best used when you know *exactly* how many times you want the loop to iterate.
* **Execution Flow:**
  1. Initialization (runs only once).
  2. Condition check (if true, go to 3; if false, exit loop).
  3. Execute loop body.
  4. Update (increment/decrement), then go back to step 2.

* **Logic Syntax:**

```java
for (initialization; condition; update) {
    // Code to repeat
}
```

## 3. `while` Loop

* **What:** Best used when you do *not* know the exact number of iterations, but you know the condition that must remain true.
* **Execution Flow:** Evaluates the condition first. If true, it runs the body and updates. Repeats until the condition evaluates to false.

* **Logic Syntax:**

```java
initialization;
while (condition) {
    // Code to repeat
    update;
}
```

## 4. `do-while` Loop

* **What:** A variation of the while loop that guarantees the code block will execute **at least once**, regardless of whether the condition is true or false initially.
* **Execution Flow:** Executes the body first, updates, and *then* checks the condition.

* **Logic Syntax:**

```java
initialization;
do {
    // Code to repeat
    update;
} while (condition); // Notice the mandatory semicolon
```

## 5. The `break` Keyword

* **What:** A control statement used to instantly terminate (exit) the loop it is enclosed in.
* **Why:** Used when a specific condition is met and you no longer need to check any further iterations.

## 6. The `continue` Keyword

* **What:** A control statement used to skip the *current* iteration of the loop and jump straight to the next iteration's update/condition check.
* **Why:** Used when you want to ignore specific cases or values but want the loop itself to keep running.

## 7. Infinite Loops

* **What:** A loop that never stops executing because its terminating condition never becomes `false`.
* **Why it happens:** Usually a logical error by the programmer (e.g., forgetting to increment/decrement the variable inside a `while` loop).