package controllers;

import entities.BookBorrowed;
import services.BookService;
import utils.BookValidator;
import utils.Helper;

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
}
