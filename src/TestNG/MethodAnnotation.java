package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodAnnotation {

	//operation sequence 
	//login==>home page==>logout
	//login==>message ==>logout
	//login==>notification==>logout
		
	@BeforeMethod
		public void LogIn() {
			System.out.println("Login Successfully");
			
		}
	 @AfterMethod
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


