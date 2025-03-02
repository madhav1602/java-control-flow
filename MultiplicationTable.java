import java.util.Scanner;

class MultiplicationTable {

    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Get input value for number
        int origNumber = input.nextInt();

        // Iterate from 6 to 9 to print the multiplication table
        for (int i = 6; i <= 9; i++) {
            System.out.println(origNumber + " * " + i + " = " + (origNumber * i));
        }
    }
}
