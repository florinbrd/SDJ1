import java.util.Scanner;


public class Gaddis04 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String name, city, collegeName, profession, animalType, animalName; 
		int age;
		
		System.out.print("Enter a name: ");
		name = input.nextLine(); 
		
		System.out.print("Enter an age: ");
		age = input.nextInt(); 
		
		System.out.print("Enter a city: ");
		city = input.nextLine(); 
		
		System.out.print("Enter a college name: ");
		collegeName = input.nextLine(); 
		
		System.out.print("Enter a profession: ");
		profession = input.nextLine(); 
		
		System.out.print("Enter an animal type: ");
		animalType = input.nextLine(); 
		
		System.out.print("Enter an animal name: ");
		animalName = input.nextLine(); 
		
		System.out.println("There was once a person called " + name + " who lived in " + city + ". At the age of " + age + ", " + name + " went to college at " + collegeName );
		System.out.println(name + " graduated and went to work as a " + profession + ". Then, " + name +" adopted a " + animalType + " called " + animalName );
		System.out.println("They both lived happily ever after ");

	}

}
