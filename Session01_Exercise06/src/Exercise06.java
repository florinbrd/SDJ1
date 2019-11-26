
//Write a program that calculates and prints the circumference and area of a circle with radius 22.5. 
//(Hint: The circumference of a circle is 2πr, the area is πr2. The expression Math.PI gives a value for π).

public class Exercise06 {
	
	public static void main(String[] args) {
		
		double radius = 22.5;
		
		double circumference = radius * 2 * Math.PI; 
		double area = Math.PI * Math.pow(radius, 2);
		
		System.out.println(circumference);
		System.out.println(area);
	}

}
