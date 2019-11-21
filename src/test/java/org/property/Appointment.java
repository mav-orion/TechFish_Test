package org.property;

import java.io.IOException;

import org.openqa.selenium.By;

import utils.TakeScreenshot;
import utils.driverutils;

public class Appointment extends driverutils {
	TakeScreenshot report=new TakeScreenshot();
	public void appointmenthome() throws IOException
	{
	driver.findElement(By.xpath("//a[contains(text(),'Appointment ')]")).click();
	report.Screenshot();
	}
}
