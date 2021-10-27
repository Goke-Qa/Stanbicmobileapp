package managers;

import org.openqa.selenium.WebDriver;

import mobileScreens.Activate_3S_Banking_Screen;
import mobileScreens.AutoAirtimeScreen;
import mobileScreens.BuyAirtimeScreen;
import mobileScreens.BuyDataScreen;
import mobileScreens.Buy_for_self_Screen;
import mobileScreens.Cardless_Withdrawal_Screen;
import mobileScreens.CorporateBillersScreen;
import mobileScreens.Create_AccountScreen;
import mobileScreens.LoginScreen;
import mobileScreens.LogoutScreen;
import mobileScreens.PayBillsScreen;
import mobileScreens.TransfersScreens;
import mobileScreens.TransferToOthersScreen;
import mobileScreens.TransferToStanbicIBTCAccountScreen;


public class PageObjectManager {
	
	private WebDriver driver;

	private BuyAirtimeScreen getBuyAirtimeScreen;
	private BuyDataScreen getBuyDataScreen;
	private Create_AccountScreen getCreate_AccountScreen;
	private LoginScreen getLoginScreen;
	private LogoutScreen getLogoutScreen;
	private PayBillsScreen getPayBillsScreen;
	private TransferToOthersScreen getTransferToOthersScreen;
	private TransferToStanbicIBTCAccountScreen getTransferToStanbicIBTCAccountScreen;
	private CorporateBillersScreen getCorporateBillersScreen;
	private Activate_3S_Banking_Screen getActivate_3s_Banking_Screen;

	private TransfersScreens getTransfersScreen;
	private AutoAirtimeScreen getautoairtimeScreen;
	private Buy_for_self_Screen getbuyforselfScreen;
	private Cardless_Withdrawal_Screen getcardlesswithdrawalScreen;

	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public BuyAirtimeScreen getBuyAirtimeScreen() {

		return (getBuyAirtimeScreen == null) ? getBuyAirtimeScreen = new BuyAirtimeScreen(driver) : getBuyAirtimeScreen;
	}
	
	public BuyDataScreen getBuyDataScreen() {

		return (getBuyDataScreen == null) ? getBuyDataScreen = new BuyDataScreen(driver) : getBuyDataScreen;
	}
	
	public Create_AccountScreen getCreate_AccountScreen() {
		return (getCreate_AccountScreen == null) ? getCreate_AccountScreen = new Create_AccountScreen(driver) : getCreate_AccountScreen;
		
	}
	
	public  LoginScreen getLoginScreen() {

		return (getLoginScreen == null) ? getLoginScreen = new LoginScreen(driver) : getLoginScreen;
	}
	
	public  LogoutScreen getLogoutScreen() {

		return (getLogoutScreen == null) ? getLogoutScreen = new LogoutScreen(driver) : getLogoutScreen;
	}
	
	public PayBillsScreen getPayBillsScreen() {

		return (getPayBillsScreen == null) ? getPayBillsScreen = new PayBillsScreen(driver) : getPayBillsScreen;
	}
	
	public TransferToOthersScreen getTransferToOthersScreen() {

		return (getTransferToOthersScreen == null) ? getTransferToOthersScreen = new TransferToOthersScreen(driver) : getTransferToOthersScreen;
	}
		
	public  TransferToStanbicIBTCAccountScreen getTransferToStanbicIBTCAccountScreen() {

		return (getTransferToStanbicIBTCAccountScreen == null) ? getTransferToStanbicIBTCAccountScreen = new TransferToStanbicIBTCAccountScreen(driver) : getTransferToStanbicIBTCAccountScreen;
	}
	
	public CorporateBillersScreen getCorporateBillersScreen() {
		return (getCorporateBillersScreen == null) ? getCorporateBillersScreen = new CorporateBillersScreen(driver) : getCorporateBillersScreen;
	}
	
	public Activate_3S_Banking_Screen getActivate_3S_BankingScreen() {
		return (getActivate_3s_Banking_Screen == null) ? getActivate_3s_Banking_Screen = new Activate_3S_Banking_Screen(driver) : getActivate_3s_Banking_Screen;
	}
	
	public TransfersScreens getTransfersScreen() {
		return (getTransfersScreen == null) ? getTransfersScreen = new TransfersScreens(driver) : getTransfersScreen;
	}
	
	public AutoAirtimeScreen getautoairtimeScreen() {
		return (getautoairtimeScreen == null) ? getautoairtimeScreen = new AutoAirtimeScreen(driver) : getautoairtimeScreen;
	}
	public Buy_for_self_Screen getbuyforselfScreen() {
		return (getbuyforselfScreen == null) ? getbuyforselfScreen = new Buy_for_self_Screen(driver) : getbuyforselfScreen;
		
	}
	public Cardless_Withdrawal_Screen getcardlesswithdrwalScreen() {
		return(getcardlesswithdrawalScreen == null) ? getcardlesswithdrawalScreen = new Cardless_Withdrawal_Screen(driver) : getcardlesswithdrawalScreen;
	}
}
