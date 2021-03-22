package com.app.student.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;
@Entity
public class UserInfo {
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	private int id;
	private String username;
	private String password;
	private String gender;
	private String country;
	private String terms;
	
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getTerms() {
		return terms;
	}


	public void setTerms(String terms) {
		this.terms = terms;
	}


	



	
}