 import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp 
{
 public static void main(String asd[])
 {
	 ApplicationContext ob=new ClassPathXmlApplicationContext("Spring.xml");
	 Triangle tri=(Triangle)ob.getBean("trngl2");
	 tri.draw();
 }
}
