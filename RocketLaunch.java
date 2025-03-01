// Program to perform a countdown for a rocket launch
import java.util.Scanner;

class RocketLaunch {

    public static void main(String[] args) {

        // Create a Scanner to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the countdown start number
        System.out.print("Enter the countdown start value: ");
        int counter = input.nextInt();

        // Perform the countdown using a while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement the counter
        }

     }
}
