import java.util.*;

public class WhileIteration {
	
	public static void main(String[] args) {
		
		int number; 
		int product = 0; 
		
		Scanner scanner = new Scanner(System.in);
		
		while (product <= 100) {
			
			System.out.println("Enter a number: ");
			number = scanner.nextInt(); 
			product += number * 10; 
		}
		
		System.out.println("out of the loop");
		
	}

}
