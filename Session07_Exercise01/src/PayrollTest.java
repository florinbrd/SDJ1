import java.util.*;

public class PayrollTest {
	
	public static void main(String[] args) {
		
		String name;
		double hours; 
		double payRate; 
		
		Scanner scanner = new Scanner(System.in);
		
		Payroll payroll1 = new Payroll(); 
		
		System.out.println("Name: ");
		name = scanner.nextLine(); 
		
		System.out.println("Worked hours: ");
		hours = scanner.nextDouble(); 
		
		System.out.println("Hourly pay: ");
		payRate = scanner.nextDouble(); 
		
		payroll1.setName(name);
		payroll1.setHoursWorked(hours);
		payroll1.setPayRate(payRate);
		
		System.out.println(payroll1.toString());
	}
	
	

}
