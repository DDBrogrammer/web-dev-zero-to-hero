package helper;

import java.util.Scanner;

public class Helper {
    public  void printMenu() {
        System.out.println("Nhập lựa chọn:\n"
                + "[1] Quản lý sản phẩm\n"
                + "[2] Quản lý khách hàng.\n"
                + "[3] Quản lý nhân viên.\n"
                + "[4] Quản lý hóa đơn.\n"
                + "[5] Tìm kiếm danh sách mượn theo tên.\n"
                + "[6] Thoát chương  trình." );

    }

    public  int getInt(String ask) {
        boolean run=true;
        int a=0;
        while(run==true) {try {
            Scanner sc = new Scanner(System.in);
            System.out.println(ask);
            a = sc.nextInt();
            run=false;

        }catch(Exception e ) {
            System.out.println("Bạn phải nhập một số nguyên");
        }

        }

        return (int)a;
    }

    public  String getString(String ask) {
        boolean run=true;
        String s="";
        while(run==true) {try {
            Scanner sc = new Scanner(System.in);
            System.out.println(ask);
            s = sc.nextLine();
            run=false;
        }
        catch(Exception e ) {
            System.out.println("Bạn phải nhập một đoạn văn bản");
        }

        }
        return s;
    }

    public  Double getDouble(String ask) {
        boolean run=true;
        Double d=0.0;
        while(run==true) {try {
            Scanner sc = new Scanner(System.in);
            System.out.println(ask);
            d = sc.nextDouble();
            run=false;
        }
        catch(Exception e ) {
            System.out.println("Bạn phải nhập một chữ số thập phân");
        }

        }
        return (Double)d;
    }

    public  boolean askYesNo() {
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
