package com.Student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                 // it helps to generate automatic getter and setter
@AllArgsConstructor     //helps to generate constructor with parameters
@NoArgsConstructor      //generates a no argument constructor(no parameters)
@Entity                   //table creation
public class StudentEntity {
	@GeneratedValue(strategy =GenerationType.IDENTITY)    // auto generate id 
	@Id   //primary key
	
	private Long id;
	private String name;
	private String department;
	private Double mark;
}



