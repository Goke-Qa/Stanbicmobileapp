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
		transfertoothersscreen.verifytransferScreen();
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

	@And("input the destination bank account number")
	public void input_the_destination_bank_account_number() {
		transfertoothersscreen.verifyaccountNumberScreen();
		transfertoothersscreen.enteraccountNumber("0157612595");
	}

	@Then("selects the bank name")
	public void selects_the_bank_name() {
		transfertoothersscreen.selectGTB();
	}

	/*
	 * Transfer to Stanbic IBTC account
	 */

	@Then("user should select transfer to Stanbic IBTC account")
	public void user_should_select_transfer_to_stanbic_ibtc_account() {
		transfertostanbicibtcaccountscreen.clickTransfertoStanbicIBTCAccount();
	}

	@When("user selects the source account number")
	public void user_selects_the_source_account_number() {
		transfertoothersscreen.verifyAccountToDebitScreen();
		transfers.selectSourceAccount();
	}

	@And("inputs destination account number")
	public void inputs_destination_account_number() {
		transfertoothersscreen.verifyaccountNumberScreen();
		transfertoothersscreen.enteraccountNumber("0037142260");
	}

	@Then("user should input valid PIN")
	public void user_should_input_valid_PIN() {
		transfertoothersscreen.verifyenterPINscreen();
		loginScreen.click4DigitPIN();
	}

	/*
	 * Transfer to @ease account
	 */

	@Then("user should select transfer to AtEase account")
	public void user_should_select_transfer_to_at_ease_account() {
		transfers.clickTransferease();
	}

	@And("inputs AtEase account number")
	public void inputs_AtEase_account_number() {
		transfertoothersscreen.enteraccountNumber("8066291016");
		transfertoothersscreen.clickcontinue();
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

	@And("selects a beneficiary")
	public void selects_a_beneficiary() {
		transfers.selectBeneficiary();
	}
}
