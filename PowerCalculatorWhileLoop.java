import java.util.Scanner;

public class PowerCalculatorWhileLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Initialize variables
        int result = 1;
        int counter = 0;

        // Calculate power using while loop
        while (counter < power) {
            result *= number;
            counter++;
        }

        // Display result
        System.out.println(number + " raised to the power " + power + " is: " + result);
    }
}
