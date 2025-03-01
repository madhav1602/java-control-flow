// Program to find the factorial of an integer using for loop
import java.util.Scanner;

class FactorialForLoop {

    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        // Check if input is a positive integer
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        // Initialize factorial variable
        long factorial = 1;  

        // Compute factorial using for loop
        for (int i = num; i > 1; i--) {
            factorial *= i;
        }

        // Print the result
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
