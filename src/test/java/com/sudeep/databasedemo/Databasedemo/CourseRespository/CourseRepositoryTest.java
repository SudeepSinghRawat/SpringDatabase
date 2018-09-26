package com.sudeep.databasedemo.Databasedemo.CourseRespository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
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
		assertEquals("JPA in 50 Steps", course.getName());
	}

	@Test
	@DirtiesContext
	public void deleteById() {
		//respository.delteById(10002L);
		//assertNull(respository.findById(10002L));
	}

	@Test
	@DirtiesContext
	public void saveBasic() {
		Course course = respository.findById(10001L);
		course.setName("JPA in 50 Steps - Updated");
		respository.save(course);

		Course course1 = respository.findById(10001L);
		assertEquals("JPA in 50 Steps - Updated", course1.getName());
		
		Course course2 = new Course();
		course2.setName("This is new courese will udpdate soon");
		respository.save(course2);
	}

}
