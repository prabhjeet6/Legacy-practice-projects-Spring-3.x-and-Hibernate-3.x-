package org.springpractice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springpractice.model.Circle;
import org.springpractice.model.Triangle;


public class ShapeService {

	private Circle circle;
	private Triangle triangle;
	public Circle getCircle() {
		//System.out.println("Shapeservice getter runs");
		return circle;
	}
	@Autowired
	public void setCircle(Circle circle) {
		this.circle = circle;
		//System.out.println("shape service setter runs");//to insure getter runs before the advice
	}
	public Triangle getTriangle() {
		return triangle;
	}
	@Autowired
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
}
