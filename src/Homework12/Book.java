package Homework12;

public class Book {
    private String bookTitle;
    private Author author;
    private int yearOfPublishing;

    public Book(String bookTitle, Author author, int yearOfPublishing) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublishing() {
        return this.yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
}
