package de.serverlessbuch.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Niko Köbler, http://www.n-k.de, @dasniko
 */
@EnableWebMvc
@Configuration
@ComponentScan("de.serverlessbuch.spring")
public class SpringAppConfig {
}
