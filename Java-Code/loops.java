/**
 * Lecture 10: Loops in Java.
 */
public class loops {
    public static void main(String[] args) {
        // for is convenient when the number of repetitions is known.
        System.out.println("for loop:");
        for (int number = 1; number <= 5; number++) {
            System.out.println(number);
        }

        // while checks its condition before every iteration.
        System.out.println("while loop:");
        int countdown = 3;
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        // do-while always executes its body at least once.
        System.out.println("do-while loop:");
        int value = 1;
        do {
            System.out.println("The body ran once.");
            value++;
        } while (value < 1);

        // continue skips the current iteration and moves to the next one.
        System.out.println("continue and break:");
        for (int number = 1; number <= 10; number++) {
            if (number % 2 == 0) {
                continue; // Skip even numbers.
            }
            if (number > 7) {
                break; // Stop the loop once number becomes greater than 7.
            }
            System.out.println(number);
        }

        // Always update a loop variable so that a while loop can finish.
    }
}
