package com.dmc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmc.service.UserService;
import com.dmc.vo.UserVo;

@RestController
@RequestMapping(path = "/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping
	public ResponseEntity<?> add(RequestEntity<UserVo> requestEntity) {
		return ResponseEntity.ok(userService.save(requestEntity.getBody()));
	}

	@PutMapping
	public ResponseEntity<?> edit(RequestEntity<UserVo> requestEntity) {
		userService.edit(requestEntity.getBody());
		return ResponseEntity.ok().build();
	}

	@GetMapping
	@RequestMapping(path = "/{id}")
	public ResponseEntity<?> get(@PathVariable("id") Integer id) {
		return ResponseEntity.ok(userService.findById(id));
	}

	@GetMapping
	public ResponseEntity<?> list() {
		return ResponseEntity.ok(userService.findAll());
	}

}