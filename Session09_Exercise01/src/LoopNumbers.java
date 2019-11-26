import java.util.*;

public class LoopNumbers {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int x = scanner.nextInt(); 
		
		System.out.println();
		
		for(int i = 1; i <= x; i++) {
			System.out.print(i  + " ");
		}
		
		System.out.println();
		
		for(int i = 1; i <= x; i++) {
			System.out.print(i * 2  + " ");
		}
		
		System.out.println();
		
		for(int i = 1; i <= x; i++) {
			if (i % 2 == 0) {
				System.out.print(i  + " ");
			}
		}
		
		System.out.println();
		
		for(int i = 1; i <= x; i++) {
			System.out.print(Math.pow(i, 2) + " ");
		}
		
	}

}
