package org.sece.personalspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonalSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonalSpringBootApplication.class, args);
    }

    private String privateMethod() {
        return "This is a private method";
    }
}
