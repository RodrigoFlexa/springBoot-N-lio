package com.io.RodrigoFlexa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.io.RodrigoFlexa.Service.OrderService;
import com.io.RodrigoFlexa.entity.Order;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping()
	public ResponseEntity<List<Order>> findAll(){
		List<Order> listOrders = orderService.findAll();
		return ResponseEntity.ok().body(listOrders);	
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Integer id){
		Order or = orderService.findById(id);
		return ResponseEntity.ok().body(or);
	}
	
	@GetMapping(value = "/count")
	public ResponseEntity<Integer> getCount(){
		return ResponseEntity.ok().body(orderService.getCount());
	}
}

