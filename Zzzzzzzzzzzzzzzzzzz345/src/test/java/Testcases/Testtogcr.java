package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.Baseclass;
import Pages.Loginpage;
import Uitilities.Browserfactory;
import Uitilities.Exceldataprovider;

public class Testtogcr extends Baseclass {

	
	
	
	
	
	@Test
	public void launchbrowser(){
logger=report.createTest("test case is passed");

System.out.println(driver.getTitle());
Loginpage login=PageFactory.initElements(driver, Loginpage.class);
logger.info("start application ");
login.testtogcrit(excel.getString("login", 0, 0), excel.getString("login", 0, 1));
logger.pass("application is passed");
	}
}
