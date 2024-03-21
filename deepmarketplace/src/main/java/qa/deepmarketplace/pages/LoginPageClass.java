package qa.deepmarketplace.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.deepmarketplace.base.TestBase;

public class LoginPageClass extends TestBase {
	
	
	@FindBy(xpath="")
	WebElement loginbtn;
	
	@FindBy(xpath="")
	WebElement username;
	
	@FindBy(xpath="")
	WebElement password;
	
	

	// Initializing the page objects
	public LoginPageClass() {
		PageFactory.initElements(driver, this);

	}
	// Page Actions :-
	
	
}
