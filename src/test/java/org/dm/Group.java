package org.dm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Group {
	@Test()
	private void tc1() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
System.out.println("group of tc1");
driver.close();
		
			
	}

//	@Test
//	private void tc2() {
//System.out.println("tc2");
//	}
//
//	
//	@Test(groups="keys")
//	private void tc3() {
//System.out.println("groupof tc3");
//	}
	
	

}


