import java.util.*;

public class LoopSum {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a positive number: ");
		int x = scanner.nextInt(); 
		int sum = 0; 
		
		if (x>0) {
			for(int i = 1; i<=x; i++) {
				sum += i; 
			}
		}
		
		System.out.println(sum);
	}

}
