package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyClass3 {
	
	
	@Test
	public void m6() {
		Assert.assertTrue(true);
		System.out.println("m6");
		
		
	}

	@Test
	public void m7() {
		Assert.assertTrue(false);
		System.out.println("m7");
	}
	
}
