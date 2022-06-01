package com.io.RodrigoFlexa.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.io.RodrigoFlexa.entity.Users;

@RestController
@RequestMapping(name = "/users")
public class UserController {
	
	@GetMapping()
	public ResponseEntity<Users> findAll(){
		Users ur = new Users(1,"Rodrigo","Rodrigo@gmail.com","91984054107","123");
		return ResponseEntity.ok().body(ur);	
	}
}
