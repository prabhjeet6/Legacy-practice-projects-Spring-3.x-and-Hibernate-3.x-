package org.springpractice.datasource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class JDBCMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /* DBConnect dbc=new DBConnect();
      dbc.getCircle("2");*/
ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
	    DBConnect dbc=(DBConnect)ctx.getBean("DBConnect");
	    dbc.getCircle("2");
	}

}
/*
Although I have Jre 1.7 installed, and  which was supported by higher versions 
of pool and dbcp jar according to apache commons website, still the program ran 
only when lower versions of dbcp and pool were added to the classpath
*/