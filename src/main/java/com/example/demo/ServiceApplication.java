package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class ServiceApplication {
    static final Logger logger = Logger.getLogger(ServiceApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }

}
