# `Optional`
+ `Optional` là một `class` được giới thiệu từ `Java 8`, thuộc `package` `java.util`. Được thiết kế như một `container` (hộp) chứa một giá trị có thể `null` hoặc không `null`, giúp giảm thiểu lỗi `NullPointerException (NPE)` và làm rõ ý định của lập trình viên khi xử lý các giá trị có thể `null`.
 
## Cách tạo một `Optional`
+ Tạo `Optional` rỗng:
    ```java
    Optional<String> emptyOptional = Optional.empty();
    ```
 
+ Tạo `Optional` từ một giá trị hoặc `Object` không `null`:
    ```java
    Optional<String> nonNullOptional = Optional.of("Hello");
    ```
+ Tạo `Optional` từ một giá trị hoặc `Object` có thể `null`:
    ```java
    Optional<String> nullableOptional = Optional.ofNullable(null); // hoặc Optional.ofNullable("Hi")
    ```
 
## Các `method` phổ biến của `Optional`
### Kiểm tra giá trị
+ `isPresent()`: Trả về `true` nếu `Optional` chứa giá trị, nếu không trả về  `false`
    ```java
    Optional<String> optional = Optional.of("Hello");
    if (optional.isPresent()) {
        System.out.println(optional.get());
    }
    ```
 
### Lấy giá trị
+ `get()`: Trả về giá trị bên trong `Optional`. Gây lỗi `NoSuchElementException` nếu null.
    ```java
    String value = optional.get(); // Cẩn thận nếu rỗng!
    ```
 
+ `ifPresent(Consumer<? super T> action)`: Thực hiện `action` nếu `Optional` chứa giá trị.
    ```java
    optional.ifPresent(value -> System.out.println("Value: " + value));
    ```
 
+ `orElse(T other)`: Trả về giá trị bên trong `Optional` nếu tồn tại, không thì trả về `other`.
    + Giá trị mặc định `other` luôn được đánh giá (`evaluated`), bất kể `Optional` có chứa giá trị hay không.
    + Sử dụng tốt khi giá trị mặc định đơn giản và không tốn kém để tính toán.
    ```java
    Optional<String> optional = Optional.ofNullable(null);
    String result = optional.orElse("Default Value");
    System.out.println(result); // Output: Default Value
    ```
 
+ `orElseGet(Supplier<? extends T> other)`: Trả về giá trị bên trong `Optional` nếu tồn tại, hoặc kết quả của hàm `Supplier` được gọi chỉ khi `Optional` rỗng.
    + Hàm `Supplier` chỉ được gọi khi cần thiết (tức là khi `Optional` không chứa giá trị).
    + Phù hợp khi giá trị mặc định cần chi phí tính toán cao hoặc phụ thuộc vào logic phức tạp.
    ```java
    Optional<String> optional = Optional.ofNullable(null);
    String result = optional.orElseGet(() -> {
        System.out.println("Computing default value...");
        return "Generated Default Value";
    });
    System.out.println(result); // Output: Computing default value... Generated Default Value
    ```
 
+ `orElseThrow()`: Ném `Exception` nếu `Optional` chứa `null`.
    ```java
    String value = optional.orElseThrow(() -> new IllegalArgumentException("No value present"));
    ```
 
### Biến đổi giá trị
+ `map(Function<? super T, ? extends U> mapper)`: Biến đổi giá trị trong `Optional`. Nếu `null`, trả về `Optional.empty()`
    ```java
    List<String> companyNames = Arrays.asList(
      "paypal", "oracle", "", "microsoft", "", "apple");
    Optional<List<String>> listOptional = Optional.of(companyNames);
 
    int size = listOptional
      .map(List::size)
      .orElse(0);
    ```
+ `flatMap(Function<? super T, Optional<U>> mapper)`: Dùng khi có 2 `Optional` lồng nhau
    ```java
    Optional<String> upper = optional.flatMap(value -> Optional.of(value.toUpperCase()));
    ```
 
## Sử dụng `Optional` trong trường hợp nào?
+ Kết quả của một `method` có thể không có giá trị (method result):
    + Tránh trả về `null` để biểu thị không có kết quả.
    + Thay vào đó, trả về `Optional`.
    + **Lưu ý**: nếu trả về `collection` thì trả về `collection` rỗng ko trả về `Optional`
    ```java
    List<String> companyNames = Arrays.asList(
      "paypal", "oracle", "", "microsoft", "", "apple");
    Optional<List<String>> listOptional = Optional.of(companyNames);
 
    int size = listOptional
      .map(List::size)
      .orElse(0);
    ```
 
+ Thay thế giá trị mặc định hoặc `fallback`:
    ```java
    String name = optional.orElse("Anonymous");
    ```
 
+ Tránh `NullPointerException` trong chuỗi thao tác:
    ```java
    String name = Optional.ofNullable(user)
                      .map(User::getProfile)
                      .map(Profile::getName)
                      .orElse("Default Name");
    ```
 
+ Xử lý các phụ thuộc tuỳ chọn (`Optional Dependencies`):
    ```java
    optional.ifPresent(dependency::performAction);
    ```
 
## Không sử dụng `Optional` trong trường hợp nào?
+ Không dùng cho các thuộc tính của `POJO` (`Plain Old Java Object`):
    + `Optional` không nên dùng trong các `getter/setter` hoặc `field` của `model`.
   
+ Không dùng làm tham số trong `method` hoặc `constructor`:
    + Sử dụng `method overloading` hoặc mặc định giá trị `null`.
 
+ Không bọc các `Collection` hoặc `Map`