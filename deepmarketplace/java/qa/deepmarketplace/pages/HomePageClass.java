package qa.deepmarketplace.pages;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.deepmarketplace.base.Helper;
import qa.deepmarketplace.base.TestBase;

public class HomePageClass extends TestBase {
	Helper help;

	@FindBy(xpath = "//div[@class='modal-dialog modal-dialog-centered']//div//input[@id='code']")
	private WebElement zipcode_onEnterzipcodemodal;

	@FindBy(xpath = "//div[@id='myModal']//div//div//button[@class='btn-close']")
	private WebElement zipcodeclosebtn_onzipcodeModal;

	@FindBy(xpath = "//div[@class='modal-dialog modal-dialog-centered']//div//button[text()=' Proceed ']")
	private WebElement proceedbtn_onEnterzipcodemodal;
	@FindBy(xpath = "//header[@class='header']//div//div//div[@class='form-control zipcode-control']")
	private WebElement zipcode;

	@FindBy(xpath = "//div[@class='input-group search-box']//input[@id='search']")
	private WebElement searchstore;

	@FindBy(xpath = "//div[@class='input-group search-box']//button[@class='btn btn-outline-secondary']")
	private WebElement searchbtn;

	@FindBy(xpath = "//a[@class='d-block mb-2 deep-logo mb-lg-0 ms-md-0']")
	private WebElement deeplogo;

	@FindBy(xpath = "//header[@class='header']//button[@class='menu-btn']")
	private WebElement leftside_moremenu;

	@FindBy(xpath = "//header[@class='header']//div//div//ul//li//a[@class='login-btn']")
	private WebElement loginbtn;

	@FindBy(xpath = "//div[@id='loginModal']//div//div//div[@class='modal-header']//div//h5[text()='Login']")
	private WebElement loginmodal_header;

	@FindBy(xpath = "//div[@id='loginModal']//div//div//button[@class='btn-close']")
	private WebElement close_modalbtn;

	@FindBy(xpath = "//div[@id='loginModal']//div//div//div//div//div//form//div//label//following-sibling::input[@id='email']")
	private WebElement enteremailadd_onmodal;

	@FindBy(xpath = "//div[@id='loginModal']//div//div//div//div//div//form//div//label//following-sibling::input[@id='password']")
	private WebElement enterpassword_onmodal;

	@FindBy(xpath = "//div[@id='loginModal']//div//div//div//div//div//form//div//label//following-sibling::span[text()=' Forgot your password? ']")
	private WebElement forgotpasword_btn;

	@FindBy(xpath = "//div[@id='loginModal']//div//div//div//div//div//p//following-sibling::span[@class='footer-button cursor-pointer']")
	private WebElement signupbtn_onloginmodal;

	@FindBy(xpath = "//div[@id='loginModal']//div//div//div//a[text()='login as vendor']")
	private WebElement loginasvendorbtn_onloginmodal;

	@FindBy(xpath = "//div[@id='loginModal']//div//div//div//div//div//form//div//button[text()=' Log in ']")
	private WebElement loginbtn_onmodal;

	@FindBy(xpath = "//header[@class='header']//div//div//ul//li//a[@class='signup-btn']")
	private WebElement signup_btn;

	@FindBy(xpath = "//div[@id='loginModal']//div//div//div[@class='modal-header']//div//h5[text()='Sign Up']")
	private WebElement signupheader_onsignupmodal;

	@FindBy(xpath = "//div[@id='loginModal']//div//div//div//div//div//form//div//div//label//following-sibling::input[@id='name']")
	private WebElement fullname_onsignupmodal;

	@FindBy(xpath = "//div[@id='loginModal']//div//div//div//div//div//form//div//div//label//following-sibling::input[@id='phone_no']")
	private WebElement phonenumber_onsignupmodal;

	@FindBy(xpath = "//div[@id='loginModal']//div//div//div//div//div//form//div//label//following-sibling::input[@id='password_confirmation']")
	private WebElement confirmpassword_onsignupmodal;

	@FindBy(xpath = "//div[@id='loginModal']//div//div//div//div//div//form//div//label//input[@type='checkbox']")
	private WebElement termsandconditioncheckbox_onsignupmodal;

	@FindBy(xpath = "//div[@id='loginModal']//div//div//div//div//div//form//div//button[text()=' Sign Up ']")
	private WebElement signupbutton_onsignupmodal;

	@FindBy(xpath = "//div[@id='loginModal']//div//p[text()='Already have an account?']")
	private WebElement alreadyhaveanaccountFootertitle_onsignupmodal;

	@FindBy(xpath = "//div[@id='loginModal']//div//span[text()='LOGIN']")
	private WebElement loginbtn_onsignupmodal;

	@FindBy(xpath = "//header[@class='header']//a[@class='dropdown user-box']//span")
	private WebElement profile_btn; // for getting profile name and profile button also

	@FindBy(xpath = "//div[@id='main-div']//main//div[@class='top-category-list']//div//div//h3[text()='Our Featured Stores']")
	private WebElement outFeaturedstore_txt;

	@FindBy(xpath = "//div[@id='main-div']//main//div[@class='top-store-list']//div//div//h3[text()='Stores near you']")
	private WebElement storenearyou_btn;

	@FindBy(xpath = "//div[@id='main-div']//main//div[@class='top-store-list']//div//div//span[text()=' View All ']")
	private WebElement storenearyou_viewAllbtn;

	@FindBy(xpath = "//footer[@class='container pt-4 py-2']//div//div//ul//li//a[text()='Become a Vendor']")
	private WebElement becomeaVendorbtn;

	@FindBy(xpath = "//footer[@class='container pt-4 py-2']//div//div//ul//li//a[text()='Contact']")
	private WebElement contactUs_btn;

	@FindBy(xpath = "//div//div//a//div[@class='storeInfo']//h4")
	private List<WebElement> storenearyou_Lists;

	// initialization of web element using pagefactory

	public HomePageClass() {
		PageFactory.initElements(driver, this);
	}

	// Page Actions

	public void validateZipcode(String zip) {
		help = new Helper();
		help.explicitWaitOnVisibility_Custom(driver, zipcode_onEnterzipcodemodal, 10);
		zipcode_onEnterzipcodemodal.sendKeys(zip);

		help.explicitWaitOnVisibility_Custom(driver, proceedbtn_onEnterzipcodemodal, 10);
		proceedbtn_onEnterzipcodemodal.click();
	}

	public String validateHomePageTitle() {
		return driver.getTitle();

	}

	public HomePageClass validate_loginform(String email, String password) {
		help = new Helper();
		help.explicitWaitOnVisibility_Custom(driver, loginbtn, 20);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", loginbtn);

		help.explicitWaitOnVisibility_Custom(driver, enteremailadd_onmodal, 10);
		enteremailadd_onmodal.sendKeys(email);
		enterpassword_onmodal.sendKeys(password);
		help.explicitWaitOnVisibility_Custom(driver, loginbtn_onmodal, 10);

		loginbtn_onmodal.click();
		return new HomePageClass();

	}

	public void validate_Signupform(String fullname, String mobno, String email, String password,
			String confirmpassword) {

		help = new Helper();
		help.explicitWaitOnVisibility_Custom(driver, signup_btn, 20);

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", signup_btn);
		help.explicitWaitOnVisibility_Custom(driver, fullname_onsignupmodal, 10);
		fullname_onsignupmodal.sendKeys(fullname);
		phonenumber_onsignupmodal.sendKeys(mobno);
		enteremailadd_onmodal.sendKeys(email);
		enterpassword_onmodal.sendKeys(password);
		confirmpassword_onsignupmodal.sendKeys(confirmpassword);

		termsandconditioncheckbox_onsignupmodal.click();

	}

	public StorePageClass validate_SelectStore(String dynamicStoreName) {
		help = new Helper();

		WebElement dy = driver
				.findElement(By.xpath("//div[@class='top-category-list']//h4[text()='" + dynamicStoreName + "']"));
		System.out.println(dy);

		help.explicaitWaitElementTobeClickable(driver, dy, 30);
		System.out.println("test okay");

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", dy);
		driver.navigate().refresh();
		help.explicitWaitOnVisibility_Custom(driver, zipcodeclosebtn_onzipcodeModal, 10);

		zipcodeclosebtn_onzipcodeModal.click();

		return new StorePageClass();
	}

	public WebElement findsotrenameByName(String dynamicStoreName) {
		help = new Helper();

		help.explicitWaitOnVisibility_Custom(driver, storenearyou_btn, 10);
		for (WebElement store : storenearyou_Lists) {
			String text = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].textContent;",
					store);
			if (text.equalsIgnoreCase(dynamicStoreName)) {
				return store;
			}

		}

		throw new NoSuchElementException("Store Name " + dynamicStoreName + " Not Found!!");

	}

	public void validateGoToStore(String dynamicStoreName) {
		help.explicitWaitOnVisibility_Custom(driver, zipcode, 10);
//		System.out.println(zipcode.getText());
		System.out.println(dynamicStoreName);

		WebElement dy = driver.findElement(By.xpath(dynamicStoreName));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", dy);
	}
//Pass
	public void validateSearchstoreByName(String storename) {

		help.explicitWaitOnVisibility_Custom(driver, searchstore, 30);
		help.explicaitWaitElementTobeClickable(driver, searchstore, 30);
		help.explicWaitOnVisibilityOfElementLocated(driver, searchstore, 30);

		try {
			searchstore.click();
			searchstore.sendKeys("aaojee");

		} catch (ElementNotInteractableException e) {

			((JavascriptExecutor) driver).executeScript("arguments[0].click();", searchstore);
		}
		searchstore.sendKeys("aaojee");

		help.explicWaitTextToBePresentInElement(searchbtn, storename, 5);
		Actions act = new Actions(driver);
		act.click(searchbtn);

		help.explicaitWaitElementTobeClickable(driver, searchbtn, 20);

		searchbtn.click();
	}
}