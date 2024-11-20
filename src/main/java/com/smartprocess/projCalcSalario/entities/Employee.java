package com.smartprocess.projCalcSalario.entities;

public class Employee {
	
	private String name;
	private double glossSalary;
	
	
	public Employee() {
		
	}

	public Employee(String name, double glossSalary) {
		this.name = name;
		this.glossSalary = glossSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGlossSalary() {
		return glossSalary;
	}

	public void setGlossSalary(double glossSalary) {
		this.glossSalary = glossSalary;
	}
	
}
