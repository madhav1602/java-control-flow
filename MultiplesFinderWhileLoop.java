import java.util.Scanner;

public class MultiplesFinderWhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a positive number less than 100: ");
        int number = sc.nextInt();

        // Check input
        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input! Enter a positive integer less than 100.");
            return;
        }

        int multiple = number; // Start from the number itself

        System.out.println("Multiples of " + number + " below 100:");
        while (multiple < 100) {
            System.out.print(multiple + " ");
            multiple += number; // Increment by the number itself
        }
    }
}
