package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp
{
 public static void main(String asd[])
 {
	 ApplicationContext ob=new ClassPathXmlApplicationContext("NewFile.xml");
	 //ob.registerShutdownHook();
	 Circle t=(Circle)ob.getBean("circle");
	 t.draw();
	 //System.out.println(ob.getMessage("greeting",null,"default greeting",null));
	 //ob.getMessage("property key",parameter,"default value for if key not found",locale)
 }
}
/*As ApplicationContext is an interface, the 
 * ClassPathXmlApplicationContext 
object created, implements MessageSource interface, that is why, we can 
implement it using its object Right away.

Instead, we make a reference of MessageSource in circle class and use it 
to implement getMessage there.

In order to use Message Passing feature, we have to define spring's
ResourceBundle bean, which also implements MessageSource interface, 
and also specifies, properties file to look for.*/
