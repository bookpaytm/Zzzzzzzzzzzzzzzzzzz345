package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {

	
	
	
	
	
	
	public WebDriver driver;
	public Loginpage(WebDriver driver){
		this.driver=driver;
		
	}
	@FindBy(name="username1") WebElement user;
	@FindBy(name="password") WebElement pass;
	@FindBy(id="tdb1") WebElement button;
	public void testtogcrit(String uname,String upass){
		user.sendKeys(uname);
		pass.sendKeys(upass);
		button.click();
	}
}
