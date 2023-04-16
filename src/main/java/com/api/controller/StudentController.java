package com.api.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.StudentBean;
import com.api.repository.StudentRepo;


@RestController
public class StudentController {
	
	@Autowired
	StudentRepo repository;
	
	@PostMapping("/addStudent")  
	public ResponseEntity<StudentBean> testMethod(@RequestBody StudentBean student){	
		StudentBean savedStudent = repository.save(student);
		return new ResponseEntity<>(savedStudent, HttpStatus.OK);
		
	}
	
	@GetMapping("/getStudentDetails")
	public List<StudentBean> getStudent(){
		return repository.findAll();
	}
	
	@PutMapping("/updateDetails")
	public void updateDetails(@RequestBody StudentBean student) {
		repository.save(student);
	}
	
	@DeleteMapping("/deleteStudentDetails/{id}")
	public void deleteStudent(@PathVariable int id) {
		repository.deleteById(id);
	}
}
