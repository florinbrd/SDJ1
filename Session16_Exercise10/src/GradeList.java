
public class GradeList {
	
	private Grade[] grades;
	private int TOTAL; 
	
	
	public GradeList(int numberOfGrades) {
		grades = new Grade[numberOfGrades];
		 
		
	}
	
	public int getNumberOfGrades() {
		return grades.length; 
	}
	
	public Grade getGrade(int index) {
		return grades[index];
	}
	
	public void setGrade(Grade grade, int index) {
		if (index < grades.length) {
			grades[index] = grade; 
			
			
		}
	}
	
	public double getAverage() {
		double sum = 0; 
		
		for(int i =0; i< grades.length; i++) {
			sum += grades[i].getGrade();
		}
		
		return (sum / grades.length);
	}
	
	public String toString() {
		String string = " ";
		for (int i = 0; i < this.getNumberOfGrades(); i++) {
			string += grades[i].toString();
			
	}
		return string; 
}
	
}
