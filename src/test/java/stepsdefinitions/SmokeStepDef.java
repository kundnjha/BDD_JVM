package stepsdefinitions;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import base.BasePage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import manager.PageObjectManager;
import pages.LoginPage;
import utilities.ExtentReport;

public class SmokeStepDef extends BasePage {
	
LoginPage login;
Logger Log = Logger.getLogger(SmokeStepDef.class.getName());//


private static ExtentReport customExtentReporter;
private static boolean isReportingRunning;


/*@After
public static void afterScenario(Scenario scenario){
String screenshotFile = scenario.getName().replaceAll(" ", "")+".jpeg";
if(scenario.isFailed()){
	ExtentReport.captureScreenShot(driver,screenshotFile);
	customExtentReporter.createtest(scenario, screenshotFile);
	customExtentReporter.writeToReport();
	System.out.println("after");
	driver.quit();
}
}*/
@Before
public static void before(){
	initialization();
/*	if(!isReportingRunning){
		customExtentReporter = new ExtentReport();
		isReportingRunning=true;
		System.out.println("num2");
}*/
}

	

	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageObjectManager manager = new PageObjectManager();
		login = manager.getLoginPage();
		login.enterCredentials();
		//Assert.assertTrue(false);
		  PropertyConfigurator.configure("Log4j.properties");
		Log.info("sysout");
	}

	@When("^use enters credentials and hit login button$")
	public void use_enters_credentials_and_hit_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("use enters credentials and hit login button");
		
	    
	}

	@Then("^User is on dashboard$")
	public void user_is_on_dashboard() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on dashboard");
	}

	@Given("^user is on dashboard page$")
	public void user_is_on_dashboard_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is on dashboard page");
	    
	}

	@Then("^user click all btn$")
	public void user_click_all_btn() throws Throwable {
		login.clickAllBtn();
	}

@Then("^user verify  menu$")
public void user_verify_menu() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("user verify  menu");
   
}

	@Given("^user is on dshboard page$")
	public void user_is_on_dshboard_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is on dshboard page");
	    
	}

	@When("^user clicks on the account icon$")
	public void user_clicks_on_the_account_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user clicks on the account icon");
	    
	}

	@Then("^create account page opens$")
	public void create_account_page_opens() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("create account page opens");
	    
	}

	@Then("^user enters required data is field$")
	public void user_enters_required_data_is_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user enters required data is field");
	    
	}

	@Then("^clicks on save account\\.$")
	public void clicks_on_save_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("clicks on save account");
		Assert.assertTrue("safjnaf", false);
	}

	@Then("^user verifies newly created account in list of account to db$")
	public void user_verifies_newly_created_account_in_list_of_account_to_db() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user verifies newly created account in list of account to db");
	    
	}


}
