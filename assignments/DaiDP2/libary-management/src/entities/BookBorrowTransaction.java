package entities;

import java.util.Date;

public class BookBorrowTransaction {
    private int id;
    private static int baseId;
    private BookBorrowed [] bookBorroweds;
    private Reader reader;
    private Employee employee;
    private Date borrowDate;
    private Date returnDate;
    private boolean isReturned;

    public BookBorrowTransaction(BookBorrowed[] bookBorroweds, Reader reader, Employee employee, Date borrowDate, Date returnDate, boolean isReturned) {
        this.bookBorroweds = bookBorroweds;
        this.reader = reader;
        this.employee = employee;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.isReturned = isReturned;
        this.id = baseId;
        baseId++;
    }

    public int getId() {
        return id;
    }


    public static int getBaseId() {
        return baseId;
    }

    public BookBorrowed[] getBookBorroweds() {
        return bookBorroweds;
    }

    public void setBookBorroweds(BookBorrowed[] bookBorroweds) {
        this.bookBorroweds = bookBorroweds;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }
}
