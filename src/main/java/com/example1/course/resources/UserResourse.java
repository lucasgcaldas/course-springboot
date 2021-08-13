package com.example1.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example1.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResourse {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Lucas", "lucas@gmail.com", "993580097", "lucas123");
		return ResponseEntity.ok().body(u);
	}
}
