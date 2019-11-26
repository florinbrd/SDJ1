

public class ForLoopSum {
	
	public static void main(String[] args) {
		
		int sum = 0; 
		
		for (int i = 1; i<=30; i++ ) {
			for(int j = 30; j>0; j--) {
				sum += i/j; 
			}
			
		}
		System.out.println(sum);
	}

}
