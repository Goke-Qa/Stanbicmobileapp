package steps;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import mobileScreens.Create_AccountScreen;
import mobileScreens.LoginScreen;
import mobileScreens.TransferToEaseAccountScreen;
import mobileScreens.TransferToOthersScreen;
import mobileScreens.TransferToStanbicIBTCAccountScreen;

public class Transfer {
	TestContext testContext;
	LoginScreen loginscreen;
	Create_AccountScreen create_AccountScreen;
	TransferToOthersScreen transfertoothersscreen;
	TransferToStanbicIBTCAccountScreen transfertostanbicibtcaccountscreen;
	TransferToEaseAccountScreen transferToEaseAccountScreen;
	
	public Transfer(TestContext context) {
		testContext = context;
		loginscreen =  testContext.getPageObjectManager().getLoginScreen();
		create_AccountScreen =  testContext.getPageObjectManager().getCreate_AccountScreen();
		transfertoothersscreen =  testContext.getPageObjectManager().getTransferToOthersScreen();
		transfertostanbicibtcaccountscreen =  testContext.getPageObjectManager().getTransferToStanbicIBTCAccountScreen();
		transferToEaseAccountScreen = testContext.getPageObjectManager().getTransferToEaseAccountScreen();
	}
	
	@Given("user has successfully logged into the app")
	public void user_has_successfully_logged_into_the_app() {
		loginscreen.clickMyBankMenu();
		loginscreen.clickLoginArrow();
		loginscreen.verifyLoginScreen();
		loginscreen.enterLoginCreds("0014493448", "Test12345@6");
		loginscreen.clickLoginButton();
		create_AccountScreen.verifydashboard();
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
	
	/*
	The steps below are solely for "Transfer to @ease account"
	 */
	
	@And("user should select transfer to @ease account")
	public void user_should_select_transfer_to_ease_account() {
		loginscreen.clickMyBankMenu();
		loginscreen.clickLoginArrow();
		loginscreen.verifyLoginScreen();
		loginscreen.enterLoginCreds("0014493448", "Test12345@6");
		loginscreen.clickLoginButton();
		transferToEaseAccountScreen.clickTransferease();
		transfertoothersscreen.enteraccountNumber();
		transfertoothersscreen.clickcontinue();
	}

	@Then("input Amount1")
	public void input_amount1() {
		 transfertoothersscreen.clickamount();
		 transfertoothersscreen.clickcontinue();
		 transfertoothersscreen.clickconfirm();
		 transfertoothersscreen.clickPIN();
		 transfertoothersscreen.clickDone();
	   
	}

}
	
