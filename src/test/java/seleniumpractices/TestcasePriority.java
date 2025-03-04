package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestcasePriority {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(ReadingPropertiesFile.getProperty("url"));
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void C() {

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//input[@name='submit']")).click();

		String actualLoginSuccefullMsg = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"))
				.getText();

		Assert.assertEquals(actualLoginSuccefullMsg, "Login Successfully");

	}

	@Test(priority = 2)
	public void B() {

		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://demo.guru99.com/test/newtours/index.php");

	}

	@Test(priority = 3)
	public void A() {

		String homePageTitle = driver.getTitle();
		Assert.assertEquals(homePageTitle, "Welcome: Mercury Tours");

	}

	@AfterMethod
	public void tearDown() {

		driver.quit();

	}

}
