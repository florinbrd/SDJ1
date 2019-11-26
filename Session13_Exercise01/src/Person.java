
public class Person {
	
	private String name, address;
	private MyDate birthday;
	
	public Person(String address, String name, MyDate birthday) {
		this.address = address; 
		this.name = name; 
		this.birthday = birthday.copy(); 
	}
	
	public Person(String name, MyDate birthday) {
		this.name = name; 
		this.birthday = birthday.copy(); 
	}
	
	public Person(MyDate birthday) {
		this.birthday = birthday; 
	}
	
	public Person copy() {
		return new Person(address, name, birthday);
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
	
	public void setAddress() {
		this.address = address; 
	}
	
	public MyDate getBirthday() {
		return birthday; 
	}
	
	public String toString() {
		return name + " " + address + " " + birthday; 
	}
	
	public boolean equals(Person other) {
		if (!(other instanceof Person)) {
			return false; 
		}
		
		Person obj = (Person) other; 
		
		return name == other.name && address == other.address && birthday == other.birthday; 
	}
}
