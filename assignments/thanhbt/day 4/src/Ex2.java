package com.udayan.oca;
public class Ex2 {
    public String name;
    public void Ex2() {
        name = "James";
    }
    public static void main(String[] args) {
        Ex2 obj = new Ex2();
        System.out.println(obj.name);
    }//Result: null (name là string, void kiểu giá trị không trả về)
}
