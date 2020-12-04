package managers;

import org.openqa.selenium.WebDriver;

import pages.httpErrorPage;
import pages.loginPage;
import pages.tokenPage;
import pages.transferToSelfPage;

public class PageObjectManager {
	private WebDriver driver;
	private httpErrorPage httpErrorPage;
	private loginPage loginPage;
	private tokenPage tokenPage;
	private transferToSelfPage transferToSelfPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public httpErrorPage getHttpErrorPage() {
		return (httpErrorPage == null) ? httpErrorPage = new httpErrorPage(driver) : httpErrorPage;
	}
	
	public loginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new loginPage(driver) : loginPage;
	}
	
	public tokenPage getTokenPage() {
		return (tokenPage == null) ? tokenPage = new tokenPage(driver) : tokenPage;
	}
	
	public transferToSelfPage getTransferToSelfPage() {
		return (transferToSelfPage == null) ? transferToSelfPage = new transferToSelfPage(driver) : transferToSelfPage;
	}
}
