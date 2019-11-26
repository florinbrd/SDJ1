
public class Person {
	
	private String name, surname; 
	
	public Person(String name, String surname) {
		
		this.name = name; 
		this.surname = surname; 
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public void setSurname(String surname) {
		this.surname = surname; 
	}
	
	public String getName() {
		return name; 
	}
	
	public String getSurname() {
		return surname; 
	}
	
	public String toString() {
		return " " + name + " " + surname; 
	}

}
