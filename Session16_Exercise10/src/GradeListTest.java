
public class GradeListTest {

	public static void main(String[] args) {
		
		Grade grade1 = new Grade("Biology", 10);
		Grade grade2 = new Grade("Geometry", 20);
		Grade grade3 = new Grade("Geometry", 40);
		Grade grade4 = new Grade("Geometry", 10);
		
		GradeList testGradeList = new GradeList(4);
		testGradeList.setGrade(grade1, 0);
		testGradeList.setGrade(grade2, 1);
		testGradeList.setGrade(grade3, 2);
		testGradeList.setGrade(grade4, 3);
		
		System.out.println(testGradeList.getNumberOfGrades());
		System.out.println(testGradeList.getAverage());
		System.out.println(testGradeList.toString());
	}
}
