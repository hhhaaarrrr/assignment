import java.util.*;
public class Trader {
	String name;
	String city;
	
	//generate constructor
	public Trader(String n, String c) {
		super();
		this.name = n;
		this.city = c;
	}
	
	public String getName() {
		return this.name;
	}

	public String getCity() {
		return this.city;
	}

	
	public String toString() {
		return " name = "+this.name + " ,city = "+this.city ;
		
	}
	
}
