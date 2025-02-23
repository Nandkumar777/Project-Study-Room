package com.studyroom.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studyroom.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
