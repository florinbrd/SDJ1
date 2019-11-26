import java.util.*;

public class Grades {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your grade");
		int grade = scanner.nextInt(); 
		
		if(grade == 12) {
			System.out.println("A");
		} else if (grade == 10) {
			System.out.println("B");
		} else if (grade ==7) {
			System.out.println("C");
		} else if(grade == 4) {
			System.out.println("D");
		} else if(grade ==2) {
			System.out.println("E");
		} else if(grade == 0) {
			System.out.println("Fx");
		} else {
			if(grade == -3) {
				System.out.println("F");
			} else {
				System.out.println("Try a different education.");
			}
		}
	}

}
