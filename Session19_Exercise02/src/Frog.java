
public class Frog extends Animal{
	
	private String color; 
	
	public Frog(int age, String color) {
		super(age);
		this.color = color;
	}
	
	public String speak() {
		return "oaaaak";
	}
	
	public String toString() {
		return super.toString() + " " + color; 
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Frog)) {
			return false; 
		}
		
		Frog other = (Frog) obj; 
		
		return super.equals(other) && color.equals(other.color);
	}

}
