import java.util.Date;

import hiber.Address;
import hiber.UserDetails;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateMain {

	public static void main(String[] args) {
		
        
			UserDetails user = new UserDetails();
			
			Address addr=new Address();
			
			//user.setUserId(96);
			user.setUserName("radhika");
			user.setDate(new Date());
			user.setDescription("gunnable");
			addr.setCity("Lko");
			addr.setState("up");
			user.getAddress().add(addr);
			//user.setAddress(addr);
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
			
            user=(UserDetails)session.get(UserDetails.class,1);
          //  System.out.println( user.getAddress().size());
            session.close();
            System.out.println( user.getAddress().size());
            
/*lazyloading is default, picks up first level member variables of 
 * userdetails,and picks collection types only when accessed.
 * To prove LazyLoading, when @ElementCollection is marked with 
 * Lazyloading if we try to access Address(Collection type) after 
 * the session is closed, it gives lazyloading Exception.
 * 
 * Fetch type Mechanism works by creating a proxy object, by subclassing 
 * the original class, which calls the parent methods for first level
 * member variables, and for collection type members,it first gets the
 * data from db in the proxy method and then calls the parent method, 
 * when the collection type getter is called
 *  */  
          
        
        
        
	}

}
