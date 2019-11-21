package org.property;

import java.io.IOException;

import org.openqa.selenium.By;

import utils.TakeScreenshot;
import utils.driverutils;

public class accounts extends driverutils {
	TakeScreenshot report=new TakeScreenshot();
	public void accountshome() throws IOException
	{
	String accounts=driver.findElement(By.xpath("//a[contains(text(),'Accounts ')]")).getText();
	System.out.println(accounts);
	report.Screenshot();
	}
}
