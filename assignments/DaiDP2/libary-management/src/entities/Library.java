package entities;

import static constants.Constant.SystemSize.*;

public class Library {

   public static Employee[] employees=new Employee[EMPLOYEE_SIZE];
   public static Reader[] readers=new Reader[READER_SIZE];
   public static Book[] books=new Book[BOOK_SIZE];
   public static BookBorrowTransaction[]bookBorrowTransactions=new BookBorrowTransaction[BOOK_BORROW_SIZE];
}
