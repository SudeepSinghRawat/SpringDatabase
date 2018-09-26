package com.sudeep.databasedemo.Databasedemo.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	@OneToOne
	private Passport passport;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", passport=" + passport + "]";
	}
	
	
	

}
