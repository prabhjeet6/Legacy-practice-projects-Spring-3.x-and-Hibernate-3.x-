package org.springpractice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springpractice.model.Circle;
import org.springpractice.model.Triangle;


public class ShapeService {

	private Circle circle;
	private Triangle triangle;
	public Circle getCircle() {
		return circle;
	}
	@Autowired
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	@Autowired
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
}
