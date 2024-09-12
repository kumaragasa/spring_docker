package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class SpringDockerDevApplication {
	
	@GetMapping
	public static String getMessage() {
		return "Hello world...spring boot container...";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerDevApplication.class, args);
		System.out.println(getMessage());
		
	}

}
