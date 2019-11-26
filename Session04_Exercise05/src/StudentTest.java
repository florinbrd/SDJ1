
public class StudentTest {

	public static void main(String[] args) {
		
		Student test1 = new Student("Florin", 'M');
		Student test2 = new Student("Leonard", 'f', 122);
		
		System.out.println(test1.toString());
		System.out.println(test2.toString());
		
		test1.setStudentNo(222);
		
		System.out.println(test1.toString());
				
			
	}
}
