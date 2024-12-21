# Update bài tập java core đã làm với Optional
+ Các hàm trả ra 1 Object phải được bọc trong Optional **trừ** 1 số trường hợp sau
    + Hàm getter()
    + Hàm trả ra 1 danh sách => trả thẳng ra mảng rỗng thay vì optional 
+ các input param nhận vào của 1 hàm phải được kiểm tra null trước khi sử dụng (có thể kiểm tra bằng Optional hoặc Objects.isNull()/Objects.nonNull() hoặc !=null )
+ tham khảo phần demo optional ở đây: https://github.com/DDBrogrammer/web-dev-zero-to-hero/blob/main/assignments/task/demoOptional/src/Main.java