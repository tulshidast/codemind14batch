package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingInSelenium {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		Thread.sleep(5000);

		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

		// how to scroll vertically and horizontally by using pixels

//		javascriptExecutor.executeScript("window.scrollBy(0,1000)");
//
//		Thread.sleep(2000);
//
//		javascriptExecutor.executeScript("window.scrollBy(0,-500)", "");
//
//		Thread.sleep(2000);
//
//		javascriptExecutor.executeScript("window.scrollBy(100,0)", "");
//
//		Thread.sleep(2000);
//
//		javascriptExecutor.executeScript("window.scrollBy(-100,0)", "");

		// scroll complete width of page
		// javascriptExecutor.executeScript("window.scrollBy(document.body.scrollWidth,0)");

//		Thread.sleep(2000);

		// scroll complete height of page
		// javascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		// scroll into view

//		WebElement userNameTextField = driver.findElement(By.xpath("//input[@name='userid']"));
//
//		javascriptExecutor.executeScript("arguments[0].scrollIntoView();", userNameTextField);
//
//		Thread.sleep(2000);
//
//		userNameTextField.sendKeys("Codemind");

		javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//a[text()='Blogger']")));

		javascriptExecutor.executeScript("arguments[0].click();",
				driver.findElement(By.xpath("//a[text()='Blogger']")));

	}

}
