package com.assess.stepDefinition;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.assess.pageObjects.Address;
import com.assess.pageObjects.MyAccount;
import com.assess.pageObjects.Tshirt;
import com.assess.setup.BasePage;
import com.assess.pageObjects.OrderHistory;
import com.assess.pageObjects.Payment;
import com.assess.pageObjects.Shipping;
import com.assess.pageObjects.SignInPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BasePage{

	private  WebDriver driver;
	
	SignInPage signin;
	String signInUrl="http://automationpractice.com/index.php";
	String browser="chrome";
	Tshirt tshirt;
	Address address;
	Shipping shipping;
	Payment payment;
	OrderHistory orderHistory;
	MyAccount myAccount;

	@Before("@firstTest,@secondTest")  //opens the browser
    public void setUp() {
		initilaize(browser);
		driver = getDriver();
    }	

	@After("@firstTest,@secondTest") //closes the browser
    public void tearDown() {
        driver.quit();
    }
	
	@Given("^user is in the homepage \"([^\"]*)\"$")  //loads the url
	public void getHomePage(String url1) throws Throwable {
		driver = getDriver();
		driver.get(url1);
	}

	@Given("^user is on the Sign in page$") //verifies the url
	public void validateFirstSignInPageFirstTest() throws Throwable {
		  String currentUrl=driver.getCurrentUrl();
		  assertEquals(currentUrl, signInUrl);
	}

	@When("^user adds a T-Shirt to cart by clicking on Add to cart$")
	public void addATshirt() throws Throwable {
		signin=new SignInPage(driver);
	    tshirt=signin.clickTshirt();
	    boolean verifyAddToCart=tshirt.isAddToCartDisplayed();
	    assertTrue(verifyAddToCart);
	    tshirt.clickAddToCart();
	}

	@When("^completes the order using \"([^\"]*)\",\"([^\"]*)\"$")
	public void completeTheOrder(String email, String pass) throws Throwable {
	    boolean verifypopup=tshirt.isPopupWithProceedToCheckoutDisplayed();
	    assertTrue(verifypopup);
	    address=tshirt.completeOrder(email, pass);
	    shipping=address.clickOnProceedToCheckOut();
	    boolean verifyErrorMag=shipping.isErrorMessageDisplayed();
	    assertTrue(verifyErrorMag);
	    payment=shipping.clickCheckBoxAndProceedToCheckOut();
	}

	@When("^select Pay by bank wire$")
	public void payByBankWire() throws Throwable {
	    payment.clickPayByBankWire();
	    payment.clickConfirmOrder();
	    orderHistory=payment.clickBackToOrders();
	}

	@Then("^Order reference of the order placed is displayed$")
	public void verifyOrderHistory() throws Throwable {
	   boolean orderRef=orderHistory.isOrderReferenceDisplayed();
	   assertTrue(orderRef);
	   boolean verifyDatePricePayment=orderHistory.isDatePriceAndPaymentMethodDisplayed();
	   assertTrue(verifyDatePricePayment);
	}

	@Given("^user is in the sign in page$") //verifies the url
	public void validateSecondSignInPage() throws Exception {
		String currentUrl=driver.getCurrentUrl();
		assertEquals(currentUrl, signInUrl);
	}

	@When("^user sign in into the account using \"([^\"]*)\",\"([^\"]*)\"$")
	public void signInToAccount(String email, String pass) throws Exception {
		SignInPage signin=new SignInPage(driver);
	    signin.clickSignIn();
	    myAccount=signin.signIn(email, pass);
	}

	@When("^updates first name in My Account page using \"([^\"]*)\",\"([^\"]*)\"$")
	public void UpdateCredential(String fname, String pswd) throws Exception {
		myAccount.clickMyPersonalInformation();
	    myAccount.updateFirstName(fname, pswd);
	}

	@Then("^user gets a success message$")
	public void validateSuccessMessage() throws Exception {
	   boolean verifysuccessMsg=myAccount.isSuccessMessageDisplayed();
	   assertTrue(verifysuccessMsg);
	   myAccount.clickHomePage();
	}
	
}
