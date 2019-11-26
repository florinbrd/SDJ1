import java.util.*;


public class LoopWords {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String string = " ";
		
		do {
			System.out.print("Enter a word: ");
			string = scanner.nextLine();
			
			for(int i = string.length() - 1 ; i >= 0; i--) {
				System.out.print(string.charAt(i));
				
			} System.out.println();
		}while (!string.equalsIgnoreCase("exit")) ;
		
		System.out.println("out of the loop");
				
			
		
		
	}

}
