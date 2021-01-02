package UserRegInGradle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static boolean FirstName() {		
		Pattern firstName = Pattern.compile("[A-Z]{1}[a-z]{2,}$");  
		Matcher match = firstName.matcher("Komal");  
		boolean patternValidity = match.matches();
		System.out.println(patternValidity);
		return patternValidity;		
	}
	
	public static boolean LastName() {		
		Pattern lastName = Pattern.compile("[A-Z]{1}[a-z]{2,}$");  
		Matcher match = lastName.matcher("Shinde");  
		boolean patternValidity = match.matches();
		System.out.println(patternValidity);
		return patternValidity;	
	}
	
	public static boolean Email() {
		Pattern email = Pattern.compile("^[a-zA-Z]{3}\\.[a-zA-Z]{1,}@[a-zA-Z]{2}\\.[a-zA-Z]{2}\\.[a-zA-Z]{1,}$");  
		Matcher match = email.matcher("abc.xyz@bl.co.in");  
		boolean patternValidity = match.matches();
		System.out.println(patternValidity);
		return patternValidity;
	}
	
	public static boolean MobileNumber() {
		Pattern mobileNumber = Pattern.compile("^[1-9]{2}\\s{1}[0-9]{1}[0-9]{9}$");  
		Matcher match = mobileNumber.matcher("91 8562416354");  
		boolean patternValidity = match.matches();
		System.out.println(patternValidity);
		return patternValidity;		
	}
	
	public static boolean Password() {
		Pattern mobileNumber = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,}");  
		Matcher match = mobileNumber.matcher("Komal@80");  
		boolean patternValidity = match.matches();
		System.out.println(patternValidity);
		return patternValidity;
	}
	
	public static void main(String args[]) {
		FirstName();
		LastName();
		Email();
		MobileNumber(); 
		Password();
	}
}
