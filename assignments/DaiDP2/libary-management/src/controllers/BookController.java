package controllers;

import entities.Book;
import entities.BookBorrowed;
import services.BookService;
import utils.BookValidator;
import utils.Helper;

import java.util.Optional;

public class BookController {
    static boolean addBook(){
        boolean result = false;
        int numberOfIsbn = 0;
        do {
            numberOfIsbn  = Helper.getIntInput("Nhap so luong dau sach: ");
        } while (
                !BookValidator.isValidNumberOfIsbn(numberOfIsbn )
        );

        for (int i = 0; i < numberOfIsbn; i++) {
            String isbnInput="";
            String titleInput="";
            int quantityInput=0;
            do {
                isbnInput = Helper.getString("Nhap ISBN: ");
            } while (
                    !BookValidator.isValidIsbn(isbnInput)
            );
            do {
                titleInput = Helper.getString("Nhap ten sach: ");
            } while (
                    titleInput.isEmpty()
            );

            do {
                quantityInput   = Helper.getIntInput("Nhap so luong sach: ");
            } while (
                    ! BookValidator.isValidBookQuantity(quantityInput)
            );

            BookService.addBook(isbnInput, titleInput, quantityInput);
        }
        return result;
    }

   public static void deleteBook(){
        BookService.printBookList();
        boolean result = false;
       String isbn = "";
       do {
           isbn  = Helper.getString("Nhap isbn cua sach");
       } while (
               !BookValidator.isBookExist(isbn)
       );

       do {
           isbn  = Helper.getString("Nhap isbn cua sach");
       } while (
               !BookValidator.isBookExist(isbn)
       );

       if (BookService.deleteBook(isbn)) {
           System.out.println("Book deleted successfully");
           BookService.printBookList();
       }else {
           System.out.println("Something went wrong");
       }

   }
    public static void changeBookQuantity(){
        BookService.printBookList();
        String isbn = "";
        do {
            isbn  = Helper.getString("Nhap isbn cua sach");
        } while (
                !BookValidator.isBookExist(isbn)
        );
        Optional<Book> bookOptional= BookService.getBookByIsnb(isbn);
        Book book = bookOptional.get();
        boolean isIncrease=false;
        int quantity=0;
        do {
         isIncrease = Helper.askYesNo("Ban muon tang hay giam ","T","G");
         quantity = Helper.getIntInput("Nhap so luong: ");
        } while (
                !BookValidator.isChangQuantityValid(quantity,isIncrease,book)
        );
        BookService.changeBookQuantity(book,isIncrease,quantity);

    }
}
