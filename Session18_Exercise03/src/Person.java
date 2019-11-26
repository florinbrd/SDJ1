
public class Person {
	
	private String address, name;
	private int telNo; 
	
	public Person(String address, String name, int telNo) {
		this.address = address; 
		this.name = name;  
		this.telNo = telNo; 
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public String getAddress() {
		return address; 
	}
	
	public void setAddress(String address) {
		this.address = address; 
	}
	
	public int getTelNo() {
		return telNo; 
	}
	
	public void setTelNo(int telNo) {
		this.telNo = telNo;
	}
	
	public String toString() {
		return name + " " + address +" " + telNo;
	}

	
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) {
			return false; 
		}
		
		Person other = (Person) obj;
		
		return name.equals(other.name) && address.equals(other.address) && telNo == other.telNo;
	
	}
	}
