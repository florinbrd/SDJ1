
public class Circle {

	private double radius; 
	private Point center;
	
	public Circle(double radius, Point center) {
		this.radius = radius; 
		this.center = center.copy(); 
	}
	
	public Point getCenter() {
		return center; 
	}
	
	public double getRadius() {
		return radius; 
	}
	
	public void move(double dx, double dy) {
		center.move(dx, dy);
	}
	
	public double getAreA() {
		return radius * radius * Math.PI;
	}
	
	public String toString() {
		return center.toString() + " " + radius; 
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Circle)) {
			return false; 
		}
		
		Circle other = (Circle) obj; 
		
		return center.equals(other.center) && radius == other.radius; 
	}
	
	

}
