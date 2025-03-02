import java.util.Scanner;

class FactorsWhileLoop {

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

            // Initialize counter variable
            int i = 1;

            // Run while loop 
            while (i <= origNumber) {

                // Check if i is a factor of number

                if (origNumber % i == 0) {
                    System.out.println(i);
                }

                i++; // Increment counter
            }
        }
    }
}
