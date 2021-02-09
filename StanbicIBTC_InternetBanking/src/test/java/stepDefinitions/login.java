package stepDefinitions;

import io.cucumber.java.en.*;
import pages.httpErrorPage;
import pages.loginPage;
import pages.tokenPage;


public class login{
	Controller controller;
	httpErrorPage httpErrorPage;
	loginPage loginPage;
	tokenPage tokenPage;

	public login(Controller controller) {
		this.controller = controller;
		httpErrorPage = new  httpErrorPage(this.controller);
		loginPage = new loginPage(this.controller);
		tokenPage = new  tokenPage(this.controller);
	}

	@Given("user has entered a valid URL")
	public void user_has_entered_a_valid_url() {
		// This is being handled in the coontroller class
	}

	@When("user clicks on the Advanced button")
	public void user_clicks_on_the_advanced_button() {
		this.httpErrorPage.clickAdvancedButton();
	}

	@And("clicks on the proceed button")
	public void clicks_on_the_proceed_button() {
		this.httpErrorPage.clickRedirectLink();
	}

	@Then("user is navigated to the login page")
	public void user_is_navigated_to_the_login_page() {
		this.loginPage.checkLoginButton();
	}

	@When("^user enters valid \"([^\"]*)\" and \"([^\"]*)\"$") 
	public void user_enters_valid_and(String username, String password) {
		loginPage.setLoginUserID(username);
		loginPage.setPassword(password);
	}
	
	@And("clicks on the login button")
	public void clicks_on_the_login_button() {
		this.loginPage.clickLoginButton();
		this.tokenPage.getTokenPageName();
	}

	@Then("user is directed to the token page")
	public void user_is_directed_to_the_token_page() {
		this.tokenPage.getTokenPageName();
	}

	@When("user enters a valid token")
	public void user_enters_a_valid_token() {
		this.tokenPage.setTokenInput("12345");
	}

	@And("clicks on the continue  button")
	public void clicks_on_the_continue_button() throws InterruptedException {
		this.tokenPage.clickContinueButton();
	}

	@Then("user is navigated to the dashboard")
	public void user_is_navigated_to_the_dashboard() {
		//tokenPage.checkDashboardPage();
	}


}
