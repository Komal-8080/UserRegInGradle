package UserRegInGradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserRegistrationTest {
	
	public static void FirstName() {
		
		UserRegistration ur = new UserRegistration();
		boolean generated_output = ur.FirstName();
		
		//Assert Statement
		assertTrue(generated_output);
}
}
