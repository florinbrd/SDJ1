
public class GarageTest {
	
	public static void main(String[] args) {
		
		Car car1 = new Car("sdsd", "sdfsdf", "sdfsdf", 1999);
		Car car2 = car1.copy(); 
		
		Garage parking1 = new Garage(); 
		Garage parking2 = new Garage(); 
		
		parking1.isParkingTaken(1);
		
		parking1.Park(car1, 1);
		
		parking1.isParkingTaken(1);
		
		System.out.println(parking1);
	}

}
