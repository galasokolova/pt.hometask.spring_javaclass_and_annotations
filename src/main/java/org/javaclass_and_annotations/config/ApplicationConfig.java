package org.javaclass_and_annotations.config;

import org.javaclass_and_annotations.entities.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ComponentScan("org.javaclass_and_annotations")
public class ApplicationConfig {

    @Bean
    Map<Long, User> getUserMap(){

        return Map.of(
                1L, new User("Jessica", "1234" ),
                2L, new User("Sophia", "4321")
        );
    }
}
