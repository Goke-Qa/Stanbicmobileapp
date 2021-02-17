package stepDefinitions;
import io.cucumber.java.en.*;
import pages.logoutPage;
import pages.loginPage;

public class logout {
	Controller controller;
	logoutPage logoutPage;
	loginPage loginPage;
	
	public logout(Controller controller) {
		this.controller = controller;
		loginPage = new loginPage(this.controller);
		logoutPage = new logoutPage(this.controller);
	}
	
//	@When("user has logged in successfully and entered a valid token")
//	public void user_has_logged_in_successfully_and_entered_a_valid_token() throws InterruptedException {
//	   loginPage.successfulLogin();
//	}
	
	@When("user clicks on the logout link")
	public void user_clicks_on_the_logout_link() throws InterruptedException {
		loginPage.successfulLogin();
	   logoutPage.clickLogoutLink();
	}

	@Then("user is navigated to the satisfaction survey")
	public void user_is_navigated_to_the_satisfaction_survey() {
	   
	}

	@When("user makes a survey response and submits")
	public void user_makes_a_survey_response_and_submits() {
	    
	}

	@Then("user is navigated back to the login page")
	public void user_is_navigated_back_to_the_login_page() {
	   
	}

}
