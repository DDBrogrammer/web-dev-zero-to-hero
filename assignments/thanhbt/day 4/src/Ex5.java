package com.udayan.oca;
class Vehicle {
    public int getRegistrationNumber() {
        return 1;
    }
}
class Car extends Vehicle {
    public int getRegistrationNumber() {
        return 2;
    }
}
public class Ex5 {
    public static void main(String[] args) {
        Vehicle obj = new Car(); // Class Car được kế thừa Class Vehicle
        System.out.println(obj.getRegistrationNumber());
    }//Result: 2
}