# Questions
## Bài 1: trả lời các câu hỏi sau
+ Real-world objects contain ___ and ___.
+ A software object's state is stored in ___.
+ A software object's behavior is exposed through ___.
+ Hiding internal data from the outside world, and accessing it only through publicly exposed methods is known as data ___.
+ A blueprint for a software object is called a ___.
+ Common behavior can be defined in a ___ and inherited into a ___ using the ___ keyword.
+ A collection of methods with no implementation is called an ___.
+ A namespace that organizes classes and interfaces by functionality is called a ___.
+ The term API stands for ___?

## Bài 2:
+ Chạy ứng dụng Java qua `terminal` chụp hình terminal vào folder nộp bài

## Bài 3:
+ Tạo 3 `class` mới cho mỗi `object` thực tế mà bạn đã quan sát ở đầu bài học. Tham khảo `class` `Bicycle` nếu bạn quên cú pháp cần thiết.

+ ví dụ
```java
class Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) {
         cadence = newValue;
    }

    void changeGear(int newValue) {
         gear = newValue;
    }

    void speedUp(int increment) {
         speed = speed + increment;   
    }

    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}
```

