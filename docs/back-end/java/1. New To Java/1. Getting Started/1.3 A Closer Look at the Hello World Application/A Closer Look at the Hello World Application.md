# Cái Nhìn Sâu Hơn Về Ứng Dụng "Hello World!"

Bài viết này sẽ khám phá cách ứng dụng "Hello World!" hoạt động. Dưới đây là mã nguồn của nó:


``` java
/**
 * The HelloWorldApp class implements an application that
 * simply displays "Hello World!" to the standard output.
 */
class HelloWorldApp {
    public static void main(String[] args) {
        System.out.println("Hello World!"); //Display the string.
    }
}
```

Ứng dụng "Hello World!" bao gồm ba thành phần chính: `Comment`, định nghĩa lớp `class definition` `HelloWorldApp` và hàm `method` main.

## `Comment`
 + Trong Java, chú thích (`comments`) được sử dụng để giải thích mã, giúp lập trình viên hiểu rõ hơn về chức năng hoặc logic của đoạn mã đó
 + Có ba loại `comments` chính:
   + `Comment` một dòng (`//`): Sử dụng cho các chú thích ngắn gọn, chỉ áp dụng cho một dòng
      ``` java 
      // Đây là một chú thích một dòng
      int x = 5; // Khởi tạo biến x
      ```

   + `Comment` nhiều dòng (`/* ... */`): Dùng để chú thích nhiều dòng.
      ``` java 
      /* Đây là một chú thích 
      nhiều dòng */
      int y = 10;
      ```

   + `Comment` tài liệu (`/** ... */`): Được sử dụng để tạo tài liệu cho `class`, `method` hoặc `field`.
      ``` java 
      /**
      * Phương thức này tính tổng của hai số.
      * @param a Số thứ nhất
      * @param b Số thứ hai
      * @return Tổng của a và b
      */
      public int sum(int a, int b) {
         return a + b;
       }
      /* Đây là một chú thích 
      nhiều dòng */
      ```
## `Class definition`
+ Từ khóa `key word` `class` bắt đầu định nghĩa cho một `class` có tên là `HelloWorldApp`, và `code` cho mỗi `class` xuất hiện giữa các dấu ngoặc nhọn mở và đóng .
``` java 
class HelloWorldApp {
    // code 
}
```
## `Main method`
+ Trong ngôn ngữ lập trình Java, mọi ứng dụng đều phải chứa một `main method` có `syntax` là:
``` java 
public static void main(String[] args){}

static public  void main(String[] args){}
```
+ Mọi ứng dụng trong Java đều bắt đầu chạy từ `main method`