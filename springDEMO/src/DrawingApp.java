import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


@SuppressWarnings("deprecation")
public class DrawingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BeanFactory ob=new XmlBeanFactory(new FileSystemResource("NewFile.xml"));
		ApplicationContext ob=new ClassPathXmlApplicationContext("NewFile.xml");
		Triangle tri=(Triangle)ob.getBean("trngl");
		tri.draw();

	}

}
