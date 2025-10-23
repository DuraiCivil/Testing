package mytests;

import org.testng.annotations.Test;

public class Sanitysmoke {
	
	
	@Test(groups={"smoke"})
	public void m1() {
		System.out.println("m1");
	}
	@Test(groups={"smoke","sanity"})
	public void m2() {
		System.out.println("m2");

}
	@Test(groups= {"sanity"})
	public void m3() {
		System.out.println("m3");
	}
	@Test
	public void m4() {
		System.out.println("m4");
	}
	@Test
	public void m5() {
		System.out.println("m5");
	}
}
