package de.serverlessbuch.spring;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Niko Köbler, http://www.n-k.de, @dasniko
 */
@EnableWebMvc
@Configuration
@EnableDynamoDBRepositories
@ComponentScan("de.serverlessbuch.spring")
public class SpringAppConfig {

    @Bean
    public AmazonDynamoDB amazonDynamoDB() {
        return AmazonDynamoDBClient.builder().withRegion(Regions.EU_CENTRAL_1).build();
    }
}
