package com.spring_mvc.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_mvc.webapp.dao.StudentDao;
import com.spring_mvc.webapp.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired 
	StudentDao dao;

	@Override
	public void createStudent(Student student) {

		dao.createStudent(student);

	}

}
