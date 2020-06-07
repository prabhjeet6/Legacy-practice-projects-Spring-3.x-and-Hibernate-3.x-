package org.springpractice.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springpractice.service.ShapeService;


public class AOPMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeservice=ctx.getBean("ShapeService",ShapeService.class);
        //shapeservice.getCircle().setName("dummy");
        //ShapeService.class parameter in getBean() allows automatic cast.
	    System.out.println(shapeservice. getCircle().getName());
	}

}
