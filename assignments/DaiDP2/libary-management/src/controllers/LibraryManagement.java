package controllers;

import constants.Constant;
import utils.Helper;

public class LibraryManagement {
    public static void run(){
        Helper.printAppMenu();
        int userChoice=Helper.getIntInput("Nhập lựa chọn của bạn:",1,5);
        System.out.println(userChoice);
        switch(userChoice){
            case Constant.MenuChoice.MANAGE_BOOK:
                BookController.addBook();

        }
    }

}
