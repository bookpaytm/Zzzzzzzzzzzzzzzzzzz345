package Uitilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	
	
	
public static String capturescreenshot(WebDriver driver){
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
String Screenshotpath=System.getProperty("user.dir")+"./Screenshot/shabnam"+getStringdatatime()+".png";
System.out.println("capture the screenshotpath");
try {
	FileHandler.copy(src, new File(Screenshotpath));
} catch (IOException e) {
	System.out.println("do not capture the screenshotpath");

}
return Screenshotpath;
}
public static String getStringdatatime(){
	DateFormat format=new SimpleDateFormat("MM_dd_yyyy_mm_hh_ss");
	Date currentdate=new Date();
	return format.format(currentdate);

}
}
