package Homework12;

public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("Джейн Остин");
        Author author2 = new Author("Энтони Дорр");

        Book prideAndPrejudice = new Book("Гордость и предубеждение", author1, 1813);
        System.out.println("authorFullName - " + prideAndPrejudice.getAuthor().getAuthorFullName());
        System.out.println("bookTitle - " + prideAndPrejudice.getBookTitle());
        System.out.println("yearOfPublishing - " + prideAndPrejudice.getYearOfPublishing());

        Book allTheLightWeCannotSee = new Book("Весь невидимый нам свет", author2, 2014);
        System.out.println("authorFullName - " + allTheLightWeCannotSee.getAuthor().getAuthorFullName());
        System.out.println("bookTitle - " + allTheLightWeCannotSee.getBookTitle());
        System.out.println("yearOfPublishing - " + allTheLightWeCannotSee.getYearOfPublishing());
        allTheLightWeCannotSee.setYearOfPublishing(2015);
        System.out.println("yearOfPublishing - " + allTheLightWeCannotSee.getYearOfPublishing());
    }
}