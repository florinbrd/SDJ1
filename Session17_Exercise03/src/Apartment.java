import java.util.ArrayList;

public class Apartment {
	
	private String addrress;
	private double rent; 
	private Tenant tenant; 
	
	public Apartment(String address, double rent) {
		this.addrress = address; 
		this.rent = rent; 
		tenant = null;
	}
	
	public String getAddress() {
		return addrress; 
	}
	
	public void setRent(double rent) {
		this.rent = rent; 
	}
	
	public double getRent() {
		return rent; 
	}
	
	public void rentTo(String phone, String name) {
		if(!(isOccupied())) {
		
		tenant = new Tenant(name, phone);
		
		}
		
		else {
			System.out.println("apartment is occupied");
		}
	}
	
	public void evict() {
		tenant = null; 
	}
	
	public boolean isOccupied() {
		if(tenant!=null) {
			return true; 
		}
		
		else {
			return false; 
		}
	}
	
	public Tenant getTenant() {
		return tenant.copy(); 
	}
	
	public double getRentDue() {
		return tenant.getRentDue();
		
		//
	}
	
	public void chargeRent() {
		rent = rent + tenant.getRentDue();
	}
	
	public void collectRent(double amount) {
		rent = rent - amount; 
	}
	
	public String toString() {
		return addrress + " " + rent + " " + tenant.toString(); 
	}

}
