package org.dm;

import org.openqa.selenium.WebElement;
import org.pojo.FacebookPoja;
import org.utilities.Baseclass;

public class FacebookExcu extends Baseclass{
	public static void main(String[] args) {
		
		browserlaunch();
		urlLaunch("https://www.facebook.com/");
		WindowMaxi();
		FacebookPoja f=new FacebookPoja();
		WebElement user = f.getEmailtextbox();
		WebElement password = f.getPasswordtextbox();
		valuePass(user, "nithya");
		valuePass(password, "12345678");
		
		
		
	}

}
