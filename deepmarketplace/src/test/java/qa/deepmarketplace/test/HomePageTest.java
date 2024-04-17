package qa.deepmarketplace.test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.deepmarketplace.base.TestBase;
import qa.deepmarketplace.pages.HomePageClass;

public class HomePageTest extends TestBase {
	HomePageClass homepage;

	public HomePageTest() {
		super();

	}

	@BeforeMethod
	public void setup() {
		initialisation();
		homepage = new HomePageClass();
		homepage.validateZipcode(prop.getProperty("zipcode"));
		

	}

	@Test
	public void homepageTitleTest() {
		String titile = homepage.validateHomePageTitle();
		Assert.assertEquals("Deep Marketplace", titile, "Actual Title Does Not Match With Expected Title");
	}

	@Test
	public void loginTest() {
		homepage.validate_loginform(prop.getProperty("email"), prop.getProperty("password"));

	}
	@Test
	public void signUpTest() {
		homepage.validate_Signupform(prop.getProperty("fullname"), prop.getProperty("mobilenumber"),prop.getProperty("signupEmail"), prop.getProperty("signupPassword"), prop.getProperty("signupConfirmPassword"));
	}
	@Test
	public  void selectStoreTest() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		homepage.validate_SelectStore(prop.getProperty("storename"));
	}
	

}
