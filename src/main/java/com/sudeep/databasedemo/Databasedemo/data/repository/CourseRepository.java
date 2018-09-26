package com.sudeep.databasedemo.Databasedemo.data.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sudeep.databasedemo.Databasedemo.data.entity.Course;

@Repository
@Transactional
public class CourseRepository {
	@Autowired
	EntityManager em;
	
	
	public Course findById(Long id) {
		return em.find(Course.class, id);
	}
	
	public void delteById(long id) {
		Course find = em.find(Course.class, id);
		em.remove(find);
	}
	
	public Course save(Course course) {

		
		System.out.println("This "+course);
		
		if (course.getId() == 0 ) {
			em.persist(course);
		} else {
			em.merge(course);
		}
		
		return course;

	}

}
