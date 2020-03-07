package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import cucumber.api.Scenario;

public class ExtentReport {

	public static ExtentHtmlReporter htmlreporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public  ExtentReport(){
		htmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/myReporter.html");
		htmlreporter.config().setDocumentTitle("report");
		htmlreporter.config().setReportName("reportt");
		htmlreporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		extent.setSystemInfo("host", "local");
		extent.setSystemInfo("OS", "windows");
		extent.setSystemInfo("browser", "chrome");	
	}
	
	public void createtest(Scenario result, String screenShotFile){
	
	String testName= getScenarioTitle(result);
	if(result != null){
		switch(result.getStatus()){
		case "passed":
			extent.createTest(testName).pass("passed");
			break;
			
		case "failed":
			try {
				extent.createTest(testName).fail("fail").addScreenCaptureFromPath("C://Users//kundan//workspace//MavenTest//test-output");
			} catch (IOException e) {
			e.printStackTrace();
			}
			break;
		
		default:
			extent.createTest(testName).skip("skipeed");
			break;
		}
	}
}
	public void writeToReport(){
		if(extent !=null){
			extent.flush();
		}
	}

	private String getScenarioTitle(Scenario scenario) {
		return scenario.getName().replaceAll(" ", "");

	}
	
	public static void captureScreenShot(WebDriver driver , String filename){
		// Take screenshot and store as a file format             
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);           
		try {
		// now copy the  screenshot to desired location using copyFile method
		 
		FileUtils.copyFile(src, new File("C://Users//Kundan//workspace//MavenTest//test-output"+filename));
		} catch (IOException e)
		 
		{
		  System.out.println(e.getMessage()) ;
		 }
		  }
}
