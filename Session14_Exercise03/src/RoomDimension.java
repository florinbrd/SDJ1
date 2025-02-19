
public class RoomDimension {
	
	private double length, width; 
	
	public RoomDimension(double len, double w) {
		length = len; 
		width = w; 
	}
	
	public double getArea() {
		return length * width; 
	}
	
	public String toString() {
		return length + " " + width + " " + getArea(); 
	}

}
