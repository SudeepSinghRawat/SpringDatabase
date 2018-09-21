package com.sudeep.databasedemo.Databasedemo.CourseRespository;



import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sudeep.databasedemo.Databasedemo.DatabasedemoApplication;
import com.sudeep.databasedemo.Databasedemo.data.entity.Course;
import com.sudeep.databasedemo.Databasedemo.data.repository.CourseRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DatabasedemoApplication.class)
public class CourseRepositoryTest {
	
	@Autowired
	CourseRepository respository;
	
	@Test
	public void findById_basic() {
		Course course = respository.findById(10001L);
		assertEquals("JPA in 50 Step", course.getName());
	}

}
