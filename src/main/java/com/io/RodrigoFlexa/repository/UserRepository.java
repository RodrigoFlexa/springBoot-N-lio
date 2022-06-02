package com.io.RodrigoFlexa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.io.RodrigoFlexa.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
