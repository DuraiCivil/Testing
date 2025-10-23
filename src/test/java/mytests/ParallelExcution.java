package mytests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExcution {
	
	
	@Test
	public void m1() {
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.instagram.com/");
	}
	
	
	@Test
	public void m2() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://web.whatsapp.com/");
		
	}

}
