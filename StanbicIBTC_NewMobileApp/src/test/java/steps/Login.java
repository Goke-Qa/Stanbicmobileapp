package steps;
import io.cucumber.java.en.*;
import mobileScreens.CreateAccountScreen;
import mobileScreens.DriverFactory;
import mobileScreens.LoginScreen;
public class Login {
	
	LoginScreen loginScreen = new LoginScreen();
	CreateAccountScreen createAccountScreen = new CreateAccountScreen();
	
	@Given("user selects the MyBank menu")
	public void user_selects_the_my_bank_menu() {
		loginScreen.clickMyBankMenu();
	}

	@When("user clicks on the login arrow")
	public void user_clicks_on_the_login_arrow() {
		loginScreen.clickLoginArrow();
	}

	@Then("user is navigated to the login screen")
	public void user_is_navigated_to_the_login_screen() {
		loginScreen.verifyLoginScreen();
	}

	@When("user enters a valid username and password")
	public void user_enters_a_valid_username_and_password() {
		loginScreen.enterLoginCreds("0015969269", "Test123@4");
	}
	
	@And("clicks on the login button")
	public void clicks_on_the_login_button() {
		loginScreen.clickLoginButton();
	}

	@Then("user is navigated to the dashboard")
	public void user_is_navigated_to_the_dashboard() {
		createAccountScreen.verifydashboard();
		
	   

	
//	@Given("user selects the MyBank menu")
//	public void user_selects_the_my_bank_menu() throws InterruptedException {
//		loginScreen.clickMyBankMenu();
//	}
//
//	@When("user clicks on the login arrow")
//	public void user_clicks_on_the_login_arrow() {
//	    loginScreen.clickLoginArrow();
//	}
//
//	@Then("user is navigated to the login screen")
//	public void user_is_navigated_to_the_login_screen() {
//		loginScreen.verifyLoginScreen();
//	}
//
//	@When("user enters a valid username and password")
//	public void user_enters_a_valid_username_and_password() {
//		loginScreen.enterLoginCreds("", "");
//	}
//
//	@And("clicks on the login button")
//	public void clicks_on_the_login_button() {
//		loginScreen.clickLoginButton();
//	}
//
//	@Then("user is navigated to the dashboard")
//	public void user_is_navigated_to_the_dashboard() {
//	   
//	}
}
}
