package seleniumpractices;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebelementMethods {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		WebElement searchTextField = driver.findElement(By.xpath("//input[@title='search']"));

		searchTextField.sendKeys("Codemind");

		Thread.sleep(3000);

		searchTextField.clear();

		String attributeValue = searchTextField.getAttribute("size");

		System.out.println(attributeValue);

		String accName = searchTextField.getAccessibleName();

		String ariaRole = searchTextField.getAriaRole();

		System.out.println("accName = " + accName + "   " + "aria role = " + ariaRole);

		org.openqa.selenium.Point p = searchTextField.getLocation();

		System.out.println("x = " + p.getX() + "     " + "y = " + p.getY());

		Rectangle r = searchTextField.getRect();

		System.out.println("height = " + r.height + "     " + "width = " + r.width);

		org.openqa.selenium.Dimension d = searchTextField.getSize();
		System.out.println("height = " + d.height + "     " + "width = " + d.width);

		String tagname = searchTextField.getTagName();

		System.out.println("tagname = " + tagname);

		System.out.println("Search text field is displayed = " + searchTextField.isDisplayed());

		WebElement dropdownBtn = driver.findElement(By.cssSelector("button.dropbtn"));

		System.out.println("Backgroud color = " + dropdownBtn.getCssValue("background-color"));

		WebElement dissappersText = driver.findElement(By.cssSelector("#deletesuccess"));

		System.out.println(dissappersText.isDisplayed());

		Thread.sleep(25000);

		System.out.println(dissappersText.isDisplayed());

		System.out.println("Button1 is enabled = " + driver.findElement(By.cssSelector("#but1")).isEnabled());

		System.out.println("Button2 is enabled = " + driver.findElement(By.cssSelector("#but2")).isEnabled());

		System.out.println("Male radio button is selected = "
				+ driver.findElement(By.xpath("//input[@id='radio1']")).isSelected());

		driver.findElement(By.xpath("//input[@id='radio2']")).click();

		System.out.println("Female radio buttonis selected = "
				+ driver.findElement(By.xpath("//input[@id='radio2']")).isSelected());

		System.out.println("Orange check box is selected = "
				+ driver.findElement(By.xpath("//input[@id='checkbox1']")).isSelected());

		System.out.println("Blue check box is selected = "
				+ driver.findElement(By.xpath("//input[@id='checkbox2']")).isSelected());

		File file = searchTextField.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File("src/test/resources/search.png"));

		System.out.println("Webelement text = " + dropdownBtn.getText());

	}

}
