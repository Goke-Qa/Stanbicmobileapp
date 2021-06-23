package steps;

import context.TestContext;
import io.cucumber.java.en.*;
import mobileScreens.Activate_3S_Banking_Screen;
import mobileScreens.LoginScreen;

public class Activate_3S_Banking {
	
	TestContext testContext;
	Activate_3S_Banking_Screen activate_3S_Banking_Screen;
	
	
	
	public Activate_3S_Banking(TestContext context) {
		testContext = context;
		activate_3S_Banking_Screen = testContext.getPageObjectManager().getActivate_3S_BankingScreen();
		
	}
		
	@Given("user click on 3S Banking icon")
	public void user_click_on_3s_banking_icon() {
		activate_3S_Banking_Screen.click3SBankingIcon();
	    
	}

	@And("click on activate 3S Banking")
	public void click_on_activate_3s_banking() {
		activate_3S_Banking_Screen.clickActivate3SBanking();
		activate_3S_Banking_Screen.clickContinue();
		activate_3S_Banking_Screen.clickAccept();
	   
	}

	@Then("enter PIN")
	public void enter_pin() {
		activate_3S_Banking_Screen.enterPIN();
		activate_3S_Banking_Screen.clickActivate3SBankingButton();
		activate_3S_Banking_Screen.validateScreen();
		activate_3S_Banking_Screen.clickContinue2();
	   
	}

}
