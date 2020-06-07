package org.springpractice.service;

import org.springpractice.model.Circle;
import org.springpractice.model.Triangle;

public class FactoryService extends ShapeService {

	public Object getBean(String beanType)
	{
		if(beanType.equals("shapeservice"))return (new ShapeServiceProxy());
		if(beanType.equals("circle"))return (new Circle());
		if(beanType.equals("triangle"))return (new Triangle());
		return null;
	}
}
