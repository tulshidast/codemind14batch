package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrameInSelenium {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement frame = driver.findElement(By.xpath("//iframe[@id='navbar-iframe']"));
		driver.switchTo().frame(frame);

		// driver.switchTo().frame("navbar-iframe");

		// driver.switchTo().frame(0);

		driver.findElement(By.xpath("//table//input[@name='q' and  not(@title)]")).sendKeys("Welcome to codemind");

		driver.switchTo().defaultContent();

		driver.findElement(By.cssSelector("#ta1")).sendKeys("Come back from frame");

		driver.switchTo().frame(frame);

		driver.findElement(By.xpath("//table//input[@name='q' and  not(@title)]")).clear();

		driver.switchTo().defaultContent();

		driver.findElement(By.cssSelector("#ta1")).clear();

	}

}
