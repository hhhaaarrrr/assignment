
public class Customerclass {
	String customerName;
	 Addressclass customerAddress;
	int customerId;
	double customerContact;
	
	
	public Customerclass(String customerName, Addressclass customerAddress, int customerId, double customerContact) {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerId = customerId;
		this.customerContact = customerContact;
	}
	
	
	
	
	public Customerclass() {
		super();
		// TODO Auto-generated constructor stub
	}




	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Addressclass getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Addressclass customerAddress) {
		this.customerAddress = customerAddress;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public double getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(double customerContact) {
		this.customerContact = customerContact;
	}
public	void displayInfo() 
	{
		System.out.println("customerId = " +customerId+ " "+ "customerName ="+ customerName );
		System.out.println("customer address= "+ customerAddress + "customerContact " + customerContact );
	}
}
