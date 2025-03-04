package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgGroups {

	WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		synchronized (driver) {

		
			driver.get(ReadingPropertiesFile.getProperty("url"));
			driver.manage().window().maximize();
		}
	}

	@Test(groups = { "regression", "smoke" }, priority = 1, dataProvider = "uservalidlogindata")
	public void C(String uname, String pass) {

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@name='submit']")).click();

		String actualLoginSuccefullMsg = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"))
				.getText();

		Assert.assertEquals(actualLoginSuccefullMsg, "Login Successfully");

	}

	@Test(groups = { "smoke" }, priority = 3)
	public void B() {

		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://demo.guru99.com/test/newtours/index.php");

	}

	@Test(groups = { "sanity" }, priority = 2)
	public void A() {

		String homePageTitle = driver.getTitle();
		Assert.assertEquals(homePageTitle, "Welcome: Mercury Tours");

	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {

		synchronized (driver) {
			driver.quit();
		}

	}

	@DataProvider(name = "uservalidlogindata")
	public Object[][] userData() {
		String data[][] = { { "Admin", "Admin@123" }, { "Admin1", "Admin@1234" }, { "Admin2", "Admin@1235" } };
		return data;
	}

}
