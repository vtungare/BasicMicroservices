package io.viks.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {
	
	@GetMapping("/hello")
	public String sendHello() {
		return "Hello World";
	}
	
	
}
