# Lecture 9: Conditionals in Java

## 1. What is Conditional Logic?

* **What:** Changing the flow of program execution based on the output (`true` or `false`) of a condition.

* **Why:** To make decisions in code (e.g., if a user is older than 18, allow them to vote; otherwise, deny).

## 2. `if` Statement

* **What:** Executes a block of code ONLY if the condition inside the parenthesis evaluates to `true`.

* **Logic Syntax:**

```
if (condition) {
    // Code to run if condition is true
}

```

## 3. `if-else` Statement

* **What:** Provides a fallback option. If the `if` condition is `false`, the `else` block runs.

* **Logic Syntax:**

```
if (condition) {
    // Runs if true
} else {
    // Runs if false
}

```

## 4. `if-else if` Ladder

* **What:** Used to check multiple conditions sequentially. It stops checking as soon as it finds the first `true` condition. The final `else` is optional.

* **Logic Syntax:**

```
if (condition1) {
    // Runs if condition1 is true
} else if (condition2) {
    // Runs if condition1 is false AND condition2 is true
} else {
    // Default fallback if nothing above is true
}

```

## 5. Nested `if-else`

* **What:** Placing an `if-else` block *inside* another `if` or `else` block to check sub-conditions.

* **Why:** When a secondary check relies heavily on a primary check being true (e.g., checking if someone is a male, and *then* checking their age).

## 6. Ternary Operator

* **What:** A single-line shortcut for a basic `if-else` statement.

* **Logic Syntax:**

```
variable = (condition) ? valueIfTrue : valueIfFalse;

```

* **Example:**

```
int answer = (age > 18) ? 22 : 12;

```

## 7. `switch` Statement

* **What:** A cleaner alternative to the `if-else if` ladder when comparing a single variable against multiple exact values (like 1, 2, 3... or 'A', 'B', 'C'...).

* **The `break` Keyword:** CRITICAL. It stops the switch execution and kicks you out of the block. If you forget `break`, Java will blindly execute every case below the matched one (known as "fall-through").

* **The `default` Keyword:** Optional. It acts like the final `else` — it runs if absolutely none of the cases match.

* **Logic Syntax:**

```
switch (expression) {
    case value1:
        // Run code for value1
        break;
    case value2:
        // Run code for value2
        break;
    default:
        // Run default code
}

```