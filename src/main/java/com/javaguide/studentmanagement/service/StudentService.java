package com.javaguide.studentmanagement.service;

import java.util.List;

import com.javaguide.studentmanagement.model.Student;

public interface StudentService {

  List<Student> getAllStudent();

  Student saveStudent(Student student);

  Student getStudentById(Long id);

  Student updateStudent(Student student);

  void deleteStudentById(Long id);
}
