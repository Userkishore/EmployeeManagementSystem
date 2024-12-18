package com.employee.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="emailId")
	private String emaillId;
	
	public Employee() {
		
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmaillId() {
		return emaillId;
	}
	public void setEmaillId(String emaillId) {
		this.emaillId = emaillId;
	}
	public Employee(long id, String firstname, String lastname, String emaillId) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emaillId = emaillId;
	}
	
	
	

}
