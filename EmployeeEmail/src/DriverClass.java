
import java.util.Scanner;

public class DriverClass {
		public static void main (String[] args)
	{
		
		int selectDept;
		String deptName;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Please enter the department from the following \n"+ "1. Technical \n + 2. Admin \n 3. Human Resource \n 4. Legal \n ");
		
	selectDept = Sc.nextInt();
	if (selectDept == 1) { deptName ="Technical";}
	else if (selectDept == 2)  { deptName ="Admin";}
	else if (selectDept == 3) { deptName =  "Human_Resource";}
	else if (selectDept == 4) { deptName = "Legal";}
	else {deptName = "NoDept";}
	
	Employee emp1= new Employee("sree","Udaya",deptName);
	GenerateCredentials gencred = new GenerateCredentials();
	gencred.generateEmailId(emp1);
	gencred.generatePassword();
	gencred.showCredentials(emp1);
	return;
	
}
}
