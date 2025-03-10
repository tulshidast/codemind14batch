package seleniumpractices;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshotInSelenium {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

		File scr = takesScreenshot.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(scr, new File("src/test/resources/" + System.currentTimeMillis() + ".jpg"));

	}

}
