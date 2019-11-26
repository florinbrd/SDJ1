
public class PointsTest {
	
	public static void main(String[] args) {
		
		Points points1 = new Points(5, 20);
		Points points2 = new Points(60, 40);
		
		
		System.out.println(points1);
		System.out.println(points2);
		
		points1.move(2, 20);
		points2.moveTO(44, 55);
		
		System.out.println(points1);
		System.out.println(points2);
		
		double distance = Math.sqrt((Math.pow(2, points2.getX() - points1.getX())) + (Math.pow(2, points2.getY() - points1.getY()))); 
		
		System.out.println(distance);
		
	
	}

}
