package steps;
import context.TestContext;
import io.cucumber.java.en.*;
import mobileScreens.Create_AccountScreen;
import mobileScreens.LoginScreen;


public class Create_An_Account {
	TestContext testContext;
	LoginScreen loginscreen;
	Create_AccountScreen create_accountscreen;
	
	
	@Given("user has logged into the app")
	public void user_has_logged_into_the_app() {
		loginscreen.clickMyBankMenu();
		loginscreen.clickLoginArrow();
		loginscreen.verifyLoginScreen();
		loginscreen.enterLoginCreds();
		loginscreen.clickLoginButton();
	}

	@And("navigated to the dashboard")
	public void navigated_to_the_dashboard() {
		create_accountscreen.verifydashboard();
		create_accountscreen.clickprofileButton();
	}

	@Then("user navigate to the profile screen")
	public void user_navigate_to_the_profile_screen() {
		create_accountscreen.verifyProfileScreen();
	}

	@And("user should select the create account button")
	public void user_should_select_the_create_account_button() {
		create_accountscreen.clickCreateAccount();
	}

}
