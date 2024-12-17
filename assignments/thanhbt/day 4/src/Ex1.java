package com.udayan.oca;
public class Ex1 {
    public static void main(String [] args) {
        int a = 2;
        boolean res = false;
        res = (a++ == 2) || ((--a == 2) && (--a == 2));
        System.out.println(a);
    } //Result: 3
}