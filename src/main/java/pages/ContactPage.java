package pages;

import org.openqa.selenium.support.PageFactory;
import base.BasePage;

public class ContactPage extends BasePage {

	public ContactPage(){
		PageFactory.initElements(driver, this);
	}
}
