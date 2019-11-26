
public class Payroll {
	
	private String emploString; 
	private int hourPay, noHours; 
	
	public Payroll(String emploString, int hourPay, int noHours) {
		this.emploString = emploString; 
		this.hourPay = hourPay; 
		this.noHours = noHours; 
	}
	
	public Payroll() {
		
	}
	
	public void setEmployeeName(String nameString) {
		emploString = nameString; 
	}
	
	public void setHours(int hours) {
		hourPay = hours; 
	}
	
	public void setNoHours(int nhours) {
		noHours = nhours; 
	}
	
	public String getName() {
		return emploString; 
	}
	
	public int getHourPay() {
		return hourPay; 
	}
	
	public int getNoHours() {
		return noHours; 
	}
	
	public String getGrossPay() {
		return "Gross pay for " + emploString + "  is " + hourPay * noHours; 
	}
	
	
	

}
