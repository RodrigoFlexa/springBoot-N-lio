package com.io.RodrigoFlexa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.io.RodrigoFlexa.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
