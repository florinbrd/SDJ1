
public class Garage {
	
	private Car position1;
	private Car position2; 
	
	public Garage() {
		position1 = null; 
		position2 = null; 
	}
	
	public boolean isParkingAreaTaken(int position) {
		return ((position == 1 && position1 != null) || (position == 2 && position2 != null));
	}
	
	public void park(Car car, int position) {
		if(position == 1 && !isParkingAreaTaken(position)) {
			position1 = car;
		} else if (position == 2 && !isParkingAreaTaken(position)) {
			position2 = car; 
		}
	}
	
	public Car leaveGarage(int position) {
		Car temp; 
		
		if(position ==1) {
			temp = position1; 
			position1 = null; 
			return temp;
		}
		
		else if (position ==2) {
			temp = position2;
			position2 = null; 
			return temp; 
		}
		else {
			return null; 
		}
	}
	
	public String toString() {
		String returnString = "";
		
		if(position1 == null) {
			returnString ="Garage position 1 is empty";
		} else {
			returnString = "Garage position 1 " + position1;
		}
		if(position2 == null) {
			returnString = "Garage position 2 is empty";
		} else {
			returnString = "Garage position 2: " + position2;
		}
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Garage)) {
			return false; 
		}
		
		Garage other = (Garage) obj;
		
		if(position1 != null && position2 != null) {
			return position1.equals(other.position1) && position2.equals(other.position2);
		} else if (position1 == null && position2 == null) {
			return other.position1 == null && other.position2 == null; 
		} else if (position1 != null && position2 == null) {
			return position1.equals(other.position1) && other.position2 == null;
		} else if (position1 == null && position2 != null) {
			return other.position1 == null && position2.equals(other.position2);
		} else {
			return false;
		}
	}
}
