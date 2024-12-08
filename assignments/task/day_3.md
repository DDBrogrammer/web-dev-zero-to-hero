# I. OCA Java Exam Practice Questions: Operators and Control Flow

### 1. What will be the output of the following code?

```java
int x = 5;
int y = 10;
if (x++ < 5) {
    y += x;
} else if (x < 10) {
    y -= x;
} else {
    y *= x;
}
System.out.println(y);
```

**A.** 5  
**B.** 4  
**C.** -1  
**D.** 40  

---

### 2. Given the following code, what will be the output?

```java
int a = 3, b = 5, c = 7;
int result = (a > b) ? (b > c ? c : b) : (a < c ? a : c);
System.out.println(result);
```

**A.** 3  
**B.** 5  
**C.** 7  
**D.** Compilation error  

---

### 3. What will the following code print?

```java
int i = 0, j = 0;
while (i < 5) {
    i++;
    j += i;
}
System.out.println(j);
```

**A.** 10  
**B.** 15  
**C.** 20  
**D.** 25  

---

### 4. Consider the following `switch` statement. What will be the output?

```java
int day = 3;
String result = "";
switch (day) {
    case 1:
    case 2:
        result += "Weekday";
    case 3:
        result += "Midweek";
    case 4:
    case 5:
        result += "Weekend";
        break;
    default:
        result += "Unknown";
}
System.out.println(result);
```

**A.** `MidweekWeekend`  
**B.** `WeekdayMidweekWeekend`  
**C.** `MidweekUnknown`  
**D.** `WeekdayMidweek`  

---

### 5. What will be the output of the following nested `for` loop?

```java
int count = 0;
for (int i = 0; i < 3; i++) {
    for (int j = 3; j > i; j--) {
        count += i + j;
    }
}
System.out.println(count);
```

**A.** 15  
**B.** 16  
**C.** 18  
**D.** 20  

---

### 6. Given the following code, what will the output be?

```java
int i = 0;
do {
    i += 2;
} while (i < 10);
System.out.println(i);
```

**A.** 10  
**B.** 12  
**C.** 8  
**D.** Compilation error  

---

### 7. What will the following code print?

```java
int x = 0;
for (int i = 0; i < 5; i++) {
    if (i % 2 == 0) continue;
    x += i;
}
System.out.println(x);
```

**A.** 4  
**B.** 5  
**C.** 6  
**D.** 9  

---

### 8. Which of the following loops will produce a `0` value for `result`?

```java
int result = 10;
for (int i = 0; i < 10; i++) {
    if (i % 3 == 0) {
        result -= 3;
        continue;
    }
    if (i == 8) break;
}
System.out.println(result);
```

**A.** 1  
**B.** 3  
**C.** 5  
**D.** 0  

---

### 9. What will the following code output?

```java
int x = 1;
while (x < 100) {
    if (x > 10) break;
    x *= 2;
}
System.out.println(x);
```

**A.** 8  
**B.** 16  
**C.** 32  
**D.** 64  

---

### 10. What will the following code print?

```java
for (int i = 1, j = 0; i <= 5; i++) {
                j += i;
                if (j > 6){
                    System.out.println(j);
                    break;
                }
            }
```

**A.** 6  
**B.** 7  
**C.** 9  
**D.** 10  

# II. Number Classification

## Objective: Write a program to classify an integer based on its properties.

## Description: Create a Java program that accepts an integer from the user and determines if the number is:
+  Positive or negative
+ Even or odd
+ Divisible by 3, 5, or both
+ Print a message for each condition that is true.

## Requirements:
+   Use if-else statements and logical operators.
+   Prompt the user to enter a number.
+   Print appropriate messages, like:
        "The number is positive."
        "The number is odd."
        "The number is divisible by 3 and 5."

```cmd
Enter a number: 15
The number is positive.
The number is odd.
The number is divisible by 3 and 5.
```

# III. Sum and Product of Range

## Objective: Write a program to calculate the sum of all even numbers and the product of all odd numbers within a specified range.

## Description: Ask the user to enter two integers representing a range (start and end). Then:
+ Calculate the sum of all even numbers within this range.
+ Calculate the product of all odd numbers within this range.
+ Print the results separately for the sum of even numbers and the product of odd numbers.

## Requirements:
+ Use a for loop to iterate through the range.
+ Use if conditions to check if a number is even or odd.
+ Print the sum of all even numbers and the product of all odd numbers in the range.

```cmd
Enter the start of the range: 1
Enter the end of the range: 5
Sum of even numbers: 6
Product of odd numbers: 15
```