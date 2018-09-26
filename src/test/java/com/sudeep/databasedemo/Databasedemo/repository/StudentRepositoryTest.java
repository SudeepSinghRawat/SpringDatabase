package com.sudeep.databasedemo.Databasedemo.repository;

import javax.persistence.EntityManager;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sudeep.databasedemo.Databasedemo.DatabasedemoApplication;
import com.sudeep.databasedemo.Databasedemo.data.entity.Student;
import com.sudeep.databasedemo.Databasedemo.data.repository.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class StudentRepositoryTest {
	@Autowired
	StudentRepository repo;
	
	@Autowired
	EntityManager em;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void retieveStudentAndPassportDetails() {
		Student st  = em.find(Student.class, 20001L);
		
//		logger.info("Student->"+ st);
//		
//		logger.info("Passport->"+ st.getPassport());
		
	}

}
