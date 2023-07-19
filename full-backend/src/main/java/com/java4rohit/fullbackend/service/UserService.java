package com.java4rohit.fullbackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java4rohit.fullbackend.model.User;

@Service
public interface UserService {

	public User saveUser(User user);

	public User getUser(Long aadhaarNumber);
	User getUserById(Long id);


	public List<User> getAllUsers();

	String saveListUsers(List<User> user);

	User updateUserByAadhaarNumber(User user, Long aadhaarNumber);

	String deleteByAadhaarNumber(Long aadhaarNumber);

	String deleteById(long id);

	User updateUserById(User user, Long id);

	List<User>  saveListUsersTEST(List<User> user);
}
