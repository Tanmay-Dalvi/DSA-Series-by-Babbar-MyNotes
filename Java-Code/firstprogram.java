/**
 * Lecture 4: Write your first Java program.
 */
public class firstprogram {
    public static void main(String[] args) {
        // println prints text and moves to the next line.
        System.out.println("Hello, Java!");

        // print keeps the cursor on the same line.
        System.out.print("Learning ");
        System.out.print("Java is fun.");
        System.out.println();

        // Text must be inside double quotes. Mathematical expressions do not.
        System.out.println("2 + 3 as text: " + "2 + 3");
        System.out.println("2 + 3 as a calculation: " + (2 + 3));

        // Calling a method lets us reuse a small, specific piece of code.
        greet();
    }

    // void means this method performs an action but returns no value.
    public static void greet() {
        System.out.println("This message came from another method.");
    }
}
