
public class Employee {

	private String name, department, position; 
	private int idNumber; 
	
	public Employee(String nameString, String deptString, String positionString, int id) {
		name = nameString; 
		department = deptString; 
		position = positionString; 
		idNumber = id; 
	}
	
	public String getName() {
		return name; 
	}
	
	public String getDepartment(){
		return department; 
	}
	
	public String getPositionString() {
		return position; 
	}
	
	public int getIdNumber() {
		return idNumber; 
	}
	
	public String getEmployeeData() {
		return "Employee name is " + name + ", department: " + department + ", id number: " + idNumber + ", position: " + position; 
	}
	
	
}
