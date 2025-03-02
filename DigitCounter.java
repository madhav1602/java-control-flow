import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Initialize count to store the number of digits
        int count = 0;
        int originalNumber = num; // Store original number for reference

        // Handle the case where number is 0 (it has 1 digit)
        if (num == 0) {
            count = 1;
        }
	else {
            // Count digits using while loop
            while (num != 0) {
                num =num / 10; // Remove the last digit
                count++;    // Increment count
            }
        }

        // Display the count
        System.out.println("The number " + originalNumber + " has " + count + " digits.");
    }
}  
