package com.io.RodrigoFlexa.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.io.RodrigoFlexa.Entity.User;

@RestController
@RequestMapping(name = "/users")
public class UserController {
	
	@GetMapping()
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Rodrigo","Rodrigo@gmail","91984054107","12345");
		return ResponseEntity.ok().body(u);	
	}
}
