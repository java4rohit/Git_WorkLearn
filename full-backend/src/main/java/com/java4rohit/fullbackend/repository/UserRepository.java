package com.java4rohit.fullbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java4rohit.fullbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {


	User findByAadhaarNumber(Long aadhaarNumber);

	String deleteByAadhaarNumber(Long aadhaarNumber);
}
