package stepDefinitions;

import io.cucumber.java.en.*;

import pages.httpErrorPage;
import pages.loginPage;
import pages.tokenPage;
import pages.transferToOthersPage;
import pages.transferToSelfPage;

public class transfers{
	Controller controller;
	httpErrorPage httpErrorPage;
	loginPage loginPage;
	tokenPage tokenPage;
	transferToSelfPage transferToSelfPage;
	transferToOthersPage transferToOthersPage;

	public transfers(Controller controller) {
		this.controller = controller;
		httpErrorPage = new  httpErrorPage(this.controller);
		loginPage = new loginPage(this.controller);
		tokenPage = new  tokenPage(this.controller);
		transferToSelfPage = new transferToSelfPage(this.controller);
		transferToOthersPage = new transferToOthersPage(this.controller);
	}

	@Given("user has logged in successfully")
	public void user_has_logged_in_successfully() {
		httpErrorPage.clickAdvancedButton();
		httpErrorPage.clickRedirectLink();
		loginPage.checkLoginButton();
		loginPage.setLoginUserID("0004524208");
		loginPage.setPassword("Test@123456");
		loginPage.clickLoginButton();
	}

	@And("entered a valid token")
	public void entered_a_valid_token() throws InterruptedException {
		tokenPage.getTokenPageName();
		controller.getDriver().getPageSource().contains("WELCOME");
		tokenPage.setTokenInput("12345");
		tokenPage.clickContinueButton();
			}

	@When("user clicks on the transfers link")
	public void user_clicks_on_the_transfers_link() throws InterruptedException {
		transferToOthersPage.clickTransfersLink();
	}

	@Then("user is navigated to the transfers page")
	public void user_is_navigated_to_the_transfers_page() throws InterruptedException {
		transferToOthersPage.verifyTransferPage();
		Thread.sleep(20000);
	}

	@When("user clicks on transfer to others link")
	public void user_clicks_on_transfer_to_others_link() {
		//The redirect automatically lands on this page
	}

	@Then("user is navigated to transfer to others page")
	public void user_is_navigated_to_transfer_to_others_page() {
		transferToOthersPage.verifyTrnasfertoOthersPage();
	}

	@When("user selects source account")
	public void user_selects_source_account() {
		transferToOthersPage.selectFromAccount();
	}

	@And("enters RecpAccNo and Amount")
	public void enters_RecpAccNo_and_Amount() {
		transferToOthersPage.setDestAccount("0157612595");
		transferToOthersPage.enterAmount();
		transferToOthersPage.enterBeneficiaryName();
	}

	@And("selects destination bank and enters recpient narration")
	public void selects_destination_bank_and_enters_recpient_narration() throws InterruptedException {
		transferToOthersPage.selectBank();
		transferToOthersPage.enterNarration();
	}

	@And("clicks continue")
	public void clicks_continue() {
		transferToOthersPage.clickContinue();
	}
	
	@Then("user is naviagated to the verify page")
	public void user_is_naviagated_to_the_verify_page() {
		// The next steps will confirm this line
	}
	
	@When("user verifies the beneficiary details")
	public void user_verifies_the_beneficiary_details(){
		transferToOthersPage.verifyAccountDetails();
	}
	
	@And("enters valid OTP")
	public void enters_valid_OTP() {
		transferToOthersPage.setOTP("12345");
	}
	
	@Then("user is navigated to the receipts page")
	public void user_is_navigated_to_the_receipts_page() {
		transferToOthersPage.verifyReceipt();
	}

	/*
	The steps below are solely for "Transfer to Self"
	 */

	@When("user ccliks on transfer to self")
	public void user_ccliks_on_transfer_to_self() {
		transferToSelfPage.clickTransferToSelf();
	}

	@Then("user is navigated to the transfer to self page")
	public void user_is_navigated_to_the_transfer_to_self_page() {
	}

	@When("users selects the source and destination account")
	public void users_selects_the_source_and_destination_account(){
		transferToSelfPage.selectFromAcct();
		transferToSelfPage.selectToAcct();
	}

	@And("enters amount and sender narration")
	public void enters_amount_and_sender_narration() {
		transferToSelfPage.enterAmount();
		transferToSelfPage.enterNarration();
	}
	@And ("clicks on the continue button")
	public void clicks_on_the_continue_button() {
		transferToSelfPage.clickContinueButton();
	}

	@Then("user is navigated to the confirmmation page")
	public void user_is_navigated_to_the_confirmmation_page() {
	}

	@When("user selects the verify checkbox and clicks continue")
	public void user_selects_the_verify_checkbox_and_clicks_continue() throws InterruptedException {
		transferToSelfPage.acceptAgreement();
		transferToSelfPage.clickContinueBTN();
	}

	@Then("user is directed to the receipt page")
	public void user_is_directed_to_the_receipt_page() {
		transferToSelfPage.clickMakeAnotherPayment();
	}

	/*
	 Remaining steps for "Transfer to Self" goes here
	 */

}
