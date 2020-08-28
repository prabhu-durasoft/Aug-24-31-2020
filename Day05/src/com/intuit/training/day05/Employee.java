package com.intuit.training.day05;

public class Employee {
	private String name;
	private long salary;
	public Employee(String name, long salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return this.name;
	}
	//private, package-friendly(default), protected, public
	//protected is package-friendly + derived members in any package
	protected long getSalary() {
		return this.salary;
	}
}
