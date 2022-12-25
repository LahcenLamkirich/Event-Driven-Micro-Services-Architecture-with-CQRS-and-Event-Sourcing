package com.lamkirich.comptecqrseventsourcing;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CompteCqrsEventSourcingApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompteCqrsEventSourcingApplication.class, args);

    }

    @Bean
    CommandLineRunner start(){
        return args -> {
            System.out.println("Hello from the CQRS Application !");
        };
    }
}
