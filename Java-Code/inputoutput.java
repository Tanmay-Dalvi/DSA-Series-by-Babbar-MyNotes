import java.util.Scanner;

/**
 * Lecture 8: Input, output, and the garbage collector.
 */
public class inputoutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your height in metres: ");
        double height = scanner.nextDouble();

        System.out.println();
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your height is " + height + " metres.");

        // Closing Scanner also closes the input stream after we are finished with it.
        scanner.close();

        // Java's garbage collector automatically cleans unreachable objects.
        // We do not manually free memory in normal Java programs.
    }
}
