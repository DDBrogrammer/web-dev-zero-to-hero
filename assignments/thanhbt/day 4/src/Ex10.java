package com.udayan.oca;
public class Ex10 {
    public static void main(String[] args) {
        int [] arr = {3, 2, 1};
        for(int i : arr) {
            System.out.println(arr[i]);
        }
    }//Result: ArrayIndexOutOfBoundsException
    // sửa System.out.println(i)
}
