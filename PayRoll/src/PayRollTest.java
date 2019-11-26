import java.util.*;

public class PayRollTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Payroll person1 = new Payroll(); 
		
		System.out.println("Introduce the name: ");
		person1.setEmployeeName(scanner.nextLine());
		
		System.out.println("Introduce the number of hours:");
		person1.setNoHours(scanner.nextInt());
		
		System.out.println("Introduce the hourly pay: ");
		person1.setHours(scanner.nextInt());
		
		System.out.println(person1.getGrossPay());
		
	}

}
