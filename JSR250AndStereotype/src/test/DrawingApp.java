package test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp
{
 public static void main(String asd[])
 {
	 AbstractApplicationContext ob=new ClassPathXmlApplicationContext("NewFile.xml");
	 ob.registerShutdownHook();
	 Circle t=(Circle)ob.getBean("circle");
	 t.draw();
	 
 }
}

/*there are certain stereotype annotations mentioned below,which 
reduce the depedency to specify beans in the xml file.

@Component used while starting a pojo removes the dependency of mentioning it as a bean 
in the xml file.It is generic of all stereotypes.

if a POJO is marked stereotype, multiple beans of it can't be 
created.

You have to specify
<context: component- scan base package="package name"> in the xml file to 
check for pojos which are beans.base package helps to narrow 
down the search for POJOs that could be beans.

@Service
@Controller
@Repository etc are certain other specific components(stereotypes),used in MVC.*/