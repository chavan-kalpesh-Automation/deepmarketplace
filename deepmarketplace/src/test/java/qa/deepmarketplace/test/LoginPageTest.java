package qa.deepmarketplace.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.deepmarketplace.base.TestBase;
import qa.deepmarketplace.pages.HomePageClass;
import qa.deepmarketplace.pages.LoginPageClass;

public class LoginPageTest extends TestBase {
	LoginPageClass loginpage;
	HomePageClass homepage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialisation();
		loginpage = new LoginPageClass();
		loginpage.validateZipcodeAnsProceed(prop.getProperty("zipcodee"));
	}

	@Test
	public void homepageTitleTest() {
		String homepagetititle = loginpage.loginPageTitle();
		Assert.assertEquals(homepagetititle, "Deep Marketplace", "Home Page Titile matched successfully ");

	}

	@Test
	public void logintodeepmarketplace() {

		homepage = loginpage.verifylogindeepmarketplace(prop.getProperty("email"), prop.getProperty("password"));

	}
}
