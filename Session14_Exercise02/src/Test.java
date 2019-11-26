
public class Test {
	
	public static void main(String[] args) {
		
		Person person = new Person("Florin", "Horsens"); 
		
		
		
		person.remeberThis("helwejkrhewrhkwehrjkhwekrjhkwehrkjwehrkjwhekrhewkrhkjewhrkwehrkhlo");
		person.remeberThis("hellhrewkjrhkwehrkhwekrhewkrhkwehrkewhrkhweko2");
		person.remeberThis("wehrkjwehjrhkwehrkewjhkrjhwekrhkjewhrkj");
		
		System.out.println(person.getIq());
		
		System.out.println(person.doYouRemember("HELLO"));
		
		person.remeberThis("MaMa");
		
		System.out.println(person.toString());
		
		System.out.println(person.whatAreyouthingAbout());
		
		
	}

}
