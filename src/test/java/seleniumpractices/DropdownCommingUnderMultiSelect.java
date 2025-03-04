package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownCommingUnderMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement multiSelectDropdown = driver.findElement(By.xpath("//select[@id='multiselect1']"));

		Select select = new Select(multiSelectDropdown);

		select.selectByIndex(0);// doc 3

		Thread.sleep(2000);

		select.selectByValue("swiftx");// doc 1

		Thread.sleep(2000);

		select.selectByVisibleText("Hyundai"); // doc 4

		Thread.sleep(2000);

		select.selectByContainsVisibleText("Aud");

		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();

		for (WebElement option : allSelectedOptions) {
			System.out.println(option.getText());
		}

		System.out.println("#########################################");

		WebElement firstSelectedOption = select.getFirstSelectedOption();

		System.out.println("First selected option = " + firstSelectedOption.getText());

		System.out.println("##########################################");

		List<WebElement> allOptions = select.getOptions();

		for (WebElement aption : allOptions) {
			System.out.println("Dropdown option = " + aption.getText());
		}

		System.out.println("##########################################");

		boolean multiselectionAllowed = select.isMultiple();

		System.out.println("Multiselection allowed = " + multiselectionAllowed);

		System.out.println("############################################");

		select.deselectByIndex(3);
		Thread.sleep(2000);

		select.deselectByValue("Hyundaix");
		Thread.sleep(2000);

		select.deselectByVisibleText("Volvo");
		Thread.sleep(2000);

		select.deSelectByContainsVisibleText("Swi");
		Thread.sleep(2000);

		select.selectByIndex(0);// doc 3

		Thread.sleep(2000);

		select.selectByValue("swiftx");// doc 1

		Thread.sleep(2000);

		select.selectByVisibleText("Hyundai"); // doc 4

		Thread.sleep(2000);

		select.selectByContainsVisibleText("Aud");

		select.deselectAll();

	}

}
