package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	List<WebElement> tableCellElements;
	WebElement onlyForTestingLink;
	WebElement navFrame;
	WebElement moreOptionsDropdwon;

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public List<WebElement> getTableCellElements() {
		this.setTableCellElements();
		return tableCellElements;
	}

	public void setTableCellElements() {
		this.tableCellElements = driver.findElements(By.xpath("//table[@id='table1']//tr//td"));
	}

	public WebElement getOnlyForTestingLink() {
		this.setOnlyForTestingLink();
		return onlyForTestingLink;
	}

	public void setOnlyForTestingLink() {
		this.onlyForTestingLink = driver.findElement(By.xpath("//a[text()='onlytestingblog']"));
	}

	public WebElement getNavFrame() {
		this.setNavFrame();
		return navFrame;
	}

	public void setNavFrame() {
		this.navFrame = driver.findElement(By.xpath("//iframe[@id='navbar-iframe']"));
	}

	public WebElement getMoreOptionsDropdwon() {
		this.setMoreOptionsDropdwon();
		return moreOptionsDropdwon;
	}

	public void setMoreOptionsDropdwon() {
		this.moreOptionsDropdwon = driver.findElement(By.xpath("//select[@aria-label='More options']"));
	}

	// methods
	public List<String> getTableData() {
		List<String> data = new ArrayList<String>();
		List<WebElement> tableData = getTableCellElements();
		for (WebElement td : tableData) {
			data.add(td.getText());
		}
		return data;
	}

}
