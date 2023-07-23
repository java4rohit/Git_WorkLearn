package com.java4rohit.fullbackend.controller;

import com.java4rohit.fullbackend.model.User;

import com.java4rohit.fullbackend.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
@CrossOrigin("http://localhost:3000")
public class UserController {

	@Autowired
	private UserService userService;

	/*
	Save the  User.
	 */
	@PostMapping(value = "/saveUser", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		User userSave = userService.saveUser(user);
		return new ResponseEntity<User>(userSave != null ? HttpStatus.OK : HttpStatus.NO_CONTENT);

	}
	/*
	Save the List of User.
	 */
	@PostMapping(value = "/saveListUsers", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<User> > saveListUsers(@RequestBody List<User> user) {
		List<User>  userSave = userService.saveListUsersTEST(user);
		return new ResponseEntity<List<User> >(userSave != null ? HttpStatus.OK : HttpStatus.NO_CONTENT);

	}
	/*
	GET the List of User.
	 */
	@GetMapping(value = "/getAllUsers", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<User>> getUsers() {
		List<User> list = userService.getAllUsers();
		return new ResponseEntity<List<User>>(list, list.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);

	}
	/*
	GET the  of User BY Aadhaar card No.
	 */
	@GetMapping(value = "/getUser/{aadhaarNumber}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getUserByAadhaarNumber(@PathVariable("aadhaarNumber") Long aadhaarNumber) {
		User user = userService.getUser(aadhaarNumber);
		return new ResponseEntity<>(user, HttpStatus.OK);

	}

	@PutMapping(value = "/updateUser/{aadhaarNumber}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> updateUserByAadhaarNumber(@RequestBody User user,@PathVariable("aadhaarNumber") Long aadhaarNumber) {
		user = userService.updateUserByAadhaarNumber(user,aadhaarNumber);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@GetMapping(value = "/getUserByID/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
		User user = userService.getUserById(id);
		return new ResponseEntity<>(user, HttpStatus.OK);

	}

	@PutMapping(value = "/updateUserById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> updateUserById(@RequestBody User user,@PathVariable("id") Long id) {
		user = userService.updateUserById(user,id);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@DeleteMapping(value = "/deleteUserBYAadhaar/{aadhaarNumber}")
	public ResponseEntity<String> deleteByAadhaarNumber(@PathVariable("aadhaarNumber") Long aadhaarNumber) {
		System.out.println("Enter in delete ");
		String mgs = userService.deleteByAadhaarNumber(aadhaarNumber);
		return new ResponseEntity<String>(mgs,HttpStatus.OK);
	}
	@DeleteMapping(value = "/deleteUserByID/{id}")
	public ResponseEntity<String> deleteUserById(@PathVariable("id") Long id) {
		System.out.println("Enter in delete ");
		String mgs = userService.deleteById(id);
		return new ResponseEntity<String>(mgs,HttpStatus.OK);
	}
}
