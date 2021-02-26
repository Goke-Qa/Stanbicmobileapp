package steps;
import io.cucumber.java.en.*;
import mobileScreens.CreateOnePassScreens;

public class Create_OnePAss_Account {
	CreateOnePassScreens CreateOnePassScreens = new CreateOnePassScreens();
	
	@When("user clicks to create OnePass Account and Agrees to terms")
	public void user_clicks_to_create_one_pass_account_and_agrees_to_terms() {
		CreateOnePassScreens.clickCreateOnepassButton();
	}

	@Then("user is required to select a login module")
	public void user_is_required_to_select_a_login_module() {
		CreateOnePassScreens.selectLoginModuleMyBank();
	}


	@When("user enters valid module credentials and logs in")
	public void user_enters_valid_module_credentials_and_logs_in() {
		CreateOnePassScreens.loginMyBank("0033518069", "Test12345@6");
	}

	@Then("an OTP should be sent")
	public void an_otp_should_be_sent() {
		CreateOnePassScreens.checkOTPsent();
	}

	@When("user validates the OTP")
	public void user_validates_the_otp() {
		CreateOnePassScreens.enterOTP();
	}
	
	@Then("user should create OnePass ID")
	public void user_should_create_one_pass_id() {
	   
	}

	@And("Create a password")
	public void create_a_password() {
	   
	}

	@When("user selects a security question and response")
	public void user_selects_a_security_question_and_response() {
	    
	}

	@Then("OnePass Account should be created successfully")
	public void one_pass_account_should_be_created_successfully() {
	    
	}

}
