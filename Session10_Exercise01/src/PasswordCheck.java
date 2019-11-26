import java.util.*;

public class PasswordCheck {
	
	public static void main(String[] args) {
		
	
	String account, pass, passconfirmation; 
	Scanner scanner = new Scanner(System.in);
	
	do {
		System.out.println("Enter your password: ");
		pass = scanner.nextLine(); 
		System.out.println("Enter your confirmation password: ");
		passconfirmation = scanner.nextLine(); 
		
		if(!(pass.equals(passconfirmation))) {
			System.out.println("Invalid password");
		}
		
	} while(!(pass.equals(passconfirmation)));
	
	System.out.println("Correct passwords!");

}}

