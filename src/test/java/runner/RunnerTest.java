package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.cucumber.listener.Reporter;

import base.BasePage;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.junit.Cucumber;
import manager.PageObjectManager;
import utilities.ExtentReport;


@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:features/smoke.feature",
glue={"stepsdefinitions"},
monochrome = true,
//tags ={"@13"},
dryRun=false,
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}


)

public class RunnerTest  {
	
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new PageObjectManager().getCommonMethods().readPropFileVal("reportConfigPath") );
	}
}


