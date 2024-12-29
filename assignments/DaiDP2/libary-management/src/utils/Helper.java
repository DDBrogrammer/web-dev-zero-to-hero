package utils;

import java.util.Scanner;

public class Helper {

    public static void printAppMenu() {
        System.out.println("Nhập lựa chọn:\n"
                + "[1] Quản lý sách.\n"
                + "[2] Quản lý người đọc.\n"
                + "[3] Quản lý mượn sách.\n"
                + "[4] Tìm kiếm danh sách mượn theo tên.\n"
                + "[5] Thoát chương  trình." );
    }


    public static  int getIntInput(String ask) {
        if( ask == null){
            ask = "";
        }
        boolean isAskAgain=true;
        int userInput=0;
        while(isAskAgain) {
            try {
            Scanner sc = new Scanner(System.in);
            System.out.println(ask);
            userInput = sc.nextInt();
            isAskAgain=false;
        }catch(Exception e ) {
            System.out.println("Bạn phải nhập một số nguyên");
        }
        }
        return userInput;
    }

    public static  int getIntInput(String ask, int min, int max) {
        if( ask == null){
            ask = "";
        }
        boolean isAskAgain=true;
        int userInput=0;
        while(isAskAgain) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println(ask);
                userInput = sc.nextInt();
                if (userInput >= min && userInput <= max) {
                isAskAgain=false;
                }else {
                    System.out.println("Số nguyên phải trong khoảng: "+min +" -> "+max);
                }
            }catch(Exception e ) {
                System.out.println("Bạn phải nhập một số nguyên");
            }
        }
        return userInput;
    }

    public static String getString(String ask) {
        boolean isAskAgain=true;
        String userStringInput="";
        while(isAskAgain) {try {
            Scanner sc = new Scanner(System.in);
            System.out.println(ask);
            userStringInput = sc.nextLine();
            isAskAgain=false;
        }
        catch(Exception e ) {
            System.out.println("Bạn phải nhập một đoạn văn bản");
        }

        }
        return userStringInput;
    }

    public  static  double getDouble(String ask) {
        boolean run=true;
        double doubleInput=0.0;
        while(run==true) {try {
            Scanner sc = new Scanner(System.in);
            System.out.println(ask);
            doubleInput = sc.nextDouble();
            run=false;
        }
        catch(Exception e ) {
            System.out.println("Bạn phải nhập một chữ số thập phân");
        }

        }
        return doubleInput;
    }

    public static  boolean askYesNo() {
        boolean isOk=false;
        boolean isRunAgain=true;
        String userAnswer="";
        while(isRunAgain) {
            try {
                userAnswer = getString("Bạn có muốn dùng tiếp chức năng khác không \n" +
                        "[C]  có\n" +
                        "[K]  không\n" +
                        "Chọn một trong 2 lựa chọn: "); }catch (Exception e) {
                userAnswer = getString("Bạn phải nhập [C] hoặc [K].");
            }
            if(userAnswer.toUpperCase().equals("C")) {
                isOk=true;
                isRunAgain=false;
            }else if(userAnswer.toUpperCase().equals("K")) {
                isOk=false;
                isRunAgain=false;
            }else {
                isRunAgain=true;
            }
        }
        return isOk;

    }
}
