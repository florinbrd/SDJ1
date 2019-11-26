import java.time.Year;

public class Car {
	
	private String make;
	private String model;
	private String color;
	private Wheel wheel1; 
	private Wheel wheel2; 
	private Wheel wheel3; 
	private Wheel wheel4;  
	private Date manufactureDate;
	
	public Car(String make, String model, String color, Date mdate) {
		this.make = make; 
		this.model = model; 
		this.color = color; 
		wheel1 = null; 
		wheel2 = null; 
		wheel3 = null; 
		wheel4 = null; 
		manufactureDate = mdate.copy();
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
	
	public void setColor(String color) {
		this.color = color; 
	}
	
	public Wheel getWheel(int position) {
		if(position == 1) {
			return wheel1; 
		}
		else if (position == 2) {
			return wheel2;
		}
		else if (position == 3) {
			return wheel3; 
		} 
		else if (position == 4) {
			return wheel4; 
		}
		else {
			return null; 
		}
	}
	
	public void setWheel(Wheel wheel, int position) {
		if (position == 1) {
			wheel1 = wheel;
		}
		else if (position ==2) {
			wheel2 = wheel; 
		}
		
		else if(position == 3) {
			wheel3 = wheel; 
		}
		else if (position == 4) {
			wheel4 = wheel; 
		}}
		
		public Date getManufactureDate() {
			return  manufactureDate.copy(); 
		}
		
		public String toString() {
			return make + " " + model + " " + color + " " + wheel1 + " " + wheel2 + " " + wheel3 + " " +  wheel4 + " " + manufactureDate.copy(); 
		}
	

}
