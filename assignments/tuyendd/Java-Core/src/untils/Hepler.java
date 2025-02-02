package untils;

// import controller.ProductController;

import entities.Product;

import java.util.Scanner;

public class Hepler {


    public static void printAppMenu() {
        System.out.println("Nhập lựa chọn:\n"
                + "[1] Quản lý sản phẩm \n"
                + "[2] Quản lý khách hàng \n"
                + "[3] Quản lý nhân viên \n"
                + "[4] Quản lý hóa đơn \n"
                + "[5] Thoát chương  trình.");

    }

    public static void printManageProductMenu() {
        System.out.println("Nhập lựa chọn:\n"
                + "[1] Thêm sản phẩm \n"
                + "[2] Xóa sản phẩm \n"
                + "[3] Xem thông tin sản phẩm \n"
                + "[4] Cập nhật số lượng tồn kho ");
    }

    public static void printManageCustomerMenu() {
        System.out.println("Nhập lựa chọn:\n"
                + "[1] Đăng kí khách hàng \n"
                + "[2] Xóa khách hàng \n"
                + "[3] Thêm sản phẩm vào giỏ hàng \n"
                + "[4] Hiện thị giỏ hàng .");

    }

    public static void printManageEmployeeMenu() {
        System.out.println("Nhập lựa chọn:\n"
                + "[1] Thêm nhân viên \n"
                + "[2] Xóa nhân viên  \n"
                + "[3] Hiện thị khách hàng sử lý hóa đơn \n"
                + "[4] Thêm nhân viên sử lý hóa đơn  ");
    }

    public static void printManageVoiceMenu() {
        System.out.println("Nhập lựa chọn:\n"
                + "[1] Thêm hóa đơn \n"
                + "[2] Xóa hóa đơn  \n"
                + "[3] Tìm kiếm hóa đơn  \n"
                + "[4] Quay lai menu chinh"
        );
    }


    public static int getIntInput(String ask, int min, int max) {
        if (ask == null) {
            ask = "";
        }
        boolean isAskAgain = true;
        int userInput = 0;
        while (isAskAgain) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println(ask);
                userInput = sc.nextInt();
                if (userInput >= min && userInput <= max) {
                    isAskAgain = false;
                } else {
                    System.out.println("Số nguyên phải trong khoảng: " + min + " -> " + max);
                }
            } catch (Exception e) {
                System.out.println("Bạn phải nhập một số nguyên");
            }
        }
        return userInput;
    }

    public static int getIntInput(String ask) {
        if (ask == null) {
            ask = "";
        }
        boolean isAskAgain = true;
        int userInput = 0;
        while (isAskAgain) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println(ask);
                userInput = sc.nextInt();
                isAskAgain = false;
            } catch (Exception e) {
                System.out.println("Bạn phải nhập một số nguyên");
            }
        }
        return userInput;
    }

    public static String getString(String ask) {
        boolean isAskAgain = true;
        String userStringInput = "";
        while (isAskAgain) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println(ask);
                userStringInput = sc.nextLine();
                isAskAgain = false;
            } catch (Exception e) {
                System.out.println("Bạn phải nhập một đoạn văn bản");
            }

        }
        return userStringInput;
    }
    public static boolean askYesNo( String ask  ) {
        boolean ok=false;
        boolean runAgain=true;
        String ans="";
        while(runAgain==true) {
            try {
                ans = getString("Bạn có muốn dùng tiếp chức năng khác không \n" +
                        "[C]  có\n" +
                        "[K]  không\n" +
                        "Chọn một trong 2 lựa chọn: "); }catch (Exception e) {
                // TODO: handle exceptions
                ans = getString("Bạn phải nhập [C] hoặc [K].");
            }
            if(ans.toUpperCase().equals("C")) {
                ok=true;
                runAgain=false;
            }else if(ans.toUpperCase().equals("K")) {
                ok=false;
                runAgain=false;
            }else {
                runAgain=true;
            }


        }
        return ok;

    }



}



