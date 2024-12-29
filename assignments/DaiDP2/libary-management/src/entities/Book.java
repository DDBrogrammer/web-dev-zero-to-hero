package entities;

public class Book {
    private int id;
    private static int baseId =0;
    public int numberOfBook;
    private int publicYear;
    private String title;
    private String authorName;
    private String isbn;

    public int getId() {
        return id;
    }

    public static int getBaseId() {
        return baseId;
    }


    public int getNumberOfBook() {
        return numberOfBook;
    }

    public void setNumberOfBook(int numberOfBook) {
        this.numberOfBook = numberOfBook;
    }

    public int getPublicYear() {
        return publicYear;
    }

    public void setPublicYear(int publicYear) {
        this.publicYear = publicYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Book(int numberOfBook, int publicYear, String title, String authorName, String isbn) {
        this.numberOfBook = numberOfBook;
        this.publicYear = publicYear;
        this.title = title;
        this.authorName = authorName;
        this.isbn = isbn;
        this.id = baseId;
        baseId++;
    }
    public Book() {
        this.id = baseId;
        baseId++;
    }

    public Book( String isbn, String title,int numberOfBook ) {
        this.numberOfBook = numberOfBook;
        this.title = title;
        this.isbn = isbn;
        this.id = baseId;
        baseId++;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", numberOfBook=" + numberOfBook +
                ", publicYear=" + publicYear +
                ", title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
