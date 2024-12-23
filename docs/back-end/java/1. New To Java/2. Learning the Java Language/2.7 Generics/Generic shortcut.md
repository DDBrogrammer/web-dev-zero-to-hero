# Generics
+ `Generics`: là một tính năng cho phép định nghĩa các `class`, `interface` và `method` có thể hoạt động trên nhiều kiểu dữ liệu khác nhau, đồng thời đảm bảo an toàn kiểu (type safety) trong quá trình biên dịch
## Lợi ích của `Generics`?
+ An toàn về kiểu dữ liệu (Type Safety): `Generics` đảm bảo rằng các `object` được xử lý chỉ thuộc một kiểu dữ liệu cụ thể, tránh lỗi `runtime` do ép kiểu (`cast`) sai.
+ Tái sử dụng mã nguồn (Code Reusability): Một `class` hoặc `method` có thể hoạt động trên nhiều kiểu dữ liệu khác nhau.
+ Tăng khả năng đọc hiểu mã (`Readability`): `Generics` giúp giảm việc ép kiểu thủ công, làm mã rõ ràng hơn.
## Generics với `class`
+ Khi định nghĩa một `class` là `generic`, `class` đó có thể làm việc với nhiều kiểu dữ liệu khác nhau mà không cần viết lại mã.
+ `T` là một tham số kiểu (`type parameter`), được thay thế bằng kiểu thực sự (`String`, `Integer`) khi tạo `object`.
    ```java
    class ClassName<T> {
    private T data;
 
    public void setData(T data) {
        this.data = data;
    }
 
    public T getData() {
        return data;
    }
    }
    ```
    ```java
    public class Box<T> {
    private T item;
 
    public void setItem(T item) {
        this.item = item;
    }
 
    public T getItem() {
        return item;
    }
 
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello Generics");
        System.out.println("String Box: " + stringBox.getItem());
 
        Box<Integer> intBox = new Box<>();
        intBox.setItem(123);
        System.out.println("Integer Box: " + intBox.getItem());
    }
    }
    ```
## Generic với Methods
+ Một `method` `generic` cho phép định nghĩa các tham số kiểu riêng biệt, độc lập với `class` chứa nó.
    + `<T>` trước tên `method` cho biết đây là một `method` `generic`.
    + `T` đại diện cho kiểu tham số thực sự được truyền vào khi gọi `method` (`String[]`, `Integer[]`).
    ```java
    public <T> ReturnType methodName(T parameter) {
    // logic
    }
    ```
    ```java
    public class GenericMethodDemo {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
        String[] strArray = {"A", "B", "C"};
        Integer[] intArray = {1, 2, 3};
 
        printArray(strArray); // Output: A B C
        printArray(intArray); // Output: 1 2 3
    }
    }
    ```
 
## Generic với Interfaces
+ `Interfaces generic` cho phép định nghĩa các kiểu dữ liệu sẽ được sử dụng bởi các `class` triển khai `Interfaces`.
    + `Pair<K, V>` là `Interfaces generic` có hai tham số `K (Key)` và `V (Value)`.
    + Khi triển khai `Interfaces`, `class` cụ thể hóa các tham số (e.g., String, Integer).
    ```java
    interface InterfaceName<T> {
    T getValue();
    void setValue(T value);
    }
    ```
    ```java
    public interface Pair<K, V> {
        K getKey();
        V getValue();
    }
 
    public class MyPair<K, V> implements Pair<K, V> {
        private K key;
        private V value;
 
    public MyPair(K key, V value) {
        this.key = key;
        this.value = value;
    }
 
    public K getKey() {
        return key;
    }
 
    public V getValue() {
        return value;
    }
 
    public static void main(String[] args) {
        Pair<String, Integer> pair = new MyPair<>("Age", 25);
        System.out.println("Key: " + pair.getKey());
        System.out.println("Value: " + pair.getValue());
    }
    }
    ```
 
## Generics với Wildcards
+ `Wildcards` được sử dụng khi muốn xử lý các kiểu dữ liệu không xác định rõ ràng.
+ Các loại `Wildcards`:
    + `?` - Đại diện cho một `type` bất kỳ.
 
 
    ```java
    import java.util.List;
 
    public class WildcardDemo {
   
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
 
    public static void main(String[] args) {
            List<String> stringList = List.of("A", "B", "C");
            List<Integer> intList = List.of(1, 2, 3);
 
            printList(stringList); // Output: A B C
            printList(intList);    // Output: 1 2 3
        }
    }
 
    ```
 
    + `?` extends `T` - Đại diện cho các `type` là `T` hoặc con của `T`.
    ```java
    public static void printNumbers(List<? extends Number> list) {
    for (Number n : list) {
        System.out.println(n);
    }
    }
    ```
       
    + `?` super `T` - Đại diện cho các `type` là `T` hoặc cha của `T`.
    ```java
    public static void printNumbers(List<? super Number> list) {
    for (Object n : list) {
        System.out.println(n);
    }
    }
    ```