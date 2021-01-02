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
	
	public static void main(String args[]) {
		FirstName();
	}
}
