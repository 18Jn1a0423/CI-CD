package com.mss.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class CicdGithubActionsApplication {
	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to deployement!";
	}
	public static void main(String[] args) {
		SpringApplication.run(CicdGithubActionsApplication.class, args);
	}

}
