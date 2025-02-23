package com.studyroom.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studyroom.entity.User;
import com.studyroom.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	public User registerUser(User user) {
		return userRepo.save(user);
	}
}
