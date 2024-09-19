package com.hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Employee {
	@Id
	private int id;
	private String name;
	private String gender;
	private int salary;
	private int age;
	
	
	
	public Employee() {
		super();
	}
	public Employee(int id, String name, int age ,String gender, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + " ,gender=" + gender + ", age= "+ age +", salary=" + salary + "]";
	}
	
 
	
	
}
