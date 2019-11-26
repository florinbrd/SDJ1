

public class TestScores {
	
	private double score1, score2, score3; 
	
	public TestScores(double score1, double score2, double score3){
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}
	
	public void setScore1(double score1) {
		this.score1 = score1; 
	}
	
	public void setScore2(double score2) {
		this.score2 = score2; 
	}
	
	public void setScore3(double score3) {
		this.score3 = score3; 
	}
	
	public double getScore1() {
		return score1;
	}
	
	public double getScore2() {
		return score2; 
	}
	
	public double getScore3() {
		return score3; 
	}
	
	public String toString() {
		
		return "Your scores are "+ score1 +"," + score2 +", "+ score3 +
				"and your score average is " + ((score1 + score2 + score3)/3);	
	}
	

}
