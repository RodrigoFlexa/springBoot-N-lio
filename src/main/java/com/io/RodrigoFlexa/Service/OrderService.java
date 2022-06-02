package com.io.RodrigoFlexa.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.io.RodrigoFlexa.entity.Order;
import com.io.RodrigoFlexa.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public Order findById(Integer id) {
		Optional<Order> opOrders = orderRepository.findById(id);
		return opOrders.get();
	}
	
	public void save(Order order) {
		orderRepository.save(order);
	}
	public Integer getCount() {
		return (int) orderRepository.count();
	}
}
