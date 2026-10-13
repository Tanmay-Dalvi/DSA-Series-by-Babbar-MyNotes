/**
 * Lecture 5: Variables in Java.
 */
public class variables {
    public static void main(String[] args) {
        // A declaration creates a variable without giving it a value yet.
        int marks;

        // Initialization gives a variable its first value.
        marks = 95;
        System.out.println("Marks: " + marks);

        // Declaration and initialization can also happen in one statement.
        int age = 20;
        age = age + 1; // A variable can be updated after initialization.
        System.out.println("Age after one year: " + age);

        // Java is case-sensitive: these are three different variables.
        int score = 10;
        int Score = 20;
        int SCORE = 30;
        System.out.println(score + ", " + Score + ", " + SCORE);

        // camelCase makes multi-word variable names easy to read.
        String studentName = "Aarav";
        System.out.println("Student: " + studentName);

        // final creates a constant: its value cannot be changed later.
        final int DAYS_IN_WEEK = 7;
        System.out.println("Days in a week: " + DAYS_IN_WEEK);
    }
}
