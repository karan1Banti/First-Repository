package Grouping_practice;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeTest(alwaysRun = true)
	public void openDB() {
		System.out.println("Database is open");
	}
	
	@AfterTest(alwaysRun = true)
	public void closeDB() {
		System.out.println("Database is close");
	}
	
	
	@BeforeClass(alwaysRun = true)
	public void LaunchBrowser() {
		System.out.println("Launch the Browser");
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		System.out.println("Close the Browser");
	}
	
	@Test(groups = "smoke")
	public void Testing1() {
		System.out.println("Testing 1");
	}
	
	@Test(groups = "functional")
	public void Testing2() {
		System.out.println("Testing 2");
	}
	
	@Test(groups = { "functional" , "regression"})
	public void Testing3() {
		System.out.println("Testing 3");
	}

}
