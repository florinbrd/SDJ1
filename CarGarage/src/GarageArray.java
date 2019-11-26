
public class GarageArray {
	

public class Garage {
	
	private Car[] cars;
	
	public Garage (int size) {
		cars = new Car[size];
	}
	
	public Garage() {
		cars = new Car[1];
	}
	
	public boolean isParkingAreaTaken(int position) {
		
		if(position < cars.length) {
			return cars[position] != null;
		}
		else {
			return false; 
		}
	}
	
	public void park(Car car, int position) {
		if(position < cars.length)
		{
			if(!isParkingAreaTaken(position)) {
				cars[position] = car;
			}
		}
	}
	
	public Car leaveGarage(int position) {
		Car temp = null; 
		
		if(position < cars.length) {
			temp = cars[position];
			cars[position]=null;
		}
		return temp; 
	}
	
	public String toString() {
		
		String returnString =" ";
		
		for(int i=0; i<cars.length; i++) {
			if(cars[i] == null) {
				returnString += "Empty\n";
			} else {
				returnString += cars[i] + "\n";
			}
		} return returnString; 
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Garage)) {
			return false; 
		}
		
		Garage other = (Garage) obj;
		
		if(cars.length != other.cars.length) {
			return false; 
		}
		else {
			for(int i =0; i< cars.length; i++) {
				if(cars[i] == null && other.cars[i] == null) {
					return false; 
				}
				else if (cars[i] != null) {
					if(!(cars[i].equals(other.cars[i]))) {
						return false;
					}
				}
			} return true; 
		}
	}

}


}
