
public class CarTest {
	
	public static void main(String[] args) {
		
		Car car1 = new Car("Honda", "XXX", "green", "AMX&X", 1997);
		Car car2 = new Car("BMW", "I3", "blue", 2000);
		Car car3 = car2.copy(); 
		car3.setLicense("AS8798");
		Car car4 = car3.copy(); 
		
		System.out.println(car1.equals(car2));
		System.out.println(car2.equals(car3));
		System.out.println(car3.equals(car4));
	}

}
