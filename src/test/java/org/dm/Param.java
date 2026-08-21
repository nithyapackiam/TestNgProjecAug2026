package org.dm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Param {
	
	@Parameters({"useer", "pass"})
	@Test()
	
	private void notepad(@Optional("revanth") String user, @Optional("2024") String pass) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("#username")).sendKeys(user);
		driver.findElement(By.cssSelector("input.form-control[name=password]")).sendKeys("pass");

	}

}
