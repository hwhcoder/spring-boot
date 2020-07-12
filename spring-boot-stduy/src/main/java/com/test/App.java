package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

	/**
	 * http://localhost:8080/
	 * @return
	 */
	@RequestMapping("/")
	public String hello() {
		return "hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class);
	}
}
