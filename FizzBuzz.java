import java.util.Scanner;

class FizzBuzz {

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

            // Iterate from 1 to the entered number

            for (int i = 1; i <= origNumber; i++) {
                
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
            }
        }
    }
}
