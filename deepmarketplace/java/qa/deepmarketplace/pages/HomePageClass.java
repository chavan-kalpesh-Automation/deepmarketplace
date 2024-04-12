package qa.deepmarketplace.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import qa.deepmarketplace.base.TestBase;

public class HomePageClass extends TestBase {

	@FindBy(xpath = "//header[@class='header']//div//div//div[@class='form-control zipcode-control']")
	WebElement zipcode;

	@FindBy(xpath = "//div[@class='input-group search-box']//input[@id='search']")
	WebElement searchstore;

	@FindBy(xpath = "//div[@class='input-group search-box']//button")
	WebElement searchbtn;

	@FindBy(xpath = "//a[@class='d-block mb-2 deep-logo mb-lg-0 ms-md-0']")
	WebElement deeplogo;

	@FindBy(xpath = "//header[@class='header']//button[@class='menu-btn']")
	WebElement leftside_moremenu;

	@FindBy(xpath = "//header[@class='header']//div//div//ul//li//a[@class='login-btn']")
	WebElement loginbtn;

	@FindBy(xpath = "//div[@id='loginModal']//div//div//div[@class='modal-header']//div//h5[text()='Login']")
	WebElement loginmodal_header;

	@FindBy(xpath = "//div[@id='loginModal']//div//div//button[@class='btn-close']")
	WebElement close_modalbtn;

	@FindBy(xpath = "//div[@id='loginModal']//div//div//div//div//div//form//div//label//following-sibling::input[@id='email']")
	WebElement enteremailadd;

	@FindBy(xpath = "//div[@id='loginModal']//div//div//div//div//div//form//div//label//following-sibling::input[@id='password']")
	WebElement enterpassword;

	@FindBy(xpath = "//div[@id='loginModal']//div//div//div//div//div//form//div//label//following-sibling::span[text()=' Forgot your password? ']")
	WebElement forgotpasword_btn;

	@FindBy(xpath = "//div[@id='loginModal']//div//div//div//div//div//p//following-sibling::span[@class='footer-button cursor-pointer']")
	WebElement signupbtn_onloginmodal;

	@FindBy(xpath = "//div[@id='loginModal']//div//div//div//a[text()='login as vendor']")
	WebElement loginasvendorbtn_onloginmodal;

	@FindBy(xpath = "//div[@id='loginModal']//div//div//div//div//div//form//div//button[text()=' Log in ']")
	WebElement loginbtn_onmodal;

	@FindBy(xpath = "//header[@class='header']//div//div//ul//li//a[@class='signup-btn']")
	WebElement signup_btn;
	
	@FindBy(xpath="//div[@id='loginModal']//div//div//div[@class='modal-header']//div//h5[text()='Sign Up']")
	WebElement signupheader_onsignupmodal;

	@FindBy(xpath = "//header[@class='header']//a[@class='dropdown user-box']//span")
	WebElement profile_btn; // for getting profile name and profile button also

	@FindBy(xpath = "//div[@id='main-div']//main//div[@class='top-category-list']//div//div//h3[text()='Our Featured Stores']")
	WebElement outFeaturedstore_txt;

	@FindBy(xpath = "//div[@id='main-div']//main//div[@class='top-store-list']//div//div//h3[text()='Stores near you']")
	WebElement storenearyou_btn;

	@FindBy(xpath = "//div[@id='main-div']//main//div[@class='top-store-list']//div//div//span[text()=' View All ']")
	WebElement storenearyou_viewAllbtn;

	@FindBy(xpath = "//footer[@class='container pt-4 py-2']//div//div//ul//li//a[text()='Become a Vendor']")
	WebElement becomeaVendorbtn;

	@FindBy(xpath = "//footer[@class='container pt-4 py-2']//div//div//ul//li//a[text()='Contact']")
	WebElement contactUs_btn;

}
