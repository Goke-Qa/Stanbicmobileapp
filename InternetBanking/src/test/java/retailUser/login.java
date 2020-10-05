package retailUser;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageFactory.LoginPage;
import pageFactory.TokenPage;
import pageFactory.httpsErrorPage;

public class login extends baseClass{
	static LoginPage objLogin;
	static httpsErrorPage objHttpError;
	static TokenPage objToken;
	@Test (priority=0)
	public static void  loginWithValidCredentials() {
		driver.navigate().to("https://80.248.0.83:3443/");
		objHttpError = new httpsErrorPage(driver);
		//Navigate to actual login page due to expired certificate
		objHttpError.redirectToLoginPage();
		
		// Input login credentials
		 objLogin = new LoginPage(driver);
		 objLogin.loginInternetBanking("0015969269", "Test@12345");
		 
		 // Input token details
		 objToken = new TokenPage(driver);
		 objToken.setTokenInternetBanking("12345");		
		 
		 //Verify user is landed on the Dashboard
		 String dashBoardName = objToken.getDashboardName();
		 Assert.assertTrue(dashBoardName.toLowerCase().contains("bvn"));
	}
	
	@Test(priority=1)
	public void loginWithInValidCredentials(){
		System.out.println("The 'Login with Invalid Crdentials' test is pending so the valid account in use does not get locked.");
		
	}
}
