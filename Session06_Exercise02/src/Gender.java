import java.util.*;

public class Gender {
	
	public static void main(String[] args) {
		
		int age; 
		char gender; 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your age and gender: ");
		age = scanner.nextInt(); 
		String answerString = scanner.nextLine().toLowerCase();
		gender = answerString.charAt(1);
		
		if (age < 0 && gender != 'm' && gender != 'f') {
			System.out.println("Error in your values");
		} else if (age <18) {
			if(gender == 'm') {
				System.out.println("You are a boy");
			} else if(gender == 'f') {
				System.out.println("You are a girl");
			} else {
				System.out.println("Your gender is wrong!");
			}
		} else if (age>= 18) {
			if (gender == 'm') {
				System.out.println("You are a man!");
			} else if (gender == 'f') {
				System.out.println("You are a woman");
			}
		} else {
			System.out.println("Looks like we are done here!");
		}
	}

}
