package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\Admin\\Documents\\chromedriver-win64\\chromedriver-win64.exe");

		// driver.get("https://www.google.com");

		WebDriverManager.chromedriver().setup();

		driver.get("https://demo.guru99.com/test/newtours/");

		driver.manage().window().maximize();

		WebElement userNameTextField = driver.findElement(By.name("userName"));
		userNameTextField.sendKeys("codemind");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Number of links = " + links.size());

		WebElement flightsLink = driver.findElement(By.linkText("Flights"));
		flightsLink.click();

		WebElement hotelsLink = driver.findElement(By.partialLinkText("tels"));
		hotelsLink.click();

		driver.navigate().to("https://omayo.blogspot.com/");

		WebElement textAreaField = driver.findElement(By.id("ta1"));

		textAreaField.sendKeys("Welcome to Codemind Technology");

		WebElement title = driver.findElement(By.className("title"));

		System.out.println(title.getText());

		// driver.quit();

	}

}
