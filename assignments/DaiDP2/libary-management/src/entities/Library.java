package entities;

import static constants.Constant.SystemSize.*;

public class Library {

   public static Employee[] employees=new Employee[EMPLOYEE_SIZE];
   public static Reader[] readers=new Reader[READER_SIZE];
   public static Book[] books=new Book[BOOK_SIZE];
   public static BookBorrowTransaction[]bookBorrowTransactions=new BookBorrowTransaction[BOOK_BORROW_SIZE];

   static {
      Book book1=new Book(10,2020,"Conan 1","ABC","1234567890001");
      Book book2=new Book(10,2020,"Conan 2","ABC","1234567890002");
      Book book3=new Book(10,2020,"Conan 3","ABC","1234567890003");
      Book book4=new Book(10,2020,"Conan 4","ABC","1234567890004");
      books[0]=book1;
      books[1]=book2;
      books[2]=book3;
      books[3]=book4;
   }
}
