import java.util.*;; 

public class QudatricEq {
	
	public static void main(String[] args) {
		
		double a,b,c,d,x; 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Enter three values: ");
		a = scanner.nextDouble() ;
		b = scanner.nextDouble() ;
		c = scanner.nextDouble();
		
		d = Math.pow(2, b) - 4 * a * c; 
		
		if (d<0) {
			System.out.println("there is no solution");
		} else if( b== 0) {
			x = - b / 2 * a; 
			System.out.println(x);
		} else if (d>0) {
			x = (-b + Math.sqrt(d) / 2*a);
			System.out.println(x);
			x = (-b - Math.sqrt(d) / 2 * a);
			System.out.println(x);
		}
		
	}

}
