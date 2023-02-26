package com.spring_mvc.webapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring_mvc.webapp.model.Student;

@Repository
public class StudentImpl implements StudentDao{

	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public void createStudent(Student student) {
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		
		session.save(student);
		
		txn.commit();
		
		
	}

}
