package com.example.Demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/helloWorld")
public class HelloWorldResource {

	@GetMapping("/home")
	public String home() {
		return "PROJETO MAVEN (SPRING INITIALIZR) CRIADO COM SUCESSO !!! ";

	}
}
