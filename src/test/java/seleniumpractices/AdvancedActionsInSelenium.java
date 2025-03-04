package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvancedActionsInSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		Actions actions = new Actions(driver);

		WebElement textArea = driver.findElement(By.xpath("//textarea[@name='q']"));

		// right click
		// actions.contextClick(textArea).build().perform();

		// actions.click(textArea).build().perform();

		// actions.doubleClick(textArea).build().perform();

		// actions.keyDown(textArea, "A").keyUp("A").build().perform();
		actions.keyDown(textArea, Keys.SHIFT).keyDown(textArea, "a").keyUp(Keys.SHIFT).keyUp("a").build().perform();

		WebElement link = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
		actions.moveToElement(link).build().perform();

		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/droppable.php");

		WebElement source = driver.findElement(By.cssSelector("#draggable"));
		WebElement target = driver.findElement(By.cssSelector("#droppable"));

//		actions.dragAndDrop(source, target).build().perform();

		actions.clickAndHold(source).pause(Duration.ofSeconds(1)).moveToElement(target).release().build().perform();

		driver.navigate().to("https://omayo.blogspot.com/");

		WebElement blogsLink = driver.findElement(By.cssSelector("#blogsmenu"));

		actions.moveToElement(blogsLink).build().perform();

		driver.findElement(By.xpath("(//div[@id='cssmenu']/ul//ul//a)[3]")).click();

	}

}
