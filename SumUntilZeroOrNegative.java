// Program to find the sum of numbers until the user enters 0 or a negative number
import java.util.Scanner;

class SumUntilZeroOrNegative {

    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Variable to store the sum of numbers
        double total = 0.0, number;

        // Infinite loop to take user input continuously
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            number = input.nextDouble();

            // Break the loop if the number is 0 or negative
            if (number <= 0) {
                break;
            }

            
            total += number;
        }

        // Print the total sum
        System.out.println("The total sum is: " + total);
    }
}
