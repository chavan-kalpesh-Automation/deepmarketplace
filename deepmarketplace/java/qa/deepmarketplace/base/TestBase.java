package qa.deepmarketplace.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;

	public  TestBase() {
		try {
			prop = new Properties();
			Path root = FileSystems.getDefault().getPath("").toAbsolutePath();
			
//			D:\Installs__\gitproj\deepmarketplace\deepmarketplace
//			D:\Installs__\gitproj\deepmarketplace\deepmarketplace\src\main\java\deepmarketplace\deepmarketplace\configue.properties

			Path filePath = Paths.get(root.toString(), 
					"configue.properties");
//			System.out.println(filePath);
			FileInputStream fis = new FileInputStream(filePath.toString());
			prop.load(fis);

		} catch (FileNotFoundException e) {
			e.getStackTrace();
		} catch (IOException e) {
			e.getStackTrace();

		}
	}

	public static void initialisation() {
		String browsername = prop.getProperty("browser");

		String fireFoxDriverPath = prop.getProperty("firefoxdriverpath");

		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		} else if (browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", fireFoxDriverPath);
			driver = new ChromeDriver();

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get(prop.getProperty("url"));

	}
//	public static void main(String []args) {
//		TestBase();
//	}
}