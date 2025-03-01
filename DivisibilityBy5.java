// Simple program to check if a number is divisible by 5
import java.util.Scanner;

class DivisibilityBy5 {
    public static void main(String[] args) {

        // Create a Scanner to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is divisible by 5
        boolean isDivisible = (number % 5 == 0);

        // Print the result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
    }
}

