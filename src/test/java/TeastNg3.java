

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TeastNg3 {
	@Ignore
	@Test
	public void z1() {
		System.out.println("z1");
	}
	@Test(priority=1)
	public void tc1() {
		System.out.println("tc2");
	}
	@Ignore
	@Test(enabled=true)
	public void tc2() {
		System.out.println("tc2");
	}
	@Test(priority=-1,enabled=false)
	public void tc3() {
		System.out.println("tc3");
	}	
	
	//dependonmethods
	
	@Test
	public void login() {
		System.out.println("log in successfully");
		//Assert.assertTrue(false);
	}
	
	
	
	@Test
	public void product_selection() {
		System.out.println("Product has been selected");
	}
		

	

}
