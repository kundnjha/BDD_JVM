package manager;

import org.openqa.selenium.WebDriver;

import commons.CommonMethods;
import pages.AcoountPage;
import pages.ContactPage;
import pages.Leads;
import pages.LoginPage;
import pages.TargetPage;

public class PageObjectManager {

	//private WebDriver driver;

	private LoginPage login;

	private ContactPage contactPage;

	private Leads homePage;

	private AcoountPage checkoutPage;

	private TargetPage confirmationPage;
	
	private CommonMethods common;

/*	

	public PageObjectManager(WebDriver driver) {

		//this.driver = driver;

	}*/

	
// If login refrence varible is null then create object of loginPage
//	otherwise it will give refrence of loginPage
	
	public LoginPage getLoginPage(){

		return (login == null) ? login = new LoginPage() : login;

	}

	

	public ContactPage getContactPage() {

		return (contactPage == null) ? contactPage = new ContactPage() : contactPage;

	}

	

	public CommonMethods getCommonMethods(){
		
		return (common==null)? common= new CommonMethods():common;
		
	}

	/*public CartPage getCartPage() {

		return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;

	}

	

	public CheckoutPage getCheckoutPage() {

		return (checkoutPage == null) ? checkoutPage = new CheckoutPage(driver) : checkoutPage;

	}*/

}
