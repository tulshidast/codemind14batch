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

public class DataProviderInTestNg {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(ReadingPropertiesFile.getProperty("url"));
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "uservalidlogindata")
	public void verifyValidLogin1(String uname, String password) {

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='submit']")).click();

		String actualLoginSuccefullMsg = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"))
				.getText();

		Assert.assertEquals(actualLoginSuccefullMsg, "Login Successfully");

	}

	@AfterMethod
	public void tearDown() {

		driver.quit();

	}

	@DataProvider(name = "uservalidlogindata")
	public Object[][] userData() {
		String data[][] = { { "Admin", "Admin@123" }, { "Admin1", "Admin@1234" }, { "Admin2", "Admin@1235" } };
		return data;
	}

}
