package com.java4rohit.fullbackend.repository;

import com.java4rohit.fullbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


	User findByAadhaarNumber(Long aadhaarNumber);

	String deleteByAadhaarNumber(Long aadhaarNumber);
}
