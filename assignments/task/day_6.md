### **Bài 1: Quản lý Hệ thống Siêu thị ( `TUYEN` )**  

**Chức năng**:  
1. **Quản lý sản phẩm**: Thêm, xem thông tin sản phẩm và cập nhật số lượng tồn kho.  
2. **Quản lý khách hàng**: Đăng ký, thêm sản phẩm vào giỏ hàng, hiển thị giỏ hàng.  
3. **Quản lý nhân viên**: Thêm nhân viên, xử lý thanh toán qua hóa đơn.  
4. **Quản lý hóa đơn**: Tạo hóa đơn, tính tổng giá trị, in chi tiết hóa đơn.  
5. **Quản lý tổng quát**: Tìm kiếm sản phẩm, khách hàng, nhân viên qua `id`.  

**Yêu cầu đảm bảo**:  
- Cập nhật tồn kho khi có giao dịch.  
- Hóa đơn phản ánh đúng giỏ hàng và tổng tiền.  

**Các `class` cần tạo**:  
1. **`Product`**  
   - Thuộc tính: `id`, `name`, `price`, `stockQuantity`.  
   - Phương thức:  
     - `updateStock(int quantity)` (Cập nhật số lượng tồn kho).  
     - `getInfo()` (Hiển thị thông tin sản phẩm).  

2. **`Customer`**  
   - Thuộc tính: `id`, `name`, `phoneNumber`, `shoppingCart` (Danh sách sản phẩm).  
   - Phương thức:  
     - `addToCart(Product product, int quantity)` (Thêm sản phẩm vào giỏ hàng).  
     - `viewCart()` (Hiển thị giỏ hàng).  

3. **`Employee`**  
   - Thuộc tính: `id`, `name`, `role`.  
   - Phương thức:  
     - `processPayment(Customer customer, Invoice invoice)` (Xử lý thanh toán).  

4. **`Invoice`**  
   - Thuộc tính: `id`, `customer`, `productList` (Danh sách sản phẩm trong giỏ hàng), `totalAmount`.  
   - Phương thức:  
     - `calculateTotal()` (Tính tổng giá trị hóa đơn).  
     - `printInvoice()` (In hóa đơn).  

5. **`Supermarket`**  
   - Thuộc tính: `productList`, `customerList`, `employeeList`.  
   - Phương thức:  
     - `addProduct(Product product)` (Thêm sản phẩm vào danh sách).  
     - `hireEmployee(Employee employee)` (Thuê nhân viên mới).  
     - `registerCustomer(Customer customer)` (Đăng ký khách hàng mới).  

**Mối quan hệ giữa các class**:  
- `Customer` thêm sản phẩm từ `Product` vào giỏ hàng.  
- `Employee` xử lý hóa đơn (`Invoice`) của `Customer`.  
- `Supermarket` quản lý danh sách `Product`, `Employee`, và `Customer`.  

---

### **Bài 2: Quản lý Trường Đại học ( `HINH` )**  

**Chức năng**:  
1. **Quản lý sinh viên**: Đăng ký sinh viên, đăng ký khóa học, xem danh sách khóa học và điểm.  
2. **Quản lý giảng viên**: Thêm giảng viên, gán khóa học, chấm điểm sinh viên.  
3. **Quản lý khóa học**: Tạo khóa học, thêm sinh viên, hiển thị thông tin khóa học.  
4. **Quản lý khoa**: Quản lý giảng viên, khóa học theo từng khoa.  
5. **Quản lý tổng quát**: Tìm kiếm thông tin sinh viên, giảng viên, khóa học theo `id`.  

**Yêu cầu đảm bảo**:  
- Điểm sinh viên cập nhật đúng theo từng khóa học.  
- Chỉ giảng viên phụ trách mới được chấm điểm.  

**Các `class` cần tạo**:  
1. **`Student`**  
   - Thuộc tính: `id`, `name`, `major`, `enrolledCourses` (Danh sách khóa học).  
   - Phương thức:  
     - `enrollCourse(Course course)` (Đăng ký khóa học).  
     - `viewGrades()` (Xem điểm).  

2. **`Teacher`**  
   - Thuộc tính: `id`, `name`, `department`, `assignedCourses` (Danh sách khóa học được giao).  
   - Phương thức:  
     - `assignGrade(Student student, Course course, double grade)` (Chấm điểm cho sinh viên).  

3. **`Course`**  
   - Thuộc tính: `id`, `name`, `teacher`, `studentList`, `grades` (Điểm của từng sinh viên).  
   - Phương thức:  
     - `addStudent(Student student)` (Thêm sinh viên vào khóa học).  
     - `getCourseInfo()` (Hiển thị thông tin khóa học).  

4. **`Department`**  
   - Thuộc tính: `name`, `teacherList`, `courseList`.  
   - Phương thức:  
     - `addTeacher(Teacher teacher)` (Thêm giảng viên vào khoa).  
     - `addCourse(Course course)` (Thêm khóa học vào khoa).  

5. **`University`**  
   - Thuộc tính: `name`, `departmentList`, `studentList`.  
   - Phương thức:  
     - `registerStudent(Student student)` (Đăng ký sinh viên mới).  
     - `createDepartment(String name)` (Tạo khoa mới).  

**Mối quan hệ giữa các class**:  
- `Student` đăng ký các `Course` thuộc `Department`.  
- `Teacher` chấm điểm cho `Student` thông qua `Course`.  
- `University` quản lý toàn bộ `Department`, `Student`, và `Teacher`.  

---

### **Bài 3: Mô phỏng Ứng dụng Gọi Xe ( `HUY` )**  

**Chức năng**:  
1. **Quản lý hành khách**: Đăng ký tài khoản, đặt chuyến xe, xem trạng thái chuyến xe.  
2. **Quản lý tài xế**: Thêm tài xế, nhận yêu cầu, cập nhật trạng thái chuyến xe.  
3. **Quản lý phương tiện**: Thêm phương tiện, hiển thị thông tin xe.  
4. **Quản lý chuyến xe (`Ride`)**: Tạo chuyến, tính giá cước, cập nhật trạng thái.  
5. **Quản lý địa điểm (`Location`)**: Tính khoảng cách giữa các địa điểm, hỗ trợ tài xế di chuyển.  

**Yêu cầu đảm bảo**:  
- Giá cước tính đúng theo khoảng cách.  
- Thông tin tài xế liên kết với chuyến xe khi nhận chuyến.  

**Các `class` cần tạo**:  
1. **`Passenger`**  
   - Thuộc tính: `id`, `name`, `phoneNumber`.  
   - Phương thức:  
     - `requestRide(Location from, Location to)` (Đặt chuyến xe).  

2. **`Driver`**  
   - Thuộc tính: `id`, `name`, `vehicle`, `currentLocation`.  
   - Phương thức:  
     - `acceptRide(Ride ride)` (Nhận đơn đặt xe).  
     - `completeRide(Ride ride)` (Hoàn tất chuyến xe).  

3. **`Vehicle`**  
   - Thuộc tính: `licensePlate`, `model`, `capacity`.  
   - Phương thức:  
     - `getInfo()` (Hiển thị thông tin phương tiện).  

4. **`Ride`**  
   - Thuộc tính: `id`, `passenger`, `driver`, `from`, `to`, `status`.  
   - Phương thức:  
     - `calculateFare()` (Tính giá cước).  
     - `updateStatus(String status)` (Cập nhật trạng thái chuyến xe).  

5. **`Location`**  
   - Thuộc tính: `latitude`, `longitude`.  
   - Phương thức:  
     - `getDistance(Location other)` (Tính khoảng cách giữa hai địa điểm).  

**Mối quan hệ giữa các class**:  
- `Passenger` yêu cầu chuyến xe (`Ride`) từ một `Location` đến `Location` khác.  
- `Driver` nhận và hoàn tất chuyến xe.  
- `Ride` kết nối `Passenger` với `Driver` và `Vehicle`.  
- `Vehicle` cung cấp thông tin phương tiện cho chuyến đi.  

### **Bài 4: Quản lý Hệ thống Thư viện ( `ĐẠI` )**

**Chức năng**:  
1. **Quản lý sách**: Thêm sách mới, xem thông tin sách, cập nhật số lượng tồn kho.  
2. **Quản lý độc giả**: Đăng ký độc giả, mượn sách, trả sách, xem lịch sử mượn.  
3. **Quản lý nhân viên**: Thêm nhân viên, xử lý yêu cầu mượn/trả sách.  
4. **Quản lý giao dịch**: Ghi nhận giao dịch mượn/trả, tính phí trễ hạn.  
5. **Quản lý tổng quát**: Tìm kiếm sách, độc giả, nhân viên theo `id`.  

**Yêu cầu đảm bảo**:  
- Số lượng sách tồn kho luôn được cập nhật đúng khi có giao dịch.  
- Phí trễ hạn được tính chính xác dựa trên số ngày trễ.  

**Các `class` cần tạo**:  
1. **`Book`**  
   - Thuộc tính: `id`, `title`, `author`, `stockQuantity`.  
   - Phương thức:  
     - `updateStock(int quantity)` (Cập nhật số lượng tồn kho).  
     - `getInfo()` (Hiển thị thông tin sách).  

2. **`Reader`**  
   - Thuộc tính: `id`, `name`, `phoneNumber`, `borrowedBooks` (Danh sách sách đang mượn).  
   - Phương thức:  
     - `borrowBook(Book book)` (Mượn sách).  
     - `returnBook(Book book)` (Trả sách).  
     - `viewBorrowHistory()` (Xem lịch sử mượn).  

3. **`Employee`**  
   - Thuộc tính: `id`, `name`, `role`.  
   - Phương thức:  
     - `processBorrowRequest(Reader reader, Book book)` (Xử lý yêu cầu mượn sách).  
     - `processReturnRequest(Reader reader, Book book)` (Xử lý yêu cầu trả sách).  

4. **`Transaction`**  
   - Thuộc tính: `id`, `reader`, `book`, `borrowDate`, `returnDate`, `lateFee`.  
   - Phương thức:  
     - `calculateLateFee()` (Tính phí trễ hạn).  
     - `getTransactionInfo()` (Hiển thị thông tin giao dịch).  

5. **`Library`**  
   - Thuộc tính: `bookList`, `readerList`, `employeeList`, `transactionList`.  
   - Phương thức:  
     - `addBook(Book book)` (Thêm sách mới vào danh sách).  
     - `registerReader(Reader reader)` (Đăng ký độc giả mới).  
     - `hireEmployee(Employee employee)` (Thuê nhân viên mới).  

**Mối quan hệ giữa các class**:  
- `Reader` mượn/trả `Book` thông qua giao dịch (`Transaction`).  
- `Employee` xử lý các yêu cầu mượn và trả sách.  
- `Library` quản lý danh sách `Book`, `Reader`, `Employee`, và `Transaction`.  
