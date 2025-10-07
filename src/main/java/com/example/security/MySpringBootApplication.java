package com.example.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBootApplication {
	public static void main(String[] args) {
		System.out.println("new jwt changes");
		SpringApplication.run(MySpringBootApplication.class, args);
	}
}
