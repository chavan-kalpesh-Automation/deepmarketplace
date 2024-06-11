package qa.deepmarketplace.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.deepmarketplace.base.TestBase;

public class LoginPageClass extends TestBase {

	@FindBy(xpath = "//input[@id='code']")
	private WebElement localzipcode;

	@FindBy(xpath = "//button[text()=' Proceed ']")
	private WebElement proceedbtn;

	@FindBy(xpath = "*//a[@class='login-btn']")
	private WebElement login;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement useremail;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement userpassword;

	@FindBy(xpath = "//button[text()=' Log in ']")
	private WebElement loginbtn;

	@FindBy(xpath = "//a[text()='login as a vendor']")
	private WebElement loginasvendor;

	@FindBy(xpath = "//span[text()='SIGN UP']")
	private WebElement signupbtn;

	// Initializing the page objects
	public LoginPageClass() {
		PageFactory.initElements(driver, this);

	}

	// Page Actions :-
	public  String loginPageTitle() {
		return driver.getTitle();

	}

	public  void validateZipcodeAnsProceed(String zipcode) {
		localzipcode.sendKeys(zipcode);
		proceedbtn.click();
	}

	public  HomePageClass verifylogindeepmarketplace(String email, String password) {
		loginbtn.click();
		useremail.sendKeys(email);
		userpassword.sendKeys(password);
		loginbtn.click();
		return new HomePageClass();

	}
}
