package services;

import entities.Book;
import entities.Library;

import java.util.Objects;
import java.util.Optional;

public class BookService {

    static public boolean addBook(String isbn, String title, int quantity) {
        boolean result = false;
        Book book = new Book(isbn, title, quantity);
        // [book, book, null ]
        for (int i = 0; i < Library.books.length; i++) {
            if (Objects.isNull(Library.books[i])) {
                Library.books[i]=book;
                result = true;
                break;
            }
        }
        if (result) {
            System.out.println("them sach moi thanh cong");
           printBookList();
        }else {
            System.out.println("them sach moi that bai");
        }
        return result;
    }

     static public   void  printBookList(){
        for (int i = 0; i < Library.books.length; i++) {
            if (Objects.nonNull(Library.books[i])) {
                System.out.println(Library.books[i]);
            }else {
                break;
            }
        }
    }

    static public boolean deleteBook(String isbn) {
        boolean result = false;
        // gan 1 co o ngoai
        boolean isDeleted = false;
        for (int i = 0; i < Library.books.length; i++) {
            if(Objects.nonNull(Library.books[i])) {
            if (Library.books[i].getIsbn().equals(isbn)) {
                Library.books[i] = null;
                isDeleted = true;
                continue;
            }

            if (isDeleted) {
                Library.books[i-1] = Library.books[i];
            }

            }
        }
        return result;
    }


    public static Optional<Book> getBookByIsnb(String isbn){
        for (int i = 0; i < Library.books.length; i++) {
            if (Objects.nonNull(Library.books[i]) && Library.books[i].getIsbn().equals(isbn)) {
                return Optional.of(Library.books[i]);
            }
        }
        return Optional.empty();
    }

    public static void changeBookQuantity(Book book, boolean isIncrease, int changeQuantity){
        if(isIncrease){
            book.numberOfBook=book.numberOfBook + changeQuantity;
            return;
        }
        book.numberOfBook= book.numberOfBook - changeQuantity;
    }
}
