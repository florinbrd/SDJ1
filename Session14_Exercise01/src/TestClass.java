
public class TestClass {
	
	public static void main(String[] args) {
		
		Wheel wheel1 = new Wheel(14, 165);
		Wheel wheel2 = new Wheel(14, 165);
		Wheel wheel3 = new Wheel(14, 165);
		Wheel wheel4 = new Wheel(14, 165);
		
		Date manufactureDate = new Date(1, 10, 2000);
		
		Car car = new Car("BMW", "I3", "green", manufactureDate);
		
		car.setColor("blue");
		car.setWheel(wheel1, 1);
		car.setWheel(wheel2, 2);
		car.setWheel(wheel3, 3);
		car.setWheel(wheel4, 4);
		
		Person person = new Person("Bob");
		
		person.buyCar(car);
		
		System.out.println(person.toString());
	}

}
