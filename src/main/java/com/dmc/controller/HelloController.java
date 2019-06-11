package com.dmc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmc.vo.HelloVo;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping("/hello")
	public ResponseEntity<?> testData() {
		List<HelloVo> datas = new ArrayList<>();
		datas.add(new HelloVo(1, "hello1"));
		datas.add(new HelloVo(2, "hello2"));
		return ResponseEntity.ok(datas);
	}

}
