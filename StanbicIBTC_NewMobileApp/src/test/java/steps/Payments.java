package steps;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mobileScreens.BuyAirtimeScreen;
import mobileScreens.BuyDataScreen;
import mobileScreens.CorporateBillersScreen;
import mobileScreens.Create_AccountScreen;
import mobileScreens.LoginScreen;
import mobileScreens.PayBillsScreen;

public class Payments {
	TestContext testContext;
	LoginScreen loginscreen;
	Create_AccountScreen create_AccountScreen;
	BuyAirtimeScreen buyairtimescreen;
	BuyDataScreen buydatascreen;
	PayBillsScreen paybillsscreen;
	CorporateBillersScreen corporatebillersscreen;
	
	public Payments(TestContext context) {
		testContext = context;
		loginscreen =  testContext.getPageObjectManager().getLoginScreen();
		create_AccountScreen =  testContext.getPageObjectManager().getCreate_AccountScreen();
		buyairtimescreen = testContext.getPageObjectManager().getBuyAirtimeScreen();
		buydatascreen = testContext.getPageObjectManager().getBuyDataScreen();
		paybillsscreen = testContext.getPageObjectManager().getPayBillsScreen();
		corporatebillersscreen = testContext.getPageObjectManager().getCorporateBillersScreen();
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
	   paybillsscreen.clickPIN();
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

	
}