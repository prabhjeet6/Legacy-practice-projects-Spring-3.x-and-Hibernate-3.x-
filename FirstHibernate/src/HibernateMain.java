import java.util.Date;
import hiber.UserDetails;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateMain {

	public static void main(String[] args) {
		
        
			UserDetails user = new UserDetails();
			
			//user.setUserId(96);
			user.setUserName("radhika");
			user.setDate(new Date());
			user.setAddress("iris/lko");
			user.setDescription("gunnable");
			
			//System.out.print( user.getUserId());
			
			SessionFactory sessionfac=new Configuration().configure().buildSessionFactory();
			Session session=sessionfac.openSession();
			
			session.beginTransaction();
			
			session.save(user);
			
			session.getTransaction().commit();
		    session.close();
		    
			user=null;
			
			session=sessionfac.openSession();
			
			session.beginTransaction();
			
            user=(UserDetails)session.get(UserDetails.class,69);
            
          //  System.out.println(user.getUserName());
        
        
        
	}

}
