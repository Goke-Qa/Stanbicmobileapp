package steps;

import context.TestContext;
import io.cucumber.java.en.*;
import mobileScreens.Create_AccountScreen;
import mobileScreens.LoginScreen;
import mobileScreens.LogoutScreen;

public class MobileApp_Logout {
	TestContext testContext;
	LoginScreen loginScreen;
	Create_AccountScreen create_accountscreen;
	LogoutScreen mobileapplogoutScreen;
	
	public MobileApp_Logout(TestContext context) {
		testContext = context;
		loginScreen =  testContext.getPageObjectManager().getLoginScreen();
		create_accountscreen =  testContext.getPageObjectManager().getCreate_AccountScreen();
		mobileapplogoutScreen = testContext.getPageObjectManager().getLogoutScreen();
		}
	
	@Given("user has logged onto the app")
	public void user_has_logged_onto_the_app() {
		loginScreen.clickMyBankMenu();
		loginScreen.clickLoginArrow();
		loginScreen.verifyLoginScreen();
		loginScreen.enterLoginCreds();
		loginScreen.clickLoginButton();
	}

	@And("user is on dashboard")
	public void user_is_on_dashboard() {
		mobileapplogoutScreen.verifyHome();
	}

	@Then("user navigate to profile screen")
	public void user_navigate_to_profile_screen() {
		create_accountscreen.clickprofileButton();
	}

	@And("user click on logout button")
	public void user_click_on_logout_button() {
		create_accountscreen.verifyProfileScreen();
		mobileapplogoutScreen.clickLogout();
		mobileapplogoutScreen.clickYes();
	}

}



