import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp
{
 public static void main(String asd[])
 {
	 ApplicationContext ob=new ClassPathXmlApplicationContext("NewFile.xml");
	 Circle t=(Circle)ob.getBean("circle");
	 t.draw();
	 
 /*The output of this project is correct,it is just to show, that if, a bean property is not set, jvm will throw exception while running the application.
 whereas, if we use @Required, appropriately, to make sure, that required beans are set, in that case, if the property is still not set, the exception will 
 come in the initialisation phase, way before execution of the application starts. 
 
 @Required is a bean post processor, so, we have to define  it, in the xml file, with its fully qualified class name, the class name will be available in 
 spring user library, in the beans package.
 
 Donot confuse it with Required class, which is also present in the same package*/ 
	 
 }
}
