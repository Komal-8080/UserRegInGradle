package UserRegInGradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserRegistrationTest {
	
	public static void FirstName() {
		
		UserRegistration ur = new UserRegistration();
		boolean generated_output1 = ur.FirstName();
		boolean generated_output2 = ur.LastName();
		
		//Assert Statement
		assertTrue(generated_output1);
		assertTrue(generated_output2);
}
}
