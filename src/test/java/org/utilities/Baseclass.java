package org.utilities;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	public static WebDriver driver;
	
	//1. browser launch
		
		public static void browserlaunch() {
			driver= new ChromeDriver();
			
		}
//2.launch url		
		public static void urlLaunch(String url) {
			driver.get(url);
		}
		
	//3.get title	
		public static void getTitle() {

			String tit = driver.getTitle();
			System.out.println(tit);
		}
		
	//4.get currenturl
		
		public static void getcurrentUrl() {

				String currentUrl = driver.getCurrentUrl();				
				System.out.println(currentUrl);
		}
		
		
		
	//5. close the window
		
		
		
		
	//6. maaximize window
		public static void WindowMaxi() {
driver.manage().window().maximize();
		}
	
	//7. sendkeys
		
		public static void valuePass(WebElement ele, String value) {
			ele.sendKeys(value);
			

		}
		
	//click method
		public static void btnclick(WebElement el) {
			el.click();

		}
		
		
		
		
		
		
		
		
		
		
}
