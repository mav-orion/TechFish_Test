package org.step;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.property.Login;
import org.property.propertymanager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class scripts  extends Login {
	//private Properties properties;
	 //private final String propertyFilePath="Configs//Configuration.properties";
	//private final String propertyFilePath=System.getProperty("user.dir")+"//Configs//Configuration.properties";	 
	//public static WebDriver driver; 
	
  Login log=new Login();
	
	@Given("user launch the browser{string}")
	public void user_launch_the_browser(String browserType) throws MalformedURLException {
		log.log(browserType);
	}



	@When("user can enter the {string},{string}")
	public void user_can_enter_the(String string, String string2) {
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
	}
	
	/*@When("user can enter the {string} and {string}")
	public void user_can_enter_the_and(String string, String string2) {
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
	}*/

	@When("user can able to click the checkbox")
	public void user_can_able_to_click_the_checkbox() {
		driver.findElement(By.id("remember-me")).click();
	
	}

	@Then("user can navigate to signin")
	public void user_can_navigate_to_signin() {
		driver.findElement(By.xpath("//button[text()='Sign in']")).click(); 
		driver.close();
	}

	@Then("user can navigate to home")
	public void user_can_navigate_to_home() {
		driver.findElement(By.xpath("//a[text()='Home']")).click();  
		
	}

	@Then("user can navigate to accounts")
	public void user_can_navigate_to_accounts() {
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
	}

	@Then("user can navigate to transfer")
	public void user_can_navigate_to_transfer() {
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]")).click();
	}

	@Then("user can navigate to appointment")
	public void user_can_navigate_to_appointment() {
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[3]")).click();
		driver.quit();
	}

}
