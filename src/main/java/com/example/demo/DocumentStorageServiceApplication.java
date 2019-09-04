package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.document.storage")
public class DocumentStorageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocumentStorageServiceApplication.class, args);
	}

}
