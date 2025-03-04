package seleniumpractices;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingExcelFile {

	public static void main(String[] args) throws InvalidFormatException, IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(ReadingPropertiesFile.getProperty("rurl"));

		List<Object> list = ReadingExcelFile.readExcel();

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(list.get(0).toString());
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(list.get(1).toString());
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(list.get(2).toString());
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(list.get(3).toString());

	}

	public static List<Object> readExcel() throws InvalidFormatException, IOException {

		List<Object> lst = new ArrayList<Object>();

		File file = new File("src/test/resources/registrationdetails.xlsx");

		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(file);

		// xssfWorkbook.getNumberOfSheets();
		XSSFSheet sheet = xssfWorkbook.getSheet("registrationdata");

		int lastNum = sheet.getLastRowNum();

		for (int i = 1; i <= lastNum; i++) {

			XSSFRow row = sheet.getRow(i);
			int lastCellNum = row.getLastCellNum();
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);

				if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
					lst.add(cell.getNumericCellValue());
				}

				if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
					lst.add(cell.getStringCellValue());
				}
			}

		}
		xssfWorkbook.close();
		return lst;
	}

}
