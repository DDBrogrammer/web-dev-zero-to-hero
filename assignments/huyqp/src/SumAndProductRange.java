import java.util.Scanner;

public class SumAndProductRange {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để nhận đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập vào giá trị bắt đầu và kết thúc của phạm vi
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        // Khởi tạo biến để tính tổng số chẵn và tích số lẻ
        int sumEven = 0;
        int productOdd = 1;
        boolean hasOdd = false;  // Biến để kiểm tra có số lẻ nào không (để tránh nhân với 0)

        // Duyệt qua tất cả các số trong phạm vi từ start đến end
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {  // Kiểm tra số chẵn
                sumEven += i;  // Cộng số chẵn vào tổng
            } else {  // Nếu là số lẻ
                productOdd *= i;  // Nhân số lẻ vào tích
                hasOdd = true;  // Đánh dấu có số lẻ
            }
        }

        // In kết quả
        System.out.println("Sum of even numbers: " + sumEven);

        // Nếu có số lẻ thì in tích, ngược lại in 0 (do không có số lẻ nào)
        if (hasOdd) {
            System.out.println("Product of odd numbers: " + productOdd);
        } else {
            System.out.println("Product of odd numbers: 0");
        }

        // Đóng Scanner để tránh rò rỉ tài nguyên
        scanner.close();
    }
}
