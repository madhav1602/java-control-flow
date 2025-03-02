import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Prime numbers are greater than 1
        boolean isPrime = (num > 1);

        // Check divisibility from 2 to num - 1
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false; // Number is not prime
                break; // No need to check further
            }
        }

        // Display result
        if (isPrime)
            System.out.println(num + " is a Prime Number.");
        else
            System.out.println(num + " is NOT a Prime Number.");
    }
}
