package de.serverlessbuch.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Niko Köbler, http://www.n-k.de, @dasniko
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping
    public String sayHello() {
        return "Hello Spring from AWS Lambda!";
    }

}
