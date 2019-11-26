
public class JobTest {
	
	public static void main(String[] args) {
		
		Person person1 = new Person("Florin", "Bordei");
		
		Job newJob = new Job("CFO", 20000);
		
		Job oldJob = new Job("CEO", 3000, person1);
		
		System.out.println(newJob);
		System.out.println(oldJob);
		
		oldJob.fire();
		newJob.setEmployee(person1);
		
		System.out.println(newJob);
		System.out.println(oldJob);
	}

}
