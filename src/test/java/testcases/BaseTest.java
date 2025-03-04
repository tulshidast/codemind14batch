package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Util;

public class BaseTest {

	WebDriver driver;
	SoftAssert verify;

	@BeforeMethod(alwaysRun = true)
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get(Util.getProperty("omayoUrl"));
		driver.manage().window().maximize();
		verify = new SoftAssert();
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		if (!(verify == null)) {
			verify.assertAll();
		}
		driver.quit();
	}

}
