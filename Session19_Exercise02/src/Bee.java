
public class Bee  extends Animal{

	private boolean isAhoneyBee; 
	
	public Bee(int age) {
		super(age);
		isAhoneyBee = false; 
	}
	
	public String speak() {
		return "zzzzzzz.....zzzzzz"; 
	}
	
	public String toString() {
		return super.toString(); 
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Bee)) {
			return false; 
		}
		
		Bee other = (Bee) obj;
		
		return super.equals(other) && isAhoneyBee == other.isAhoneyBee; 
				
	}

}
