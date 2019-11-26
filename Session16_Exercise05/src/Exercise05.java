import java.util.*;


public class Exercise05 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] array1 = new int[4];
		int[] array2 = new int[4];
		
		for (int i=0; i< array1.length; i++) {
			System.out.println("Value for array1: ");
			array1[i] = scanner.nextInt(); 
			System.out.println("Value for array2: ");
			array2[i] = scanner.nextInt(); 
		}
		
	
	
		
		if ( array1.length != array2.length) {
			System.out.println("They are not equal");
		}
		else {
			System.out.println("Their size is equal but let's see the elements");
			for(int i=0; i< array1.length; i++ ) {
				if(array1[i] != array2[i]) {
					System.out.println("they are not identical");
				} else {
					System.out.println("Elements on position: " + i + "They are identical ");
				}
			}
		}
	}

}
