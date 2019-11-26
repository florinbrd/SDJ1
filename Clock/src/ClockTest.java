
public class ClockTest {
	
	public static void main(String[] args) {
		
		
		Clock clock1 = new Clock(8,  20, 0);
		Clock clock2 = clock1.copy(); 
		
		System.out.println("Clock1: " + clock1);
		System.out.println("Clock2: " + clock2);
		
		System.out.println();
		
		if(clock1.equals(clock2)) {
			System.out.println("Time is the same");
		} else {
			System.out.println("Time is not the same!");
		}
		
		clock2.setTime(42600);
		
		System.out.println("Clock2: " + clock2);
		
		clock2.tic();
		clock2.tic();
		
		System.out.println();
		
		System.out.println("Clock1: " + clock1);
		System.out.println("Clock2: " + clock2);
		
		if(clock1.equals(clock2)) {
			System.out.println("Time is the same");
		} else {
			System.out.println("Time is not the same!");
		}
		
		System.out.println();
		
		System.out.println(Clock.ConverToSec(8, 20, 0));
		
	}

}
