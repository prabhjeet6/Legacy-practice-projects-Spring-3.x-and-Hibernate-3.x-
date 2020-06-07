package org.springpractice.service;

import org.springpractice.aspect.LoggingAdvice;
import org.springpractice.model.Circle;

public class ShapeServiceProxy extends ShapeService {
	public Circle getCircle()
	{
		new LoggingAdvice().log();//example of proxy before advice
		return super.getCircle();
	}

}
