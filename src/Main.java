import lesson1.Author;
import lesson1.Book;

public class Main {
    public static void main(String[] args) {

        System.out.println("Lesson1");
        Author ivanIvanov = new Author("Иван", "Иванов");
        Author vasilijVasiliev = new Author("Василий", "Васильев");
        Book azbuka = new Book("Азбука", 1986, ivanIvanov);
        Book matematika = new Book("Математика", 2002, vasilijVasiliev);
        matematika.setDateOfPublication(2006);
        System.out.println(azbuka.getAuthor().getName());

    }
}