package com.rbtxm.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableJms
@SpringBootApplication
public class SpringDataJpaApplication {
    public static void main(String[] args) {
        SpringApplication.run(
                SpringDataJpaApplication.class, args);
    }

}
