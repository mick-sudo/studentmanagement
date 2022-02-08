package com.javaguide.studentmanagement.controller;

import com.javaguide.studentmanagement.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

  @Autowired
  private StudentService studentService;

  @GetMapping("/students")
  public String listStudent(Model model) {
    model.addAttribute("students", studentService.getAllStudent());
    return "students";

  }
}
