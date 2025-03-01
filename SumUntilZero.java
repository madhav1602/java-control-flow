// Program to find the sum of numbers until the user enters 0
import java.util.Scanner;

class SumUntilZero {

    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Variable to store the sum of numbers
        double total = 0.0;

        // Variable to store user input
	System.out.print("Enter a number: ");
        double number;
	number=input.nextDouble();
	total=total+number;



        // Loop runs until the user enters 0
        while(number!=0){
		System.out.print("Enter a number: ");
		number=input.nextDouble();
		total=total+number;
	}

        // Print the total sum
        System.out.println("The total sum is: " + total);
    }
}
