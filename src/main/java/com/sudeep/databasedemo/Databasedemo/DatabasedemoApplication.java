package com.sudeep.databasedemo.Databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sudeep.databasedemo.Databasedemo.data.entity.Course;
import com.sudeep.databasedemo.Databasedemo.data.repository.CourseRepository;

@SpringBootApplication
public class DatabasedemoApplication  implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(DatabasedemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Course course = repo.findById(10001L);
		logger.info("Course ->"+course.toString());
		
	}
}
