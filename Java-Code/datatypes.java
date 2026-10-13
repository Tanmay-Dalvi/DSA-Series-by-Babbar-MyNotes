/**
 * Lecture 6: Data types and type casting in Java.
 */
public class datatypes {
    public static void main(String[] args) {
        // Primitive types store simple values directly.
        byte smallNumber = 100;
        short mediumNumber = 30_000;
        int wholeNumber = 2_000_000;
        long largeNumber = 9_000_000_000L; // L marks a long literal.
        float decimalNumber = 3.14f; // f marks a float literal.
        double preciseNumber = 3.1415926535;
        char letter = 'A'; // char stores exactly one character.
        boolean isLearning = true;

        System.out.println("byte: " + smallNumber);
        System.out.println("short: " + mediumNumber);
        System.out.println("int: " + wholeNumber);
        System.out.println("long: " + largeNumber);
        System.out.println("float: " + decimalNumber);
        System.out.println("double: " + preciseNumber);
        System.out.println("char: " + letter);
        System.out.println("boolean: " + isLearning);

        // Widening conversion happens automatically because long can hold an int.
        long widenedNumber = wholeNumber;
        System.out.println("Widened int to long: " + widenedNumber);

        // Narrowing conversion must be written explicitly and can lose information.
        int narrowedNumber = (int) largeNumber;
        System.out.println("Narrowed long to int: " + narrowedNumber);

        // Characters have numeric Unicode values, including ASCII values for common characters.
        int letterValue = letter;
        char nextLetter = (char) (letter + 2);
        System.out.println("Numeric value of " + letter + ": " + letterValue);
        System.out.println("Two letters after " + letter + ": " + nextLetter);
    }
}
