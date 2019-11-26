import java.util.*;


public class Exercise04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double[] array = new double[5];
		double sum = 0;
		
		for(int i=0; i<array.length ; i++) {
			System.out.println("Enter a number: ");
			array[i] = scanner.nextDouble(); 
		}
		
		for (int i =0; i<array.length; i++) {
			sum += array[i];
		}
		
		System.out.println("You average is: " + (sum/array.length));
		
		
	}
}
