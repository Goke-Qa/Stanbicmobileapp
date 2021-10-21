package steps;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import mobileScreens.Create_AccountScreen;
import mobileScreens.LoginScreen;
import mobileScreens.LogoutScreen;

public class Logout {
	TestContext testContext;
	LoginScreen loginscreen;
	Create_AccountScreen create_accountscreen;
	LogoutScreen logoutscreen;
	
	public Logout(TestContext context) {
		testContext = context;
		loginscreen =  testContext.getPageObjectManager().getLoginScreen();
		create_accountscreen =  testContext.getPageObjectManager().getCreate_AccountScreen();
		logoutscreen = testContext.getPageObjectManager().getLogoutScreen();
		}
	
	@And("user is on the dashboard")
	public void user_is_on_the_dashboard() {
		logoutscreen.verifyHome();
//		createaccountscreen.clickprofileButton();
	   
	}

	@Then("user click on the logout button")
	public void user_click_on_the_logout_button() {
//		createaccountscreen.verifyProfileScreen();
		logoutscreen.clickLogout();
		logoutscreen.clickYes();
	    
	}

}
