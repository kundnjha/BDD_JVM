
package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import utilities.Wait_utility;

public class BasePage {
	
	public static WebDriver driver;
	public static Properties prop;

	static String url ;


	
	public BasePage(){
		prop = new Properties();
		FileInputStream ip;
		try {
			ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}
	public static  void initialization() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + prop.getProperty("driverpath"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Wait_utility.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Wait_utility.IMPLICIT_WAIT, TimeUnit.SECONDS);
		url = prop.getProperty("url");
		driver.get(url);
		
	}
	

}
