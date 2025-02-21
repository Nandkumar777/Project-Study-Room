package com.studyroom.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studyroom.entity.Student;
import com.studyroom.repo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo studentRepo;
	public Student addStudent(Student student) {
		return studentRepo.save(student);
	}

}
