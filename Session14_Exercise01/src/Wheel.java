
public class Wheel {
	
	private int diameter, width; 
	
	public Wheel(int diameter, int width) {
		this.diameter = diameter; 
		this.width = width; 
	}
	
	public int getDiameter() {
		return diameter; 
	}
	
	public int getWidth() {
		return width; 
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Wheel)) {
			return false;
		}
		
		Wheel other = (Wheel) obj; 
		
		return width == other.width && diameter == other.diameter; 
	}
	
	public String toString() {
		return diameter + " " + width; 
	}

}
