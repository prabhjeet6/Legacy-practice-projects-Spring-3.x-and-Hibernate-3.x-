package org.springpractice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springpractice.aspect.Loggable;
import org.springpractice.model.Circle;
import org.springpractice.model.Triangle;


public class ShapeService {

	private Circle circle;
	private Triangle triangle;
	@Loggable
	public Circle getCircle() {
		//System.out.println("Shapeservice getter runs");
		return circle;
	}
	@Autowired
	public void setCircle(Circle circle) {
		this.circle = circle;
		//System.out.println("shape service setter runs");//to insure getter runs before the advice
	}
	@Loggable
	public Triangle getTriangle() {
		return triangle;
	}
	@Autowired
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
}
