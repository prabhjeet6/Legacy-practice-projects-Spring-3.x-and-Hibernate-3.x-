package org.springpractice.datasource;


public class circle {
	int id;
	String name;
	public circle(int id, String name) {
		super();
		/*this.id = id;
		this.name = name;*/
		setId(id);
		setName(name);
	}
	public circle() {
		// TODO Auto-generated constructor stub
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

}
