
public class Student {
	
	private String name; 
	private char gender; 
	private int studNo; 
	
	public Student (String name, char gender, int studNo) {
		this.name = name; 
		this.gender = gender; 
		this.studNo = studNo; 
	}
	
	public Student(String name, char gender) {
		this.name = name; 
		this.gender = gender; 
		this.studNo = 0;
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public void setGender(char gender) {
		this.gender = gender; 
	}
	
	public void setStudentNo(int studNo) {
		this.studNo = studNo; 
	}
	
	public String toString() {
		return "Student name: " + name + 
				", gender: " + gender + 
				", student number : " + studNo; 
	}

}
