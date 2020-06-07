import java.util.Date;

import hiber.Address;
import hiber.UserDetails;
import hiber.Vehicle;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateMain {

	public static void main(String[] args) {
		
        
			UserDetails user = new UserDetails();
			
			Address addr=new Address();
			

			user.setUserName("radhika");
			
			
			addr.setCity("Lko");
			addr.setState("up");
			user.getAddress().add(addr);
			
		    Vehicle	vehicle=new Vehicle();
		    vehicle.setVehicleid(1);
		    vehicle.setVehiclename("mercedes");
		    
		    Vehicle	vehicle2=new Vehicle();
		    vehicle2.setVehicleid(2);
		    vehicle2.setVehiclename("polo");
		    
		    user.getVehicle().add(vehicle);
		    user.getVehicle().add(vehicle2);
		    
			
			SessionFactory sessionfac=new Configuration().configure().buildSessionFactory();
			Session session=sessionfac.openSession();
			
			session.beginTransaction();
			
			session.save(user);
			/*session.save(vehicle);
			session.save(vehicle2);
			vehicle objects cascaded upon persisting user_details*/
			
			session.getTransaction().commit();
		    session.close();
		    
			
        
        
	}

}
