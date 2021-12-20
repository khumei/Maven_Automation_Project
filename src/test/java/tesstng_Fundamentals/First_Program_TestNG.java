package tesstng_Fundamentals;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class First_Program_TestNG {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is the before suite mehtod which will execute first");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is the after suite method which will execute lasat");
			
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is the after test method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is the after test method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is the before test method");
	}
	

}
