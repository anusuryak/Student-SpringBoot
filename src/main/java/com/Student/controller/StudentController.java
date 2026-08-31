package com.Student.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Student.entity.StudentEntity;
import com.Student.serviceInterface.ServiceInterface;

@RestController     
@RequestMapping("/student")     
public class StudentController {

	@Autowired                                  
	public ServiceInterface service;
	
	@PostMapping("/addStudent")                   
	public StudentEntity addStudents(@RequestBody StudentEntity entity) {       
		return service.addAllStudent(entity);
	}
	
	@GetMapping("/getStudent")           
	public List<StudentEntity> getAllStudents() {
		return service.getAllStudent();
	}
	
	@GetMapping("/{id}")
	public StudentEntity getStudentSById(@PathVariable Long id) {     
		return service.getStudentById(id);
	}
	
	@DeleteMapping("/delete/{id}")                    
	public String deleteStudentById(@PathVariable Long id) {
		service.deleteStudentById(id);
		return "student Deleted Successfully";
	}
	
	@GetMapping("/search")
	public List<StudentEntity> searchStudentByDepartment(@RequestParam String department) {
		return service.searchStudentByDept(department);           
	}
	
	@GetMapping("/aboveMarks")
	public List<StudentEntity> getStudentAboveMarks(@RequestParam Double mark) {     
		return service.getAboveMinMarks(mark);                      
	}
	
}
