import java.util.*;

public class BankAccountTest {
	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount(200, 0.2);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Current balance: " + account.getBalance());
		
		System.out.println("1 for deposit");
		System.out.println("2 for withdraw");
		System.out.println("3 to change interest");
		
		int choice = 0 ; 
		double amount= 0; 
		
		choice = scanner.nextInt(); 
		
		if(choice == 1)
		{
			System.out.println("Amount to deposit: ");
			amount = scanner.nextDouble(); 
			account.deposit(amount);
		}
		else if(choice ==2 )
		{
			System.out.println("To withdraw:");
			amount = scanner.nextDouble(); 
			account.withdrawal(amount);
		}
		else if (choice == 3)
		{
			System.out.println("New interest rate: ");
			amount = scanner.nextDouble(); 
			account.setInterestRate(amount);
		}
			
		else {
			System.out.println("Wrong value");
		}
		
		System.out.println("Balance: " + account.getBalance());
		System.out.println("Interest rate: " + account.getInterestRate());
	}
	

}
