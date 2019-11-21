package org.step;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.property.Appointment;
import org.property.Login;
import org.property.Transfer;
import org.property.accounts;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.TakeScreenshot;

public class scripts  extends Login {
	//private Properties properties;
	 //private final String propertyFilePath="Configs//Configuration.properties";
	//private final String propertyFilePath=System.getProperty("user.dir")+"//Configs//Configuration.properties";	 
	//public static WebDriver driver; 
	
  Login log=new Login();
  TakeScreenshot report=new TakeScreenshot();
  accounts acc=new accounts();
  Appointment app=new Appointment();
  Transfer tra=new Transfer();
	
	@Given("user launch the browser{string}")
	public void user_launch_the_browser(String browserType) throws IOException {
		log.log(browserType);
	}



	@When("user can enter the {string},{string}")
	public void user_can_enter_the(String string, String string2) throws IOException {
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		report.Screenshot();
	}
	
	/*@When("user can enter the {string} and {string}")
	public void user_can_enter_the_and(String string, String string2) {
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
	}*/

	@When("user can able to click the checkbox")
	public void user_can_able_to_click_the_checkbox() throws IOException {
		driver.findElement(By.id("remember-me")).click();
		report.Screenshot();
	}

	@Then("user can navigate to signin")
	public void user_can_navigate_to_signin() throws IOException {
		driver.findElement(By.xpath("//button[text()='Sign in']")).click(); 
		report.Screenshot();
	
	}

	@Then("user can navigate to home")
	public void user_can_navigate_to_home() throws IOException {
		String home=driver.findElement(By.xpath("//a[text()='Home']")).getText();
		System.out.println(home);
		report.Screenshot();
		
	}

	@Then("user can navigate to accounts")
	public void user_can_navigate_to_accounts() throws IOException {
		acc.accountshome();
	}

	@Then("user can navigate to transfer")
	public void user_can_navigate_to_transfer() throws IOException {
		tra.transferhome();
	}

	@Then("user can navigate to appointment")
	public void user_can_navigate_to_appointment() throws IOException {
		app.appointmenthome();
		
		driver.quit();
	}

}
