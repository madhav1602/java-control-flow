import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Initialize sum to store sum of cubes of digits
        int sum = 0;
        int originalNumber = num; // Store original number for comparison

        // Process each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Extract last digit
            sum += digit * digit * digit;    // Add cube of digit to sum
            originalNumber /= 10;            // Remove last digit
        }

        // Check if sum of cubes of digits equals the original number
        if (sum == num)
            System.out.println(num + " is an Armstrong Number.");
        else
            System.out.println(num + " is NOT an Armstrong Number.");
    }
}
