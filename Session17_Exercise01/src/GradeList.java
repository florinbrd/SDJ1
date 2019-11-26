import java.util.ArrayList;


public class GradeList {
	
	private ArrayList<Grade> grades;
	
	public GradeList() {
		grades = new ArrayList<Grade>();
	}
	
	public int getNumberOfGrades() {
		return grades.size();
	}
	
	public Grade[] getAllGrades() {
		
		Grade[] gradeArray = new Grade[grades.size()];
		
		return grades.toArray(gradeArray);
	}
	
	public void addGrade(Grade grade) {
		grades.add(grade);
	}
	
	public double getAverage() {
		
		double sum = 0; 
		
		for(int i =0; i< grades.size(); i++) {
			sum += grades.get(i).getGrade();
		}
		
		return sum / grades.size();
	}
	
	public String toString(){
		
		String returnString =" ";
		
		for(int i =0; i< grades.size(); i++) {
			returnString += " " + grades.get(i).toString();
		}
		
		return returnString;
	}
	
	

}
