package pageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TokenPage {
	WebDriver driver;
	
	@FindBy(id ="txtpassCode")
	WebElement tokenInput;
	
	@FindBy(xpath ="//*[@id=\'frmOtp\']/div[2]/div/button[1]")
	WebElement continueButton;
	
	@FindBy(className="account-name-truncate")
	WebElement dashboardName;
	
	public TokenPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void setTokenInput(String token){
		tokenInput.sendKeys(token);
	}
	public void clickContinueButton() {
		continueButton.click();
	}
	
	public String getDashboardName() {
		return dashboardName.getText();
	}
	
	// This will be referenced in the test case class
	public void setTokenInternetBanking(String token) {
		 @SuppressWarnings("deprecation")
		 WebDriverWait wait = new WebDriverWait(driver, 100);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtpassCode")));
		this.setTokenInput(token);
		this.clickContinueButton();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("account-name-truncate")));
		}
}
