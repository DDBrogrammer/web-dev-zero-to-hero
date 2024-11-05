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
 
    ```java
    // access modifier  type  name
    public              int   cadence;
    public int gear;
    public int speed;
    ```
 
+ Khai báo 1 `fields` gồm 3 thành phần bao gồm:
  + `access modifier`: phạm vi truy cập bao gồm  `public`, `private`, `protected`, `default`
  + `data type`: kiểu dữ liệu
  + `name`: tên `fields`
 
## Access Modifiers
+ Kiểm soát quyền truy cập của `class` khác đối với `fields`, bao gồm 4 loại:
  + `public`: `field` có thể được truy cập từ tất cả các `class`.
  + `protected`: Chỉ trong cùng package hoặc `class` con
  + `default`: Chỉ trong cùng `package`
  + `private`: `field` chỉ có thể truy cập trong chính `class` của nó.
 
+ Để đạt được tính đóng gói `encapsulation` các `field` của 1 `class` nên được để `private`, và truy cập thông qua các `public` `method`
    ```java
    public class Bicycle {
   
    private int cadence;
    private int gear;
    private int speed;
   
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
   
    public int getCadence() {
        return cadence;
    }
   
    public void setCadence(int newValue) {
        cadence = newValue;
    }
   
    public int getGear() {
        return gear;
    }
   
    public void setGear(int newValue) {
        gear = newValue;
    }
   
    public int getSpeed() {
        return speed;
    }
   
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
   
    public void speedUp(int increment) {
        speed += increment;
    }
    }
 
    ```
## `Types`
+ Tất cả các biến đều phải có một `type`.  
  + `primitive types` như int, float, boolean, v.v.
  + `reference types` `Strings`, `Arrays`, hoặc `Objects`
 
## Variable Names
+ Tất cả các biến đều phải tuân thủ quy tắc đặt tên trong bài trước
+ `Naming` quy tắc đặt tên `variable`:
  + Phân biệt chữ hoa và chữ thường: tên "AGE" và và "age" là 2 tên khác nhau
  + Định danh hợp lệ: Tên `variable` bắt buộc phải là chữ cái, $, hoặc _, theo quy ước thì bắt đầu tên `variable` nên là chữ cái.
  + Không dùng khoảng trắng: tên `variable` không dùng khoảng trắng
  + Các ký tự sau kí tự đầu có thể là chữ cái, số, hoặc _ $
  + Dùng từ đầy đủ: Tên `variable` nên được đặt đầy đủ, dễ hiểu và giàu thông tin
  + Tránh từ khóa: không dùng từ khóa để làm tên `variable`
  + Quy ước viết hoa:
    + Từ đầu tiên viết thường chữ cái đầu, từ từ thứ 2 chở đi viết hoa chữ cái đầu (vd: isRunnning, myEmail)
    + Đối với `final` `variable` viết hoa tất cả các chữ cái và các từ cách nhau bởi dấu _ (vd: IS_RUNNING, MY_EMAIL)
+ Quy tắc đặt tên cho `class` và `method` phương thức áp dụng tương tự chỉ khác ở 2 điểm:
  + Chữ cái đầu tiên của tên `class` phải viết hoa vd: `Car`,` Person`, `Student`, `OrderProcessor`
  + Tên `method` phải chứa động từ và nên là từ đầu tiên: `calculateTotal()`, `getSpeed()`, `setGear()`, `applyBrake()`, `speedUp()`
 
 
### Defining Methods
+ khai báo `method` có sáu thành phần theo thứ tự:
   + `Modifiers`: `public`, `private`,`protected`,`default`
   + `Return type`:  kiểu dữ liệu của giá trị trả về từ `method`, hoặc `void` nếu `method` không trả về giá trị.
   + `Method name`: các quy tắc đặt tên cho `fields` cũng áp dụng cho tên `method`
   + `Parameter list`: danh sách các tham số đầu vào được phân cách bằng dấu phẩy, với kiểu dữ liệu đi trước tên tham số và được đặt trong dấu ngoặc đơn ()
   + `Exception list`: danh sách các lỗi mà `method` có thể tạo ra trong quá trình chạy (học ở phần sau)
   + `Method body`: được đặt giữa cặp ngoặc nhọn – là triển khai của `method`, bao gồm cả khai báo của các `local variables`, sẽ nằm ở đây.
   ```java
    //Modifier  Return type  Method name
    public     double        calculateAnswer(// Parameter list
                                  double wingSpan, int numberOfEngines,
                                  double length, double grossTons) {
    // thực hiện tính toán ở đây
    }
    ```
+ `Method name` và `Parameter type` của `method` tạo thành `method signature`, trong 1 `class` không thể có 2  `method signature` giống nhau
  ```java
  calculateAnswer(double, int, double, double)
  ```
#### Naming a Method
+ Theo quy ước, tên method nên là một động từ viết thường hoặc là một tên nhiều từ bắt đầu bằng động từ viết thường, theo sau bởi tính từ, danh từ, v.v.
    ```java
    run()
    runFast()
    getBackground()
    getFinalData()
    compareTo()
    setX()
    isEmpty()
    ```
+ Trong 1 `class` có thể có nhiều `Method` có tên giống nhau nhờ cơ chế `method overloading`
#### Overloading Methods
+ Java có thể phân biệt giữa các `methods` với các `method signatures` khác nhau. Điều này có nghĩa là các methods trong cùng một lớp có thể có cùng tên nếu chúng có danh sách tham số khác nhau.
   
    ```java
    public class DataArtist {
        public void draw(String s) {
        }
   
        public void draw(int i) {
        }
   
        public void draw(double f) {
        }
 
        public void draw(int i, double f) {
        }
    }
    ```
 
+ Các `overloaded methods` được phân biệt bởi số lượng và kiểu của các `arguments` được truyền vào `method`.Trong ví dụ mã, draw(String s) và draw(int i) là các `methods` khác nhau và độc lập vì chúng yêu cầu các loại `arguments` khác nhau.
+ Không thể khai báo nhiều `method` với cùng tên và cùng số lượng và kiểu `arguments` vì trình biên dịch `compiler` không thể phân biệt chúng.
+ `Compiler` không xét đến kiểu trả về khi phân biệt `methods`, do đó không thể khai báo hai `methods` với cùng `signature` ngay cả khi chúng có `Return type` khác nhau.
+ Nên dùng `Overloaded methods` một cách phù hợp vì sẽ làm `code` khó đọc hơn
 
### Providing Constructors for Classes
+ `Constructors`: là 1 `method` đặc biệt dùng để tạo ra `object` từ `class`
+ Khai báo `Constructors` giống như khai báo `method` trừ 1 số điểm đặc biệt sau
  +  tên của `Constructors` là tên `class`
  + `Constructors` không có `return type`
   
   ```java
   public Bicycle(int startCadence, int startSpeed, int startGear) {
    gear = startGear;
    cadence = startCadence;
    speed = startSpeed;
    }
   ```
 
+ Để tạo một `object` từ một `constructor` sử dụng từ khóa `new`.Từ khóa `new` sẽ tạo ra không gian trong bộ nhớ cho `object` và khởi tạo các `fields` (`default value`) của nó.
   
    ```java
    Bicycle myBike = new Bicycle(30, 0, 8);
    ```
 
+ 1 `class` có thể có nhiều `constructor` khác nhau miễn là chúng có `method signature` khác nhau
+ `constructor` không có tham số đầu vào gọi là `no-argument constructor`
   
   ```java
    Bicycle(){
        ///
    }
    ```
 
+ `compiler` sẽ tự động gọi đến `no-argument constructor` của `class` cha nếu `class` con không có `constructor`, nếu `class` cha (`superclass`) không có `no-argument constructor` thì `compiler` sẽ báo lỗi. Khi `class` có `constructor` rồi thì `compiler` sẽ mặc định gọi vào `constructor` duy nhất đó mà ko gọi lên `class` cha nữa
   
   ```java
   public class Bicycle {
    int gear ;
    int cadence ;
    int speed ;
    // chỉ có 1 constructor duy nhất ko gọi lên `no-argument constructor` của `class` cha
    public Bicycle(int startCadence, int startSpeed, int startGear) {
    gear = startGear;
    cadence = startCadence;
    speed = startSpeed;
     }
 
    }
    ```
 
+ Nếu ko khai báo `superclass` qua từ khóa `extend`, `compiler` sẽ mặc định hiểu `class` cha là `Object`
+ Có thể sử dụng `access modifiers` trong khai báo `constructor` để kiểm soát `constructor` có thể được gọi bởi các `classes` khác nào.
 
   ```java
   public class Bicycle {
    int gear ;
    int cadence ;
    int speed ;
    // không cho các class khác gọi vào
    private Bicycle(int startCadence, int startSpeed, int startGear) {
    gear = startGear;
    cadence = startCadence;
    speed = startSpeed;
     }
 
    }
    ```
 
### Truyền Thông Tin Vào `Method` hoặc `Constructor`
+ Khai báo của một `method` hoặc `constructor` sẽ xác định số lượng và loại của các tham số cho `method` hoặc `constructor` đó.
    ```java
    public double computePayment(
                  double loanAmt,
                  double rate,
                  double futureValue,
                  int numPeriods) {
    double interest = rate / 100.0;
    double partial1 = Math.pow((1 + interest),
                    - numPeriods);
    double denominator = (1 - partial1) / interest;
    double answer = (-loanAmt / denominator)
                    - ((futureValue * partial1) / denominator);
    return answer;
    }  
    ```
+ `Parameters` là danh sách các `variable` trong khai báo `method`. `Arguments` là các giá trị thực tế được truyền vào khi `method` được gọi. Khi bạn một `method`, các `arguments` phải khớp với các `parameters` về loại và thứ tự.
#### Các Kiểu `Parameter`
+ Có thể sử dụng bất kỳ loại dữ liệu nào cho `parameter` của một `method` hoặc `constructor`. Bao gồm các loại dữ liệu nguyên thủy `primative`  như double, float, và int, và các kiểu tham chiếu  `reference` như `object` và `arrays`.
    ```java
    public Polygon polygonFrom(Point[] corners) {
    // thân method ở đây
    }
 
    ```
+ Lưu ý: Có thể truyền một `method` vào một `method` khác, bằng cách sử dụng một `lambda expression` hoặc `method reference`.
 
#### Số lượng `Argument` động
+ Có thể sử dụng một cấu trúc gọi là `varargs` để truyền một số lượng giá trị tùy ý vào `method`
    ```java
    public Polygon polygonFrom(Point... corners) {
    int numberOfSides = corners.length;
    double squareOfSide1, lengthOfSide1;
    squareOfSide1 = (corners[1].x - corners[0].x)
                     * (corners[1].x - corners[0].x)
                     + (corners[1].y - corners[0].y)
                     * (corners[1].y - corners[0].y);
    lengthOfSide1 = Math.sqrt(squareOfSide1);
 
    // thêm mã thân method để tạo và trả về một
    // `polygon` kết nối các `Point`
    }
 
    public PrintStream printf(String format, Object... args)
    ```
+ Gọi `method`:
    ```java
     System.out.printf("%s: %d, %s%n", name, idnum, address);
    ```
 
#### Tên `Parameter`
+ Khi khai báo một `parameter` cho một `method` hoặc `constructor`, cần phải cung cấp một tên cho `parameter` đó. Tên này được sử dụng trong thân `method` để tham chiếu đến `argument` được truyền vào.
+ Tên của một `parameter` phải là duy nhất trong phạm vi của nó. Nó không thể trùng với tên của một `parameter` khác cho cùng một `method` hoặc `constructor`, và không thể là tên của một `local variable` trong `method` hoặc `constructor`.
+ Một `parameter` có thể có cùng tên với một trong các trường (`field`) của `class`. Nếu trường hợp này xảy ra, `parameter` sẽ che khuất (`shadow`) `field`.
    ```java
    public class Circle {
        // `field` của `class`
    private int x, y, radius;
                          // paramter
    public void setOrigin(int x, int y) {
        int a = x+y;// xy là paramter ko phải là `field`
    }
    }
    ```
+ để sử dụng `field` của `class` sử dụng từ khóa `this`
    ```java
    public class Circle {
        // `field` của `class`
    private int x, y, radius;
                          // paramters
    public void setOrigin(int x, int y) {
        int a = this.x + this.y; // x y là `field` của `class`
    }
    }
    ```
#### Truyền `Argument` `primative type`
+ Các `primative type` `argument`, như `int` hoặc `double`, được truyền vào các `method` theo giá trị (`by value`). Điều này có nghĩa là bất kỳ thay đổi nào đối với các giá trị của `parameter` chỉ tồn tại trong phạm vi của `method`. Khi `method` kết thúc, các `parameter` sẽ biến mất và mọi thay đổi của chúng sẽ bị mất.
    ```java
    public class PassPrimitiveByValue {
 
        public static void main(String[] args) {
           
        int x = 3;
           
        // gọi passMethod() với
        // x làm argument
        passMethod(x);
           
        // in x để xem giá trị của nó
        // có thay đổi không
        System.out.println("After invoking passMethod, x = " + x);
        // KẾT QUẢ:
        // After invoking passMethod, x =  3
        }
       
    // thay đổi parameter trong passMethod()
        public static void passMethod(int p) {
            p = 10;
        }
    }
 
    ```
#### Truyền `reference type` `Argument`
+ Các `reference type` `parameter`, như `object`, cũng được truyền vào các `method` theo giá trị (`by value`). Điều này có nghĩa là khi `method` kết thúc, tham chiếu đã truyền vào vẫn tham chiếu đến cùng một `object` như trước. Tuy nhiên, các giá trị của các `field` của `object` có thể được thay đổi trong `method`, nếu chúng có cấp độ truy cập phù hợp.
    ```java
    public void moveCircle(Circle circle, int deltaX, int deltaY) {
    // mã để di chuyển gốc của circle đến x+deltaX, y+deltaY
    circle.setX(circle.getX() + deltaX);
    circle.setY(circle.getY() + deltaY);
       
    // mã để gán một tham chiếu mới cho circle
    circle = new Circle(0, 0);
    }
 
    ```
+ call method:
    ```java
    moveCircle(myCircle, 23, 56)
    ```
 
## Objects
+ Một chương trình Java điển hình sẽ tạo ra nhiều đối tượng (`objects`), các `objects` tương tác với nhau qua `method`, qua những sự tương tác này trương trình có thể thực hiện nhiều tác vụ phức tạp khác nhau
+ Khi một `objects` đã hoàn thành nhiệm vụ mà nó được tạo ra, các tài nguyên của nó sẽ được tái sử dụng cho các `objects` khác.
    ```java
    public class CreateObjectDemo {
 
    public static void main(String[] args) {
       
        // Khai báo và tạo một đối tượng point và hai đối tượng rectangle.
        Point originOne = new Point(23, 94);
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);
       
        // Hiển thị chiều rộng, chiều cao và diện tích của rectOne
        System.out.println("Width of rectOne: " + rectOne.width);
        System.out.println("Height of rectOne: " + rectOne.height);
        System.out.println("Area of rectOne: " + rectOne.getArea());
       
        // Đặt vị trí cho rectTwo
        rectTwo.origin = originOne;
       
        // Hiển thị vị trí của rectTwo
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
       
        // Di chuyển rectTwo và hiển thị vị trí mới của nó
        rectTwo.move(40, 72);
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
    }
    }
    ```
    ```cmd
    Width of rectOne: 100
    Height of rectOne: 200
    Area of rectOne: 20000
    X Position of rectTwo: 23
    Y Position of rectTwo: 94
    X Position of rectTwo: 40
    Y Position of rectTwo: 72
    ```
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