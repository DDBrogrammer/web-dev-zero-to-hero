# `Classes` and `Objects`
## `Classes`
+ `Class` là một bản thiết kế hoặc nguyên mẫu để tạo ra các `object`.
### Declaring Classes
+ để khai báo `declare` 1 `class`:
  + Các `modifier` như `public`, `private`, và một số `modifier` khác. (Lưu ý rằng modifier private chỉ có thể được áp dụng cho Nested Classes.)
  + Tên `class`, theo quy ước, viết hoa chữ cái đầu.
  + Tên `superclass` của `class`, nếu có, đứng sau từ khóa `extends`. Một `class` chỉ có thể kế thừa (`extend`) từ một `parent class`.
  + Danh sách các `interface` mà `class` triển khai, nếu có, cách nhau bởi dấu phẩy và đứng sau từ khóa `implements`. Một `class` có thể `triển khai` nhiều hơn một `interface`.
  + Phần thân của `class`, bao quanh bởi 1 cặp ngoặc nhọn `{}`.
    ```java
    public class MyClass extends MySuperClass implements YourInterface {
    // field, constructor, and
    // method declarations
    private class MyNestedClass{
 
 
    }
    }
    ```
+ Phần thân của `class` hay `class body` là nơi sẽ bao gồm toàn bộ `code` thiết kế cho vòng đời của `object` được tạo ra bới `class` bao gồm:
  + `constructors`: dùng để khởi tạo 1 `object` mới từ `class` hiện tại.
  + `fields`: các trạng thái của `class` hoặc `object`.
  + `methods`: các hành vi của `class` hoặc `object`

### Declaring Member Variables
+ có 3 loại `Variables` khác nhau:
  + `Variables` trong 1 `class` được gọi là `fields`.
  + `Variables` trong 1 `method` hoặc `code block` được gọi là `local variables`.
  + `Variables` trong khai báo của `method` được gọi là `parameters`.

+ Khai báo 1 `fields` gồm 3 thành phần bao gồm:
  + `access modifier`: phạm vi truy cập bao gồm  `public`, `private`, `protected`
  + `data type`: 
## Access Modifiers
+ Kiểm soát quyền truy cập của `class` khác đối với `fields`, bao gồm 4 loại: 
  + `public`: `field` có thể được truy cập từ tất cả các `class`.
  + `protected`: Chỉ trong cùng package hoặc lớp con
  + `default`: Chỉ trong cùng `package`
  + `private`: `field` chỉ có thể truy cập trong chính `class` của nó.
  
### Defining Methods
+ 
### Providing Constructors for Your Classes
### Passing Information to a Method or a Constructor
## Objects
### Creating Objects
### Using Objects
## More on Classes
### Returning a Value from a Method
### Using the this Keyword
### Controlling Access to Members of a Class
### Understanding Class Members
### Initializing Fields
### Summary of Creating and Using Classes and Objects
## Nested Classes
### Inner Class Example
### Local Classes
### Anonymous Classes
### Lambda Expressions
#### Method References
### When to Use Nested Classes, Local Classes, Anonymous Classes, and Lambda Expressions
## Enum Types