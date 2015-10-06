package com.israellimon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "job_title")
	private String jobTitle;
	
	@Column(name = "department")
	private String departament;
	
	@Column(name = "salary")
	private int salary;

	public Employee(){}
	public Employee(Integer id, String firstName, String lastName, String jobTitle, String departament, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobTitle = jobTitle;
		this.departament = departament;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getDepartament() {
		return departament;
	}

	public void setDepartament(String departament) {
		this.departament = departament;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(!(obj instanceof Employee)){
			return false;
		}
		Employee employee = (Employee) obj;
		if(firstName != null ? !firstName.equals(employee.firstName) : employee.firstName != null){
			return false;
		}else{
			return true;
		}
	}
	
	@Override
	public int hashCode(){
		return firstName != null ? firstName.hashCode() : 0;
	}
	
	@Override
	public String toString(){
		return "EmployeeId="+id+", name="+firstName;
	}

}
