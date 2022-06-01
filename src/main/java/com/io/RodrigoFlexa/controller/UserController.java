package com.io.RodrigoFlexa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.io.RodrigoFlexa.Service.UserService;
import com.io.RodrigoFlexa.entity.Users;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping()
	public ResponseEntity<List<Users>> findAll(){
		List<Users> listUsers = userService.findAll();
		return ResponseEntity.ok().body(listUsers);	
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Users> findById(@PathVariable Integer id){
		Users ur = userService.findById(id);
		return ResponseEntity.ok().body(ur);
	}
}
