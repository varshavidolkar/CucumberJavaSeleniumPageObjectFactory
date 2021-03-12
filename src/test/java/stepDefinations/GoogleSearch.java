package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.*;

import io.cucumber.java.en.And;
//import io.cucumber.java.After;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageFactory.GoogleHome_PF;

public class GoogleSearch {
	
	WebDriver driver=null;
	GoogleHome_PF googleHome;
	
	@Given("User is on Google Home Page")
	public void NavigateToApplication() 
	{
		//System.out.println("System Project Path - " + System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/drivers/chromedriver.exe");
		
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		
	}
	
	@Given("^user search field (.*) on google home page$")
	public void enterusernamepassword(String strTextToSearch) 
	{
		googleHome= new GoogleHome_PF(driver);
		googleHome.searchText(strTextToSearch);
	}
	
	@Then("user should see title of browser as (.*)$")
	public void verifyTitle(String RunTimeBrowserTitle) 
	{
		assertEquals(RunTimeBrowserTitle, driver.getTitle());
	}
	
	@And("user should see search results with text (.*)$")
	public void verifytextWithlink(String textWithLink) 
	{
		assertTrue(driver.getPageSource().contains(textWithLink));
	}
	
	@And("I close the application")
	public void closeApplication() throws InterruptedException 
	{
		//Close the browser and stop execution
		driver.quit();
	}
	
}
