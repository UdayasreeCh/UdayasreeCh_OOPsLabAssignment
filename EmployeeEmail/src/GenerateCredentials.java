import java.util.Random;

public class GenerateCredentials {
	
	public string generatePassword() {
		
		String ValidPwdChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@£$%^&*();";
	array[i] = ValidPwdChars.charAt(Random.nextint(validpwdchars.length()));
	return new string(array[]);
	}
	
	public String generateEmailId(Employee emp) {
		
		return emp.getFName()+emp.getLName()+"@"+emp.getDeptName()+".gl.in";
	}
	
	public void showCredentials(Employee emp, String password) {
		
		System.out.println ("Dear" + emp.getfname() +"your generated credentials are as follows \n Email---->" + generateEmailID(emp) +"\n Password ----> "+ generatePassword())
		
		
	}

}
