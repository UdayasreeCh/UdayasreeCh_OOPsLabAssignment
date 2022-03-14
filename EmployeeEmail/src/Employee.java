public class Employee {
	String FName;
	String LName;
	String DeptName;
	
	public Employee() {};
	public Employee(String fName, String lName, String deptName) {
		super();
		FName = fName;
		LName = lName;
		DeptName = deptName;
	}
	
	
	public String getFName() {
		return FName;
	}

	public String getLName() {
		return LName;
	}

	public String getDeptName() {
		return DeptName;
	}

}
