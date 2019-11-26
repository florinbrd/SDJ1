// string manipulator 

import java.util.*; 

public class Exercise02 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the name of your favorite city: ");
		
		String city = input.nextLine(); 
		
		System.out.println(city.length());
		System.out.println(city.toUpperCase());
		System.out.println(city.toLowerCase());
		System.out.println(city.charAt(0));
		
		
	}

}
