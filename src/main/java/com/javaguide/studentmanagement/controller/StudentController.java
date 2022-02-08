package com.javaguide.studentmanagement.controller;

import com.javaguide.studentmanagement.model.Student;
import com.javaguide.studentmanagement.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

  @Autowired
  private StudentService studentService;

  @GetMapping("/students")
  public String listStudent(Model model) {
    model.addAttribute("students", studentService.getAllStudent());
    return "students";
  }

  @GetMapping("/students/new")
  public String createStudentform(Model model) {
    Student student = new Student();
    model.addAttribute("student", student);
    return "create_student";
  }

  @PostMapping("/students")
  public String saveStudent(@ModelAttribute("student") Student student) {
    studentService.saveStudent(student);
    return "redirect:/students";
  }
}
