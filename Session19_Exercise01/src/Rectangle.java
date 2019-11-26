
public class Rectangle extends TwoDimensionalShape {
	
	private double width; 
	private double length; 
	
	public Rectangle(double x, double y, double width, double length) {
	super(x, y);
	this.length = length; 
	this.width = width; 
	}
	
	public double getWidth() {
		return width; 
	}
	
	public double getLength() {
		return length; 
	}
	
	public void setWidth(double width) {
		this.width = width; 
	}
	
	public void setLength(double length) {
		this.length = length; 
	}
	
	public double getArea() {
		return length * width; 
	}

}
