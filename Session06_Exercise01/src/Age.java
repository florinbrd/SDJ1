import java.util.*;

public class Age {
	
	public static void main(String[] args) {
		
		int age; 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an age: ");
		age = scanner.nextInt(); 
		
		if (age<0) {
			System.out.println("error");
		} else if (age >=0 && age <= 12) {
			System.out.println("Child");
		} else if(age >=13 && age<=19) {
			System.out.println("Teenager");
		} else if(age >=20 && age <= 65) {
			System.out.println("Adult");
		} else if(age> 65) {
			System.out.println("Senior");
		} else {
			System.out.println("How old you really are?");
		}
	}

}
