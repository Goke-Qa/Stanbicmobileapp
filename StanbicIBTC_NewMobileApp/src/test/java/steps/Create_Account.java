package steps;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mobileScreens.CreateAccountScreen;
import mobileScreens.LoginScreen;

public class Create_Account {
	TestContext testContext;
	CreateAccountScreen createAccountScreen;
	LoginScreen loginscreen;
	
	public Create_Account(TestContext context) {
		testContext = context;
		loginscreen =  testContext.getPageObjectManager().getLoginScreen();
		createAccountScreen =  testContext.getPageObjectManager().getCreateAccountScreen();
		}
	
	@Given("user has logged into the app")
	public void user_has_logged_into_the_app() {
		loginscreen.clickMyBankMenu();
		loginscreen.clickLoginArrow();
		loginscreen.verifyLoginScreen();
		loginscreen.enterLoginCreds("0014493448", "Test12345@6");
		loginscreen.clickLoginButton();
		
	}

	@And("navigated to the dashboard")
	public void navigated_to_the_dashboard() {
	    createAccountScreen.verifydashboard();
	    createAccountScreen.clickprofileButton();
	}

	@When("user navigate to the profile screen")
	public void user_navigate_to_the_profile_screen() {
	    createAccountScreen.verifyProfileScreen();
	}

	@Then("user should select the create account button")
	public void user_should_select_the_create_account_button() {
		createAccountScreen.clickCreateAccount();
	    
	    
	}

}