import java.util.ArrayList;

public class CircleList {

	private int capacity; 
	private ArrayList<Circle> circles; 
	
	public CircleList(int capacity) {
		this.capacity = capacity; 
		circles = new ArrayList<Circle>(capacity);
	}
	
	public int getNumberOfCircles() {
		return circles.size(); 
	}
	
	public void addCircle(Circle circle) {
		circles.add(circle);
		capacity++;
	}
	
	public Circle getCircle(int index) {
		return circles.get(index);
	}
	
	public double getTotalArea() {
		double total = 0; 
		
		for( int i =0; i< circles.size(); i++) {
			total += circles.get(i).getAreA();
		}
		
		return total; 
	}
	
	public double getAverageArea() {
		double avg =0; 
		
		for (Circle circle : circles) {
			avg += circle.getAreA();
		}
		
		avg = avg / circles.size();
		
		return avg; 
	}
	
	

}
