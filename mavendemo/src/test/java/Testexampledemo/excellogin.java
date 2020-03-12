package Testexampledemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class excellogin {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream file = new FileInputStream(new File("C:\\Users\\BLTuser.BLT1208\\Desktop\\excel\\testdata.xlsx"));
XSSFWorkbook workbook = new XSSFWorkbook(file);
XSSFSheet sheet = workbook.getSheet("Sheet1");
int count = sheet.getLastRowNum();
System.out.println(count);
for(int i=1;i<=count;i++)
{
	XSSFRow row =sheet.getRow(i);
	XSSFCell cell = row.getCell(0);
	String un = cell.getStringCellValue();
	XSSFCell cell1=row.getCell(1);
	String pwd = cell.getStringCellValue();
	System.setProperty("webdriver.chrome.driver","C:/Users/BLTuser.BLT1208/Desktop/Selenium/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.linkedin.com/login");
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.id("password")).sendKeys(pwd);
	driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button")).click();
	driver.close();
	
}
	}

}
