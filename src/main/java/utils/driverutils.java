package utils;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class driverutils {
	//public static RemoteWebDriver driver;
	public static WebDriver driver;
	
	public static String path="";
	
	public void getDriver() throws MalformedURLException
	{
		
		DesiredCapabilities dr = DesiredCapabilities.chrome();
		dr.setPlatform(Platform.LINUX);
		dr.setVersion("");
		//driver=new RemoteWebDriver(new URL("http://docker.rapidtestpro.com:4444/wd/hub"), dr);
		
		
		/*else{
			dr=DesiredCapabilities.internetExplorer();
			dr.setBrowserName("iexplore");
			dr.setPlatform(Platform.WINDOWS);
		}*/

	}
	public void newdir(String tagname){
		 
			  
			  LocalTime time =java.time.LocalTime.now();
				 String suff=time.toString().replace(":", "").replace(".", "");
			 path="C:\\Users\\muralim\\git\\TechFish_Test1\\ScreenShot\\Run"+tagname+suff; 
		  File newdirectory = new File(path);
		  newdirectory.mkdir();
		 
		  
		  }

}
