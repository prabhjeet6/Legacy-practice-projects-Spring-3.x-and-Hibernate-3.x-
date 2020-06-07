package hiber;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.Type;

@Entity(name="user_details")
//@Table(name="user_details")  @Table and @Entity are different
public class UserDetails {
   
  
	
	@Column(name="user_id")
	@Id 
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
    int userId;
     
	
	@OneToMany
	
	Collection<Vehicle> vehicle=new ArrayList<Vehicle>();
  
 
	
	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	
	@ElementCollection
	@JoinTable(name="User_Address", joinColumns=@JoinColumn(name="user_id"))
	//giving different name to address table,and foreign key
	
	@GenericGenerator(name="hilo_gen" ,strategy="hilo")
	@CollectionId(columns = { @Column (name="Address_Id")}, generator = "hilo_gen", type = @Type(type="long"))
	/* @Collection Id and @Generic Generator are annotations of hibernate 
	and not JPA, hilo is a strategy provided by hibernate,here we are 
	creating primary key for address table.*/
	List<Address>  address=new ArrayList<Address>();
    
  
	
	
    public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	


	String userName;
    
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	 @Column(name="user_name")
/*annotations can be marked just above the getters, or member variable 
declarations.if they are marked above the getter methods, values 
returned by getters will be stored in the table, even if values in the object to be 
persisted are different, because @Entity returns the values to be
 stored to its mapped tables   */
	 
	public String getUserName() {
		return userName +  "from getter";
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
