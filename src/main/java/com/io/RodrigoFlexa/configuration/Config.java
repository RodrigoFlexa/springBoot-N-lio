package com.io.RodrigoFlexa.configuration;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.io.RodrigoFlexa.entity.Order;
import com.io.RodrigoFlexa.entity.User;
import com.io.RodrigoFlexa.repository.OrderRepository;
import com.io.RodrigoFlexa.repository.UserRepository;

@Configuration
public class Config implements CommandLineRunner{

	//injeção de dependencias automático do springboot
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	//roda antes da aplicação startar
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null,"Rodrigo","Rodrigo@gmail.com","91984054107","123");
		User u2 = new User(null,"Luzitito","luiz@gmail.com","91984054107","123");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
}
