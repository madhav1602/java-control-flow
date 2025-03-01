// Program to find the factorial of an integer using while loop
import java.util.Scanner;

class FactorialWhileLoop {

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

        // variables for factorial computation
        long factorial = 1;  
        int i = num;

        // Compute factorial using while loop
        while (i > 1) {
            factorial *= i;
            i--;
        }

        // Print the result
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
