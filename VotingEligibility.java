// Program to check if a person is eligible to vote based on age
import java.util.Scanner;

class VotingEligibility {

    public static void main(String[] args) {

        // Create a Scanner to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter age
        System.out.print("Enter the person's age: ");
        int age = input.nextInt();

        // Check if the person is eligible to vote
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } 
	else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}
