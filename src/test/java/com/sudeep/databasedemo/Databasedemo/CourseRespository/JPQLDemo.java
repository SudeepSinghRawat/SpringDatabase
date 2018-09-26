package com.sudeep.databasedemo.Databasedemo.CourseRespository;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sudeep.databasedemo.Databasedemo.DatabasedemoApplication;
import com.sudeep.databasedemo.Databasedemo.data.entity.Course;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DatabasedemoApplication.class)
public class JPQLDemo {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EntityManager em;
	
	@Test
	public void jpqlBasic() {
		Query query = em.createQuery("Select  c  From Course c");
		List resultList = query.getResultList();
		logger.info("Select  c  From Course c -> {}"+resultList);
	}
	
	@Test
	public void jpqlTyped() {
		TypedQuery<Course> query = em.createQuery("Select  c  From Course c",Course.class);
		List<Course> list = query.getResultList();
		logger.info("Select  c  From Course c -> {}"+list);
	}
	
	@Test
	public void jpql_where() {
		TypedQuery<Course> query = em.createQuery("Select  c  From Course c where name like '%100 Steps'",Course.class);
		List<Course> list = query.getResultList();
		logger.info("this is me");
		logger.info("Select  c  From Course c where name like '%100 Steps' -> {}"+list);
	}

}
