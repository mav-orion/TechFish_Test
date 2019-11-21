package utils;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class TakeScreenshot extends driverutils {
public void Screenshot()
{
	 Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);            
	 try { 
		 LocalTime time =java.time.LocalTime.now();
		 String suff=time.toString().replace(":", "").replace(".", "");
		 
	 ImageIO.write(screenshot.getImage(),"jpeg",new File("C:\\Users\\muralim\\ScreenShot"+suff+".jpeg"));            
	 
	 }
	 catch (IOException e) {                    
	 e.printStackTrace();  
	 }  }


	

/*public static void Screenshot() throws IOException {
	 LocalTime time =java.time.LocalTime.now();
	 String suff=time.toString().replace(":", "").replace(".", "");
	 
    ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(scrFile, new File("C:\\Users\\muralim\\ScreenShot"+suff+".jpeg"));
}*/
}
