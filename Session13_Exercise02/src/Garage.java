

public class Garage {
	
	private Car carposition1; 
	private Car carposition2; 
	
	public Garage() {
		carposition1 = null; 
		carposition2 = null; 
	}
	
	public boolean isParkingTaken(int position) {
		return ((position ==1 && carposition1 != null) || (position ==2 && carposition2!= null));
	}
	
	public void Park(Car car, int position) {
		if(position == 1 && !isParkingTaken(position)) {
			carposition1 = car;
		}
		else if(position ==2 && !isParkingTaken(position)) {
			carposition2 = car; 
		}
	}
	
	public Car leaveGara(int position) {
		Car temp; 
		
		if (position ==1 ) {
			temp = carposition1; 
			carposition1 = null; 
			return temp; 
		}
		else if (position ==2) {
			temp = carposition2; 
			carposition2 = null; 
			return temp; 
		} else {
			return null; 
		}
	}
	
	public String toString() {
		String returnString = " ";
		
		if(carposition1 == null) {
			returnString += "Garage position 1 empty";
		}
		else {
			returnString += "Garage position 1" + carposition1; 
		}
		
		if (carposition2 == null) {
			returnString += "Garage position 2 empty";
		} else {
			returnString += "Garage position 2" + carposition2; 
		} return returnString; 
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Garage)) {
			return false; 
		}
		
		Garage other = (Garage) obj; 
		
		if(carposition1 != null && carposition2 !=null) {
			return carposition1.equals(other.carposition1) && carposition2.equals(other.carposition2);
		}
		else if (carposition1 == null && carposition2 == null) {
			return other.carposition1 == null && other.carposition2 == null; 
		}
		else if(carposition1 == null) {
			return other.carposition1 == null && carposition2.equals(other.carposition2);
		} 
		else if (carposition2 == null) {
			return other.carposition2 == null && carposition1.equals(other.carposition1);
		} else {
			return false; 
		}
	}
	
}


