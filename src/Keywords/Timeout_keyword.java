package Keywords;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Timeout_keyword {
	
	public class Timeout {
		@BeforeMethod
			public void LOgin() {
			System.out.println("Login sucess");
		}
		@AfterMethod
		public void Logout() {
			System.out.println("Logout sucess");
		}
		@Test (priority = 1)
		public void Homepage() {
			System.out.println("Check home page");
		}
		@Test (priority = 2 ,timeOut = 4000) 
		public void Profilepage() throws InterruptedException {
			Thread.sleep(5000);                             //when we add thread.sleep explicitly then test case get fail.
			System.out.println("check profilepage ");
		}
		@Test (priority = 3)
		public void msgbox() {
			System.out.println("check msg box");
		}
	    @BeforeClass
		public void Open_Browser() {
			System.out.println("Browser open");
		}
	@AfterClass
		public void CLose_Browser() {
			System.out.println("Browser close");
		}
	}

}
