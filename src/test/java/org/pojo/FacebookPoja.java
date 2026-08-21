
package org.pojo;import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.*;
import org.openqa.selenium.WebElement;
public class FacebookPoja extends Baseclass

{
	public FacebookPoja()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="email")
	private WebElement emailtextbox;
	
	@FindBy(name="pass")
	private WebElement passwordtextbox;

	public WebElement getEmailtextbox() {
		return emailtextbox;
	}

	

	public WebElement getPasswordtextbox() {
		return passwordtextbox;
	}

	
	
//	private WebElement getemailtextbox()
//	{
//		return emailtextbox;
//	}
//	
//	private WebElement getpasswordtextbox()
//	{
//		return passwordtextbox;
//	}
	
	
	}
	
	
	

