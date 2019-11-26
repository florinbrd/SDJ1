
public class BankChecksFeesTest {
	
	public static void main(String[] args) {
		
		BankChecksFees account = new BankChecksFees();
		
		account.displayAccount();
		
		account.setBalance(200);
		
		account.setChecks(999999);
		
		account.displayAccount();
		
		
	}

}
