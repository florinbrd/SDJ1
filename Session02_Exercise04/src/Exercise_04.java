// read 3 scores and display the average 

import java.util.*;; 


public class Exercise_04 {
	
	public static void main(String[] args) {
		
		double a,b,c; 
		
		Scanner obScanner = new Scanner(System.in); 
		
		System.out.print("Enter three scores: ");
		a = obScanner.nextDouble(); 
		b = obScanner.nextDouble(); 
		c = obScanner.nextDouble(); 
		
		System.out.println("Average is " + ((a+b+c)/3));
	}

}
