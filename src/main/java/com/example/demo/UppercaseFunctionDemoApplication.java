package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class UppercaseFunctionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(UppercaseFunctionDemoApplication.class, args);
	}

	@Bean
	public Function<String, String> uppercase() {
		return s -> {
			System.out.println("Invoking uppercase using input: " + s);
			return s.toUpperCase();
		};
	}
}
