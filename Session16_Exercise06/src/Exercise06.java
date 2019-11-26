import java.util.Scanner;


public class Exercise06 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] array1 = new int[4];
		int[] array2 = new int[4];
		int[] sum = new int[4];
		
		for (int i=0; i< array1.length; i++) {
			System.out.println("Value for array1: ");
			array1[i] = scanner.nextInt(); 
			System.out.println("Value for array2: ");
			array2[i] = scanner.nextInt(); 
			sum[i] = array1[i] + array2[i];
		}
		
		for (int i =0; i< sum.length; i++) {
			System.out.print(sum[i] +" ");
		}
		
	
	
	
	
	
	
	}}
		