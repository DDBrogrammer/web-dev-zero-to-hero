package services;

import entities.Book;
import entities.Library;

import java.util.Objects;

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
}
