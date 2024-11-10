import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive or negative
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // Check divisibility by 3, 5, or both
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("The number is divisible by 3 and 5.");
        } else if (number % 3 == 0) {
            System.out.println("The number is divisible by 3.");
        } else if (number % 5 == 0) {
            System.out.println("The number is divisible by 5.");
        } else {
            System.out.println("The number is not divisible by 3 or 5.");
        }
    }

}
