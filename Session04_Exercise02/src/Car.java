
public class Car {
	
	private int yearModel; 
	private String make; 
	private double speed; 
	
	public Car(int yearModel, String make) {
		this.yearModel = yearModel; 
		this.make = make; 
		this.speed =0; 
	}
	
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel; 
	}
	
	public void setMake(String make) {
		this.make = make; 
	}
	
	public void setSpeed(double speed) {
		this.speed = speed; 
	}
	
	public int getYearModel() {
		return yearModel; 
	}
	
	public String getMake() {
		return make; 
	}
	
	public double getSpeed() {
		return speed; 
	}
	
	public void accelerate() {
		this.speed += 5; 
	}
	
	public void breakspeed() {
		this.speed -= 5; 
	}
	
	public String toString() {
		return "Your car is from " + yearModel + ", model: " + make + 
				" and it's running with this speed: " + speed; 
	}
	
	
	

}
