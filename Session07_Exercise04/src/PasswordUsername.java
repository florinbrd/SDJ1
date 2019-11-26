import java.util.*;

public class PasswordUsername {
	
	public static void main(String[] args) {
		
	
	String pass, passConfirmation, idString;
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter your id: ");
	idString = scanner.nextLine();
	
	System.out.print("Enter your password: ");
	pass = scanner.nextLine();
	
	System.out.print("Enter your password again: ");
	passConfirmation = scanner.nextLine();
	
	if(passConfirmation.equals(pass)) {
		System.out.println(idString);
		System.out.println(pass);
		System.out.println(passConfirmation);
	} else {
		System.out.println("Wrong info!");
	}
	
	}}
