package de.serverlessbuch.spring.books;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Niko Köbler, http://www.n-k.de, @dasniko
 */
@RestController
@RequestMapping("books")
@RequiredArgsConstructor
public class BooksController {

    private final BookService service;

    @GetMapping
    public List<Book> getBooks() {
        return service.getBooks();
    }

    @PostMapping
    public List<Book> addBook(@RequestBody Book book) {
        return service.addBook(book);
    }

}
