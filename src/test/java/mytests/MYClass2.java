package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MYClass2 {
	
	
	@Test(retryAnalyzer = RetryClass.class)
	public void m6() {
		Assert.assertFalse(true);}
		
		@Test(retryAnalyzer = RetryClass.class)
		public void m7() {
			Assert.assertTrue(false);
		}
	}


