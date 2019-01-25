package com.student.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setFirstname(String firstName) {
		this.firstname = firstName;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setLastname(String lastName) {
		this.lastname = lastName;
	}

	public String getLastname() {
		return this.lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Student() {
	}

	public Student(String firstName, String lastName, String email, String password) {
		this.firstname = firstName;
		this.lastname = lastName;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return String.format("Student[id=%d, firstName='%s', lastName='%s',email='%s',password='%s']", id, firstname,
				lastname, email, password);
	}
}