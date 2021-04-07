package managers;

import org.openqa.selenium.WebDriver;
import mobileScreens.BuyAirtimeScreen;
import mobileScreens.BuyDataScreen;
import mobileScreens.CreateAccountScreen;
import mobileScreens.LoginScreen;
import mobileScreens.LogoutScreen;
import mobileScreens.PayBillsScreen;
import mobileScreens.TransferToOthersScreen;
import mobileScreens.TransferToStanbicIBTCAccountScreen;


public class PageObjectManager {
	
	private WebDriver driver;

	private BuyAirtimeScreen getBuyAirtimeScreen;
	private BuyDataScreen getBuyDataScreen;
	private CreateAccountScreen getCreateAccountScreen;
	private LoginScreen getLoginScreen;
	private LogoutScreen getLogoutScreen;
	private PayBillsScreen getPayBillsScreen;
	private TransferToOthersScreen getTransferToOthersScreen;
	private TransferToStanbicIBTCAccountScreen getTransferToStanbicIBTCAccountScreen;
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public BuyAirtimeScreen getBuyAirtimeScreen() {

		return (getBuyAirtimeScreen == null) ? getBuyAirtimeScreen = new BuyAirtimeScreen(driver) : getBuyAirtimeScreen;
	}
	
	public BuyDataScreen getBuyDataScreen() {

		return (getBuyDataScreen == null) ? getBuyDataScreen = new BuyDataScreen(driver) : getBuyDataScreen;
	}
	
	public  CreateAccountScreen getCreateAccountScreen() {

		return (getCreateAccountScreen == null) ? getCreateAccountScreen = new CreateAccountScreen(driver) : getCreateAccountScreen;
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
}
