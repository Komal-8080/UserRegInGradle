package UserRegInGradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserRegistrationTest {
	
	public static void FirstName() {
		
		String Happy = null;
		
		UserRegistration ur = new UserRegistration();
		String generated_output1 = ur.FirstName();
		String generated_output2 = ur.LastName();
		String generated_output3 = ur.Email();
		String generated_output4 = ur.MobileNumber();
		String generated_output5 = ur.Password();
		boolean generated_output6 = ur.SampleEmailValidation();
		
		//Assert Statement
		assertEquals(Happy, generated_output1);
		assertEquals(Happy, generated_output1);
		assertEquals(Happy, generated_output2);
		assertEquals(Happy, generated_output3);
		assertEquals(Happy, generated_output4);
		assertEquals(Happy, generated_output5);
		assertTrue(generated_output6);
}
}
