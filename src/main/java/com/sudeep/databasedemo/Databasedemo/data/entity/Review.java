package com.sudeep.databasedemo.Databasedemo.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String rating;
	
	private String descriotion;

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getDescriotion() {
		return descriotion;
	}

	public void setDescriotion(String descriotion) {
		this.descriotion = descriotion;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Review [rating=" + rating + ", descriotion=" + descriotion + "]";
	}
	
	
	

}
