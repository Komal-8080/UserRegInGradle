package UserRegInGradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserRegistrationTest {
	
	public static void FirstName() {
		
		UserRegistration ur = new UserRegistration();
		boolean generated_output1 = ur.FirstName();
		boolean generated_output2 = ur.LastName();
		boolean generated_output3 = ur.Email();
		boolean generated_output4 = ur.MobileNumber();
		boolean generated_output5 = ur.Password();
		boolean generated_output6 = ur.SampleEmailValidation();
		
		//Assert Statement
		assertTrue(generated_output1);
		assertTrue(generated_output2);
		assertTrue(generated_output3);
		assertTrue(generated_output4);
		assertTrue(generated_output5);
		assertTrue(generated_output6);
}
}
