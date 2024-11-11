import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        String string = scanner1.nextLine();
        System.out.println(number + " " + string);
        System.out.print("Enter an integer: " + number + "\n" );

        
//kiem tra am, duong,=0
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
//ktra chan, le
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
//ktra chia het 3 va 5
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("The number is divisible by 3 and 5.");
        } else if (number % 3 == 0) {
            System.out.println("The number is divisible by 3.");
        } else if (number % 5 == 0) {
            System.out.println("The number is divisible by 5.");
        } else {
            System.out.println("The number is not divisible by 3 or 5.");
        }

        scanner.close();
    }
}

