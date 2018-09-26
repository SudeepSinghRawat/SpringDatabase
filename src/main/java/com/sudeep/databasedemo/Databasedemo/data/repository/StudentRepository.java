package com.sudeep.databasedemo.Databasedemo.data.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sudeep.databasedemo.Databasedemo.data.entity.Passport;
import com.sudeep.databasedemo.Databasedemo.data.entity.Student;

@Repository
@Transactional
public class StudentRepository {
	
	@Autowired
	EntityManager em;
	
	public Student findById(long id) {
		return em.find(Student.class, id);
	}
	
	public void saveStudentWithPassword() {
		Passport password =  new Passport();
		password.setNumber("Z123456");
		em.persist(password);
		
		Student student = new Student();
		student.setName("Mike");
		
		student.setPassport(password);
		em.persist(student);
		
	}
	

}
