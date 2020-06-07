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
			
			addr.setCity("Lko");
			addr.setState("up");
			user.getAddress().add(addr);
			
		    Vehicle	vehicle=new Vehicle();
		    vehicle.setVehicleid(1);
		    vehicle.setVehiclename("mercedes");
		    

		    Vehicle	vehicle2=new Vehicle();
		    vehicle.setVehicleid(2);
		    vehicle.setVehiclename("polo");
		    
		    user.getVehicle().add(vehicle2);
		    user.getVehicle().add(vehicle);
		    
			
			SessionFactory sessionfac=new Configuration().configure().buildSessionFactory();
			Session session=sessionfac.openSession();
			
			session.beginTransaction();
			
			session.save(user);
			session.save(vehicle2);
			session.save(vehicle);
			
			session.getTransaction().commit();
		    session.close();
		    
			

        
        
        
	}

}
