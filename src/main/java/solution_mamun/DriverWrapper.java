package solution_mamun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverWrapper {
	private static WebDriver driver = null;
	private static final String URL = "https://www.foods.com";

	public static WebDriver getDriver() {
		return driver;
	}

	@BeforeClass
	public void initializeWebDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/mamunkhan/Desktop/DESKTOP/Tools/geckodriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.manage().deleteAllCookies();
			driver.quit();
		}
	}

}
