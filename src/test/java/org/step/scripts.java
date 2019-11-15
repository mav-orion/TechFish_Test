package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.property.propertymanager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class scripts {
	//private Properties properties;
	 //private final String propertyFilePath="Configs//Configuration.properties";
	//private final String propertyFilePath=System.getProperty("user.dir")+"//Configs//Configuration.properties";	 
	public static WebDriver driver; 

	@Given("user launch the browser")
	public void user_launch_the_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DURGAN\\eclipse-workspace\\TechfishBank\\driver\\chromedriver.exe");	
		driver=new ChromeDriver();	
		String url = System.getProperty("launchUrl");
		driver.get(url);
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
	}

}
