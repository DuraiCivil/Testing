package mytests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class saucheodemo {
	
	
	
	@Test(dataProvider = "dataContainer")
	public void m1(String userid,String password) throws InterruptedException {
       
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        
        Thread.sleep(5000);

        driver.get("https://www.saucedemo.com/v1/");
        
        
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        
        
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        
        
        driver.findElement(By.id("login-button")).click();
        
        
        
		System.out.println("|" + userid + " | " + password);
		
		
		driver.quit();
		
	}  
     @DataProvider(name="dataContainer")
	public Object[][] myContainer(){
		 return new Object[][] {
			 {"standard_user", "secret_sauce"},
			 {"locked_out_user", "secret_sauce"},
	            {"problem_user", "secret_sauce"},  
	            {"invalid_user", "wrong_pass"} 
	            
};
} 
	
	
}