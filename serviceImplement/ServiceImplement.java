package com.Student.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Student.entity.StudentEntity;
import com.Student.repo.StudentRepo;
import com.Student.serviceInterface.ServiceInterface;
@Service     // business logic and act as connection bridge btw controller and repository
public class ServiceImplement implements ServiceInterface{
        @Autowired            //inject dependencies automatically
		public StudentRepo repo;
        
		@Override    //method implementation
		public StudentEntity addAllStudent(StudentEntity entity) {
			//System.out.println(entity);
			return repo.save(entity);      //create a new record or update an existing one   //crud operation
			
		}

		@Override
		public List<StudentEntity> getAllStudent() {
			return repo.findAll();       //retrieves all records
		}

		@Override
		public StudentEntity getStudentById(Long id) {
			return repo.findById(id).orElse(null);     //retreives a student by id
		}

		@Override
		public void deleteStudentById(Long id) {
		   repo.deleteById(id);     //delete the student with specified id
		}

		@Override
		public  List<StudentEntity> searchStudentByDept(String department) {
			return repo.findByDepartment(department);
		}

		@Override
		public List<StudentEntity> getAboveMinMarks(Double mark) {
			return repo.findByMarkGreaterThan(mark);
		}

		

		
}
