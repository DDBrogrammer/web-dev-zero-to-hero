package utils;

import entities.Library;

import java.util.Objects;

public class BookValidator {

     static public boolean isValidIsbn(String isbn) {
        boolean isValid = false;
        if (isbn.length() != 13) {
            System.out.println("sai do dai");
            return false;
        }else {
            for (int i = 0; i < Library.books.length; i++) {
                if(Objects.nonNull(Library.books[i])) {
                    if (Library.books[i].getIsbn().equals(isbn)) {
                        System.out.println("isbn da ton tai");
                        break;
                    }
                }
            }
        }
        isValid = true;
        return isValid;

    }

    static public boolean isValidBookQuantity(int bookQuantity) {
        boolean isValid = false;
        if (bookQuantity<=0) {
            System.out.println("so luong sach phai lon hon 0");
            return isValid;
        }else {
        isValid = true;
        }
        return isValid;
    }

    static public boolean isValidNumberOfIsbn(int numberOfIsbn) {
        boolean isValid = false;
        if (numberOfIsbn<=0) {
            System.out.println("so luong dau sach phai lon hon 0");
            return isValid;
        }else {
            isValid = true;
        }
        return isValid;
    }
}
