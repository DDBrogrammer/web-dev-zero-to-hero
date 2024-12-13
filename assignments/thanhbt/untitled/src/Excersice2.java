import java.util.Scanner;
public class Excersice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = scanner.nextInt();
        if (a < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is positive");
        }
        if (a % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        } if (a % 3 == 0) {
            System.out.println("The number divisible by 3");
        } else if ( a % 5 == 0) {
            System.out.println("The number divisible by 5");
        } else if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("The number divisible by 3 and 5");
        }
    }
}
