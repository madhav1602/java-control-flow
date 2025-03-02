import java.util.Scanner;

public class LeapYearSingleLine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a year (>=1582): ");
        int year = sc.nextInt();

        // Check for valid year and determine leap year using a single if condition
        if (year >= 1582 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {

            System.out.println(year + " is a Leap Year.");
        }
	 else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
