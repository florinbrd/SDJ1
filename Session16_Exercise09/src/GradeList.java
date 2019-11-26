
public class GradeList {
	
	private int[] grades; 
	
	public GradeList(int numberOfGrades) {
		grades = new int[numberOfGrades];
	}
	
	public int getNumberOfGrades() {
		return grades.length;
	}
	
	public int getGrade(int index) {
		return grades[index];
	}
	
	public void setGrade(int grade, int index) {
		grades[index] = grade;
	}
	
	public double getAverage() {
		double sum =0; 
		for(int i=0; i< getNumberOfGrades() ; i++) {
			sum += grades[i];
		}
		
		return (sum/ grades.length);
	}
	
	public boolean equals(Object obj) {
		
		boolean bool = true; 
		
		if(!(obj instanceof GradeList)) {
			bool = false; 
		}
		
		
		GradeList other = (GradeList) obj; 
		
		
		if(grades.length != other.grades.length) {
			bool = false; 
		}
		
		else {
			
			for(int i =0; i< grades.length; i++) {
				
				if( grades[i] == other.grades[i]) {
					
					bool = true;
				} else {
					
					bool = false; 
				}
				
			}
			
		} return bool; 
	}
}
