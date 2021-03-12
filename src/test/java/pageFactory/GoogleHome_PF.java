package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleHome_PF {
	
	//All the objects of Google Home Page are described here
	@FindBy(name = "q")
	WebElement txtSearchbox;		//Search text box on Google home page
	
	WebDriver driver;				//Initializing Driver for Pagefactory
	
	//Constructor to use PageFactory
	public GoogleHome_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Method to Search text on Google home page
	public void searchText(String textValuetoSearch) {
		txtSearchbox.clear();
		txtSearchbox.sendKeys(textValuetoSearch,Keys.RETURN);
		//txtSearchbox.sendKeys(Keys.RETURN);
	}

}
