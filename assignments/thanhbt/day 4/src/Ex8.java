package com.udayan.oca;
class Student {
    String name;
    int age;
    Student() {
        this ("James", 25);
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class Ex8 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name + ":" + s.age);
    }// Result: Compilation error
    // Để có kết quả Student ("James", 25), Thay bằng this ("James" , 25) => Result: James:25
}
