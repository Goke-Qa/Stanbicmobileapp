package retailUser;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageFactory.LoginPage;
import pageFactory.NavigationLinksPage;
import pageFactory.TokenPage;
import pageFactory.httpsErrorPage;
import pageFactory.Transfers.TransferToOthersPage;
import pageFactory.Transfers.TransfersNavigation;

public class transfer extends setUp {
	static NavigationLinksPage objNavigation;
	static LoginPage objLogin;
	static httpsErrorPage objHttpError;
	static TokenPage objToken;
	static TransfersNavigation objTransNav;
	static TransferToOthersPage objTransToOthersPage;

	public void transferToSelf() {
		// Test script goes here
	}

	public void transferToSingleBeneficiary() {
		// Test script goes here
	}

	@Test(priority = 0)
	public void transferToOthers() throws InterruptedException {
		// Navigate to the landing page and login to Internet banking
		driver.navigate().to("https://80.248.0.83:3443/");
		objHttpError = new httpsErrorPage(driver);
		objHttpError.redirectToLoginPage();
		objLogin = new LoginPage(driver);
		objLogin.loginInternetBanking("0015969269", "Test@12345");
		objToken = new TokenPage(driver);
		String tokenPageName = objToken.getTokenPageName();
		Assert.assertTrue(tokenPageName.toLowerCase().contains("adenike"));
		objToken.setTokenInternetBanking("12345");
		String dashBoardName = objToken.getDashboardName();
		Assert.assertTrue(dashBoardName.toLowerCase().contains("bvn"));

		// Navigate to the transfers page objNavigation.clickTransfersLink();
		objNavigation = new NavigationLinksPage(driver);
		objToken.waitDashboardCards();
	//	objNavigation.clickDashboardLink();
		 objNavigation.clickTransfersLink();
		/*
		 * objTransNav = new TransfersNavigation(driver);
		 * objTransNav.clickTrnsferToOthers(); // Fill in the transfer details
		 */ /*
			 * objTransToOthersPage.enterTransferDetails("0021269236", "100",
			 * "Auto test transfer", "Auto test transfer");
			 * objTransToOthersPage.selectBank(); // Validate account name is displayed
			 * String accountName = objTransToOthersPage.getRecipientName();
			 * Assert.assertTrue(accountName.toLowerCase().contains("oluwaseun"));
			 * objTransToOthersPage.clickContinueButton();
			 */
	}
}
