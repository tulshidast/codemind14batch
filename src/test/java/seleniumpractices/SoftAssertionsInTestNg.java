package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertionsInTestNg {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get(ReadingPropertiesFile.getProperty("url"));
		driver.manage().window().maximize();
	}

	@Test
	public void verifyHomePageFunctinality() {
		
		SoftAssert verify = new SoftAssert();

		// verify current page url
		String currentUrl = driver.getCurrentUrl();	
		verify.assertEquals(currentUrl, "https://demo.guru99.com/test/newtours/index.php");
		verify.assertEquals(currentUrl, "https://demo.guru99.com/test/newtours/index.php","Page url not matching");
		
	    verify.assertNotEquals(currentUrl, "https://www.google.com");
	    verify.assertNotEquals(currentUrl, "https://www.google.com","Page url is mismatched");
	    
	    WebElement submitBtn = driver.findElement(By.xpath("//input[@name='submit']"));
	    
	    verify.assertTrue(submitBtn.isDisplayed());
	    verify.assertTrue(submitBtn.isDisplayed(),"Submit btn not displayed");
	    
	    verify.assertFalse(!(submitBtn.isDisplayed()),"Submit is not displayed");
	    verify.assertFalse(!(submitBtn.isDisplayed()),"Submit is not displayed");
	    
	    

		// verify current page title
		String homePageTitle = driver.getTitle();
		verify.assertEquals(homePageTitle, "Welcome: Mercury Tours");

		// verify valid login
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin@123");
		submitBtn.click();

		String actualLoginSuccefullMsg = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"))
				.getText();

		verify.assertEquals(actualLoginSuccefullMsg, "Login Successfully");
		
		verify.assertAll();

	}

	@AfterMethod
	public void tearDown() {

		driver.quit();

	}

}
