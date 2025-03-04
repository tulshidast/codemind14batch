package seleniumpractices;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingPropertiesFile {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(ReadingPropertiesFile.getProperty("url"));

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(ReadingPropertiesFile.getProperty("uname"));
		driver.findElement(By.xpath("//input[@name='password']"))
				.sendKeys(ReadingPropertiesFile.getProperty("password"));
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	public static String getProperty(String key) {

		File file = new File("src/test/resources/data.properties");
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Properties properties = new Properties();
		try {
			properties.load(fileInputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return properties.getProperty(key);
	}

}
