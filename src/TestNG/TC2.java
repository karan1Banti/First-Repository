package TestNG;

//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC2 {
	
//	@BeforeClass
//    public void Open_Browser() {
//    	System.out.println("open browser");
//    }
//    @AfterClass
//    public void Close_Browser() {
//    	System.out.println("Close browser");
//    }
    	
	@Test (priority = 4)
	public void m4() {
		System.out.println("m4 method from test 1");
	}
	@Test (priority = 5)
	public void m5() {
		System.out.println("m5 method from test 1");
	}
	@Test (priority = 6)
	public void m6() {
		System.out.println("m6 method from test 1");
	}

}
