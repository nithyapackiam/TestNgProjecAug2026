package org.array;

import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArrayDemo {
	
	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[0]=5;
		arr[1]=4;
		arr[2]=3;
		arr[3]=2;
		arr[4]=1;
		
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
		
		WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(null))
		
		WebDriver driver = new ChromeDriver();
		WebElement element=driver.findElement(By.id(""));
		File sc= element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyDirectory(sc, new File(""));
		
		String mainWindow=driver.getWindowHandle();
		Set<String> allHandles=driver.getWindowHandles();
		for(String windowHandle: allHandles) {
			if(!windowHandle.equals(mainWindow)) {
				windowHandle.quit;
				
				Actions actions= new Actions(driver);
				actions.contextClick(element).perform();
			}
		}
	}

}
