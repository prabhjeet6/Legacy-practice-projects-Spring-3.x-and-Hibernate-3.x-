package org.springpractice.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springpractice.service.FactoryService;
import org.springpractice.service.ShapeService;


public class AOPMain {

	
	public static void main(String[] args) {

		//ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		//ShapeService shapeservice=ctx.getBean("ShapeService",ShapeService.class);
        
		FactoryService factoryservice=new FactoryService();
		ShapeService service=(ShapeService)factoryservice.getBean("shapeservice");
		service.getCircle();
   	  

	}

}
