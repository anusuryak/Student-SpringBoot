package com.Student.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Student.entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity,Long> {

	List<StudentEntity> findByDepartment(String department);

	List<StudentEntity> findByMarkGreaterThan(Double mark);

	

	
	
	//there are many repository specifically to helps to perform the crud operation we use jpaRepository
}
