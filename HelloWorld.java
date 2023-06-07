package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

    @RestController
    public class HelloWorldController {

        @GetMapping("/hello")
        public HelloWorld hello() {
            return new HelloWorld("Hello, world!");
        }
    }

    public class HelloWorld {

        private String message;

        public HelloWorld(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
