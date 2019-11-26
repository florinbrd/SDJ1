import java.util.*;

public class GuessNumber {
	
	public static void main(String[] args) {
		
		Random random = new Random(); 
		int x = random.nextInt(1000) + 1;
		Scanner scanner = new Scanner(System.in);
		int y; 
		
		do {
			System.out.println("Enter a number: ");
			y = scanner.nextInt(); 
			
			if (y<x) {
				System.out.println("Your number is smaller");
			} else {
				System.out.println("Your number is bigger");
			}
			System.out.println("Try again!");

		} while(!(y==x));
		
		
	}
	

}
