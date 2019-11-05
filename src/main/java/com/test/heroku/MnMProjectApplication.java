package com.test.heroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RequestMapping( produces = "application/json")
@RestController
public class MnMProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MnMProjectApplication.class, args);
	}
	
	@GetMapping
	public String test(){
		return "Success";
	}

}
