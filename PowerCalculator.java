import java.util.Scanner;

public class PowerCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get base number and power as input
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Check input 
        if (number < 0 || power < 0) {
            System.out.println("Enter positive integers only.");
            return;
        }

        int result = 1; 

        // Calculate power using loop
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Print the final result
        System.out.println(number + " raised to the power " + power + " is: " + result);
    }
}
