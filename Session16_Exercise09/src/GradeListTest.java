
public class GradeListTest {
	
	public static void main(String[] args) {
		
		GradeList grade1 = new GradeList(5);
		GradeList grade2 = new GradeList(5);
		GradeList grade3 = new GradeList(6);
		
		grade1.setGrade(2, 1);
		grade1.setGrade(3, 2);
		grade1.setGrade(4, 1);
		
		grade2.setGrade(2, 1);
		grade2.setGrade(3, 2);
		grade2.setGrade(4, 1);
		
		System.out.println(grade1.equals(grade2));
		System.out.println(grade1.equals(grade3));
		
	}

}
