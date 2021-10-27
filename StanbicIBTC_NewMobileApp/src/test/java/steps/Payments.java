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
		buyairtimescreen.verifyaccounttodebitpage();
		buyairtimescreen.clickaccounttodebit();
		buyairtimescreen.verifysummarypage();
		buyairtimescreen.clickconfirm();
	}

	@Then("confirm and input pin")
	public void confirm_and_input_pin() {
		buyairtimescreen.verifypinpage();
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

	@And("input phone number & amount")
	public void input_phone_number_amount() {
		buyairtimescreen.clickmtn();
		buyairtimescreen.enterPhonenumber();
		autoairtimeScreen.inputThreshould();
		buyairtimescreen.enterAmount();
		buyairtimescreen.clicknext();
		buyairtimescreen.clickaccounttodebit();
	}

	@Then("select the account to debit")
	public void select_the_account_to_debit() {
		buyairtimescreen.verifysummarypage();
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
		buyairtimescreen.verifysummarypage();
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
		Thread.sleep(5000);
		paybillsscreen.clickBillers();
		paybillsscreen.verifybillPayments();

	}

	@And("select platform you are paying for")
	public void select_platform_you_are_paying_for() {
		paybillsscreen.clickdstv();
	}

	@Then("select account to debit during bills payment")
	public void select_account_to_debit_during_bills_payment() {
		paybillsscreen.clickaccounttoDebit();
	}

	@Then("input unique numbers of the platform")
	public void input_unique_numbers_of_the_platform() throws Exception {
		Thread.sleep(20000);
		paybillsscreen.verifyDSTVsubScreen();
		paybillsscreen.enterIUC();

	}

	@Then("select plan")
	public void select_plan() {
		paybillsscreen.clickselectPlan();
		paybillsscreen.clickcompact();
		paybillsscreen.clickcontinue();
	}

	@Then("confirm")
	public void confirm() {
		paybillsscreen.verifysummary();
		paybillsscreen.clickconfirm();
		loginScreen.click4DigitPIN();
		paybillsscreen.clickDone();
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

	@Then("select Government")
	public void select_government() {
		corporatebillersscreen.clickgovernment();
	}

	@When("you click on revpay")
	public void you_click_on_revpay() {
		corporatebillersscreen.clickrevpay();
	}

	@Then("select account to debit for revpay")
	public void select_account_to_debit_for_revpay() {

	}

	@Then("continue")
	public void continue1() {
		corporatebillersscreen.clickaccounttoDebit();
		corporatebillersscreen.clickwebGUID();
		corporatebillersscreen.clickyes();
		corporatebillersscreen.clickcontinue();
		corporatebillersscreen.enterCreds();
		corporatebillersscreen.clickcontinue1();
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
		loginScreen.click4DigitPIN();
		cardlesswithdrawalScreen.clickWithdrawalPIN();
		loginScreen.click4DigitPIN();
		cardlesswithdrawalScreen.clickWithdrawalPIN();
		cardlesswithdrawalScreen.clickEnterPIN();
	}


}