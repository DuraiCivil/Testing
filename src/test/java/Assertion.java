import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	
	@Test
	public void m1() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"header_container\"]/div[1]/div"));
		//System.out.println( elements.size());
		 Assert.assertTrue(elements.size()>0);
		 
		 System.out.println("Navigation has been successfully done!..................................!!!!");
		 
	}
	
	
	
	@Ignore
   @Test
   public void m2() {
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		
		List<WebElement> elements = driver.findElements(By.xpath("/div[text()='Product']"));
  
		 Assert.assertTrue(elements.size()>0);
		 
		 System.out.println("Navigation has been successfully done!..................................!!!!");
	   
   }
	@Ignore
	@Test
	   public void m3() throws InterruptedException {
			WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.saucedemo.com/v1/");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				
				driver.findElement(By.id("login-button")).click();
				Thread.sleep(1000);
				
				List<WebElement> elements = driver.findElements(By.xpath("//div[text()='Products']"));
		  
				System.out.println( elements.size());
				 
				 

				 
				 SoftAssert soft = new SoftAssert();
				 soft.assertTrue(elements.size()>0);
				 System.out.println("Navigation has been successfully done!..................................!!!!");
				 soft.assertAll();
				 System.out.println("I am ready for Production selection!!!!!!!!!");
				 
				 
				 System.out.println("I am ready for Production Listening");
				 
				 driver.quit();
				 
}
}
