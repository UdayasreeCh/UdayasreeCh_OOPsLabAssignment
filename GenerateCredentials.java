import java.util.Random;

public class GenerateCredentials{
	
	Employee emp = new Employee();

	public String generatePassword() {

		String ValidPwdChars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%&";
		int len=0;;
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(ValidPwdChars.charAt(rnd.nextInt(ValidPwdChars.length())));
		return sb.toString();
	}

	public String generateEmailId(Employee emp)
	
	{

		return emp.getFName() + emp.getLName() + "@" + emp.getDeptName() + ".gl.in";
	}

	public void showCredentials(Employee emp) {
		
		String returnstring;
		returnstring = "Dear "+ emp.getFName() + "your generated credentials are as follows \n Email---->" + generateEmailId(emp) + "\n Password ----> " + generatePassword();


		System.out.println(returnstring);
	}

}
