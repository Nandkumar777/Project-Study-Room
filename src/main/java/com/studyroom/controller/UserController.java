package com.studyroom.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.studyroom.entity.User;
import com.studyroom.services.UserService;

@RestController
@RequestMapping("/srm")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	
	@PostMapping("/registerUser")
	public ResponseEntity<User> registerUser(@RequestBody User user) {
		logger.info("Add user Controller called ");
		User userdata = userService.registerUser(user);
		logger.info(" msg = "+userdata);
		return new ResponseEntity<>(userdata, HttpStatus.CREATED);
	}
}
