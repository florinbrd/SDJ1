
public class Points {
	
	private int x, y; 
	
	public Points(int x, int y) {
		this.x = x; 
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x; 
	}
	
	public void setY(int y) {
		this.y = y; 
	}
	
	public int getX() {
		return x; 
	}
	
	public int getY() {
		return y; 
	}
	
	public void moveTO(int newX, int newY) {
		x= newX; 
		y = newY;
	}
	
	public void move(int xDistance, int yDistance) {
		x += xDistance; 
		y+= yDistance;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
	
	
}
