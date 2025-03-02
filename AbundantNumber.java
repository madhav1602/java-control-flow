import java.util.Scanner;

public class AbundantNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        // Find divisors and calculate their sum
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Check if sum of divisors is greater than the number
        if (sum > num) {
            System.out.println(num + " is an Abundant Number.");
        } 
	else {
            System.out.println(num + " is NOT an Abundant Number.");
        }
    }
}
