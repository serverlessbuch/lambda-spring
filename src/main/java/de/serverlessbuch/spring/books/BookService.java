package de.serverlessbuch.spring.books;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Niko Köbler, http://www.n-k.de, @dasniko
 */
@Component
public class BookService {

    private List<Book> books = new ArrayList<>();

    @PostConstruct
    public void init() {
        books.add(new Book("Michael Simons", "Spring Boot 2.0"));
        books.add(new Book("Niko Köbler", "Serverless Computing"));
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Book> addBook(Book book) {
        books.add(book);
        return books;
    }

}
