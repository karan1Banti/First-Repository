package Keywords;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Priority_keyword {
	@BeforeClass
	public void URL() {
		System.out.println("Open url");
	}
	@AfterClass
	public void URL_close() {
		System.out.println("Close url");
	}
    @Test (priority = 1)
	public void m1() {
		System.out.println("Perform method m1");
	}
    @Test (priority = 2)
	public void m2() {
		System.out.println("Perform method m2");
	}
    @Test (priority = 3)
	public void m3() {
		System.out.println("Perform method m3");
	}






}
