# I. OCA Java Exam Practice Questions: Operators and Control Flow , Object and Class

### 1. What will be the result of compiling and executing Test class?

```java
package com.udayan.oca;
 
public class Test {
     public static void main(String [] args) {
         int a = 2;
         boolean res = false;
         res = a++ == 2 || --a == 2 && --a == 2;
         System.out.println(a);
     }
}
```

**A.** 3  
**B.** 2  
**C.** Compilation error  
**D.** 1  



### 2. What will be the result of compiling and executing Test class?

```java
package com.udayan.oca;
 
public class Test {
     public String name;
     public void Test() {
         name = "James";
     }
 
     public static void main(String [] args) {
         Test obj = new Test();
         System.out.println(obj.name);
     }
}
```

**A.** James  
**B.** Compilation error  
**C.** null  
**D.** None of the above
  

---

### 3. What will be the result of compiling and executing Test class?

```java
package com.udayan.oca;
 
public class Test {
    public static void main(String[] args) {
        String[][] arr = { { "7", "6", "5" }, { "4", "3" }, { "2", "1" } };
        for (int i = 0; i < arr.length; i++) { //Line n1
            for (int j = 0; j < arr[i].length; j++) { //Line n2
                switch (arr[i][j]) { //Line n3
                    case "2":
                    case "4":
                    case "6":
                        break; //Line n4
                    default: 
                        continue; //Line n5
                }
                System.out.print(arr[i][j]); //Line n6
            }
        }
    }
}
```

**A.** 7  
**B.** 6  
**C.** 7654321  
**D.** 64  
**E.** 642  
**F.** 753  


### 4. What will be the result of compiling and executing Test class?

```java
package com.udayan.oca;
 
public class Test {
     public static void main(String[] args) {
         String [] arr = new String[7];
         System.out.println(arr);
     }
}
```

**A.** NullPointerException  
**B.** Compilation Error  
**C.** Some String containing @ symbol  
**D.** null  

---

### 5. What will be the result of compiling and executing Test class?

```java
package com.udayan.oca;
 
class Vehicle {
     public int getRegistrationNumber() {
         return 1;
     }
}
 
class Car {
     public int getRegistrationNumber() {
         return 2;
     }
}
 
public class Test {
     public static void main(String[] args) {
         Vehicle obj = new Car();
         System.out.println(obj.getRegistrationNumber());
     }
}
```

**A.** 1  
**B.** Compilation error  
**C.** 2  
**D.** An exception is thrown at runtime  

---

### 6. What will be the result of compiling and executing the Test class?

```java
package com.udayan.oca;
 
public class Test {
     public static void main(String[] args) {
         int grade = 75;
         if(grade > 60)
             System.out.println("Congratulations");
             System.out.println("You passed");
         else
             System.out.println("You failed");
     }
}
```

**A.** Compilation error  
**B.** Congratulations  
**C.** You failed  
**D.**  
Congratulations  
You passed  



### 7. what will be the result of compiling and executing Test class?

```java
package com.udayan.oca;
 
class Message {
    String msg = "Happy New Year!";
    
    public void print() {
        System.out.println(msg);
    }
}
 
public class Test {
    public static void change(Message m) { //Line n5
        m.msg = "Happy Holidays!"; //Line n6
    }
    
    public static void main(String[] args) {
        Message obj = new Message(); //Line n1
        obj.print(); //Line n2
        change(obj); //Line n3
        obj.print(); //Line n4
    }
}
```

**A.**  null null  

**B.** 
null
Happy Holidays!  

**C.** Happy New Year!
Happy Holidays!  

**D.** Happy Holidays!
Happy Holidays!  

---

### 8. what will be the result of compiling and executing Test class?

```java
package com.udayan.oca;
 
class Student {
     String name;
     int age;
 
     Student() {
         Student("James", 25);
     }
 
     Student(String name, int age) {
         this.name = name;
         this.age = age;
     }
}
 
public class Test {
     public static void main(String[] args) {
         Student s = new Student();
         System.out.println(s.name + ":" + s.age);
     }
}
```

**A.** Compilation error  
**B.** null:0  
**C.** An exception is thrown at runtime  
**D.** James:25  

---

### 9. What will be the result of compiling and executing Test class?

```java
package com.udayan.oca;
 
public class Test {
     public static void main(String[] args) {
         String fruit = "mango";
         switch (fruit) {
             case "Apple":
                 System.out.println("APPLE");
             case "Mango":
                 System.out.println("MANGO");
             case "Banana":
                 System.out.println("BANANA");
                 break;
             default:
                 System.out.println("ANY FRUIT WILL DO");
         }
     }
}
```

**A.** MANGO
  
**B.** MANGO
ANY FRUIT WILL DO  
**C.** ANY FRUIT WILL DO  
**D.** MANGO
BANANA


---

### 10. What will the following code print?

```java
package com.udayan.oca;
 
public class Test {
     public static void main(String[] args) {
         int [] arr = {3, 2, 1};
         for(int i : arr) {
             System.out.println(arr[i]);
         }
     }
}
```

**A.** ArrayIndexOutOfBoundsException is thrown at runtime  
**B.** Compilation error  
**C.** 3
2
1  
**D.** 1
2
3 

