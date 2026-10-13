/**
 * Lecture 7: Operators in Java.
 */
public class operators {
    public static void main(String[] args) {
        int first = 25;
        int second = 7;

        // Arithmetic operators.
        System.out.println("Addition: " + (first + second));
        System.out.println("Subtraction: " + (first - second));
        System.out.println("Multiplication: " + (first * second));
        System.out.println("Integer division: " + (first / second));
        System.out.println("Remainder: " + (first % second));

        // Relational operators always produce true or false.
        System.out.println("first == second: " + (first == second));
        System.out.println("first != second: " + (first != second));
        System.out.println("first > second: " + (first > second));
        System.out.println("first <= second: " + (first <= second));

        // Logical operators combine boolean expressions.
        boolean hasTime = true;
        boolean hasInterest = true;
        System.out.println("Can practise: " + (hasTime && hasInterest));
        System.out.println("Either reason is enough: " + (hasTime || hasInterest));
        System.out.println("No time: " + !hasTime);

        // Shorthand assignment operators update the same variable.
        int points = 10;
        points += 5; // points = points + 5
        points *= 2; // points = points * 2
        System.out.println("Points after shorthand assignments: " + points);

        // Post-increment uses the old value first; pre-increment increments first.
        int count = 5;
        System.out.println("Post-increment value: " + count++);
        System.out.println("Value after post-increment: " + count);
        System.out.println("Pre-increment value: " + (++count));
    }
}
