package qa.deepmarketplace.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.deepmarketplace.base.TestBase;

public class LoginPageClass extends TestBase {

	@FindBy(xpath = "//input[@id='code']")
	WebElement localzipcode;

	@FindBy(xpath = "//button[text()=' Proceed ']")
	WebElement proceedbtn;

	@FindBy(xpath = "*//a[@class='login-btn']")
	WebElement login;

	@FindBy(xpath = "//input[@id='email']")
	WebElement useremail;

	@FindBy(xpath = "//input[@id='password']")
	WebElement userpassword;

	@FindBy(xpath = "//button[text()=' Log in ']")
	WebElement loginbtn;

	@FindBy(xpath = "//a[text()='login as a vendor']")
	WebElement loginasvendor;

	@FindBy(xpath = "//span[text()='SIGN UP']")
	WebElement signupbtn;

	// Initializing the page objects
	public LoginPageClass() {
		PageFactory.initElements(driver, this);

	}

	// Page Actions :-
	public String loginPageTitle() {
		return driver.getTitle();

	}

	public void validateZipcodeAnsProceed(String zipcode) {
		localzipcode.sendKeys(zipcode);
		proceedbtn.click();
	}

	public HomePageClass verifylogindeepmarketplace(String email, String password) {
		loginbtn.click();
		useremail.sendKeys(email);
		userpassword.sendKeys(password);
		loginbtn.click();
		return new HomePageClass();

	}
}
