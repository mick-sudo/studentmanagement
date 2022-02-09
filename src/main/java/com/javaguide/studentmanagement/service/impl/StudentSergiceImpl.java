package com.javaguide.studentmanagement.service.impl;

import java.util.List;

import com.javaguide.studentmanagement.model.Student;
import com.javaguide.studentmanagement.repository.StudentRepository;
import com.javaguide.studentmanagement.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentSergiceImpl implements StudentService {

  @Autowired
  private StudentRepository studentRepository;

  @Override
  public List<Student> getAllStudent() {
    return studentRepository.findAll();
  }

  @Override
  public Student saveStudent(Student student) {
    return studentRepository.save(student);
  }

  @Override
  public Student getStudentById(Long id) {
    return studentRepository.findById(id).get();
  }

  @Override
  public Student updateStudent(Student student) {
    return studentRepository.save(student);
  }

}
