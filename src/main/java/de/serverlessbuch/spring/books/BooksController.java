package de.serverlessbuch.spring.books;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(method = RequestMethod.GET)
    public List<Book> getBooks() {
        return service.getBooks();
    }

    @RequestMapping(method = RequestMethod.POST)
    public List<Book> addBook(@RequestBody Book book) {
        return service.addBook(book);
    }

}
