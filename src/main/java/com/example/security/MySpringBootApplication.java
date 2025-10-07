package com.example.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBootApplication {
	public static void main(String[] args) {
<<<<<<< Updated upstream
		System.out.println("new jwt changes");		
=======
		System.out.println("new jwt changes");
		System.out.println("change from localgit");
>>>>>>> Stashed changes
		SpringApplication.run(MySpringBootApplication.class, args);
	}
}
