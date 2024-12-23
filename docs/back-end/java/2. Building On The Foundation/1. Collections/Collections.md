# Collections
 
## Introduction to Collections
+ `Collection` là một object nhóm nhiều phần tử thành một đơn vị duy nhất. `Collections` được dùng để lưu trữ, truy xuất, thao tác và giao tiếp dữ liệu tổng hợp.
### What Is a Collections Framework?
+ https://topdev.vn/blog/framework-la-gi-su-khac-biet-giua-framework-va-library/
+ `Library` (thư viện) trong lập trình là một tập hợp các hàm, phương thức hoặc đoạn mã được xây dựng sẵn, nhằm thực hiện các nhiệm vụ cụ thể và có thể được tái sử dụng trong nhiều ứng dụng khác nhau.
+ `Framework` là các đoạn code đã được viết sẵn, cấu thành nên một bộ khung và các thư viện lập trình được đóng gói. Chúng cung cấp các tính năng có sẵn như mô hình, API và các yếu tố khác để tối giản cho việc phát triển các ứng dụng web phong phú, năng động. Các `framework` giống như là chúng ta có khung nhà được làm sẵn nền móng cơ bản, lập trình viên chỉ cần vào xây dựng và nội thất theo ý mình.
 
+ `Collections Framework` là một kiến trúc thống nhất để biểu diễn và thao tác với `collections`. Tất cả các `collections frameworks` đều bao gồm:
    + `Interfaces`: Đây là các kiểu dữ liệu trừu tượng đại diện cho `collections`. `Interfaces` cho phép thao tác với `collections` một cách độc lập với chi tiết triển khai của chúng. Trong các ngôn ngữ hướng đối tượng, `interfaces `thường tạo thành một hệ thống phân cấp.
    + `Implementations`: Đây là các triển khai cụ thể của `collection interfaces`. Về cơ bản, chúng là các cấu trúc dữ liệu có thể tái sử dụng.
    + `Algorithms`: Đây là các `methods` thực hiện các tính toán hữu ích, như tìm kiếm và sắp xếp, trên các `objects` triển khai `collection interfaces`. Các `algorithms` có tính chất đa hình (`polymorphic`): nghĩa là cùng một `method` có thể được triển khai theo nhiều cách khác nhau khi implement chung một
     `collection interfaces`.
 
### Benefits of the Java Collections Framework
+ Giảm `effort code`: Cung cấp các cấu trúc dữ liệu và `algorithms` hữu ích, giúp nhà phát triển tập trung vào các phần quan trọng của phần mềm mà không cần lo lắng về các chi tiết kỹ thuật phức tạp.
+ Tăng tốc độ và chất lượng phần mềm:
    + Cung cấp các triển khai hiệu năng cao, chất lượng cao cho cấu trúc dữ liệu và algorithms.
    + Các triển khai khác nhau của mỗi `interface` có thể thay thế lẫn nhau, giúp dễ dàng điều chỉnh chương trình bằng cách đổi `collection implementations`.
+ Dễ dàng sử dụng và tái sử dụng
 
## Interfaces
+ Các `core` `collection interfaces` bao gồm các loại `collections` khác nhau, Các `interfaces` này cho phép thao tác với các `collections` một cách độc lập với các triển khai của chúng
+ `Core collection interfaces` là nền tảng của `Java Collections Framework`,
+ `Core collection interfaces` tạo thành 1 hệ thống phân cấp bắt đầu với 2  `interface` chính là `Collection` và `Map`
    + `Collection`: gốc của hệ thống phân cấp `collections`. Một `Collection` đại diện cho một nhóm `objects`, những `object` này được gọi là các phần tử của `Collection`
        + `Set`: một `collection` không thể chứa các phần tử trùng lặp
            + `SortedSet`: một `Set` duy trì các phần tử của nó theo thứ tự tăng dần
        + `List`: một `indexed collection` (đôi khi được gọi là một dãy). `Lists` có thể chứa các phần tử trùng lặp. Một `List` có quyền kiểm soát chính xác vị trí trong danh sách mà mỗi phần tử được chèn vào và có thể truy cập các phần tử bằng chỉ số (vị trí - `index`)  của chúng.
        + `Queue`: một `collection` được sử dụng để giữ nhiều `elements` trước khi xử lý. Bên cạnh các thao tác cơ bản của `Collection`, một `Queue` cung cấp thêm các thao tác chèn, trích xuất và kiểm tra. `Queues` thường, nhưng không nhất thiết, sắp xếp các phần tử theo kiểu `FIFO (first-in, first-out)`. Các ngoại lệ bao gồm `priority queues`, sắp xếp các phần tử theo một `comparator` được cung cấp hoặc thứ tự tự nhiên của các phần tử.
        + `Deque`: một `collection` được sử dụng để giữ nhiều `elements` trước khi xử lý. Bên cạnh các thao tác cơ bản của `Collection`, một `Deque` cung cấp thêm các thao tác chèn, trích xuất và kiểm tra ở cả hai đầu.
    + `Map`: một `object` ánh xạ các `key`s tới các `values`. Một `Map` không thể chứa các `keys` trùng lặp; mỗi `key` có thể ánh xạ tối đa một `value`.
        + `SortedMap`: một `Map` duy trì các ánh xạ của nó theo thứ tự `key` tăng dần.
### The Collection Interface
+ Một `Collection` đại diện cho một nhóm các `object`. `Interface Collection` được sử dụng để truyền các `Collection object` với mức tổng quát tối đa
+ `Collection` có thể khởi tạo chuyển đổi với tất cả các `sub class` và `interface` của nó
    ```java
    Collection<String> collections = new ArrayList<String>(c);
    collections = new ArrayList<>(c);
    collections = new LinkedList<>();
    ```
+ `Interface Collection` chứa các `method`
    + thực hiện các thao tác cơ bản:
        + int size(): trả về số lượng phần tử đang chứa
        + boolean isEmpty(): `collection` hiện tại có rỗng hay không
        + boolean contains(Object element): `collection` có chứa phần tử này (Object element) không
        + boolean add(E element): thêm mới phần tử `E element` vào `collection`
        + boolean remove(Object element): loại bỏ phần tử `E element` khỏi `collection`
        + Iterator<E> iterator(): tạo 1 `Iterator`

    + `method` hoạt động trên toàn bộ `Collection`: 
        + boolean containsAll(Collection<?> c): kiểm tra `collection` hiện tại có chứa `collection` c không
        + boolean addAll(Collection<? extends E> c): thêm phần toàn bộ phần tử từ `collection` khác vào `collection` hiện tại 
        + boolean removeAll(Collection<?> c): loại bỏ toàn bộ các phần tử có trong `collection` c ở `collection` hiện tại 
        + boolean retainAll(Collection<?> c): loại bỏ toàn bộ các phần tử không có trong `collection` c ở `collection` hiện tại
        + void clear(): xóa toàn bộ phần tử trong `collection` hiện tại
        + Object[] toArray(): lấy ra 1 mảng từ `collection` hiện tại
    
    + lấy ra các `stream` từ `collection` hiện tại: 
        + Stream<E> stream()
        + Stream<E> parallelStream()

+ Như vậy `Collection` cung cấp nhiều chức năng hỗ trợ để làm việc trên 1 nhóm các `Object` bao gồm:
    + Xác định số lượng phần tử trong `Collection` (`size`, `isEmpty`).
    + Kiểm tra xem một object cụ thể có nằm trong `Collection` không (`contains`).
    + Thêm và xóa một phần tử khỏi `Collection` (`add`, `remove`).
    + Cung cấp một `Iterator` để duyệt qua `Collection` (`iterator`).

##### Traversing Collections
+ Có 3 cách duyệt qua 1 `Collection`:
    + `Aggregate Operations`: tạo 1 `stream` và thực hiện các `aggregate operations` trên `stream` đó. Thường được dùng với `lamda`
    ```java
        myShapesCollection.stream()
        .filter(e -> e.getColor() == Color.RED)
        .forEach(e -> System.out.println(e.getName()));

        myShapesCollection.parallelStream()
        .filter(e -> e.getColor() == Color.RED)
        .forEach(e -> System.out.println(e.getName()));

    ```
    + `for-each Construct`: duyệt qua `Collection` hoặc `array` một cách ngắn gọn bằng vòng lặp `for`
    ```java
        for (Object o : collection)
            System.out.println(o);
    ```
    + `Iterators`: duyệt qua một `Collection` và xóa các phần tử một cách chọn lọc nếu cần
    ```java
        static void filter(Collection<?> c) {
        for (Iterator<?> it = c.iterator(); it.hasNext(); )
            if (!cond(it.next()))
            it.remove();
            }
    ```
#### The Set Interface
#### The List Interface
#### The Queue Interface
#### The Deque Interface
 
### The Map Interface
### Object Ordering
### The SortedSet Interface
### The SortedMap Interface
 
## Aggregate Operations
### Reduction
### Parallelism
 
## Implementations
## Algorithms
## Custom Collection Implementations
## Interoperability