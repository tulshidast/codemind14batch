package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownNotCommingUnderSelect {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/vistara-airlines.html");
		driver.manage().window().maximize();

		selectValueFromDropdown("Return Trip");

		Thread.sleep(2000);

		selectValueFromDropdown("One Way");
	}

	public static void selectValueFromDropdown(String tripType) {

		// drop down expanded
		driver.findElement(By.xpath("//input[@id='tripType']")).click();

		driver.findElement(By.xpath("//div[@class='tripTypeFilter']/ul/li/p[text()='" + tripType + "']")).click();

		// get all values from drop down
		// List<WebElement> tripOptions =
		// driver.findElements(By.xpath("//div[@class='tripTypeFilter']/ul/li/p"));

		// logic for selecting value from drop down
//		for (WebElement elm : tripOptions) {
//			if (elm.getText().equalsIgnoreCase(tripType)) {
//				elm.click();
//				break;
//			}
//		}
	}

}
