
public class BankChecksFees {
	
	private double checks, balance, fees; 
	
	public BankChecksFees () {
		this.checks = 0; 
		this.balance = 0; 
		this.fees = 10; 
	}
	
	public void setChecks(double checks) {
		this.checks = checks; 
		
		if (checks < 20) {
			 setFees(0.10);
			 this.balance -= fees;
		} else if(checks >= 20 && checks <= 39) {
			setFees(0.08);
			this.balance -= fees; 
		} else if (checks >= 40 && checks <= 59) {
			setFees(0.06);
			this.balance -= fees;
		} else if (checks >= 60) {
			setFees(0.04);
			this.balance -= fees;
		}
	}
	
	public void setBalance(double balance) {
		this.balance = balance; 
		if (balance < 0) {
			this.fees += 15; 
		}
	}
	
	public void setFees(double fees) {
		this.fees += fees * getChecks(); 
	}
	
	public double getChecks() {
		return checks; 
	}
	
	public double getBalance() {
		return balance; 
	}
	
	public double getFees() {
		return fees; 
	}
	
	public void displayAccount() {
		System.out.println("balance:  " + balance + " number of checks: " + checks + "total fees" + fees );
	}

}
