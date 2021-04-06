package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mobileScreens.CreateAccountScreen;
import mobileScreens.LoginScreen;
import mobileScreens.TransferToOthersScreen;
import mobileScreens.TransferToStanbicIBTCAccountScreen;

public class Transfer {
	
	LoginScreen loginscreen = new LoginScreen();
	CreateAccountScreen createAccountScreen = new CreateAccountScreen();
	TransferToOthersScreen transfertoothersscreen = new TransferToOthersScreen();
	TransferToStanbicIBTCAccountScreen transfertostanbicibtcaccountscreen = new TransferToStanbicIBTCAccountScreen();
	
	@Given("user has successfully logged into the app")
	public void user_has_successfully_logged_into_the_app() {
		loginscreen.clickMyBankMenu();
		loginscreen.clickLoginArrow();
		loginscreen.verifyLoginScreen();
		loginscreen.enterLoginCreds("0015969269", "Test123@4");
		loginscreen.clickLoginButton();
		createAccountScreen.verifydashboard();
	}

	@And("user navigate to the transfer screen")
	public void user_navigate_to_the_transfer_screen() {
		transfertoothersscreen.clicktransferButton();
		transfertoothersscreen.verifytransferScreen();
	}

	@Then("user should select transfer to other banks")
	public void user_should_select_transfer_to_other_banks() {
	    transfertoothersscreen.clicktransferToOtherBanks();
	    transfertoothersscreen.verifyAccountToDebitScreen();
	    transfertoothersscreen.clickaccountToDebit();
	    
	}

	@And("input account number")
	public void input_account_number() {
		transfertoothersscreen.verifyaccountNumberScreen();
	    transfertoothersscreen.enteraccountNumber();
	}

	@Then("select bank name")
	public void select_bank_name() {
//		transfertoothersscreen.verifyBankName();
//	    transfertoothersscreen.clickzenith();
	    transfertoothersscreen.verifyamountScreen();
	    transfertoothersscreen.clickamount();
	    transfertoothersscreen.clickcontinue();
	    transfertoothersscreen.verifyreasonForPayment();
	    transfertoothersscreen.clickcontinue();
	    transfertoothersscreen.verifytransferSummary();
	    transfertoothersscreen.clickconfirm();
	    transfertoothersscreen.verifyenterPINscreen();
	    transfertoothersscreen.clickPIN();
	    
	}
	
	/*
	The steps below are solely for "Transfer to Stanbic IBTC account"
	 */
	
	@Then("user should select transfer to Stanbic IBTC account")
	public void user_should_select_transfer_to_stanbic_ibtc_account() {
	    transfertostanbicibtcaccountscreen.clickTransfertoStanbicIBTCAccount();
	    transfertoothersscreen.verifyAccountToDebitScreen();
	    transfertoothersscreen.clickaccountToDebit();
	    transfertoothersscreen.verifyaccountNumberScreen();
	    transfertoothersscreen.enteraccountNumber();
	    
	    
	}

	@Then("input amount")
	public void input_amount() {
		transfertoothersscreen.verifyamountScreen();
	    transfertoothersscreen.clickamount();
	    transfertoothersscreen.clickcontinue();
	    transfertoothersscreen.verifytransferSummary();
	    transfertoothersscreen.clickconfirm();
	    transfertoothersscreen.verifyenterPINscreen();
	    transfertoothersscreen.clickPIN();
	    transfertoothersscreen.clickDone();
	}
}
	
