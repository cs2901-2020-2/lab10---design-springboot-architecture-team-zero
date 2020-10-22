package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.logging.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.example.business", "com.example.controller"})
@EntityScan("com.example.model")
@EnableJpaRepositories("com.example.repositories")
public class ServiceApplication extends SpringBootServletInitializer {
    static final Logger logger = Logger.getLogger(ServiceApplication.class.getName());
    public static void main(String[] args){
        SpringApplication.run(ServiceApplication.class, args);
    }
}
