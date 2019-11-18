package org.property;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Login {
	public static RemoteWebDriver driver;
	
	public void log(String browserType) throws MalformedURLException{
	
	DesiredCapabilities dr = DesiredCapabilities.chrome();
	dr.setPlatform(Platform.LINUX);
	dr.setVersion("");
	/*else{
		dr=DesiredCapabilities.internetExplorer();
		dr.setBrowserName("iexplore");
		dr.setPlatform(Platform.WINDOWS);
	}*/
		
	 driver=new RemoteWebDriver(new URL("http://docker.rapidtestpro.com:4444/wd/hub"), dr);
	
	 String url = System.getProperty("launchUrl");
		driver.get(url);
	 
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
