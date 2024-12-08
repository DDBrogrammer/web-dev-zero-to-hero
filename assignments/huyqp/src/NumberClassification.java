import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập một số nguyên
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Kiểm tra số dương hay âm
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Kiểm tra số chẵn hay lẻ
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // Kiểm tra số chia hết cho 3, 5, hay cả 3 và 5
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("The number is divisible by 3 and 5.");
        } else if (number % 3 == 0) {
            System.out.println("The number is divisible by 3.");
        } else if (number % 5 == 0) {
            System.out.println("The number is divisible by 5.");
        }
    }
}
