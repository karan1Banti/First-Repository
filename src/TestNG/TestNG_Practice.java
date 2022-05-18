package TestNG;

import org.testng.annotations.Test;

public class TestNG_Practice {
@Test (priority = 1)
	public void login() {
		System.out.println("Log in successfully");		
	}
	@Test (priority = 3)
	public void logout() {
		System.out.println("Logout successfully");
	}
	@Test (priority = 2)
	public void enterURL() {
		System.out.println("Enter your url");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
