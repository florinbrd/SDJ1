
public class GarageTest {
	
	public static void main(String[] args) {
		
		Garage garage1 = new Garage(4);
		Garage garage2 = new Garage(4);
		
		Car car1 = new Car("BMW", "AMAM");
		Car car2 = new Car("Audi", "Sdsdfsd");
		
		garage1.park(car1, 1);
		garage2.park(car2, 2);
		
		System.out.println(garage1);
		System.out.println(garage2);
	}

}
