
public class Person {
	
	private String address, name; 
	
	public Person(String address, String name) {
		this.address = address; 
		this.name = name; 
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
	
	public String toString() {
		return name + " " + address;
	}

	
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) {
			return false; 
		}
		
		Person other = (Person) obj;
		
		return name.equals(other.name) && address.equals(other.address);
	
	}
	}
