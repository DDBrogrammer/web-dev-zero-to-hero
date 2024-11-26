# Interfaces and Inheritance
## Interfaces
+ `Interfaces` là 1 bản hợp đồng chứa các quy tắc mà các `class` triển khai nó phải tuân theo
+ `Interfaces` sẽ khai báo `constants`, `method signatures`, `default methods`, `static methods`, và `nested types`
+ Chỉ `default methods` và `static methods` được triển khai `Method bodies` .
+ `Interfaces` không thể được khởi tạo chúng chỉ có thể được triển khai (`implements`) bởi các `classes` hoặc được mở rộng (`extend`) bởi các `interfaces` khác.
+ ví dụ khai báo `Interfaces`
    ```java
    public interface OperateCar {
 
   // constant declarations, if any
 
   // method signatures
   
   // Một enum với các giá trị RIGHT, LEFT
   int turn(Direction direction,
            double radius,
            double startSpeed,
            double endSpeed);
   int changeLanes(Direction direction,
                   double startSpeed,
                   double endSpeed);
   int signalTurn(Direction direction,
                  boolean signalOn);
   int getRadarFront(double distanceToCar,
                     double speedOfCar);
   int getRadarRear(double distanceToCar,
                    double speedOfCar);
         ......
   // thêm các method signatures khác
    }
 
    ```
+ Lưu ý rằng các `method signatures` không có dấu ngoặc nhọn và kết thúc bằng dấu chấm phẩy.
#### Interfaces as APIs
+ `interface` là công cụ để có thể tương tác giữa các phần mềm mà không tiết lộ các triển khai bên trong
 
### Defining an Interface
+ 1 `interface` được khai báo bao gồm các thành phần
  + `modifiers`: `public`, `pakage-private`
  + `keyword` `interface`: khai báo định danh 1 `interface`
  + tên `interface`
  + `keyword` `extends`: Một `interface` có thể mở rộng các `interface` khác, giống như một `class` có thể kế thừa hoặc mở rộng một `class` khác.
  + danh sách các `interface` cha: danh sách các `interface` mà `interface` hiện tại mở rộng, được phân tách bằng dấu phẩy.
 
    ```java
   public interface GroupedInterface extends Interface1, Interface2, Interface3 {
 
    // constant declarations
   
    // cơ số của logarit tự nhiên
    double E = 2.718282;
 
    // method signatures
    void doSomething(int i, double x);
    int doSomethingElse(String s);
    }
    ```
#### Phần Thân của Interface
+ Phần thân của một `interface` có thể chứa:
  + `abstract methods`: `method` ko chứa triển khai, không có dấu ngoặc nhọn
  + `default methods`: `method` được đánh dấu `default` và có thể có triển khai
  + `static methods`: `method` được đánh dấu `static`, thuộc về `interface`
  + `constants variable`: `variable` không đổi giá trị sau khi được gán giá trị
+ tất cả `abstract`, `default`, và `static methods` trong một `interface` đều mặc định là `public`
+ tất cả `constant` được định nghĩa trong `interface` đều mặc định là `public`, `static`, và `final`
 
### Implementing an Interface
+ Để khai báo một `class` triển khai một `interface`, sử dụng mệnh đề `implements` trong khai báo `class`
+ Một `class` có thể triển khai nhiều `interface`
+ Thông thường `implements` sẽ nằm sau `extends`
    ```java
   public interface Relatable {
       
    // `this` (`object` gọi `isLargerThan`)
    // và `other` phải là các instance
    // của cùng một `class`, trả về 1, 0, -1
    // nếu `this` lớn hơn,
    // bằng, hoặc nhỏ hơn `other`
    public int isLargerThan(Relatable other);
    }
 
    ```
#### Implementing the Relatable Interface
    ```java
    public class RectanglePlus
 
    implements Relatable {
    public int width = 0;
    public int height = 0;
    public Point origin;
 
    // bốn constructor
    public RectanglePlus() {
        origin = new Point(0, 0);
    }
    public RectanglePlus(Point p) {
        origin = p;
    }
    public RectanglePlus(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public RectanglePlus(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }
 
    // một method để di chuyển hình chữ nhật
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }
 
    // một method để tính diện tích
    public int getArea() {
        return width * height;
    }
   
    // một method cần thiết để triển khai
    // `Interface` `Relatable`
    public int isLargerThan(Relatable other) {
        RectanglePlus otherRect
            = (RectanglePlus) other;
        if (this.getArea() < otherRect.getArea())
            return -1;
        else if (this.getArea() > otherRect.getArea())
            return 1;
        else
            return 0;              
    }
    }
 
    ```
+ Lưu ý: `Method isLargerThan`, được định nghĩa trong `Interface Relatable`, nhận một `object` thuộc kiểu `Relatable`. Dòng `code` `RectanglePlus otherRect=(RectanglePlus) other; `  chuyển kiểu (`cast`) `other` sang một `instance` của `RectanglePlus`. Việc chuyển kiểu này báo cho trình biên dịch biết `object` thực sự là gì. Nếu gọi trực tiếp `getArea` trên `other` (`other.getArea()`), `code` sẽ không thể biên dịch được vì trình biên dịch không hiểu rằng `other` thực sự là một `instance` của `RectanglePlus`.
 
### Using an Interface as a Type
+ Khi khai báo `interface` có thể được dùng như 1 kiểu dữ liệu tham chiếu. Biến tham chiếu được khai báo bằng `interface` phải được gán với tham chiếu của 
`class` `implement` `interface` đó.
+ Khi 1 `class` `implement` 1 `interface` nó vừa có thể là kiểu dữ liệu của chính nó (hoặc `class` cha), vừa có thể là kiểu dữ liệu của `interface`,
`multiple inheritance`
   ```java
   public Object findLargest(Object object1, Object object2) {
   Relatable obj1 = (Relatable)object1;
   Relatable obj2 = (Relatable)object2;
   if ((obj1).isLargerThan(obj2) > 0)
      return object1;
   else 
      return object2;
    }

    public Object findSmallest(Object object1, Object object2) {
   Relatable obj1 = (Relatable)object1;
   Relatable obj2 = (Relatable)object2;
   if ((obj1).isLargerThan(obj2) < 0)
      return object1;
   else 
      return object2;
    }

    public boolean isEqual(Object object1, Object object2) {
   Relatable obj1 = (Relatable)object1;
   Relatable obj2 = (Relatable)object2;
   if ((obj1).isLargerThan(obj2) == 0)
      return true;
   else 
      return false;
    }
   ```

### Evolving Interfaces
+ Khi tạo ra 1 `interface` hãy cố dự đoán tất cả các `method` mà `interface` cần được khai báo ngay từ đầu
+ Khi 1 `interface` đã được triển khai ở nhiều `class`, việc thêm 1 `method` mới vào `interface` sẽ trở lên khó khăn do các `class` hiện tại có thể chưa có cách để `implement method` mới này. Lúc này chúng ta có thể triển khai `method` mới theo 2 hướng chính
  + Tạo ra 1 `interface` mới kế thừa `interface` hiện tại để thêm `method` mới, lúc này các `class` đã `implement interface` cũ có thể chọn triển khai `method` mới 1 cách chủ động hơn
   ```java
    public interface DoItPlus extends DoIt {

       boolean didItWork(int i, double x, String s);
    }

   ```
   + Sử dụng 1 `default method` (cung cấp 1 triển khai tạm thời cho `method` mới)
   ```java
    public interface DoIt {

   void doSomething(int i, double x);
   int doSomethingElse(String s);
   default boolean didItWork(int i, double x, String s) {
       // Method body 
   }
    }
   ```
### Default Methods
+ `Default methods` cho phép thêm chức năng mới vào các `interface` của thư viện và đảm bảo `binary compatibility` với code được viết cho các phiên bản cũ của những `interface` đó.
+  Khai báo một `method` là `default method` trong một `interface` bằng từ khóa `default` ở đầu `method signature`. 
   ```java
    package defaultmethods;
 
    import java.time.*;

    public interface TimeClient {
    void setTime(int hour, int minute, int second);
    void setDate(int day, int month, int year);
    void setDateAndTime(int day, int month, int year,
                               int hour, int minute, int second);
    LocalDateTime getLocalDateTime();
    
    static ZoneId getZoneId (String zoneString) {
        try {
            return ZoneId.of(zoneString);
        } catch (DateTimeException e) {
            System.err.println("Invalid time zone: " + zoneString +
                "; using default time zone instead.");
            return ZoneId.systemDefault();
        }
    }
        
    default ZonedDateTime getZonedDateTime(String zoneString) {
        return ZonedDateTime.of(getLocalDateTime(), getZoneId(zoneString));
    }
    }
   ```
#### Mở rộng Interface chứa Default Method
+ Khi mở rộng một `interface` có chứa `default method`, có thể thực hiện những điều sau:
    + không khai báo `default method`, cho phép `interface` mở rộng kế thừa `default method`.
    ```java
    public interface AnotherTimeClient extends TimeClient { }
    ```
    + Khai báo lại `default method`, điều này biến `default method` thành `abstract`.
    ```java
        public interface AbstractZoneTimeClient extends TimeClient {
        public ZonedDateTime getZonedDateTime(String zoneString);
        }   
    ```
    + Định nghĩa lại `default method`, điều này ghi đè `default method`.
    ```java
    public interface HandleInvalidTimeZoneClient extends TimeClient {
    default public ZonedDateTime getZonedDateTime(String zoneString) {
        try {
            return ZonedDateTime.of(getLocalDateTime(), ZoneId.of(zoneString)); 
        } catch (DateTimeException e) {
            System.err.println("Invalid zone ID: " + zoneString +
                "; using the default time zone instead.");
            return ZonedDateTime.of(getLocalDateTime(), ZoneId.systemDefault());
        }
    }
    }

    ```
### Static Method
+ Ngoài `default method`, có thể khai báo `static method` trong các `interface`. (Một `static method` là một `method` được liên kết với `class` hoặc `interface` mà nó được khai báo thay vì với bất kỳ `object` nào. Mọi `instance` của `class` chia sẻ các `static method` của nó.)
    ```java
    public interface TimeClient {
    // ...
    static public ZoneId getZoneId(String zoneString) {
        try {
            return ZoneId.of(zoneString);
        } catch (DateTimeException e) {
            System.err.println("Invalid time zone: " + zoneString +
                "; using default time zone instead.");
            return ZoneId.systemDefault();
        }
    }

    default public ZonedDateTime getZonedDateTime(String zoneString) {
        return ZonedDateTime.of(getLocalDateTime(), getZoneId(zoneString));
    }    
    }
    ```
### Summary of Interfaces
+ Một khai báo `interface` có thể chứa `method signatures`, `default methods`, `static methods` và các định nghĩa hằng số. Các `method` duy nhất có triển khai là `default` và `static methods`.

+ Một `class` thực thi một `interface` phải triển khai tất cả các `method` được khai báo trong `interface`.

+ Tên của một `interface` có thể được sử dụng ở bất kỳ nơi nào mà một kiểu (`type`) có thể được sử dụng.

## Inheritance
### Multiple Inheritance of State, Implementation, and Type
### Overriding and Hiding Methods
### Polymorphism
### Hiding Fields
### Using the Keyword super
### Object as a Superclass
### Writing Final Classes and Methods
### Abstract Methods and Classes
### Summary of Inheritance