import java.util.Scanner;

class Factors {

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

            // Iterate from 1 to the number

            for (int i = 1; i <= origNumber; i++) {

                // Check if i is a factor of number

                if (origNumber % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
