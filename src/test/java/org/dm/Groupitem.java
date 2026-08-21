package org.dm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Groupitem {
	
	
	@Parameters("bro")
	@Test()
	private void tc6(String bro) {
		if (bro.equalsIgnoreCase("chrome")) 
		{
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.snapdeal.com/");
			System.out.println("snap deal worked");
			
		} 
		
		
		else if(bro.equalsIgnoreCase("edge")) 
		
		{
			WebDriver driver=new EdgeDriver();
			driver.get("https://www.amazon.in/");
			System.out.println("amazon worked");


		}

	


	}
	

}
