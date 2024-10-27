# Các thông tin cơ bản về Java

## Biến `Variable`

- Ở phần thảo luận về `Object` đã giới thiệu các `fields`, nhưng có lẽ vẫn còn một số câu hỏi chưa được giải quyết, chẳng hạn như: Các quy tắc và quy ước đặt tên `field` là gì? Ngoài `int`, còn có những kiểu dữ liệu `data type` nào khác? Các `fields` có bắt buộc phải được khởi tạo `initialize` khi chúng được khai báo không? Nếu không được khởi tạo rõ ràng, các `fields` có được gán một giá trị mặc định `default value` không? Chúng ta sẽ khám phá câu trả lời cho những câu hỏi này trong bài học này. Trong ngôn ngữ lập trình Java, cả hai thuật ngữ field và variable đều được sử dụng; đây là một điều dễ gây nhầm lẫn phổ biến cho những lập trình viên mới, vì cả hai có vẻ như ám chỉ cùng một điều. Trong bài học này chúng ta sẽ cùng nhau phân tích sự khác biệt giữa chúng.

- Ngôn ngữ lập trình Java định nghĩa các loại `variables` sau:

  - `Instance Variables` (`Non-Static Fields`): Các `objects` lưu trữ `state` của chúng trong các `non-static fields`, nghĩa là các `fields` được khai báo mà không có từ khóa `static`.` Non-static fields` còn được gọi là `instance variables` vì giá trị `value` của chúng là duy nhất cho mỗi `instance` của một `class`.

    ```java
    public class MyClass {
    // instance variable declaration
    private int instanceVariable;

    public void setInstanceVariable(int value) {
        instanceVariable = value;
    }

    public int getInstanceVariable() {
        return instanceVariable;
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        obj1.setInstanceVariable(10);

        MyClass obj2 = new MyClass();
        obj2.setInstanceVariable(20);

        System.out.println("Value of obj1's variable: " + obj1.getInstanceVariable());
        System.out.println("Value of obj2's variable: " + obj2.getInstanceVariable());
    }
     }
    ```

  - `Class Variables` (`Static Fields`): Một `class variable` là bất kỳ `field` nào được khai báo `declare` với từ khóa `static`; điều này cho phép trình biên dịch `compiler` biết rằng chỉ có một bản sao duy nhất của `variable` này tồn tại, bất kể `class` đã được khởi tạo `initialize` bao nhiêu lần. Một `field` xác định số bánh răng của một loại xe đạp có thể được đánh dấu là `static` vì về mặt ý niệm, số bánh răng sẽ giống nhau cho tất cả các `instances`. Ví dụ: static int numGears = 6; tạo ra một `static field`. Ngoài ra, từ khóa `final` có thể được thêm vào để chỉ ra rằng số bánh răng sẽ không bao giờ thay đổi.

    ```java
     class Car {
     // Sử dụng static để biến này có thể dùng chung cho mọi đối tượng Car
       static int numberOfCars = 0;

    // Constructor (hàm tạo) được gọi mỗi lần tạo một đối tượng Car mới
       Car() {
       // Tăng số lượng xe khi tạo một xe mới
           numberOfCars++;
       }

    // Phương thức static để lấy số lượng xe hiện có
       static int getNumberOfCars() {
           return numberOfCars;
       }
     }

     public class Main {
       public static void main(String[] args) {
            // Tạo các đối tượng Car
            Car car1 = new Car();
            Car car2 = new Car();
            Car car3 = new Car();

       // In ra số lượng xe ô tô đã được tạo
        System.out.println("Số lượng xe đã tạo: " + Car.getNumberOfCars()); // Kết quả: 3
       }
     }
    ```

  - `Local Variables`: Tương tự như cách một `object` lưu trữ `state` của nó trong các `fields`, một `method` sẽ thường lưu trữ `state` tạm thời trong các `local variables`. Cú pháp `declare` một `local variable` tương tự như `declare` một `field` (ví dụ: int count = 0;). Không có từ khóa đặc biệt nào để chỉ định một `variable` là "`local`"; việc xác định hoàn toàn phụ thuộc vào vị trí mà `variable` được `declare` — nghĩa là giữa dấu ngoặc nhọn mở và đóng của method "{ }". Do đó, `local variables` chỉ hiển thị cho các `methods` mà chúng được `declare`; chúng không thể truy cập `access` từ phần còn lại của `class`.
    ```java
    public class LocalVariable {
      public void show() {
        int num = 100; // local variable
        System.out.println("The number is : " + num);
     }
      public static void main(String args[]) {
        LocalVariableTest test = new LocalVariableTest();
        test.show();
     }
      }
    ```

## Toán tử

Phần này mô tả các `operators` của ngôn ngữ lập trình `Java`. Nó giới thiệu các toán tử thường dùng nhất trước, và các toán tử ít được dùng hơn sau. Mỗi phần thảo luận đều bao gồm các mẫu mã mà bạn có thể biên dịch và chạy.

## Biểu thức, Câu lệnh và Khối lệnh

Các `operators` có thể được sử dụng trong việc xây dựng `expressions`, để tính toán giá trị; các `expressions` là thành phần cốt lõi của các `statements`; các `statements` có thể được nhóm thành các `blocks`. Phần này thảo luận về các `expressions`, `statements`, và `blocks` bằng cách sử dụng mã ví dụ mà bạn đã thấy.

## Câu lệnh Điều khiển Luồng

Phần này mô tả các `control flow statements` được hỗ trợ bởi ngôn ngữ lập trình `Java`. Nó bao gồm các câu lệnh quyết định, vòng lặp, và câu lệnh phân nhánh cho phép chương trình của bạn thực thi có điều kiện các khối mã cụ thể.
