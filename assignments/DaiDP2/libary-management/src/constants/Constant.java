package constants;

public interface Constant {

    interface SystemSize{
      int EMPLOYEE_SIZE = 20;
      int BOOK_SIZE = 1_000_000;
      int READER_SIZE = 100_000;
      int BOOK_BORROW_SIZE = 100_000;
    }

    interface MainMenuChoice {
        int MANAGE_BOOK = 1;
        int MANAGE_READER = 2;
        int MANAGE_BOOK_BORROW = 3;
    }

    interface BookMenuChoice {
        int ADD_BOOK = 1;
        int CHANGE_BOOK_QUANTITY = 2;
        int DELETE_BOOK = 3;
    }

}
