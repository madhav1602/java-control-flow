import java.util.Scanner;

public class GreatestFactorWhileLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        int greatestFactor = 1;

        int counter = number - 1; // Start from the last possible factor

        while (counter >= 1) { 

            if (number % counter == 0) { // Check if it is a factor

                greatestFactor = counter;

                break; // Exit once the largest factor is found
            }
            counter--; // Decrement counter
        }

        System.out.println(greatestFactor);
    }
}
