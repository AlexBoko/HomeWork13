package pro.sky.java.course1.Hw13;

import java.util.Objects;
public class Book {
    private final String bookName;
    private final Author author;
    private int publishYear;

    public Book(String bookName, Author author, int publishYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public String setPublishYear() { this.publishYear = publishYear;
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishYear == book.publishYear && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, publishYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\"' +
                ", author=" + author +
                ", publishYear " + publishYear +
                '}';
    }

    public boolean setPublishYear(int i) {
        return false;
    }

}









