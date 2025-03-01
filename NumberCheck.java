// Program to check whether a number is positive, negative, or zero
import java.util.Scanner;

class NumberCheck {

    public static void main(String[] args) {

        // Create a Scanner to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } 
	else if (number < 0) {
            System.out.println("The number is negative.");
        } 
	else {
            System.out.println("The number is zero.");
        }
    }
}
