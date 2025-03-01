// Program to check if the given date falls in the Spring Season
import java.util.Scanner;

class SpringSeason {

    public static void main(String[] args) {

        // Create a Scanner to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter month and day
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();
        
        System.out.print("Enter the day (1-31): ");
        int day = input.nextInt();

        // Check if the given date falls in the Spring Season
        boolean isSpring = (month == 3 && day >= 20) || 
                           (month == 4) || 
                           (month == 5) || 
                           (month == 6 && day <= 20);

        // Print the result 
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } 
	else {
            System.out.println("Not a Spring Season.");
        }
    }
}
