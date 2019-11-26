import java.util.*;

public class PetTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Pet test1 = new Pet(); 
		
		System.out.println("Enter the name of your pet: ");
		test1.setName(scanner.nextLine());
		
		System.out.println("Enter the type: ");
		test1.setType(scanner.nextLine());
		
		System.out.println("Age: ");
		test1.setAge(scanner.nextInt());
		
		System.out.println(test1);
	}

}
