
public class Person {
	
	private String name; 
	private String birthday;
	
	public Person(String name, String birthday) {
		this.name = name; 
		this.birthday = birthday; 
	}
	
	public Person() {
		
	}
	
	public void setName(String nameString) {
		name = nameString; 
	}
	
	public void setBirthday(String bday) {
		birthday = bday; 
	}
	
	public String getName() {
		return name; 
	}
	
	public String getBirthday() {
		return birthday; 
	}

}
