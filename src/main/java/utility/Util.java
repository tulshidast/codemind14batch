package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Util {

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

	public static void selectOptionFromSelectDropdown(WebElement selectTagElement, String option) {
		Select select = new Select(selectTagElement);
		select.selectByVisibleText(option);
	}

	public static void switchToFrame(WebDriver driver, WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	public static void switchToDefaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	public static String switchToChildWindow(WebDriver driver) {
		String parentWindowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String handle : windowHandles) {
			if (!(handle.equals(parentWindowHandle))) {
				driver.switchTo().window(handle);
			}
		}
		return parentWindowHandle;

	}

	public static void switchToWindow(WebDriver driver, String handle) {
		driver.switchTo().window(handle);
	}

}
