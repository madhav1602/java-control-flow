import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        String op = sc.next();

        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        double result = 0;
        boolean valid = true;

        // Switch case for performing the required operation
        switch (op) {
            case "+":
                result = first + second;
                break;

            case "-":
                result = first - second;
                break;

            case "*":
                result = first * second;
                break;

            case "/":
                if (second != 0) {
                    result = first / second;
                } 
		else {
                    System.out.println("Error: Division by zero is not allowed.");
                    valid = false;
                }
		break;

            default:
                System.out.println("Invalid Operator. Please use +, -, * or /.");
                valid = false;
        }

        // Display result only if the operation was valid
        if (valid) {
            System.out.println("Result: " + result);
        }
    }
}
