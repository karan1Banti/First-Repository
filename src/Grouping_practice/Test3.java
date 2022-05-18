package Grouping_practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test3 {

	@BeforeClass(alwaysRun = true)
	public void LaunchBrowser() {
		System.out.println("Launch the Browser");
	}

	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		System.out.println("Close the Browser");
	}

	@Test(groups = "smoke")
	public void Testing7() {
		System.out.println("Testing 7");
	}

	@Test(groups = "functional")
	public void Testing8() {
		System.out.println("Testing 8");
	}

	@Test(groups = { "functional", "regression" })
	public void Testing9() {
		System.out.println("Testing 9");
	}

}
