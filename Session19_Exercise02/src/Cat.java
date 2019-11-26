
public class Cat extends Pet{

	private boolean isHouseCat;
	
	public Cat(String name, int age) {
		super(age, name);
		isHouseCat = false; 
	}
	
	public String speak() {
		return "meeeoooooooowwwwww";
	}
	
	public String toString() {
		return super.toString() + " " + isHouseCat;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Cat)) {
			return false; 
		}
		
		Cat other = (Cat) obj; 
		
		return super.equals(other) && isHouseCat == other.isHouseCat; 
	}

}
