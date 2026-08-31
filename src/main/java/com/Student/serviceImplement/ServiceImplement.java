package com.Student.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Student.entity.StudentEntity;
import com.Student.repo.StudentRepo;
import com.Student.serviceInterface.ServiceInterface;
@Service     
public class ServiceImplement implements ServiceInterface{
        @Autowired
		public StudentRepo repo;
        
		@Override
		public StudentEntity addAllStudent(StudentEntity entity) {
			//System.out.println(entity);
			return repo.save(entity);    
			
		}

		@Override
		public List<StudentEntity> getAllStudent() {
			return repo.findAll();
		}

		@Override
		public StudentEntity getStudentById(Long id) {
			return repo.findById(id).orElse(null);     
		}

		@Override
		public void deleteStudentById(Long id) {
		   repo.deleteById(id);     
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
