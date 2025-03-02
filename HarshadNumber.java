import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0, temp = num;

        // Calculate sum of digits
        while (temp > 0) {
            sum =sum + (temp % 10); // Extract last digit and add to sum
            temp /= 10; // Remove last digit
        }

        // Check if the number is divisible by the sum of its digits
        if (num % sum == 0) {
            System.out.println(num + " is a Harshad Number.");
        } 
	else {
            System.out.println(num + " is NOT a Harshad Number.");
        }
    }
}
