package com.io.RodrigoFlexa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.io.RodrigoFlexa.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
