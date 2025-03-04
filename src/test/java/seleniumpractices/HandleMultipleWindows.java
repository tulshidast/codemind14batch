package seleniumpractices;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleWindows {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement textAreaField = driver.findElement(By.xpath("//textarea[@id='ta1']"));

		textAreaField.sendKeys("Welcome to codemind");

		driver.findElement(By.cssSelector("a#selenium143")).click();

		String currentWindowHandle = driver.getWindowHandle();

		Set<String> windowsHandles = driver.getWindowHandles();

		for (String handle : windowsHandles) {
			if (handle != currentWindowHandle) {

				driver.switchTo().window(handle);
			}
		}

		driver.findElement(By.xpath("//a[text()='What is Selenium?']")).click();

		driver.close();

		driver.switchTo().window(currentWindowHandle);

		textAreaField.clear();

		driver.quit();

	}

}
