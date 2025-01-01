package utils;

import entities.Book;
import entities.Library;
import services.BookService;

import java.util.Objects;
import java.util.Optional;

public class BookValidator {

     static public boolean  isValidIsbn(String isbn) {
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

    static public boolean isBookExist(String isbn) {
        if (isbn.length() != 13) {
            System.out.println("sai do dai isbn");
            return false;
        }
        Optional<Book> bookOptional = BookService.getBookByIsnb(isbn);
           if (bookOptional.isPresent()) {
                System.out.println("ban dang chon sach: "+ bookOptional.get());
            }else {
               System.out.println("khong tim thay sach ");
           }
        return bookOptional.isPresent();
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

    static public boolean isChangQuantityValid(int bookQuantityToChange, boolean isIncrease, Book bookInLibrary) {
        if (isIncrease) return true;
        if (Objects.nonNull(bookInLibrary) && bookInLibrary.numberOfBook > bookQuantityToChange){
        return true;
        }
        System.out.println("so luong giam phai nho hon so luong sach dang co");
        return false;
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
