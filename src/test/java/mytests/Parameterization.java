
package mytests;


import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import org.testng.annotations.Test;

public class Parameterization {
	
	
	
	@Parameters("browser1")
	@Test
	public void m1(@Optional("chrome")String name) {
		System.out.println("It is Launched in "+name+"...............");
	}
	
	
	@Parameters("browser2")
	@Test
	public void m2(@Optional("edge")String name) {
		System.out.println("It is Launched in "+name+"...............");
		
	}

}
