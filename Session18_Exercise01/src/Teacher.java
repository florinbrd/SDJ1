
public class Teacher extends Person {
	
	private double payRate;
	private double hours;
	
	public Teacher(String name, String address, double payRate, double hours) {
		super(address, name);
		this.payRate = payRate; 
		this.hours = hours; 
	}
	
	public double getPayRate() {
		return payRate; 
	}
	
	public void setPayRate(double payRate) {
		this.payRate = payRate; 
	}
	
	public double getHours() {
		return hours; 
	}
	
	public void setHours(double hours) {
		this.hours = hours; 
	}
	
	public double getSalary() {
		return hours * payRate; 
	}
	
	public String toString() {
		return super.toString() + " " + hours + " " + payRate;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Teacher)) {
			return false; 
		}
		
		Teacher other = (Teacher) obj;
		
		return super.equals(other) && payRate == other.payRate && hours == other.hours; 
	}
	
	
	
	

}
