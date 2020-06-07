package org.springpractice.model;


public class Circle {

    
	private String name;

	public String getName() {
		System.out.println("name getter runs");
		return name;
	}

	public void setName(String name)  {
		this.name = name;
		System.out.println("name setter runs");//to insure getter runs before the advice
		throw new RuntimeException();
	}
	
	public String setNameAndReturn(String name)  {
		this.name = name;
		System.out.println("setNameAndReturn runs");//to insure getter runs before the advice
		return name;
	}
	
}
