package lesson1;

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
}
