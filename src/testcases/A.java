package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) throws IOException {
	
		try
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.close();
		}
		catch(Exception e)
		{
			
		}
	}
	
	
}
