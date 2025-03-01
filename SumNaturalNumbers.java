// Program to find the sum of n natural numbers using while loop and compare with formula
import java.util.Scanner;

class SumNaturalNumbers {

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

        // Compute sum using while loop
        int sum = 0, i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }

        // Print results
        System.out.println("Sum using while loop: " + sum);
        System.out.println("Sum using formula: " + formulaSum);

        
        if (sum == formulaSum) {
            System.out.println("Both computations are correct!");
        }
	 else {
            System.out.println("There is a mismatch in computation.");
        }
    }
}
