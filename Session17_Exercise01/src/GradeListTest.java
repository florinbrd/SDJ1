
public class GradeListTest {
	
	public static void main(String[] args) {
		
		Grade grades1 = new Grade("Math", 10);
		Grade grades2 = new Grade("English", 10);
		
		GradeList test = new GradeList();
		
		test.addGrade(grades1);
		test.addGrade(grades2);
		
		test.getNumberOfGrades();
		
		test.getAllGrades();
		
	
		
		System.out.println(test.getNumberOfGrades());
		
		System.out.println(test.getAllGrades());
		
		System.out.println(test.getAverage());
		
		System.out.println(test.toString());
		
		
	}

}
