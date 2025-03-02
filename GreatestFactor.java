import java.util.Scanner;

class GreatestFactor {

    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Get input value for number
        int number = input.nextInt();

        // Initialize greatestFactor variable to 1
        int greatestFactor = 1;

        // Iterate from number - 1 to 1

        for (int i = number - 1; i >= 1; i--) {

            if (number % i == 0) {  
                greatestFactor = i;  //Update greatestFactor

                break;  //Exit loop after finding the first factor
            }
        }

        // Print the greatest factor
        System.out.println("Greatest factor (other than the number itself): " + greatestFactor);
    }
}
