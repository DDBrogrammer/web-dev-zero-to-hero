package entities;

public class BookBorrowed {
   private Book book;
   private int numberOfBorrowed;

    public BookBorrowed(Book book, int numberOfBorrowed) {
        this.book = book;
        this.numberOfBorrowed = numberOfBorrowed;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getNumberOfBorrowed() {
        return numberOfBorrowed;
    }

    public void setNumberOfBorrowed(int numberOfBorrowed) {
        this.numberOfBorrowed = numberOfBorrowed;
    }
}
