import java.util.*;


public class OrderNumbers {
	
	public static void main(String[] args) {
		
		int a,b,c,d;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter four numbers: ");
		
		a = scanner.nextInt(); 
		b = scanner.nextInt(); 
		c = scanner.nextInt();
		d = scanner.nextInt(); 
		
		// order two numbers
		
		if (a>b)
			System.out.println(" " + b + " " + a);
		else {
			System.out.println(" " + a +  " " + b);
		}
		
		// order three numbers
		if(a>b) {
			int temp = a; 
			a = b; 
			b = temp; 
		}
		
		if (b>c) {
			int temp = b;
			b = c; 
			c = temp;
		}
		
		if(a>b) {
			int temp = a; 
			a = b; 
			b = temp; 
		}
		
		System.out.println(" " + a +" " + b + " " + c);
	
	
	// sort four numbers 
	
		if(a>b) {
			int temp = a; 
			a = b; 
			b = temp; 
		}
		
		if(c>d) {
			int temp = c; 
			c=d; 
			d = temp;
		}
		
		if(a>c) {
			int temp = a; 
			a = c; 
			c = temp; 
		}
		
		if (b>d) {
			int temp = b; 
			b = d; 
			d = temp; 
		}
		
		if (b>c) {
			int temp = b; 
			b = c; 
			c = temp; 
		}
		
		
		System.out.println(" " + a +" " + b + " " + c + "  " + d);
	

}}
