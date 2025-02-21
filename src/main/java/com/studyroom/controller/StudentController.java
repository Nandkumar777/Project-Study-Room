package com.studyroom.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studyroom.entity.Student;
import com.studyroom.services.StudentService;

@RestController
@RequestMapping("/srm")
public class StudentController {
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
	@Autowired
	private StudentService studentService;
	@PostMapping("/addStudent")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		logger.info("Add student Controller called ");
		Student studentData = studentService.addStudent(student);	
		logger.info(" msg = "+studentData);
		return new ResponseEntity<>(studentData, HttpStatus.CREATED);
	}

}
