//Determine the order of evaluation of the operators in each of the following Java statements, 
//and try to figure out what the value of x, y, and z will be. 
//Then check if you were right by implementing a Java program that prints out the values after running the statements.
//a. x = 7 + 3 * 6 / 2 - 1;
//b. y = 2 % 2 + 2 * 2 - 2 / 2;
//c. z = (3 * 9 * ( 3 + ( 9 * 3 / ( 3 ) ) ) );


public class Exercise07 {
	
	public static void main(String[] args) {
		
		double x = 7 + 3 * 6 / 2 - 1;
		double y = 2 % 2 + 2 * 2 - 2 / 2;
		double z = (3 * 9 * ( 3 + ( 9 * 3 / ( 3 ) ) ) );
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
