package TestNG;

import org.testng.Reporter;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {
	
	@BeforeTest
	public void DB_open() {
		System.out.println("Data base is open");
	}
    @AfterTest
	public void DB_close() {
		System.out.println("Data base is close");
		Reporter.log("close the data base after all operations");
	}
    @BeforeTest
    public void Open_Browser() {
    	System.out.println("open browser");
    }
    @AfterTest
    public void Close_Browser() {
    	System.out.println("Close browser");
    }
	
    @Test (priority = 1)
	public void m1() {
		System.out.println("m1 method from test 1");
	}
    @Test (priority = 2)
	public void m2() {
		System.out.println("m2 method from test 1");
	}
    @Test (priority = 3)
	public void m3() {
		System.out.println("m3 method from test 1");
	}

}
