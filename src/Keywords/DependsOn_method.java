package Keywords;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DependsOn_method {
	@BeforeClass
	public void OB() {
		System.out.println("Open Browser");
		Assert.assertTrue(true);

	}
	@AfterClass
	public void CB() {
		System.out.println("Close Bowser");
	}
	@Test (priority = 2)
	public void Login() {
		System.out.println("Login successfully");
	}
	@Test (priority = 1 , dependsOnMethods = "Login")
	public void Homepage() {
		System.out.println("Check the home page");
	}
	@Test (priority = 3, dependsOnMethods = { "Login" , "Homepage"} )// enabled = false )
	public void Logout() {
		System.out.println("Logout successfully");
	}

}
