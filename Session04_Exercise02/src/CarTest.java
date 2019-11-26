
public class CarTest {
	
	public static void main(String[] args) {
		
		Car car1 = new Car(1997, "Honda");
		
		car1.setSpeed(20);
		
		car1.accelerate();
		
		System.out.println(car1.toString());
		
		car1.breakspeed();
		car1.breakspeed();
		
		System.out.println(car1.toString());
		
	}

}
