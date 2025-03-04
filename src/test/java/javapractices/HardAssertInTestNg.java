package javapractices;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import seleniumpractices.ReadingPropertiesFile;

public class HardAssertInTestNg {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get(ReadingPropertiesFile.getProperty("url"));
		driver.manage().window().maximize();
	}

	@Test
	public void AssertHomePageFunctinality() {

		// Assert current page url
		String currentUrl = driver.getCurrentUrl();
		assertEquals(currentUrl, "https://demo.guru99.com/test/newtours/index.php");
		assertEquals(currentUrl, "https://demo.guru99.com/test/newtours/index.php", "Page url not matching");

		//System.out.println("After assert failure");
		
		assertNotEquals(currentUrl, "https://www.google.com");
		assertNotEquals(currentUrl, "https://www.google.com", "Page url is mismatched");

		WebElement submitBtn = driver.findElement(By.xpath("//input[@name='submit']"));

		assertTrue(submitBtn.isDisplayed());
		assertTrue(submitBtn.isDisplayed(), "Submit btn not displayed");

		assertFalse(!(submitBtn.isDisplayed()), "Submit is not displayed");
		assertFalse(!(submitBtn.isDisplayed()), "Submit is not displayed");

		// Assert current page title
		String homePageTitle = driver.getTitle();
		assertEquals(homePageTitle, "Welcome: Mercury Tours");

		// Assert valid login
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin@123");
		submitBtn.click();

		String actualLoginSuccefullMsg = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"))
				.getText();

		assertEquals(actualLoginSuccefullMsg, "Login Successfully");

	}

	@AfterMethod
	public void tearDown() {

		driver.quit();

	}

}
