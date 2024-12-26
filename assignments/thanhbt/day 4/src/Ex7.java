package com.udayan.oca;
class Message {
    String msg = "Happy New Year!";
    public void print() {
        System.out.println(msg);
    }
}
public class Ex7 {
    public static void change(Message m) {
        m.msg = "Happy Holidays!";
    }
    public static void main(String[] args) {
        Message obj = new Message();
        obj.print();
        change(obj);
        obj.print();
    }//Result: Happy New Year!
    // Happy Holidays!
}
