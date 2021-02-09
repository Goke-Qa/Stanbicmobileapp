package steps;



import io.cucumber.java.en.*;
import mobileScreens.DriverFactory;
import mobileScreens.LoginScreen;
public class Login {
	
	DriverFactory driverFactory = new DriverFactory();
	LoginScreen loginScreen = new LoginScreen();
	
	@Given("user selects the MyBank menu")
	public void user_selects_the_my_bank_menu() throws InterruptedException {
		loginScreen.clickMyBankMenu();
	}

	@When("user clicks on the login arrow")
	public void user_clicks_on_the_login_arrow() {
	    
	}

	@Then("user is navigated to the login screen")
	public void user_is_navigated_to_the_login_screen() {
	    
	}

	@When("user enters a valid username and password")
	public void user_enters_a_valid_username_and_password() {
	    
	}

	@And("clicks on the login button")
	public void clicks_on_the_login_button() {
	    
	}

	@Then("user is navigated to the dashboard")
	public void user_is_navigated_to_the_dashboard() {
	   
	}
}
