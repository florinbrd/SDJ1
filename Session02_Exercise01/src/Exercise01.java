// read int and display sum & product 

import java.util.*; 

public class Exercise01 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.print("Enter three integers: ");
		
		a = scanner.nextInt(); 
		b = scanner.nextInt(); 
		c = scanner.nextInt(); 
		
		System.out.println("Sum is " + (a+b+c));
		System.out.println("Product is " + (a*b*c));
	}

}
