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
		loginscreen.enterLoginCreds("0015969269", "Test@123456");
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

	
	
	
//	@Given("user enters a valid username and password")
//	public void user_enters_a_valid_username_and_password() {
//		createAccountScreen.enterLoginCreds("0015969269", "Test123@4");
//	}
//	
//	@Then("clicks on the login button")
//	public void clicks_on_the_login_button() {
//		createAccountScreen.clickLoginButton();
//	}
//
//	@And("user is navigated to the dashboard")
//	public void user_is_navigated_to_the_dashboard() {
//	   
//	}
//
//	@When("user click on profile icon")
//	public void user_click_on_profile_icon() {
//	    createAccountScreen.clickprofileButton();
//	}
//
//	@Then("user is navigated to the profile screen")
//	public void user_is_navigated_to_the_profile_screen() {
//		createAccountScreen.verifyProfileScreen();
//	   
//	}
//
//	@And("user scroll to the account pane")
//	public void user_scroll_to_the_account_pane() {
//	   
//	}
//
//	@Then("user clicks on Create Account")
//	public void user_clicks_on_create_account() {
//	    createAccountScreen.clickcreateAccountButton();
//	    
//	}
//
//	@Then("user input valid BVN and phone number")
//	public void user_input_valid_bvn_and_phone_number() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@And("click on continue button")
//	public void click_on_continue_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}


}
