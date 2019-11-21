package org.property;

import java.io.IOException;

import org.openqa.selenium.By;

import utils.TakeScreenshot;
import utils.driverutils;

public class Transfer extends driverutils {
	TakeScreenshot report=new TakeScreenshot();
	public void transferhome() throws IOException
	{
	driver.findElement(By.xpath("//a[contains(text(),'Transfer ')]")).click();
	report.Screenshot();
	}
}
