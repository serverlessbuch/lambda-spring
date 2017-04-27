package de.serverlessbuch.spring.books;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Niko Köbler, http://www.n-k.de, @dasniko
 */
@EnableScan
public interface BookRepository extends CrudRepository<Book, String> {
}
