
public class Person {
	
	private String name, address;
	private Brain brain; 
	
	public Person(String name, String address) {
		
		this.name = name; 
		this.address = address; 
		brain = new Brain();
	}
	
	public String getName() {
		return name; 
	}
	
	public void SetName() {
		this.name = name; 
	}
	
	public String getAddress() {
		return address; 
	}
	
	public void setAddress(String address) {
		this.address = address; 
	}
	
	public int getIq() {
		int iq = brain.getIQ();
		return iq; 
	}
	
	public boolean isBrainDamaged() {
		if (brain.isBrainDamage()) {
			return true;
		} else {
			return false; 
		}
	}
	
	public boolean doYouRemember(String topic) {
		if (topic == brain.recall()) {
			return true; 
		} else {
			return false; 
		}
	}
	
	public void remeberThis(String topic) {
		if (topic != brain.recall()) {
			brain.remeber(topic);
		} else {
			brain.refreshMemory(topic);
		}
	}
	
	public String whatAreyouthingAbout() {
		return brain.recall();
		
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) {
			return false; 
		}
		
		Person other = (Person) obj;
		
		return name == other.name && address == other.address && brain == other.brain; 
	}
	
	public String toString() {
		return name + " " + address + " " + brain; 
	}

}
