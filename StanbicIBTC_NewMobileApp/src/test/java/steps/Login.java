package steps;
import context.TestContext;
import io.cucumber.java.en.*;
import mobileScreens.Create_AccountScreen;
import mobileScreens.LoginScreen;

public class Login {
	TestContext testContext;
	LoginScreen loginScreen;
	Create_AccountScreen create_AccountScreen;
	
	public Login(TestContext context) {
		testContext = context;
		loginScreen =  testContext.getPageObjectManager().getLoginScreen();
		create_AccountScreen =  testContext.getPageObjectManager().getCreate_AccountScreen();
		}
	
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
		loginScreen.enterLoginCreds();
	}
	
	@And("clicks on the login button")
	public void clicks_on_the_login_button() {
		loginScreen.clickLoginButton();
	}

	@Then("user is navigated to the dashboard")
	public void user_is_navigated_to_the_dashboard() {
		create_AccountScreen.verifydashboard();
			   
}
}
