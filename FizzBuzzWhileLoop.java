import java.util.Scanner;

class FizzBuzzWhileLoop {

    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Get input value for number
        int origNumber = input.nextInt();

        // Check if input is a positive integer
        if (origNumber < 1) {

            System.out.println("Please enter a positive integer.");
        } 
	else {

            // Initialize loop variable
            int i = 1;

            // Loop from 1 to origNumber using while loop

            while (i <= origNumber) {

                // Check for multiples of 3 and 5

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } 
		else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } 
		else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } 
		else {
                    System.out.println(i);
                }

                // Increment counter
                i++;
            }
        }
    }
}
