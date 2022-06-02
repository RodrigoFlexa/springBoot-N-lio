package com.io.RodrigoFlexa.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.io.RodrigoFlexa.entity.User;
import com.io.RodrigoFlexa.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(Integer id) {
		Optional<User> opUsers = userRepository.findById(id);
		return opUsers.get();
	}
	
	public void save(User user) {
		userRepository.save(user);
	}
	public Integer getCount() {
		return (int) userRepository.count();
	}
}
