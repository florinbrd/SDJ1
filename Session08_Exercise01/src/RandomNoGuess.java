import java.util.*;

public class RandomNoGuess {
	
	public static void main(String[] args) {
		
		int a, random; 
		Scanner scanner = new Scanner(System.in);
		
		
		Random random2 = new Random();
		random = random2.nextInt(10) + 1;
		
		System.out.println(random);
		
		System.out.println("Enter a number: ");
		a = scanner.nextInt(); 
		
		if (a == random) {
			System.out.println("You guessed it");
		} else {
		   System.out.println("You did not guessed it!");
		}
		
		
		
	}

}
