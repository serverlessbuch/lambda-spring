package de.serverlessbuch.spring.books;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Niko Köbler, http://www.n-k.de, @dasniko
 */
@Slf4j
@RestController
@RequestMapping("books")
@RequiredArgsConstructor
public class BooksController {

    private final BookService service;

    @GetMapping
    public List<Book> getBooks() {
        return service.getBooks();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable("id") String id) {
        return service.getBook(id);
    }

    @DeleteMapping("/{id}")
    public List<Book> deleteBook(@PathVariable("id") String id) {
        return service.deleteBook(id);
    }

    @PostMapping
    public List<Book> addBook(@RequestBody Book book) {
        return service.addBook(book);
    }

}
