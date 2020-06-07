package hiber;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
    @Column(name="Home_Street")
	private String street;
    @Column(name="Home_zip")
	private String zip;
    @Column(name="Home_State")
	private String state;
    @Column(name="Home_city")
	private String city;
    
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
