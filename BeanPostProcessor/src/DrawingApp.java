import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp
{
 public static void main(String asd[])
 {
	 ApplicationContext ob=new ClassPathXmlApplicationContext("NewFile.xml");
	 Triangle t=(Triangle)ob.getBean("triangle1");
	 t.draw();
	 
 }
}
