import java.util.Scanner;

class EmployeeBonus {

    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Get input values for salary and years of service
        int salary = input.nextInt();
        int yearsOfService = input.nextInt();

        // Define variable to store bonus
        double bonus = 0;

        // Check if years of service is more than 5 years
        if (yearsOfService > 5) {
            bonus = salary * 0.05; // 5% bonus
        }

        // Print the bonus amount
        System.out.println("Bonus Amount: " + bonus);
    }
}
