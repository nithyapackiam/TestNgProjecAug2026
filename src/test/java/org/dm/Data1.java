package org.dm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data1 {
	
	
	
	@Test(dataProvider = "source", dataProviderClass = B.class)
	private void look(String user, String pass) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("#username")).sendKeys(user);
		driver.findElement(By.cssSelector("input.form-control[name=password]")).sendKeys(pass);
		
	}
	
	@DataProvider(name="samp1")
	
	private Object [][] sample() {
		
return new Object [][]
		{
	{"java" , "890"},
	{"sql" , "786"},
	{"python" , "123"}
	
		};
	}
	
	
	}
