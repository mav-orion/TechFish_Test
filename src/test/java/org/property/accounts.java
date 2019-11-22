package org.property;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import utils.TakeScreenshot;
import utils.driverutils;

public class accounts extends driverutils {
	TakeScreenshot report=new TakeScreenshot();
	public void accountshome() throws IOException
	{
	String accounts=driver.findElement(By.xpath("//a[contains(text(),'Accounts ')]")).getText();
	System.out.println(accounts);
	
	//report.Screenshot();
	if(accounts.equals("Account"))
	{
		System.out.println("Accounts matched"); 
		
	}else{
		Assert.fail("Accounts mismatched");
	}
	}
}
