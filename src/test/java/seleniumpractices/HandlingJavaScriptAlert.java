package seleniumpractices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingJavaScriptAlert {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='prompt']")).click();

		Alert alt = driver.switchTo().alert();

		System.out.println(alt.getText());

		alt.sendKeys("Codemind");

		// alt.accept();

		alt.dismiss();

		driver.findElement(By.cssSelector("#ta1")).sendKeys("Welcome to codemind");

	}

}
