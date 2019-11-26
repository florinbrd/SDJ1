
public abstract class Pet  extends Animal{
	
	private String name; 
	
	public Pet(int age, String name) {
		super(age);
		this.name = name; 
	}
	
	public String toString() {
		return super.toString() + " " + name; 
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Pet)) {
			return false; 
		}
		
		Pet other = (Pet) obj; 
		
		return super.equals(other) && name.equals(other.name);
	}

}
