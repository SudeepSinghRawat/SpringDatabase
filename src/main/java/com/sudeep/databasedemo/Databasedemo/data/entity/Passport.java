package com.sudeep.databasedemo.Databasedemo.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passport {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable = false)
	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Passport [number=" + number + "]";
	}
	
	

}
