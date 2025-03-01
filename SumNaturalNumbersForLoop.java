// Program to find the sum of n natural numbers using for loop and compare with formula
import java.util.Scanner;

class SumNaturalNumbersForLoop {

    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Check if input is a natural number (positive integer)
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
            return;
        }

        // Compute sum using formula
        int formulaSum = n * (n + 1) / 2;

        // Compute sum using for loop
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Print results
        System.out.println("Sum using for loop: " + sum);
        System.out.println("Sum using formula: " + formulaSum);

        
        if (sum == formulaSum) {
            System.out.println("Both computations are correct!");
        } 
	else {
            System.out.println("There is a mismatch in computation.");
        }
    }
}
