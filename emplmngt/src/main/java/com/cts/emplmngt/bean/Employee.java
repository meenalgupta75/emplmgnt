package com.cts.emplmngt.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Empl")
@Table(name="empl_Table")
public class Employee {
	
	
	@Id
	@Column(name="empID", nullable = false,unique= true )
	private String empID;
	private static Employee employee;
	
	public Employee(){
		
	}
	
	@Column(name = "firstName", nullable = false, unique= true)
	private String firstName;
	
	@Column(name = "lastName",nullable = false, unique= true)
	private String lastName;
	
	@Column(name = "salary",nullable = false, unique= true)
	float salary;
	
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Employee(String empID, String firstName, String lastName, float salary) {
		super();
		this.empID = empID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

}
