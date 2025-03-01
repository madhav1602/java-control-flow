// Program to perform a countdown for a rocket launch using a for loop
import java.util.Scanner;

class RocketLaunchForLoop {

    public static void main(String[] args) {

        // Create a Scanner to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the countdown start value
        System.out.print("Enter the countdown start value: ");
        int counter = input.nextInt();

        // Perform the countdown using a for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
