package test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;



import org.springframework.stereotype.Component;
@Component
public class Circle {

	Point center;

	public Point getCenter() {
		return center;
	}

	@Resource()
	public void setCenter(Point center) {
		this.center = center;
	}

	@PostConstruct
	void myinit() {
		System.out.println("myinit");
	}

	@PreDestroy
	void mydestroy() {
		System.out.println("mydestroy");
	}

	void draw() {
		System.out.println("Circle drawn" + " " + center.getX() + " "
				+ center.getY());
	}
}

/*we have used three JSR(Java Specific Requirement ) annotations 
which are supported by spring, but are diffrent from spring's 
own annotations.

@Resource: used for setting the property of a bean, which is not
set in the xml file diectly.

if it does not take an argument,finds for a bean in the xml file
with same name as the variable to set. 

if it takes an argument,it uses name=value, where value is the 
id of the bean specified.

@PreDestroy: Preprocessor for a bean, over a userdefined method 
in its own POJO.

@PreDestroy: Postprocessor for a bean, over a userdefined method 
in its own POJO.*/

