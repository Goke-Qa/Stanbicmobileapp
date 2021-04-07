package steps;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import mobileScreens.BuyAirtimeScreen;
import mobileScreens.BuyDataScreen;
import mobileScreens.CreateAccountScreen;
import mobileScreens.LoginScreen;
import mobileScreens.PayBillsScreen;

public class Payments {
	TestContext testContext;
	LoginScreen loginscreen;
	CreateAccountScreen createAccountScreen;
	BuyAirtimeScreen buyairtimescreen;
	BuyDataScreen buydatascreen;
	PayBillsScreen paybillsscreen;
	
	public Payments(TestContext context) {
		testContext = context;
		loginscreen =  testContext.getPageObjectManager().getLoginScreen();
		createAccountScreen =  testContext.getPageObjectManager().getCreateAccountScreen();
		buyairtimescreen = testContext.getPageObjectManager().getBuyAirtimeScreen();
		buydatascreen = testContext.getPageObjectManager().getBuyDataScreen();
		paybillsscreen = testContext.getPageObjectManager().getPayBillsScreen();
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
	   buyairtimescreen.enterCreds();
	   buyairtimescreen.clickamount();
	   buyairtimescreen.clicknext();
	}

	@Then("select account to debit")
	public void select_account_to_debit() {
	   buyairtimescreen.verifyaccounttodebitpage();
	   buyairtimescreen.clickaccounttodebit();
	}

	@Then("confirm and input pin")
	public void confirm_and_input_pin() {
	   buyairtimescreen.verifysummarypage();
	   buyairtimescreen.clickconfirm();
	   buyairtimescreen.verifypinpage();
	   buyairtimescreen.clickpin();
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
	    buydatascreen.verifyselectaccounttoDebit();
	    buydatascreen.clickaccounttoDebit();
	    buydatascreen.verifysummary();
	    buydatascreen.clickconfirm();
	    buydatascreen.verifyenterPIN();
	    buydatascreen.clickpin();
	    buydatascreen.verifydonePage();
	    buydatascreen.clickdone();
	}
	
	/*
	The steps below are solely for "Pay Bills"
	 */

	@Then("click on pay bills")
	public void click_on_pay_bills() {
	   paybillsscreen.clickpayBills();
	   paybillsscreen.verifybillPayments();
	   
	}

	@And("select platform you are paying for")
	public void select_platform_you_are_paying_for() {
	    paybillsscreen.clickdstv();
	    paybillsscreen.verifyselectaccounttoDebit();
	    paybillsscreen.clickaccounttoDebit();
	    paybillsscreen.verifycontinue();
	}

	@Then("input unique numbers of the platform")
	public void input_unique_numbers_of_the_platform() {
	    paybillsscreen.enterCreds();
	    
	}

	@Then("select plan")
	public void select_plan() {
		 paybillsscreen.clickselectPlan();
		 paybillsscreen.clickcompact();
		 paybillsscreen.clickcontinue1();
	}

	@Then("confirm")
	public void confirm() {
	   paybillsscreen.verifysummary();
	   paybillsscreen.clickconfirm();
	   paybillsscreen.verifyenterPIN();
	   paybillsscreen.clickPIN();
	   paybillsscreen.clickDone();
	}
}


