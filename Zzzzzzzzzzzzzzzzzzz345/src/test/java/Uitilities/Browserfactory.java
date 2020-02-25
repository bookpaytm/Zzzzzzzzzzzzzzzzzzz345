package Uitilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserfactory {

	
	
	
	
	
	
public static WebDriver Startapplication(WebDriver driver,String browser, String appurl){
if(browser.equals("Chrome")){
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	System.out.println("chrome issucessfully passed");
}
else {
	System.out.println("unsucessfully failed");
}
driver.manage().window().maximize();
driver.get(appurl);
	
	
	
	return driver;
	
}
public static void quitbrowser(WebDriver driver){
	driver.quit();
}
}
