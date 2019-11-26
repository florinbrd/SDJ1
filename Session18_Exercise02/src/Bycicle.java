
public class Bycicle extends Vehicle{
	
	private int gears;

	public Bycicle(String owner, double price, int gear) {
		super(owner, price);
		this.gears = gear; 
	}
	
	public void setGears(int gear) {
		this.gears = gear;
	}
	
	public int getGear() {
		return gears; 
	}
	
	public String toString() {
		return super.toString() + " " + gears;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Bycicle)) {
			return false; 
		}
		
		Bycicle other = (Bycicle) obj;
		
		return super.equals(other) && gears == other.gears; 
	}

}
