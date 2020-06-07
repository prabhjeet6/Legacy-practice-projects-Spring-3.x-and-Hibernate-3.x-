import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {
public static void main(String asd[])
{
	ApplicationContext ob=new ClassPathXmlApplicationContext("spring.xml");
	Triangle tri=(Triangle)ob.getBean("Triangle");
	tri.draw();
}
}
