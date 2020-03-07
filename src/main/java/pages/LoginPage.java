package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="user_name")
	WebElement username;
	
	@FindBy(id="username_password")
	WebElement password;
	
	@FindBy(id="bigbutton")
	WebElement loginBtn;
	
	@FindBy(xpath="//span[text()='kun']")
	WebElement allBtn;
	
	
	
	public  void enterCredentials() {
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginBtn.click();
		
}	
	public void clickAllBtn(){
		allBtn.click();
	}
}
