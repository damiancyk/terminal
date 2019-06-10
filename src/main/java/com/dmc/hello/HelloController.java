package com.dmc.hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping("/hello")
	public ResponseEntity<?> testData() {
		List<Hello> datas = new ArrayList<>();
		datas.add(new Hello(1, "hello1"));
		datas.add(new Hello(2, "hello2"));
		return ResponseEntity.ok(datas);
	}

}
