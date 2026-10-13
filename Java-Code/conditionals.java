/**
 * Lecture 9: Conditional statements in Java.
 */
public class conditionals {
    public static void main(String[] args) {
        int marks = 76;

        // if runs only when its condition is true.
        if (marks >= 40) {
            System.out.println("The student passed.");
        }

        // if-else chooses exactly one of two paths.
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Needs improvement");
        }

        // A nested if checks a second condition only after the first is true.
        int age = 20;
        boolean hasId = true;
        if (age >= 18) {
            if (hasId) {
                System.out.println("Entry allowed.");
            }
        }

        // The ternary operator is a short form of a simple if-else.
        String result = (marks >= 40) ? "Pass" : "Fail";
        System.out.println("Result: " + result);

        // switch is useful when comparing one value with exact choices.
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Another day");
        }
    }
}
