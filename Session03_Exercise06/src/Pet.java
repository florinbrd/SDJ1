
public class Pet {
	
	private String name, type;
	private int age; 
	
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public void setType(String type) {
		this.type = type; 
	}
	
	public void setAge(int age) {
		this.age = age; 
	}
	
	public String getName() {
		return name; 
	}
	
	public String getType() {
		return type; 
	}
	
	public int getAge() {
		return age; 
	}
	
	public String toString() {
		return "Your pet has the name of: " + name + ", and it is a: " + type + ", age: " + age; 
	}

}
