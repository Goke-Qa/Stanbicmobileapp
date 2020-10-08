package pageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(id = "txtusername")
	WebElement LoginUserID;
	
	@FindBy(id = "txtpassword")
	WebElement password;
	
	@FindBy(xpath = "//*[@id='frmLogin']/div[4]/div/div/div/button")
	WebElement loginButton;
		
	//@FindBy(className = "simple-notification-wrapper bottom right")
	@FindBy(xpath = "/html/body/app-root/simple-notifications/div/simple-notification/div/div[1]/div[2]")
	WebElement errorPrompt;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void setLoginUserID(String userID) {
		LoginUserID.sendKeys(userID);
	}
	public void setPassword(String userPassword) {
		password.sendKeys(userPassword);
	}
	public void clickLoginButton() {
		loginButton.click();
	}

	//This will be referenced from the test case
	public void loginInternetBanking(String userID, String userPassword) {
		this.setLoginUserID(userID);
		this.setPassword(userPassword);
		this.clickLoginButton();
	}
	
	
}
