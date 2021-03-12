package pageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchResult_PF 
{
	
	//All the objects of Google Search Page are described here- In our case we dont need for sample test case so leaving it blank
	
	WebDriver driver;
	
	//Constructor to use PageFactory
	public GoogleSearchResult_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Method to handle operation on google search result page
}
