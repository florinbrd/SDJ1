
public class ExchangeStudent extends Student {
	
	private int intProjectGroup; 
	
	public ExchangeStudent(String name, String address, int studentNo, int group) {
		super(name, address, studentNo);
		this.intProjectGroup = group; 
	}
	
	public int getProjectGroup() {
		return intProjectGroup; 
	}
	
	public void setProjectGroup(int group) {
		intProjectGroup = group;
	}
	
	public String toString() {
		return super.toString() + " " + intProjectGroup; 
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof ExchangeStudent)) {
			return false; 
		}
		
		ExchangeStudent other = (ExchangeStudent) obj; 
		
		return super.equals(other) && intProjectGroup == other.intProjectGroup; 
	}

}
