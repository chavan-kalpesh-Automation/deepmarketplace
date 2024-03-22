package qa.deepmarketplace.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.deepmarketplace.base.TestBase;
import qa.deepmarketplace.pages.LoginPageClass;

public class LoginPageTest extends TestBase {
	LoginPageClass loginpage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialisation();
		 loginpage=new LoginPageClass();
	}
	@Test 
	public void homepageTitleTest() {
		
	}
}
