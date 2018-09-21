package com.sudeep.databasedemo.Databasedemo.data.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sudeep.databasedemo.Databasedemo.data.entity.Course;

@Repository
public class CourseRepository {
	@Autowired
	EntityManager em;
	
	
	public Course findById(Long id) {
		return em.find(Course.class, id);
	}

}
