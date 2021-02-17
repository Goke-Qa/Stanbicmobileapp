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


}
