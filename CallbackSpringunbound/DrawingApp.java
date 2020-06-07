import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring.xml");
		
		Triangle tri = (Triangle) context.getBean("trngl");
		context.registerShutdownHook();
		tri.draw();
	}

}
