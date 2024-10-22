# Debugging
+ là quá trình tìm kiếm, phân tích và sửa chữa (`fix`) các lỗi (`bug`) trong hệ thống phần mềm hoặc phần cứng.  
### Các kỹ thuật Debugging:
 
- **In ra thông tin (`Print Debugging`)**: Sử dụng các câu lệnh in hoặc `log` trong `source code` để hiển thị giá trị của biến (`variable`) hoặc các điểm dừng `break point` trong quá trình thực thi (`execute`) chương trình .
- **Công cụ `Debugge`r**: Các môi trường phát triển tích hợp (`IDE`) thường đi kèm với công cụ gỡ lỗi `Debugger Tool`, cho phép lập trình viên đặt `break point`, kiểm tra trạng thái của `variable`, và thứ tự chạy qua `source code`.
- **Rubber Duck Debugging**: Giải thích vấn đề cho người khác (hoặc một con vịt cao su) để giúp làm rõ suy nghĩ và phát hiện lỗi.
- **Binary Search Debugging**: Cách ly phần `code` gây ra `bug` bằng cách thu hẹp dần phạm vi của đoạn `code` dẫn đến `bug`.
 
### Các công cụ thường dùng để Debugging:
 
- **Debugger trong `IDE`**: Các `IDE` hiện đại như Visual Studio Code, IntelliJ IDEA, Eclipse đều có tích hợp sẵn các `Debugger Tool`.
- **Console/Log Output**: Sử dụng `terminal` hoặc file log để xem thông báo `bug` và thông tin cần thiết để fix bug.
- **Profiler**: Các công cụ để phân tích sử dụng bộ nhớ, phát hiện các nút thắt về hiệu năng hoặc thời gian thực thi.
- **Hệ thống quản lý phiên bản (như Git)**: Giúp theo dõi khi nào và ở đâu lỗi được giới thiệu thông qua so sánh các thay đổi trong mã nguồn.