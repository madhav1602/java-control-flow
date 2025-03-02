import java.util.Scanner;

public class MultiplesFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive number less than 100: ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) { // Validate input
            System.out.println("Invalid input! Enter a positive integer less than 100.");
            return;
        }

        System.out.println("Multiples of " + number + " below 100:");
        for (int i = number; i < 100; i += number) { // Print multiples
            System.out.print(i + " ");
        }
    }
}
