package org.property;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import utils.TakeScreenshot;
import utils.driverutils;

public class Login extends driverutils {
	TakeScreenshot report=new TakeScreenshot();
	//@Parameters({ "browserType" })
	//@Test
	public void log(String browser) throws IOException{
	
	
	// String url = System.getProperty("launchUrl");
		
		if(browser.equals("chrome"))
			{System.setProperty("webdriver.chrome.driver","C:\\Users\\muralim\\git\\TechFish_Test1\\chromedriver.exe");
		driver=new ChromeDriver();}
		else if(browser.equals("IE")){
		System.setProperty("webdriver.ie.driver","C:\\Users\\muralim\\git\\TechFish_Test1\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\muralim\\git\\TechFish_Test1\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		String url = "http://elastic.rapidtestpro.com:8086/index";
		driver.get(url);
		
		//report.Screenshot();
		
	 
	}
	
	/*public void user_launch_the_browser() {
		String path = System.getProperty("user.dir") + "/chromedriver.exe";
		System.out.println(path);

		System.setProperty("webdriver.chrome.driver", path);
		
		driver=new ChromeDriver();	
		String url = System.getProperty("launchUrl");
		driver.get(url);
	}*/
	
	
	
}
