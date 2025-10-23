package mytests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataAnalysis {
	
	
	@Test(dataProvider = "dataContainer")
	public void m1(String data1,String data2) {
		System.out.println("|"+data1+ "|" +data2);
	}
	
	
	@DataProvider(name="dataContainer")
	public Object[][] myContainer(){
		 return new Object[][] {
			 {"user1", "pass1"},
	            {"user2", "pass2"},
	            {"user3", "pass3"}
			 
			 
		 
		 };
	}
	

}
