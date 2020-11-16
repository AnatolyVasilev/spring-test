package spring.aspect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.aspect.domain.Book;
import spring.aspect.domain.Library;

public class ApplicationAspect {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Library library = context.getBean("library", Library.class);

        Book book1 = context.getBean("book", Book.class);
        book1.setName("Book1");
        book1.setYear("1789");
        book1.setAuthor("Author1");
        library.addBook(book1);

        Book book2 = context.getBean("book", Book.class);
        book2.setName("Book2");
        book2.setYear("1989");
        book2.setAuthor("Author2");
        library.addBook(book2);

        Book book3 = context.getBean("book", Book.class);
        book3.setName("Book3");
        book3.setYear("2020");
        book3.setAuthor("Author3");
        library.addBook(book3);

        context.close();
    }
}
