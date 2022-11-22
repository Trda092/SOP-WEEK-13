package com.example.bookstoreservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BookStoreServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreServiceApplication.class, args);
	}

	@RequestMapping("/recommended")
	public String toRead(){
		return  "recommended books";
	}
}

