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
	
	public static void main(String args[]) {
		FirstName();
		LastName();
		Email();
	}
}
