package stepDefinitions;

import org.openqa.selenium.WebDriver;

import managers.PageObjectManager;
import pages.transferToSelfPage;
import io.cucumber.java.en.*;

public class transfers {
	WebDriver driver;
	static PageObjectManager PageObjectManager;
	static transferToSelfPage transferToSelfPage;

	@When("user clicks on the transfers link")
	public void user_clicks_on_the_transfers_link() {
		PageObjectManager = new PageObjectManager(driver);
		transferToSelfPage = PageObjectManager.getTransferToSelfPage();
		transferToSelfPage.clickTransfersLink();
	}

	@Then("user is navigated to the transfers page")
	public void user_is_navigated_to_the_transfers_page() {
	}

	@When("user clicks on transfer to others link")
	public void user_clicks_on_transfer_to_others_link() {
		transferToSelfPage.clickTransferToOthersLink();
	}

	@Then("user is navigated to transfer to others page")
	public void user_is_navigated_to_transfer_to_others_page() {
	}

	@When("user selects source account")
	public void user_selects_source_account() {
	}

	@And("enters {string} and {string}")
	public void enters_and(String string, String string2) {
	}

	@And("selects destination bank and enters recpient narration")
	public void selects_destination_bank_and_enters_recpient_narration() {
	}

	@And("clicks continue")
	public void clicks_continue() {
	}

	@Then("user is naviagated to the confirmation page")
	public void user_is_naviagated_to_the_confirmation_page() {
	}

	/*
	 Remaining steps for "Transfer to Others" goes here
	 */

	@When("user ccliks on transfer to self")
	public void user_ccliks_on_transfer_to_self() {
	}

	@Then("user is navigated to the transfer to self page")
	public void user_is_navigated_to_the_transfer_to_self_page() {
	}

	@When("users selects the source and destination account")
	public void users_selects_the_source_and_destination_account() {
	}

	@And("enters amount and sender narration")
	public void enters_amount_and_sender_narration() {
	}

	@Then("user is navigated to the confirmmation page")
	public void user_is_navigated_to_the_confirmmation_page() {
	}

	@When("user selects the verify checkbox and clicks continue")
	public void user_selects_the_verify_checkbox_and_clicks_continue() {
	}

	/*
	 Remaining steps for "Transfer to Self" goes here
	 */

}
