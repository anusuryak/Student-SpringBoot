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

@RestController    //request and response from the client 
@RequestMapping("/student")     
public class StudentController {

	@Autowired                                  //dependency injection
	public ServiceInterface service;
	
	@PostMapping("/addStudent")                   //post mapping is used to send data and create resources
	public StudentEntity addStudents(@RequestBody StudentEntity entity) {       //requestbody-->request data into a Java object
		return service.addAllStudent(entity);
	}
	
	@GetMapping("/getStudent")           //get mapping is used for retreive data from server
	public List<StudentEntity> getAllStudents() {
		return service.getAllStudent();
	}
	
	@GetMapping("/{id}")
	public StudentEntity getStudentSById(@PathVariable Long id) {     // used to extract values from urls
		return service.getStudentById(id);
	}
	
	@DeleteMapping("/delete/{id}")                    
	public String deleteStudentById(@PathVariable Long id) {
		service.deleteStudentById(id);
		return "student Deleted Successfully";
	}
	
	@GetMapping("/search")
	public List<StudentEntity> searchStudentByDepartment(@RequestParam String department) {
		return service.searchStudentByDept(department);           // to run in postman    "http://localhost:8080/student/search?department=it"
	}
	
	@GetMapping("/aboveMarks")
	public List<StudentEntity> getStudentAboveMarks(@RequestParam Double mark) {     //@RequestParam is used to get query parameters from URL
		return service.getAboveMinMarks(mark);                      //to run in postman "http://localhost:8080/student/aboveMarks?mark=80"
	}
	
}
