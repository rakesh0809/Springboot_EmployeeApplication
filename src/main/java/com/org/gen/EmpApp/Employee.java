package com.org.gen.EmpApp;

public class Employee {
int id; String firstname;
 String lastname; String email;
 

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(int id, String firstname, String lastname, String email) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	
}

public int getId() {
	return id;
}

public void setId(int id) {
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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
 
}
