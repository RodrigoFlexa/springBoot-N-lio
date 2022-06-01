package com.io.RodrigoFlexa.configuration;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.io.RodrigoFlexa.entity.Users;
import com.io.RodrigoFlexa.repository.UserRepository;

@Configuration
public class Config implements CommandLineRunner{

	//injeção de dependencias automático do springboot
	@Autowired
	private UserRepository userRepository;
	
	//roda antes da aplicação startar
	@Override
	public void run(String... args) throws Exception {
		Users ur1 = new Users(null,"Rodrigo","Rodrigo@gmail.com","91984054107","123");
		Users ur2 = new Users(null,"Luzitito","luiz@gmail.com","91984054107","123");
		userRepository.saveAll(Arrays.asList(ur1,ur2));
	}
	
}
