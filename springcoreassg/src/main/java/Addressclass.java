
public class Addressclass {
	String street,city,state,country;
	int zip;
	
	
	//pametersized constructor
	
	public Addressclass(String street, String city, String state, String country, int zip) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
	}
	
	//default
	public Addressclass() {
		super();
		
	}



	//getter and setter method
	public String getStreet() {
		return street;
	}
	
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public int getZip() {
		return zip;
	}
	
	
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setZip(int zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return " [street=" + street + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", zip=" + zip + "]";
	}
	
	
	
	
}
