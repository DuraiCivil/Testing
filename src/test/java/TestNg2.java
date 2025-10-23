

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

public class TestNg2 {
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("i am before suite");
	}
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("i am before Test");
	}
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("i am before Class");
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("i am before Method");
	}
	
	
	@Test
	public void m5() {
		System.out.println("m5");
	}
	
	
	@Test
	public void m6() {
		System.out.println("m6");
	}
	
	
	@Test
	public void m7() {
		System.out.println("m7");
	}
	
	
	@Test
	public void m8() {
		System.out.println("m8");
	}
}