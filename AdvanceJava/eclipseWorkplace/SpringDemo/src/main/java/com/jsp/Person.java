package com.jsp;

public class Person {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person() {
		System.out.println("person object is created");
	}
	
	public void welcome() {
		System.out.println("post contructor");
	}
	
	public void call() {
		System.out.println("Person called");
	}
	
	public void close() {
		System.out.println("Pre destroy");
	}

}
