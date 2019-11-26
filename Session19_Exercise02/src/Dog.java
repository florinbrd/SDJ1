
public class Dog extends Pet {

	public String breed; 
	
	public Dog(int age, String name, String breed) {
		super(age, name);
		this.breed = breed;
	}
	
	public String speak() {
		return "bark bark";
	}
	

}
