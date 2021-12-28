package steps;

import context.TestContext;

import io.cucumber.java.en.*;
import mobileScreens.Create_AccountScreen;
import mobileScreens.LoginScreen;
import mobileScreens.TransfersScreens;
import mobileScreens.TransferToOthersScreen;
import mobileScreens.TransferToStanbicIBTCAccountScreen;

public class Transfer {
	TestContext testContext;
	LoginScreen loginScreen;
	Create_AccountScreen create_AccountScreen;
	TransferToOthersScreen transfertoothersscreen;
	TransferToStanbicIBTCAccountScreen transfertostanbicibtcaccountscreen;
	TransfersScreens transfers;

	public Transfer(TestContext context) {
		testContext = context;
		loginScreen = testContext.getPageObjectManager().getLoginScreen();
		create_AccountScreen = testContext.getPageObjectManager().getCreate_AccountScreen();
		transfertoothersscreen = testContext.getPageObjectManager().getTransferToOthersScreen();
		transfertostanbicibtcaccountscreen = testContext.getPageObjectManager().getTransferToStanbicIBTCAccountScreen();
		transfers = testContext.getPageObjectManager().getTransfersScreen();
	}

	@Given("user has successfully logged into the app")
	public void user_has_successfully_logged_into_the_app() {
		loginScreen.clickMyBankMenu();
		loginScreen.clickLoginArrow();
		loginScreen.verifyLoginScreen();
		loginScreen.enterLoginCreds();
		loginScreen.clickLoginButton();
		create_AccountScreen.verifydashboard();
	}

	@And("user navigate to the transfer screen")
	public void user_navigate_to_the_transfer_screen() {
		transfertoothersscreen.clicktransferButton();
		
	}

	/*
	 * Transfer to Self
	 */

	@Then("user should select transfer to Self")
	public void user_should_select_transfer_to_self() {
		transfers.clickTransferToSelf();
	}

	@When("user selects source and destination accounts")
	public void user_selects_source_and_destination_accounts() {
		transfers.selectSourceAccount();
		transfers.selectDestinationAcct();
	}

	@And("inputs a valid amount and narration")
	public void inputs_a_valid_amount_and_narration() {
		transfertoothersscreen.enterAmount();
		transfertoothersscreen.clickContinueAmount();
		transfertoothersscreen.verifyreasonForPayment("Transfer Test");
		transfertoothersscreen.clickcontinue();
		transfers.clickConfirm();
	}

	@Then("funds should be transfered successfully")
	public void funds_should_be_transfered_successfully() {
		transfers.clickDone();
	}

	/*
	 * Transfer to Other banks functions
	 */

	@Then("user should select transfer to other banks")
	public void user_should_select_transfer_to_other_banks() {
		transfertoothersscreen.clicktransferToOtherBanks();
		
	}
	
	@When("user selects source account number")
	public void user_selects_source_account_number() {
		transfertoothersscreen.clickaccountToDebit();
	}

	@When("input destination bank account number")
	public void input_destination_bank_account_number() {
		transfertoothersscreen.verifyinputAccount();
		transfertoothersscreen.enteraccountNumber("2029793305");
	}

	@Then("selects bank name")
	public void selects_bank_name() {
		transfertoothersscreen.selectUBA();
	}

	@Then("inputs amount and narration")
	public void inputs_amount_and_narration() {
		transfertoothersscreen.enterAmount();
		transfertoothersscreen.clickContinueAmount();
		transfertoothersscreen.verifyreasonForPayment("Test");
		transfertoothersscreen.clickcontinue();
	}

	@Then("user should input a valid PIN")
	public void user_should_input_a_valid_pin() {
		transfertoothersscreen.clickconfirm();
		loginScreen.click4DigitPIN();
	}

	@Then("funds should be transferred successfully")
	public void funds_should_be_transferred_successfully() {
		transfertoothersscreen.verifyDonescreen();
	}

	/*
	 * Transfer to Stanbic IBTC account
	 */

	@Then("user should select transfer to Stanbic IBTC account")
	public void user_should_select_transfer_to_stanbic_ibtc_account() {
		transfertostanbicibtcaccountscreen.clickTransfertoStanbicIBTCAccount();
	}
	
	@When("user selects the source account")
	public void user_selects_the_source_account() {
		transfertoothersscreen.clickaccountToDebit();
	}

	@When("inputs the destination account number")
	public void inputs_the_destination_account_number() {
		transfertoothersscreen.enteraccountNumber("9201858730");
	}

	@When("inputs valid amount and narration")
	public void inputs_valid_amount_and_narration() {
		transfertoothersscreen.enterAmount();
		transfertoothersscreen.clickContinueAmount();
		transfertoothersscreen.verifyreasonForPayment("Test");
		transfertoothersscreen.clickcontinue();
	}

	@Then("user should input a 4digit valid PIN")
	public void user_should_input_a_4digit_valid_pin() {
		transfertoothersscreen.clickconfirm();
		loginScreen.click4DigitPIN();
	}

	@Then("funds should be transferred with a successful screen")
	public void funds_should_be_transferred_with_a_successful_screen() {
		transfertoothersscreen.verifyDonescreen();
	}

	/*
	 * Transfer to @ease account
	 */

	@Then("user should select transfer to AtEase account")
	public void user_should_select_transfer_to_at_ease_account() {
	//	transfers.clickTransferease();
		transfers.clickTransferease();
	}
	
	@When("user selects account number to debit")
	public void user_selects_account_number_to_debit() {
	   transfertoothersscreen.clickaccountToDebit();
	}
	
	@And("inputs AtEase account number")
	public void inputs_AtEase_account_number() {
		transfertoothersscreen.enteraccountNumber("8166583776");
		transfertoothersscreen.clickcontinue();
	}
	

	@When("inputs an amount and a narration")
	public void inputs_an_amount_and_a_narration() {
		transfertoothersscreen.enterAmount();
		transfertoothersscreen.clickContinueAmount();
		transfertoothersscreen.verifyreasonForPayment("Test");
		transfertoothersscreen.clickcontinue();
		transfertoothersscreen.clickconfirm();
	}

	@Then("user should input PIN")
	public void user_should_input_pin() {
	   loginScreen.click4DigitPIN();
	}

	@Then("funds should be transffered successfully")
	public void funds_should_be_transffered_successfully() {
	   transfertoothersscreen.verifyDonescreen();
	}

	
	/*
	 * Transfer to e Beneficiary
	 */

	@Then("user should select transfer to a Beneficiary")
	public void user_should_select_transfer_to_a_beneficiary() {
		transfers.clickTransBeneficiary();
	}

	@And("selects transfer to a single beneficiary")
	public void selects_transfer_to_a_single_beneficiary() {
		transfers.clickTransBeneficiarySingle();
	}
	
	@When("user selects a source account number")
	public void user_selects_a_source_account_number() {
		transfertoothersscreen.clickaccountToDebit();
	}
	
	@When("selects a beneficiary")
	public void selects_a_beneficiary() {
	    transfers.selectBeneficiary();
	}

	@When("inputs amount and the narration")
	public void inputs_amount_and_the_narration() {
		transfertoothersscreen.enterAmount();
		transfertoothersscreen.clickContinueAmount();
		transfertoothersscreen.verifyreasonForPayment("Test");
		transfertoothersscreen.clickcontinue();
		transfertoothersscreen.clickconfirm();
	}

	@When("funds should be transferred successfully to the beneficiary account")
	public void funds_should_be_transferred_successfully_to_the_beneficiary_account() {
		transfertoothersscreen.verifyDonescreen();
	}

}
