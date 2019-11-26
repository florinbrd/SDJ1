
public class PersonTest {
	
	public static void main(String[] args) {
		
		Person person1 = new Person(); 
		
		person1.setName("Florin");
		person1.setBirthday(22);
		
		System.out.println(person1.getBirthday());
		System.out.println(person1.getName());
	}

}
