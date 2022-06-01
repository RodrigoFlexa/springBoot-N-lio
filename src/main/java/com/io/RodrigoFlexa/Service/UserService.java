package com.io.RodrigoFlexa.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.io.RodrigoFlexa.entity.Users;
import com.io.RodrigoFlexa.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<Users> findAll(){
		return userRepository.findAll();
	}
	
	public Users findById(Integer id) {
		Optional<Users> opUsers = userRepository.findById(id);
		return opUsers.get();
		
	}
}
