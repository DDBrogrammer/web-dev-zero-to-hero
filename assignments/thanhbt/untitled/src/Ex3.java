import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start of the range: ");
        int a = scanner.nextInt();
        System.out.println("Enter the end of the range: ");
        int b = scanner.nextInt();
        int SumOfEven = 0;
        int ProductOfOdd = 1;
        boolean Odd = false;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                SumOfEven += i;
            } else {
                Odd = true;
                ProductOfOdd *= i;
            }
        }
        System.out.println("Sum of even number: " + SumOfEven);
        if (Odd) {
            System.out.println("Product of odd number: " + ProductOfOdd);
        }
    }
}

