package com.example.libraryconsumerapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LibraryConsumerApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryConsumerApiApplication.class, args);
    }

}
