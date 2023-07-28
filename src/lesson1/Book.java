package lesson1;

import java.util.Objects;

public class Book {
    private String title;
    private int dateOfPublication;
    private Author author;

    public Book(String title, int dateOfPublication, Author author) {
        this.title = title;
        this.dateOfPublication = dateOfPublication;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getDateOfPublication() {
        return dateOfPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public void setDateOfPublication(int dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", dateOfPublication=" + dateOfPublication +
                ", author=" + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getDateOfPublication() == book.getDateOfPublication() && Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getDateOfPublication(), getAuthor());
    }
}
