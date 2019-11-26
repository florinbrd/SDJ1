//read strings and display 

import java.util.*;


public class Exercise_03 {
	
	public static void main(String[] args) {
		
		Scanner objScanner = new Scanner(System.in);
		
		String name, address, city; 
		
		System.out.print("Enter your name: ");
		name = objScanner.nextLine(); 
		
		System.out.print("Enter your address: ");
		address = objScanner.nextLine(); 
		
		System.out.print("Enter your city:  ");
		city = objScanner.nextLine(); 
		
		System.out.println(name);
		System.out.println(address);
		System.out.println(city);
		
	}

}
