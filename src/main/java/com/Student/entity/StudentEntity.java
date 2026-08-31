package com.Student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                 
@AllArgsConstructor
@NoArgsConstructor      
@Entity                   
public class StudentEntity {
	@GeneratedValue(strategy =GenerationType.IDENTITY)    
	@Id   //primary key
	
	private Long id;
	private String name;
	private String department;
	private Double mark;
}



