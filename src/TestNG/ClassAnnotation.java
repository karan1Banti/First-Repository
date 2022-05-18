package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassAnnotation {
	
	//log in
	//Home page check
	//Message window check
	//Notification window check
	//log out
	
	@BeforeClass
	public void LogIn() {
		System.out.println("Login Successfully");
		
	}
 @AfterClass
	public void Logout() {
	   System.out.println("Logout successfully");
	}
	
 @Test (priority = 1)
	public void HomePage() {
		System.out.println("Home Page visible");
	}
	
 @Test (priority = 2)
	public void Message() {
		System.out.println("Message  window visible");
	}
	
 @Test (priority = 3)
	public void Notification() {
		System.out.println("Notification window  visible");
	}

}
