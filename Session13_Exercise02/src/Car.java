
public class Car {
	
	private String make, model, color, license; 
	private int year;
	
	
	public Car(String make, String model, String color, String license, int year) {
		this.make = make; 
		this.model = model; 
		this.color = color; 
		this.license = license; 
		this.year = year; 
		
	}
	
	public Car(String make, String model, String color, int year) {
		this.make = make; 
		this.model = model; 
		this.color = color; 
		this.year = year; 
		license = null; 
	}
	
	
	
	public String getMake() {
		return make; 
	}
	
	public String getModel() {
		return model; 
	}
	
	public String getColor() {
		return color;
	}
	
	public String getLicense() {
		return license; 
	}
	
	public int getYear() {
		return year; 
	}
	
	public void setColor(String color) {
		this.color = color; 
	}
	
	public void setLicense(String license) {
		this.license = license; 
	}
	
	public Car copy() {
		return new Car(make, model, color,license, year);
	}
	
	public String toString() {
		return " " + make + " " + model + " " + color + " " + year + " " + license; 
		}
	
	public boolean equals(Car other) {
		
		if(!(other instanceof Car)) {
			return false; 
		}
		
		Car obj = (Car) other; 
		
		return make == other.make && model == other.model && color == other.color && year == other.year && license == other.license; 
		
	}

}
