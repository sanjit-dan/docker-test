package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {

	@GetMapping("/msg")
	public String getMessage() {
		return "hello sanjit--how are you ?";
	}
}
