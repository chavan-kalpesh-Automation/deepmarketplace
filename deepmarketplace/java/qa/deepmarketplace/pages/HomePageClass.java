package qa.deepmarketplace.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import qa.deepmarketplace.base.TestBase;

public class HomePageClass extends TestBase {
	
	@FindBy(xpath="//header[@class='header']//div//div//div[@class='form-control zipcode-control']")
	WebElement zipcode;

	@FindBy(xpath = "//div[@class='input-group search-box']//input[@id='search']")
	WebElement searchstore;

	@FindBy(xpath = "//div[@class='input-group search-box']//button")
	WebElement searchbtn;

	@FindBy(xpath = "//a[@class='d-block mb-2 deep-logo mb-lg-0 ms-md-0']")
	WebElement deeplogo;

	@FindBy(xpath = "//header[@class='header']//button[@class='menu-btn']")
	WebElement more_menu;

	@FindBy(xpath = "//header[@class='header']//a[@class='dropdown user-box']//span")
	WebElement profile_btn; // for getting profile name and profile button also

	@FindBy(xpath = "//div[@id='main-div']//main//div[@class='top-category-list']//div//div//h3[text()='Our Featured Stores']")
	WebElement outFeaturedstore_txt;

	@FindBy(xpath = "//div[@id='main-div']//main//div[@class='top-store-list']//div//div//h3[text()='Stores near you']")
	WebElement storenearyou_btn;

	@FindBy(xpath = "//div[@id='main-div']//main//div[@class='top-store-list']//div//div//span[text()=' View All ']")
	WebElement storenearyou_viewAllbtn;

	@FindBy(xpath="//footer[@class='container pt-4 py-2']//div//div//ul//li//a[text()='Become a Vendor']")
	WebElement becomeaVendorbtn;
	
	@FindBy(xpath="//footer[@class='container pt-4 py-2']//div//div//ul//li//a[text()='Contact']")
	WebElement contactUs_btn;
	
}
