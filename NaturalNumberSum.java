// Program to check if a number is natural and find the sum of first n natural numbers
import java.util.Scanner;

class NaturalNumberSum {

    public static void main(String[] args) {

        // Create a Scanner to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is a natural number 
        if (number >= 0) {

            // Calculate the sum of first 'n' natural numbers
            int sum = number * (number + 1) / 2;

            // Print the sum
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        }
 
	else {
            // Print that the number is not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
