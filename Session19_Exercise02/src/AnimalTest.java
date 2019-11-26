
public class AnimalTest {

	public static void main(String[] args) {
		
	Animal[] animals = new Animal[5];
	
	animals[0] = new Bee(20);
	animals[1] = new Dog(20, "Bob", "wolf");
	animals[2] = new Frog(20, "green");
	animals[3] = new Cat("Jessy", 20);
	
	Pet[] pets = new Pet[2];
	pets[0] = new Cat("Jessy", 20);
	pets[1] = new Dog(20, "MyDog", "notaWolf");
	
	System.out.println(animals[0]);
	System.out.println(animals[1].speak());
	System.out.println(animals[3].equals(pets[0]));

	
	
	
	}

}
