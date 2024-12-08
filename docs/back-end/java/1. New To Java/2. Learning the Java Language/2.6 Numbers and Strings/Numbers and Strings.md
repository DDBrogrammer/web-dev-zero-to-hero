# Number
## The Numbers Classes
+ Vì là 1 ngôn ngữ hướng đối tượng (`OOP`) rất nhiều `API` (`libary`, `farmework`) dùng trong `java` được tạo ra để thao tác với `object`, tuy nhiên trong nhiều trường hợp ta lại muốn sử dụng `primative type` cho những `API` này, vậy nên `Wrapper classes` ra đời:
+ `Wrapper classes`: là các `class` tạo ra để bao bọc `wrap` `primative type` trong 1 `object`
+ `Wrapper classes` bao gồm 8 loại chính đại diện cho 8 `primative type`
 
    | Primitive Type | Wrapper Class |
    |----------------|--------------|
    | byte           | Byte         |
    | short          | Short        |
    | int            | Integer      |
    | long           | Long         |
    | float          | Float        |
    | double         | Double       |
    | char           | Character    |
    | boolean        | Boolean      |
 
 
+ Ngoài ra còn có thêm 3 `Utility Classes` cung cấp thêm để sử dụng cho những mục đích chuyên biệt
 + `BigInteger`: dùng để sử lý các số nguyên cần độ chính xác cao, số lượng lớn
 + `BigDecimal`: dùng để sử lý các số thập phân cần độ chính xác cao, số lượng lớn (các tính toán về tài chính)
 + `AtomicInteger` và `AtomicLong`: để thực hiện tính toán trong môi trường đa luồng
 
+ Những trường hợp cần dùng đến `Wrapper classes` thay vì `primative type` bao gồm:
 + Là một `object` `parameter` của một `method`(thường được sử dụng khi thao tác với các `collections`).
 + Để sử dụng các `constants` được định nghĩa bởi `Wrapper classes` (MIN_VALUE, MAX_VALUE), những `constants` này cung cấp các giới hạn lớn nhất bé nhất của 1 kiểu dữ liệu nguyên thủy
 + Để chuyển đổi kiểu dữ liệu từ String sang số hoặc ngược lại, chuyển đổi giữa các hệ thống số (`decimal`, `octal`, `hexadecimal`, `binary`)
 
 
+ Bảng sau liệt kê các phương thức `method` instance mà tất cả các lớp con của Number đều triển khai.
    | Method | Description |
    | --- | --- |
    | byte byteValue(), short shortValue(), int intValue(), long longValue(), float floatValue(), double doubleValue() | Chuyển đổi giá trị của **Number object** này thành kiểu dữ liệu primitive được trả về. |
    | int compareTo(Byte anotherByte), int compareTo(Double anotherDouble), int compareTo(Float anotherFloat), int compareTo(Integer anotherInteger), int compareTo(Long anotherLong), int compareTo(Short anotherShort) | So sánh **Number object** này với đối số. |
    | boolean equals(Object obj) | Xác định liệu **number object** này có bằng với đối số không. Trả về true nếu đối số không null và là một object của cùng kiểu với cùng giá trị số. |
 
+ Bảng sau liệt kê các `method` chuyển đổi kiểu dữ liệu từ String và ngược lại
 
    | Method | Description |
    | --- | --- |
    | static Integer decode(String s) | Giải mã một string thành một integer. Có thể chấp nhận các biểu diễn string của số thập phân, bát phân, hoặc thập lục phân làm đầu vào. |
    | static int parseInt(String s) | Trả về một integer (chỉ thập phân). |
    | static int parseInt(String s, int radix) | Trả về một integer, dựa trên biểu diễn string của số thập phân, nhị phân, bát phân, hoặc thập lục phân (radix lần lượt là 10, 2, 8, hoặc 16). |
    | String toString() | Trả về một **String object** đại diện cho giá trị của **Integer** này. |
    | static String toString(int i) | Trả về một **String object** đại diện cho integer đã chỉ định. |
    | static Integer valueOf(int i) | Trả về một **Integer object** chứa giá trị của primitive được chỉ định. |
    | static Integer valueOf(String s) | Trả về một **Integer object** chứa giá trị của biểu diễn string đã chỉ định. |
    | static Integer valueOf(String s, int radix) | Trả về một **Integer object** chứa giá trị integer của biểu diễn string đã chỉ định, được phân tích với giá trị radix. Ví dụ, nếu s = "333" và radix = 8, phương thức sẽ trả về giá trị số thập phân tương đương của số bát phân 333. |
## Formatting Numeric Print Output
## Beyond Basic Arithmetic
## Summary of Numbers
 
# Characters
 
# Strings
## Converting Between Numbers and Strings
## Manipulating Characters in a String
## Comparing Strings and Portions of Strings
## The StringBuilder Class
 
# Summary of Characters and Strings
# Autoboxing and Unboxing
 