import java.util.Scanner;

class OddEvenNumbers {

    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Get input value for number
        int origNumber = input.nextInt();

        // Check if input is a natural number
        if (origNumber < 1) {

            System.out.println("Please enter a natural number (greater than 0).");
        } 
	else {
            
            for (int i = 1; i <= origNumber; i++) {

                // Check and print if the number is odd or even

                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } 
		else {
                    System.out.println(i + " is an odd number");
                }
            }
        }
    }
}
