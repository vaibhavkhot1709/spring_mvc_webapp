package com.spring_mvc.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring_mvc.webapp.model.Student;
import com.spring_mvc.webapp.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;

	@RequestMapping(value = "/createStudent", method = RequestMethod.POST)
	public String createStudent(@ModelAttribute("student") Student student) {

		studentService.createStudent(student);

		return "studentView";
	}

}
