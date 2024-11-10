import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        // nhap dau cuoi
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        int sumOfEvens = 0;
        int productOfOdds = 1;
        boolean oddFound = false;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                // chan cong
                sumOfEvens += i;
            } else {
                // le nhan
                productOfOdds *= i;
                oddFound = true;
            }
        }

        System.out.println("Sum of even numbers: " + sumOfEvens);
        if (oddFound) {
            System.out.println("Product of odd numbers: " + productOfOdds);
        } else {
            System.out.println("No odd numbers in the range, product not calculated.");
        }

        scanner.close();
    }
}
