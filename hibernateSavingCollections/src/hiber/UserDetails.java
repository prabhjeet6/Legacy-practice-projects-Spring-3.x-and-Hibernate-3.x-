package hiber;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NaturalId;

@Entity(name="user_details")
//@Table(name="user_details")  @Table and @Entity are different
public class UserDetails {
   
    /*@GeneratedValue(strategy=GenerationType.AUTO)
    The increment type generator is not available in JPA annotations.so, 
    often, @GeneratedValue does not work for us. instead, we can use 
    hibernate specific annotationss */
	
	@Column(name="user_id")
	@Id 
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
    int userId;
     
  
	
	@ElementCollection(fetch=FetchType.LAZY)
   /*default, picks up first level member variables of userdetails,and 
    * picks collection types only when accessed. 
    */
	
	//@ElementCollection(fetch=FetchType.EAGER)
	//picks up all member variables
	Set<Address>  address=new HashSet<Address>();
    
  
	
	public Set<Address> getAddress() {
		return address;
	}
	public void setAddress(Set<Address> address) {
		this.address = address;
	}
	// @Lob
    String description;
    /*@Lob is of two types clob for storing character large objects
    (by dfault for String and char array), and blob, for byte array, by 
    default */
    
    @Temporal(TemporalType.DATE)
    Date date;
    /* if @Temporal is not mentioned as above, Date variable persists the 
    object, with time stamp along with the date, by default.*/
    
   

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
