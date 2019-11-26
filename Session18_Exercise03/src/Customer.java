
public class Customer extends Person {

	private int customerID;
	private boolean mailingList; 
	
	public Customer(String name, String address, int telNo, int customerID) {
		super(address, name, telNo);
		this.customerID = customerID; 
		mailingList = false; 
	}
	
	public int getCustomerID() {
		return customerID; 
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID; 
	}
	
	public void setToMail() {
		mailingList = true; 
	}
	
	public void removeFromMail() {
		mailingList = false; 
	}
	
	public String toString() {
		return super.toString() + " " + customerID + " " + mailingList;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Customer)){
			return false; 
		}
		
		Customer other = (Customer) obj; 
		
		return super.equals(other) && customerID == other.customerID && mailingList == other.mailingList; 
	}
}
