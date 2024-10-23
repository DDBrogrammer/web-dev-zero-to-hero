public class DebuggerDemo {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        System.out.println("numbers = "+numbers);
        int sum = 0;
        System.out.println("sum = "+sum);
        // Dùng debugger để bước qua từng dòng và xem các giá trị của biến
        for (int i = 0; i <= numbers.length; i++) {
            System.out.println("i = "+i);
            sum += numbers[i]; // Đặt breakpoint tại đây để kiểm tra giá trị sum và numbers[i]
        }

        System.out.println("Tổng các phần tử trong mảng: " + sum); // Đặt breakpoint tại đây để kiểm tra kết quả
    }

//    public static void main(String[] args) {
//        int[] numbers = {5, 10, 15, 20, 25};
//        int sum = 0;
//
//        // Dùng debugger để bước qua từng dòng và xem các giá trị của biến
//        for (int i = 0; i <= numbers.length; i++) { // Lỗi tiềm ẩn ở đây: nên là i < numbers.length
//            sum += numbers[i]; // Đặt breakpoint tại đây để kiểm tra giá trị sum và numbers[i]
//        }
//
//        System.out.println("Tổng các phần tử trong mảng: " + sum); // Đặt breakpoint tại đây để kiểm tra kết quả
//    }
}
