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
+ Trong Java Các `class` có thể được bắt nguồn từ các `class` khác, qua đó kế thừa các `fields` and `methods` từ các `class` đó:
  + Một `class` được bắt nguồn từ một `class` khác được gọi là `subclass` (còn gọi là `derived class`, `extended class`, hoặc `child class`).
  + `Class` mà `subclass` được bắt nguồn từ đó được gọi là `superclass` (còn gọi là `base class` hoặc `parent class`).
+ Ngoại trừ `Object` (không có `superclass`), mọi `class` đều có một và chỉ một `superclass` trực tiếp (`single inheritance`). Nếu không có `superclass` rõ ràng nào được khai báo, thì mỗi `class` mặc định là một `subclass` của `Object`.
+ Các `class` có thể được bắt nguồn từ các `class` khác, tiếp nối như vậy, và cuối cùng bắt nguồn từ `class` cao nhất, `Object`. Những `class` này được gọi là hậu duệ (`descendant`) của tất cả các `class` trong chuỗi kế thừa kéo dài về `Object`.
+ Một `subclass` kế thừa tất cả các thành viên (`fields`, `methods`, và `nested types`) từ `superclass`.
+ Lưu ý: Các `constructor` không được kế thừa, nhưng `constructor` của `superclass` có thể được gọi từ `subclass`.
 
#### The Java Platform Class Hierarchy

  <p align="center">
  <img src="./images/image.png" alt="alt text">
  </p>

+ `Class` `Object`, được định nghĩa trong `package` `java.lang`, định nghĩa và thực hiện các hành vi chung cho tất cả các `class`.
+ Trên nền tảng `Java`, nhiều `class` kế thừa trực tiếp từ `Object`, các `class` khác kế thừa từ các `class` đó, và cứ tiếp tục như vậy, tạo thành một hệ thống phân cấp `class`.
+ Tất cả các `class` trong nền tảng `Java` đều là hậu duệ của `Object`.
+ Ở đầu hệ thống phân cấp, `Object` là `class` tổng quát nhất. Các `class` gần cuối hệ thống phân cấp cung cấp hành vi và đặc điểm chuyên biệt hơn.
    ```java
    public class Bicycle {
       
    // the Bicycle class has three fields
    public int cadence;
    public int gear;
    public int speed;
       
    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
       
    // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
       
    public void setGear(int newValue) {
        gear = newValue;
    }
       
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
       
    public void speedUp(int increment) {
        speed += increment;
    }
    }
    ```
    ```java
    public class MountainBike extends Bicycle {
       
    // the MountainBike subclass adds one field
    public int seatHeight;
 
    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }  
       
    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }  
    }
    ```
#### What You Can Do in a Subclass
+ Kế thừa tất cả các thành viên `public` và `protected` của `superclass`, dù `subclass` nằm trong `package` nào
+ Nếu `subclass` nằm trong cùng `package` với `superclass`, nó cũng kế thừa các thành viên `package-private`.
+ Có thể sử dụng các thành viên được kế thừa như hiện tại, thay thế, ẩn, hoặc bổ sung các thành viên mới.
+ Lưu ý: `Subclass` không kế thừa các thành viên `private` của `superclass`. Tuy nhiên, nếu `superclass` có `method public` hoặc `protected` để truy cập các trường `private`, `subclass` có thể sử dụng chúng.
#### Casting Objects
+ Nếu một `object` là kiểu của `class` từ đó nó được khởi tạo, có thể ép kiểu giữa các loại `class` trong chuỗi kế thừa. Ví dụ:
    ```java
    Object obj = new MountainBike();
    MountainBike myBike = (MountainBike)obj;  // Explicit casting
    ```
+ sử dụng `instanceof` để tránh bị lỗi khi `object` không phải `type` cần cast
    ```java
    if (obj instanceof MountainBike) {
    MountainBike myBike = (MountainBike)obj;
    }  // Explicit casting
    ```
 
### Multiple Inheritance of State, Implementation, and Type
+ Khác biệt giữa `class` và `Interface`:
  + `Class` có thể có `fields`, nhưng `Interface` thì không.
  + Có thể khởi tạo `class` để tạo `object`, nhưng không thể làm điều này với `Interface`.
+ Kế thừa đa dạng về trạng thái (`Multiple inheritance of state`), Java không cho phép một `class` mở rộng nhiều `class` để tránh xung đột khi:
  + Các `fields` giống nhau được kế thừa từ nhiều `superclass`.
  + `Method` hoặc `constructor` từ các `superclass` khác nhau khởi tạo cùng một `field`.
+ Kế thừa đa dạng về triển khai (`Multiple inheritance of implementation`):
  + Gây ra xung đột tên hoặc mơ hồ khi nhiều `superclass` chứa các `methods` trùng tên.
  + Java hỗ trợ một phần qua `default methods` trong `Interface`.
  + Java có quy tắc xác định `default method` nào sẽ được sử dụng nếu trùng tên.
+ Kế thừa đa dạng về kiểu (`Multiple inheritance of type`):
  + Một `class` có thể triển khai nhiều `Interface`.
  + Một `object` có thể có nhiều kiểu: kiểu của `class` và kiểu của các `Interface` mà `class` đó triển khai.
  + Nếu một `variable` được khai báo theo kiểu `Interface`, nó có thể tham chiếu đến bất kỳ `object` nào thuộc `class` triển khai `Interface`.
+ Xử lý xung đột `default methods` hoặc `static methods`
  + Khi một `class` kế thừa nhiều `methods` từ các `Interface`, lập trình viên hoặc trình biên dịch phải quyết định dùng cái nào.
 
### Overriding and Hiding Methods
#### Instance Methods
+ Một `instance` `method` trong `subclass` nếu có cùng `method signature` và kiểu trả về (`return type`) giống như (cùng `type` hoặc là `subtype` ) một `instance` `method` trong `superclass` sẽ `override` `method` của `superclass`.
+ Ghi đè hay `override` là khả năng thay đổi triển khai của một `method` mà `subclass` kế thừa từ `superclass`
    ```java
    // Superclass
    public class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
    }
    ```
    ```java
    // Subclass
    public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
    }
    ```
    ```java
    public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Tạo một object của superclass
        Animal myDog = new Dog(); // Tạo một object của subclass nhưng tham chiếu từ kiểu superclass

        myAnimal.makeSound(); // Gọi method từ superclass
        myDog.makeSound();    // Gọi method từ subclass (ghi đè)
    }
    }

    ```
    ```cmd
    Some generic animal sound
    Woof Woof
    ```
+ Khi `override` 1 `method`, nên sử dụng `anotation` `@Override` để đánh dấu, khi 1 `method` được đánh dấu `override`, trình biên dịch `compiler`
sẽ xác định được `method` hiện tại đang `override` `method` của `super class`
#### Static Methods
+ Nếu một `subclass` định nghĩa một `static method` có cùng `method signature` như một `static method` trong `superclass`, thì method trong `subclass` sẽ hide (ẩn) `method` trong `superclass`.
+ Sự khác biệt giữa `hiding` một `static method` và `overriding` một `instance method`:
  + `instance method`: Khi gọi `method` bị `override` qua `subclass` nó sẽ gọi đến `method` của `subclass`
  + `static method`: Khi gọi `method` bị `override` nó sẽ phụ thuộc vào tên của `class` gọi nó
    ```java
    public class Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
    }

    ```
    ```java
    public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
    }
    }

    ```
    ```cmd
    The static method in Animal  
    The instance method in Cat
    ```

### Đa hình (Polymorphism)
  <p align="center">
  <img src="./images/image-1.png" alt="alt text">
  </p>
  
+ Đa hình là một trong những nguyên tắc quan trọng của lập trình hướng đối tượng (`Object-Oriented Programming - OOP`), 
cho phép các `object` có cùng `interface` hoặc kế thừa cùng một `class` có thể triển khai khác nhau dựa trên ngữ cảnh.
+ `JVM` sẽ gọi `method` phù hợp với `object` mà `reference variable` trỏ tới, không phải với kiểu (`type`) của `variable`.
    ```java
    // Lớp cha
    public class Animal {
    public void speak() {
        System.out.println("Animal is making a sound");
    }
    }

    // Lớp con Dog
    public class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog says: Woof Woof");
    }
    }

    // Lớp con Cat
    public class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Cat says: Meow Meow");
    }
    }

    public class TestPolymorphism {
    public static void main(String[] args) {
        Animal myAnimal; // Reference variable kiểu Animal

        myAnimal = new Dog(); // Tham chiếu tới đối tượng Dog
        myAnimal.speak(); // Gọi phương thức speak() của Dog

        myAnimal = new Cat(); // Tham chiếu tới đối tượng Cat
        myAnimal.speak(); // Gọi phương thức speak() của Cat
    }
    }

    ```
    ```cmd
    Dog says: Woof Woof
    Cat says: Meow Meow
    ```

+ Tính đa hình được thể hiện qua 2 loại đa hình chính
  + `Compile-time Polymorphism` (Đa hình lúc biên dịch):
    + Thể hiện thông qua `method overloading`.
    + `Compiler` sẽ quyết định `method` nào được gọi tại thời điểm biên dịch.
  + `Runtime Polymorphism` (Đa hình lúc chạy):
    + Thể hiện thông qua `method overriding`.
    + `Java` quyết định `method` nào được gọi tại `runtime`, dựa trên `object` mà `reference variable` trỏ tới.

+ Lợi ích của đa hình
    + Tăng tính linh hoạt và khả năng mở rộng: Cho phép sử dụng một `interface` chung nhưng triển khai khác nhau.
    + Giảm sự phụ thuộc giữa các thành phần: Dễ dàng thay đổi hoặc mở rộng hệ thống mà không ảnh hưởng đến phần code hiện tại.
    + Tối ưu hóa mã nguồn: Có thể sử dụng chung `reference variable` thay vì viết các `method` xử lý riêng biệt cho từng `class`.

### Hiding Fields 
+ Trong Java, `hiding fields` xảy ra khi một `field` trong `subclass` có cùng tên với một `field` trong `superclass`, bất kể kiểu dữ liệu (`data type`) của chúng có giống nhau hay không.
+ Để truy cập `field` trong `superclass`, phải sử dụng từ khóa `super`.
+ Không khuyến khích việc `hiding fields` do sẽ làm `code` khó bảo trì
    ```java
    // Lớp cha
    public class SuperClass {
    public String field = "Field in SuperClass";
    }

    // Lớp con
    public class SubClass extends SuperClass {
    public String field = "Field in SubClass";

    public void printFields() {
        // Truy cập field trong subclass
        System.out.println("SubClass field: " + field);

        // Truy cập field trong superclass
        System.out.println("SuperClass field: " + super.field);
    }
    }

    // Kiểm tra
    public class TestHidingFields {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.printFields();
    }
    }

    ```
    ```cmd
    SubClass field: Field in SubClass
    SuperClass field: Field in SuperClass
    ```
+ **Lưu ý**: `Hiding fields` khác với `method overriding`
    + `Hiding fields`: Sự lựa chọn `field` để sử dụng dựa trên kiểu của `reference variable` (lúc biên dịch - `compile-time`).
    + `Method overriding`: Sự lựa chọn `method` để gọi dựa trên kiểu của `object` thực sự (lúc chạy - `runtime`).
    ```java
    // Lớp cha
    public class SuperClass {
    public String field = "Field in SuperClass";
    }

    // Lớp con
    public class SubClass extends SuperClass {
    public String field = "Field in SubClass";

    public void printFields() {
        // Truy cập field trong subclass
        System.out.println("SubClass field: " + field);

        // Truy cập field trong superclass
        System.out.println("SuperClass field: " + super.field);
    }
    }

    // Kiểm tra
    public class TestHiding {
    public static void main(String[] args) {
        SuperClass obj = new SubClass();
        System.out.println(obj.field); // Kết quả: Field in SuperClass
    }
    }
    ```
    ```cmd
    SubClass field: Field in SubClass
    SuperClass field: Field in SuperClass
    ```
### Using the Keyword super
#### Accessing Superclass Members
+ Nếu một `method` hoặc `field` trong `subclass` ghi đè (`overrides`) `method` của `superclass`, có thể gọi `method` bị ghi đè bằng cách sử dụng từ khóa `super`.
    ```java
    // Superclass
    public class Superclass {
    public void printMethod() {
        System.out.println("Printed in Superclass.");
    }
    }

    // Subclass
    public class Subclass extends Superclass {
    // Ghi đè (override) printMethod trong Superclass
    @Override
    public void printMethod() {
        // Gọi phương thức của superclass
        super.printMethod(); 
        System.out.println("Printed in Subclass");
    }

    public static void main(String[] args) {
        Subclass s = new Subclass();
        s.printMethod();
    }
    }
    ```
    ```cmd
    Printed in Superclass.
    Printed in Subclass
    ```    
#### Subclass Constructors
+ Từ khóa `super` cũng được sử dụng để gọi `constructor` của `superclass`.
+ Lời gọi đến `constructor` của `superclass` phải nằm ở dòng đầu tiên trong `constructor` của `subclass`.
    ```java
    // Superclass: Bicycle
    public class Bicycle {
    private int cadence;
    private int speed;
    private int gear;

    public Bicycle(int startCadence, int startSpeed, int startGear) {
        this.cadence = startCadence;
        this.speed = startSpeed;
        this.gear = startGear;
    }
    }

    // Subclass: MountainBike
    public class MountainBike extends Bicycle {
    private int seatHeight;

    public MountainBike(int startHeight, 
                        int startCadence,
                        int startSpeed,
                        int startGear) {
        // Gọi constructor của superclass
        super(startCadence, startSpeed, startGear); 
        this.seatHeight = startHeight; // Thêm logic khởi tạo riêng
    }
    }

    ```
    ```cmd
    Printed in Superclass.
    Printed in Subclass
    ```
+ Cú pháp gọi `constructor` của `superclass`:
    + `super();` dùng để Gọi `constructor` không tham số (`no-argument constructor`) của `superclass`.
    + `super(parameter list);` Gọi `constructor` có tham số của `superclass`, với danh sách tham số phù hợp.
+ **Lưu ý:** 
    + Nếu không gọi `super()` một cách rõ ràng:
        + `Compiler` sẽ tự động thêm lệnh gọi đến `constructor` không tham số của `superclass`.
        + Nếu `superclass` không có `constructor` không tham số, chương trình sẽ báo lỗi biên dịch.
    + `Constructor chaining`:
        + Khi `constructor` của `subclass` gọi `constructor` của `superclas`s, quá trình này sẽ tiếp tục theo "chuỗi" ngược lên đến `Object`.
        + Đây được gọi là `constructor chaining`.
        ```java 
        public class Grandparent {
        public Grandparent() {
        System.out.println("Constructor of Grandparent");
            }
        }

        public class Parent extends Grandparent {
        public Parent() {
        super(); // Gọi constructor của Grandparent
        System.out.println("Constructor of Parent");
        }
        }

        public class Child extends Parent {
        public Child() {
        super(); // Gọi constructor của Parent
        System.out.println("Constructor of Child");
        }

        public static void main(String[] args) {
        Child obj = new Child();
        }   
        }
        ```
        ```cmd
        Constructor of Grandparent
        Constructor of Parent
        Constructor of Child
        ```
### Object as a Superclass
+ `Class` `Object`, nằm trong `package` `java.lang`, đứng ở đỉnh của cây phân cấp các `class`. Mọi `class` đều là hậu duệ, trực tiếp hoặc gián tiếp, của `class` `Object`.
+ Toàn bộ các `Class` trong `java` đều kế thừa các `method` của `Object`, các `method` này bao gồm
    + `protected Object clone() throws CloneNotSupportedException`: Tạo và trả về một bản sao của `object` này.
    + `public boolean equals(Object obj)`: Xác định xem một `object` khác có "bằng" với `object` hiện tại hay không.
    + `protected void finalize() throws Throwable`: Được gọi bởi bộ thu gom rác (`garbage collector`) trên `object` khi không còn bất kỳ tham chiếu nào trỏ đến `object` đó.
    + `public final Class getClass()`: trả về `runtime class` của 1 `object` 
    + `public int hashCode()`: trả về giá trị `hashcode` của 1 `object`
    + `public String toString()`: trả về biểu diễn chuỗi (`String`) của `object`.
+ Các `method` `notify`, `notifyAll`, và `wait` trong `Object` đóng vai trò trong việc đồng bộ hóa hoạt động của các `thread` chạy độc lập trong một chương trình
    + `public final void notify()`
    + `public final void notifyAll()`
    + `public final void wait()`
    + `public final void wait(long timeout)`
    + `public final void wait(long timeout, int nanos)`

#### The clone() Method
+ Nếu một `class` hoặc một `superclass` của nó `implements interface Cloneable`, có thể sử dụng `method clone()` để tạo bản sao từ một `object` đã tồn tại. 
    ```java 
    class Address implements Cloneable {
    String street;
    String city;

    Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Address [street=" + street + ", city=" + city + "]";
    }
    }

    class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Clone cơ bản
        Person clonedPerson = (Person) super.clone();

        // Clone sâu (deep copy) cho các thuộc tính tham chiếu
        clonedPerson.address = (Address) address.clone();

        return clonedPerson;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", address=" + address + "]";
    }
    }

    public class CloneExample {
    public static void main(String[] args) {
        try {
            // Tạo đối tượng gốc
            Address address = new Address("123 Main St", "Hanoi");
            Person original = new Person("Nguyen Van A", address);

            // Clone đối tượng
            Person cloned = (Person) original.clone();

            // In ra thông tin
            System.out.println("Original: " + original);
            System.out.println("Cloned: " + cloned);

            // Thay đổi dữ liệu của bản gốc
            original.address.city = "Ho Chi Minh";
            System.out.println("\nAfter modifying the original:");
            System.out.println("Original: " + original);
            System.out.println("Cloned: " + cloned);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
    }
    ```
    ```cmd
    Original: Person [name=Nguyen Van A, address=Address [street=123 Main St, city=Hanoi]]
    Cloned: Person [name=Nguyen Van A, address=Address [street=123 Main St, city=Hanoi]]

    After modifying the original:
    Original: Person [name=Nguyen Van A, address=Address [street=123 Main St, city=Ho Chi Minh]]
    Cloned: Person [name=Nguyen Van A, address=Address [street=123 Main St, city=Hanoi]]

    ```
#### The equals() Method
+ `Method` equals() so sánh hai `object` để xác định tính bằng nhau và trả về `true` nếu chúng bằng nhau.
+ `Method` mặc định trong `Object` sử dụng toán tử == để kiểm tra xem hai `object` có giống nhau hay không. Điều này phù hợp cho các `primitive data types`, nhưng đối với `object`, kết quả sẽ không chính xác trong nhiều trường hợp do
    + `==` so sánh giá trị của `variable`:
        + Nếu là `primative type`: so sánh giá trị 
        + Nếu là `reference type`: so sánh địa chỉ bộ nhớ
    + `equals()`: mặc định sẽ so sánh qua `==`, tuy nhiên nên được `override` lại theo yêu cầu bài toán (vd: 2 object People có cùng ID thì nên được coi là `equals`)

    ```java 
    class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // Kiểm tra nếu obj là chính đối tượng hiện tại
        if (this == obj) return true;

        // Kiểm tra nếu obj không phải là kiểu Person
        if (!(obj instanceof Person)) return false;

        // Ép kiểu và so sánh các thuộc tính
        Person other = (Person) obj;
        return this.name.equals(other.name) && this.age == other.age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    }

    public class EqualsExample {
    public static void main(String[] args) {
        // Tạo hai đối tượng Person
        Person person1 = new Person("Nguyen Van A", 25);
        Person person2 = new Person("Nguyen Van A", 25);

        // So sánh bằng equals
        if (person1.equals(person2)) {
            System.out.println("person1 và person2 bằng nhau");
        } else {
            System.out.println("person1 và person2 không bằng nhau");
        }

        // So sánh bằng toán tử ==
        if (person1 == person2) {
            System.out.println("person1 và person2 là cùng một tham chiếu");
        } else {
            System.out.println("person1 và person2 là các tham chiếu khác nhau");
        }
    }
    }

    ```

    ```cmd
    person1 và person2 bằng nhau
    person1 và person2 là các tham chiếu khác nhau
    ```
#### The hashCode() Method
+ Giá trị trả về bởi `hashCode()` là một số nguyên, được tạo ra bởi thuật toán băm (`hashing algorithm`).
    + `hashing algorithm`: là thuật toán chuyển dữ liệu đầu vào thành một `giá trị cố định` (luôn tạo ra một giá trị `hash` duy nhất) (`hash value`), thường dùng để định danh, kiểm tra, hoặc lưu trữ dữ liệu.
    + Theo định nghĩa, nếu hai `object` bằng nhau `equal`, `hash code` của chúng cũng phải bằng nhau.
    ```java
    @Override
    public int hashCode() {
        return Objects.hash(name, age); // Sử dụng phương thức tiện ích của Java
    }
    ```
#### The finalize() Method
+ Dùng để dọn dẹp tài nguyên khi `object` không còn được tham chiếu và sắp bị thu gom bởi `Garbage Collector`.
#### The getClass() Method
+ `Method` `getClass()` trong `Java` trả về một `object` của `class` `Class`, cho phép lấy thông tin về `class` của `object` đang được tham chiếu.
+  Không thể `override` `Method` `getClass()` vì đây là một `method` `final` trong `class` `Object`.
+ Các tính năng của `getClass()`:
    + `getSimpleName()`: Lấy tên đơn giản của `class` (không có `package`).
    + `getSuperclass()`: Lấy `class` cha của `class` hiện tại.
    + `getInterfaces()`: Lấy các `Interface` mà `class` hiện tại `implements`.
+ `Method` hữu ích của `Class`:
    + `isAnnotation()`: Kiểm tra xem `class` có phải là `annotation` không.
    + `isInterface()`: Kiểm tra xem `class` có phải là `interface` không.
    + `isEnum()`: Kiểm tra xem `class` có phải là `enum` không.
    + `getFields()`: Lấy tất cả các trường (`fields`) của `class`.
    + `getMethods()`:  Lấy tất cả các phương thức (`methods`) của `class`.
#### The toString() Method
+ Mặc định, `toString()` trong `Object` trả về một chuỗi biểu diễn của `object`.
+ Nên `override` `method` `toString()` trong các `class` đã khai báo.

### Writing Final Classes and Methods
+ `final`: đánh dấu 1 `method` không thể bị `override` bởi `class` con
+ `final` giúp đảm bảo tính nhất quán của `object`: Một `method` có thể có một triển khai quan trọng không nên bị thay đổi, giúp duy trì trạng thái nhất quán của `object`. Ví dụ, một phương thức như `getFirstPlayer()` trong lớp `ChessAlgorithm` không nên bị thay đổi, vì nó có thể liên quan đến logic quan trọng trong trò chơi cờ vua.
    ```java 
    class ChessAlgorithm {
    enum ChessPlayer { WHITE, BLACK }
    
    // Phương thức final không thể bị ghi đè
    final ChessPlayer getFirstPlayer() {
        return ChessPlayer.WHITE;
    }
    
    // Các phương thức khác có thể không phải là final
    ChessPlayer getSecondPlayer() {
        return ChessPlayer.BLACK;
    }
    }
    ```
+ các `method` được gọi bên trong `constructor` nên được đánh dấu `final`
    ```java 
    class Parent {
    public Parent() {
        // Constructor gọi phương thức final
        initialize();
    }

    // Phương thức final, không thể bị ghi đè trong lớp con
    public final void initialize() {
        System.out.println("Initializing Parent");
    }
    }

    class Child extends Parent {
    public Child() {
        super(); // Gọi constructor của lớp cha
    }

    // Không thể ghi đè phương thức initialize() vì nó đã được khai báo final
    // @Override
    // public void initialize() { ... }
    }
    ```
### Abstract Methods and Classes
+ Một `class` `abstract` là một `class` được khai báo với `keyword` `abstract`
    + `abstract class` có thể bao gồm hoặc không bao gồm các `abstract method`.
        + `abstract method` là một `method` được khai báo mà không có phần triển khai (không có dấu ngoặc nhọn, và kết thúc bằng dấu chấm phẩy)
        ```java
        abstract void moveTo(double deltaX, double deltaY);
        ```
    + `abstract class` không thể được khởi tạo, nhưng có thể được kế thừa.
    + Nếu 1 `class` chứa `abstract method` thì `class` đó phải được khai báo là `abstract class`
    ```java
    public abstract class GraphicObject {
    // khai báo các fields
    // khai báo các method không phải abstract
    abstract void draw();
    }
    ```
    + Khi 1 `abstract class` được kế thừa `subclass` thường cung cấp triển khai cho tất cả các `abstract method` trong `parent class`. Tuy nhiên, nếu không, thì `subclass` đó cũng phải được khai báo là `abstract`.
    ```java
    // Định nghĩa một abstract class
    abstract class Animal {
    // Thuộc tính chung
    String name;
 
    // Constructor
    public Animal(String name) {
        this.name = name;
    }
 
    // Phương thức đã triển khai
    void eat() {
        System.out.println(name + " is eating.");
    }
 
    // Phương thức abstract (không có thân)
    abstract void makeSound();
    }
 
    // Lớp Dog kế thừa từ abstract class Animal
    class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
 
    // Triển khai phương thức abstract
    @Override
    void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }
    }
 
    // Lớp Cat kế thừa từ abstract class Animal
    class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
 
    // Triển khai phương thức abstract
    @Override
    void makeSound() {
        System.out.println(name + " says: Meow! Meow!");
    }
    }
 
    // Lớp chính để chạy chương trình
    public class Main {
    public static void main(String[] args) {
        // Khởi tạo các đối tượng từ lớp con
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Kitty");
 
        // Gọi các phương thức
        dog.eat();
        dog.makeSound();
 
        cat.eat();
        cat.makeSound();
    }
    }
 
    ```
+ **Lưu ý**: Các `method` trong một `Interface` mà không được khai báo là `default` hoặc `static` đều được ngầm định là `abstract`, vì vậy không cần thiết phải sử dụng từ khóa `abstract` với các `method` của `Interface` (dù vẫn có thể sử dụng, nhưng không cần thiết).
#### Abstract Classes Compared to Interfaces
# So sánh: Abstract Classes vs Interfaces
 
| Đặc điểm                                  | Abstract Classes                                                                 | Interfaces                                                                 |
|-------------------------------------------|----------------------------------------------------------------------------------|----------------------------------------------------------------------------|
| **Khởi tạo**                              | Không thể khởi tạo                                                               | Không thể khởi tạo                                                         |
| **Kế thừa**                               | Chỉ có thể mở rộng từ một `class`                                               | Có thể triển khai nhiều `interfaces`                                       |
| **method**                           | Có thể có method có hoặc không có triển khai                               | Các method ngầm định là `abstract`, trừ khi được khai báo là `default` hoặc `static` |
| **Fields**                                | Có thể khai báo các `field` không phải là `static` và `final`                   | Tất cả các `field` ngầm định là `public`, `static`, và `final`             |
| **Access Modifiers**                      | Các method có thể là `public`, `protected`, hoặc `private`                 | Các method ngầm định là `public`                                      |
| **Sử dụng**                               | - Chia sẻ code hoặc triển khai giữa các `class` liên quan chặt chẽ                           | - Xác định hành vi cho các `class` không liên quan                         |
|                                           | - Định nghĩa các `field` hoặc method có `access modifier` khác ngoài `public` | - Tận dụng tính kế thừa đa kiểu                                            |
| **Ví dụ trong JDK**                       | `AbstractMap`                                                                   | `Serializable`, `Cloneable`, `Map<K, V>`                                   |
| **Ưu điểm chính**                         | Cung cấp một nền tảng (`base`) chung cho các `class` tương tự nhau                           | Thúc đẩy tính linh hoạt và tính đa hình                                     |
 
**Khi nào nên sử dụng?**
- Sử dụng **Abstract Classes** khi:
  - Cần chia sẻ code hoặc triển khai chung giữa các `class` liên quan chặt chẽ.
  - Định nghĩa các `field` không phải là `static` hoặc `final`.
  - Cần các method có `access modifier` khác ngoài `public`.
 
- Sử dụng **Interfaces** khi:
  - Các `class` không liên quan cần chia sẻ một hành vi chung.
  - Muốn xác định hành vi của một `reference type` mà không cần chi tiết triển khai.
  - Muốn tận dụng tính kế thừa đa kiểu.
 
### Summary of Inheritance
+ Ngoại trừ `Object class`, mỗi `class` luôn luôn có một và chỉ một `superclass` trực tiếp.
+ Một `class` kế thừa tất cả `fields` và `methods` từ các `superclasses` của nó (bao gồm cả trực tiếp và gián tiếp).
+ `Override` hoặc `Hide`:
    + `Subclass` có thể `override` các `instance methods` được kế thừa từ `superclass`.
    + `Subclass` có thể `hide` các `fields` hoặc `static methods`, nhưng `hide fields` thường không được khuyến khích.
+ `Object class` là `class` ở đỉnh của cây phân cấp:
    + Tất cả các `class` đều là hậu duệ của `Object class`.
    + Các `methods` hữu ích được kế thừa từ `Object clas`:
        + `toString()`
        + `equals()`
        + `clone()`
        + `getClass()`
+ Đánh dấu 1 `class` với `keyword` `final` sẽ khiến `class` đó không thể được `class` khác kế thừa
+ Đánh dấu 1 `method` với `keyword` `final` sẽ khiến `method` đó không thể bị `method` khác `override`
+ `Abstract class`:
    + Chỉ có thể được `subclassed`, không thể khởi tạo.
    + Có thể chứa `abstract methods` (chỉ khai báo, không triển khai).
    + `Subclass` cần cung cấp triển khai cho các `abstract methods`.