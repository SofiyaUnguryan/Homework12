package Homework12;

import java.util.Objects;

public class Book {
    private final String bookTitle;
    private final Author author;
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

    @Override
    public String toString() {
        return author + ", " + yearOfPublishing + " - " + bookTitle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(author);
    }
    @Override
    public boolean equals (Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return author.equals(book.author);
    }
}
