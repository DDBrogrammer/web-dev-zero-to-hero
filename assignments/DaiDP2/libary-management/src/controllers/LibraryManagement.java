package controllers;

import constants.Constant;
import services.BookService;
import utils.Helper;

public class LibraryManagement {
    public static void run(){
        Helper.printAppMenu();
        int userChoice=Helper.getIntInput("Nhập lựa chọn của bạn:",1,5);
        switch(userChoice){
            case Constant.MainMenuChoice.MANAGE_BOOK:
                BookService.printBookList();
                Helper.printManageBookMenu();
                int manageBookChoice = Helper.getIntInput("Nhập lựa chọn của bạn:",1,4);
                switch(manageBookChoice) {
                    case Constant.BookMenuChoice.ADD_BOOK:
                        BookController.addBook();
                        break;
                    case Constant.BookMenuChoice.CHANGE_BOOK_QUANTITY:
                        BookController.changeBookQuantity();
                        break;
                    case Constant.BookMenuChoice.DELETE_BOOK:
                        BookController.deleteBook();
                        break;
                    default:
                            break;
                }

                break;

        }
    }

}
