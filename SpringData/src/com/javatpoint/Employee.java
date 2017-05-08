package com.javatpoint;

public class Employee {
	
	private int id;  
	private String name;  
	private float salary;
	private String designation;
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Employee() {
		
		
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	} 
	
	public String toString(){  
	    return "Id:"+id+" Name:"+ name+" salary:"+salary+" Designation:"+designation;  
	}  
	
	

}
