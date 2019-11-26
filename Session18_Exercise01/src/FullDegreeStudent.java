
public class FullDegreeStudent extends Student {

	private int semester; 
	
	public FullDegreeStudent(String name, String address, int studentNo, int sem) {
		super(name, address, studentNo);
		this.semester = sem; 
	}
	
	public int getSemester() {
		return semester; 
	}
	
	public void setSemester(int semester) {
		this.semester = semester; 
	}
	
	public String toString() {
		return super.toString() + " " + semester; 
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof FullDegreeStudent)) {
			return false; 
		}
		
		FullDegreeStudent other= (FullDegreeStudent) obj; 
		
		return super.equals(other) && semester == other.semester; 
	}
	
	
	
	

}
