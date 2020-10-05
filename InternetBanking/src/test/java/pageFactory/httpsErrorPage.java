package pageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class httpsErrorPage {
	WebDriver driver;
	
	@FindBy(id = "details-button")
	WebElement detailsButton;
	
	@FindBy(id = "proceed-link")
	WebElement redirectLink;
		
	public httpsErrorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickDetailsButton() {
		detailsButton.click();
	}
	public void clickRedirectLink() {
		redirectLink.click();
	}
	
	public void redirectToLoginPage() {
		this.clickDetailsButton();
		this.clickRedirectLink();
	}
}
