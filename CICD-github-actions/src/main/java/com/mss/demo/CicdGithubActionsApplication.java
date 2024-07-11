package com.mss.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdGithubActionsApplication {
	@GetMapping("/welcome")
	public String welcome(){

		return "<html><head><style>body { display: flex; justify-content: center; align-items: center; height: 100vh;}</style></head><body><h1 style='color:green; text-align:center;'>WELCOME TO MY <b>DEPLOYMENT <b><br></h1></body></html>";
	}
	public static void main(String[] args) {
		SpringApplication.run(CicdGithubActionsApplication.class, args);
	}

}
