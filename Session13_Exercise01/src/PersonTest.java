
public class PersonTest {
	
	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(22, 12, 1987);
		
		Person person = new Person("Horsens", "Florin", date1);
		
		Person person2 = person.copy(); 
		
		person.setName("Alex");
		
		System.out.println(person.equals(person2));
		
		
	}

}
