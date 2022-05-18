package Grouping_practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 {
	
	@BeforeClass(alwaysRun = true)
	public void LaunchBrowser() {
		System.out.println("Launch the Browser");
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		System.out.println("Close the Browser");
	}
	
	
	
	@Test(groups = "smoke")
	public void Testing4() {
		System.out.println("Testing 4");
	}
	
	@Test(groups = "functional")
	public void Testing5() {
		System.out.println("Testing 5");
	}
	
	@Test(groups = { "functional" , "regression"})
	public void Testing6() {
		System.out.println("Testing 6");
	}

}
