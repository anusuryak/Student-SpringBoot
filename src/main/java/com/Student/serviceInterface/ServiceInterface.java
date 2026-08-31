package com.Student.serviceInterface;

import java.util.List;

import com.Student.entity.StudentEntity;

public interface ServiceInterface {
   //void addAllStudent();
    //void getStudentById();
   //void deleteStudentById();
   //void searchStuByDept();
  // void getAboveMinMarks();

   StudentEntity addAllStudent(StudentEntity entity);
   List<StudentEntity> getAllStudent();

   StudentEntity getStudentById(Long id);

   void deleteStudentById(Long id);

   List<StudentEntity> searchStudentByDept(String department);

   List<StudentEntity> getAboveMinMarks(Double mark);

   

   

   

  
}
