import java.util.*;

public class RomanNumbers {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a; 
		
		System.out.println("Enter a number: ");
		a = scanner.nextInt(); 
		
		if(a == 1) {
			System.out.println("I");
		} else if (a == 2) {
			System.out.println("II");
		} else if (a == 3) {
			System.out.println("III");
		} else if (a == 4) {
			System.out.println("IV");
		} else if (a == 5) {
			System.out.println("V");
		} else if (a == 6) {
			System.out.println("VI");
		} else if (a == 7) {
			System.out.println("VII");
		} else if (a ==8) {
			System.out.println("VII");
		} else if (a ==9) {
			System.out.println("IX");
		} else if (a == 10) {
			System.out.println("X");
		} else if (a < 1 && a> 10) {
			System.out.println("Wrong number!");
		}
		
	}

}
