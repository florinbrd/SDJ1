import java.util.*;

public class BankAccountTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		BankAccount account= new BankAccount(0.02);
		
		int choice = 0; 
		double amount = 0; 
		
		do {
			System.out.println("1 to display balance");
			System.out.println("2 to display interest rate");
			System.out.println("3 to change the interest rate");
			System.out.println("4 to add interest");
			System.out.println("5 to withdraw");
			System.out.println("6 to deposit");
			System.out.println("9 to quit");
			
			if (choice == 1) {
				System.out.println(account.getBalance());
			} 
			
			else if (choice == 2) {
				System.out.println(account.getInterestRate());
			} 
			
			else if (choice == 3) {
				System.out.println("Enter your new interest rate: ");
				amount = scanner.nextDouble(); 
				account.setInterestRate(amount);
				System.out.println(account.getInterestRate());
			}
			
			else if (choice ==4) {
				account.addInterest();
				System.out.println("Interest added");
			}
			
			else if (choice == 5) {
				System.out.println("Enter the amount to withdraw");
				amount = scanner.nextDouble(); 
				account.withdraw(amount);
				System.out.println(amount + "has been withdrawned");
			}
			
			else if (choice == 6) {
				System.out.println("How much do you want to deposit?");
				amount = scanner.nextDouble(); 
				account.deposit(amount);
				System.out.println("Done");
			}
			
			else if (choice ==9) {
				System.out.println("Bye bye");
			}
			
			else {
				System.out.println("Error");
			}
			
			
		} while(choice != 9);
	}

}
