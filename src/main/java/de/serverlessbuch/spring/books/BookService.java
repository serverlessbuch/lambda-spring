package de.serverlessbuch.spring.books;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Niko Köbler, http://www.n-k.de, @dasniko
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class BookService {

    private final BookRepository repository;

    public List<Book> getBooks() {
        return (List<Book>) repository.findAll();
    }

    public Book getBook(String id) {
        return repository.findOne(id);
    }

    public List<Book> deleteBook(String id) {
        repository.delete(id);
        return getBooks();
    }

    public List<Book> addBook(Book book) {
        repository.save(book);
        return getBooks();
    }

}
