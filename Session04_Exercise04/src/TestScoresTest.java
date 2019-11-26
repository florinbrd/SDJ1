import java.util.*;

public class TestScoresTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter score1: ");
		double score1 = scanner.nextDouble(); 
		
		System.out.println("Enter score2: ");
		double score2 = scanner.nextDouble(); 
		
		System.out.println("Enter score 3: ");
		double score3 = scanner.nextDouble(); 
		
		TestScores test = new TestScores(score1, score2, score3);
		
		System.out.println(test.toString());
	}

}
