package steps;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mobileScreens.AutoAirtimeScreen;
import mobileScreens.BuyAirtimeScreen;
import mobileScreens.BuyDataScreen;
import mobileScreens.Buy_for_self_Screen;
import mobileScreens.Cardless_Withdrawal_Screen;
import mobileScreens.CorporateBillersScreen;
import mobileScreens.Create_AccountScreen;
import mobileScreens.LoginScreen;
import mobileScreens.PayBillsScreen;

public class Payments {
	TestContext testContext;
	LoginScreen loginScreen;
	Create_AccountScreen create_AccountScreen;
	BuyAirtimeScreen buyairtimescreen;
	BuyDataScreen buydatascreen;
	PayBillsScreen paybillsscreen;
	CorporateBillersScreen corporatebillersscreen;
	AutoAirtimeScreen autoairtimeScreen;
	Buy_for_self_Screen buyforselfScreen;
	Cardless_Withdrawal_Screen cardlesswithdrawalScreen;

	public Payments(TestContext context) {
		testContext = context;
		loginScreen =  testContext.getPageObjectManager().getLoginScreen();
		create_AccountScreen =  testContext.getPageObjectManager().getCreate_AccountScreen();
		buyairtimescreen = testContext.getPageObjectManager().getBuyAirtimeScreen();
		buydatascreen = testContext.getPageObjectManager().getBuyDataScreen();
		paybillsscreen = testContext.getPageObjectManager().getPayBillsScreen();
		corporatebillersscreen = testContext.getPageObjectManager().getCorporateBillersScreen();
		autoairtimeScreen = testContext.getPageObjectManager().getautoairtimeScreen();
		buyforselfScreen = testContext.getPageObjectManager().getbuyforselfScreen();
		cardlesswithdrawalScreen = testContext.getPageObjectManager().getcardlesswithdrwalScreen();
	}

	@And("click on payments icon")
	public void click_on_payments_icon() {
		buyairtimescreen.clickpaymentsButton();
		buyairtimescreen.verifypaymentspage();
	}

	@Then("click on buy airtime")
	public void click_on_buy_airtime() {
		buyairtimescreen.clickbuyairtime();
		buyairtimescreen.verifybuyairtimepage();
		buyairtimescreen.clickbuyairtime1();

	}

	@And("input phone number and amount")
	public void input_phone_number_and_amount() {
		buyairtimescreen.verifygoogleenable();
		buyairtimescreen.clickallow();
		buyairtimescreen.verifyairtimepage();
		buyairtimescreen.clickmtn();
		buyairtimescreen.enterPhonenumber();
		buyairtimescreen.enterAmount();
		buyairtimescreen.clicknext();
	}

	@Then("select account to debit")
	public void select_account_to_debit() {
		buyairtimescreen.clickaccounttodebit();
		buyairtimescreen.clickconfirm();
	}

	@Then("confirm and input pin")
	public void confirm_and_input_pin() {
		loginScreen.click4DigitPIN();
	}


	/*
	The steps below are solely for "Auto Airtime"
	 */

	@And("click payments icon")
	public void click_payments_icon() {
		buyairtimescreen.clickpaymentsButton();
		buyairtimescreen.verifypaymentspage();
	}

	@Then("click on auto airtime")
	public void click_on_auto_airtime() {
		buyairtimescreen.clickbuyairtime();
		autoairtimeScreen.clickAuto_airtime();
		buyairtimescreen.verifygoogleenable();
		buyairtimescreen.clickallow();

	}

	@Then("input threshold")
	public void input_threshold() throws Exception {
		autoairtimeScreen.verifyAutoairtimeScreen();
		autoairtimeScreen.inputPhonenumber();
		autoairtimeScreen.inputThreshould();
		autoairtimeScreen.inputAmount();
		autoairtimeScreen.clickTaptosave();
		
	}

	@Then("select the account to debit")
	public void select_the_account_to_debit() {
		autoairtimeScreen.selectAccount();
		buyairtimescreen.clickconfirm();
	}

	@And("input pin")
	public void input_pin() {
		loginScreen.click4DigitPIN();

	}

	/*
	The steps below are solely for "Buy for Self"
	 */

	@Then("click on buy for self")
	public void click_on_buy_for_self() {
		buyairtimescreen.clickpaymentsButton();
		buyairtimescreen.verifypaymentspage();
		buyairtimescreen.clickbuyairtime();
		buyforselfScreen.clickBuyforSelf();
		buyairtimescreen.verifygoogleenable();
		buyairtimescreen.clickallow();
		buyforselfScreen.inputAmount();
		buyforselfScreen.clickNext();
		buyairtimescreen.clickaccounttodebit();
		buyairtimescreen.clickconfirm();

	}

	@Then("proceed to input pin")
	public void proceed_to_input_pin() {
		loginScreen.click4DigitPIN();

	}

	/*
	The steps below are solely for "Buy Data"
	 */

	@Then("click on buy data")
	public void click_on_buy_data() {
		buydatascreen.clickbuyData();
		buydatascreen.verifygoogleEnable();
		buydatascreen.clickgoogleEnable();
	}

	@And("input phone number")
	public void input_phone_number() {
		buydatascreen.verifynetworkscreen();
		buydatascreen.clickmtn();
		buydatascreen.verifydataplan();
		buydatascreen.enterCreds();
		buydatascreen.clickdataPlan();
		buydatascreen.clickxtraTalk();
		buydatascreen.verifytaptosaveNumber();
		buydatascreen.clicknext();
	}
		
	@Then("select an account to debit")
		public void select_an_account_to_debit() {
		buydatascreen.verifyselectaccounttoDebit();
		buydatascreen.clickaccounttoDebit();
		buydatascreen.verifysummary();
		buydatascreen.clickconfirm();
		loginScreen.click4DigitPIN();
	}

	/*
	The steps below are solely for "Pay Bills"
	 */

	@Then("click on pay bills")
	public void click_on_pay_bills() throws Exception {
		paybillsscreen.clickpayBills();
		

	}

	@And("confirm user can see all third party vendor")
	public void confirm_user_can_see_all_third_party_vendor() {
	   paybillsscreen.confirmDSTV();
	}

	/*
	The steps below are solely for "Corporate Billers"
	 */

	@And("click on the payments icon")
	public void click_on_the_payments_icon() {
		corporatebillersscreen.clickpayment();

	}

	@Then("click on Corporate Billers")
	public void click_on_corporate_billers() {
		corporatebillersscreen.clickcorporateBillers();
	}
	
	@Then("confirm government category")
	public void confirm_government_category() {
		corporatebillersscreen.clickgovernment();
	}

	@Then("confirm airlines category")
	public void confirm_airlines_category() {
		corporatebillersscreen.clickAirlines();
	}

	@Then("confirm insurance category")
	public void confirm_insurance_category() {
	    corporatebillersscreen.clickInsurance();
	}

	@Then("confirm construction category")
	public void confirm_construction_category() {
		corporatebillersscreen.clickConstruction();
	}

	@Then("confirm others category")
	public void confirm_others_category() {
		corporatebillersscreen.clickOthers();
	}

	@Then("confirm cableTV category")
	public void confirm_cable_tv_category() {
		corporatebillersscreen.clickCableTV();
	}

	@Then("confirm investment category")
	public void confirm_investment_category() {
		corporatebillersscreen.clickInvestments();
	}

	@Then("confirm shipping category")
	public void confirm_shipping_category() {
		 corporatebillersscreen.clickShipping();
	}
	    
	
	/*
	The steps below are solely for "Cardless Withdrawal"
	 */
	
	@And("click on payment sign")
	public void click_on_payment_sign() {
		buyairtimescreen.clickpaymentsButton();
	   
	}

	@Then("click on cardless withdrawal")
	public void click_on_cardless_withdrawal() {
		cardlesswithdrawalScreen.clickCardlesswithdrawalbutton();
	   
	}

	@And("amount and pin")
	public void amount_and_pin() {
		cardlesswithdrawalScreen.clickCardlessamount();
		cardlesswithdrawalScreen.clickAccounttodebit();
		cardlesswithdrawalScreen.clickWithdrawalPIN();
	}
	
	@Then("confirm done button")
		public void confirm_done_button() {
		cardlesswithdrawalScreen.clickEnterPIN();
		cardlesswithdrawalScreen.verifyDone();
	}

}