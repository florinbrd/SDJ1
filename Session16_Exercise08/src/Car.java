
public class Car {
	
	private String model, license; 
	
	public Car(String model, String license) {
		this.model = model; 
		this.license = license; 
	}
	
	public void setModel(String model) {
		this.model = model; 
	}
	
	public String getModel() {
		return model; 
	}
	
	public void setLicense(String license) {
		this.license = license; 
	}
	
	public String getLicense() {
		return license; 
	}
	
	public Car copy() {
		return new Car(model, license);
	}
	
	public String toString() {
		return model +" " + license; 
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Car)) {
			return false; 
		}
		
		Car other = (Car) obj;
		
		return model == other.model && license == other.license ; 
	}
	
	

}
