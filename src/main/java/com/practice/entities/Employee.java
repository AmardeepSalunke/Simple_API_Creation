package com.practice.entities;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
public class Employee {
	
	@Id
	private int id;
	
	private String firstName;
	private String lastName;
	
	private String Department;
	
	private  int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(int id, String firstName, String lastName, String department, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		Department = department;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", Department="
				+ Department + ", salary=" + salary + "]";
	}
	
	
	

}
