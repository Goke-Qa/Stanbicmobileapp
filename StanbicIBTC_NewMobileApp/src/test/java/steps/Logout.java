package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import mobileScreens.CreateAccountScreen;
import mobileScreens.LoginScreen;
import mobileScreens.LogoutScreen;

public class Logout {
	
	LoginScreen loginscreen = new LoginScreen();
	CreateAccountScreen createaccountscreen = new CreateAccountScreen();
	LogoutScreen logoutscreen = new LogoutScreen();
	
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
