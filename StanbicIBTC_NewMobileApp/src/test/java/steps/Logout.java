package steps;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import mobileScreens.CreateAccountScreen;
import mobileScreens.LoginScreen;
import mobileScreens.LogoutScreen;

public class Logout {
	TestContext testContext;
	LoginScreen loginscreen;
	CreateAccountScreen createaccountscreen;
	LogoutScreen logoutscreen;
	
	public Logout(TestContext context) {
		testContext = context;
		loginscreen =  testContext.getPageObjectManager().getLoginScreen();
		createaccountscreen =  testContext.getPageObjectManager().getCreateAccountScreen();
		logoutscreen = testContext.getPageObjectManager().getLogoutScreen();
		}
	
	@And("user is on the dashboard")
	public void user_is_on_the_dashboard() {
		logoutscreen.verifyHome();
		createaccountscreen.clickprofileButton();
	   
	}

	@Then("user click on the logout button")
	public void user_click_on_the_logout_button() {
		createaccountscreen.verifyProfileScreen();
		logoutscreen.clickLogout();
		logoutscreen.clickYes();
	    
	}

}
