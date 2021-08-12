package com.ust.hb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Eeemp1000")
public class Employee {
	@Id
	@Column(name="Id")
	private int Id;
	@Column(name="FirstName")
	private String FirstName;
	@Column(name="LastName")
	private String LastName;
	public int getId() {
		return Id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setId(int id) {
		Id = id;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
}