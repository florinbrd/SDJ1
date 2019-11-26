
public class Payroll {
	
	private String name;
	private double hoursWorked; 
	private double payRate; 
	
	public Payroll() {
		hoursWorked = 0; 
		payRate =0; 
		name = "not set";
	}
	
	public Payroll(String name, double hoursWorked, double payRate) {
		this.hoursWorked = hoursWorked; 
		this.name = name; 
		this.payRate = payRate; 
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked; 
	}
	
	public void setPayRate(double payRate) {
		this.payRate = payRate; 
	}
	
	public String getName() {
		return name; 
	}
	
	public double getHourdWorked() {
		return hoursWorked; 
	}
	
	public double getPayRate() {
		return payRate; 
	}
	
	public String toString() {
		return "Name: " + name +", hours: " + hoursWorked + ", rate: " + payRate; 
	}
	
	// if > 37 hours =>  1h = 1.5 

	public double getGrossPay() {
		
		double grossPay; 
		double overtimePay; 
		
		if (hoursWorked > 37) {
			grossPay = 37 * payRate;
			overtimePay = (hoursWorked - 37) * (payRate * 1.5); 
			grossPay += overtimePay; 
		}
		else {
			grossPay = hoursWorked * payRate; 
		}
		
		return grossPay; 
		}
	}

