

public class Person {
	
	private String name; 
	private Car car; 
	
	public Person(String name) {
		this.name = name; 
		car = null; 
	}
	
	public String getName() {
		return name; 
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public void buyCar(Car car) {
		this.car = car; 
	}
	
	public void sellCar() {
		this.car = null; 
	}
	
	public Car getCar() {
		return car; 
	}
	
	public String toString() {
		return name + " " + car; 
	}
	

	
	

}
