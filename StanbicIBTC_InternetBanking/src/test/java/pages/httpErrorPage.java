package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class httpErrorPage {

WebDriver driver;
	
	@FindBy(id = "details-button")
	WebElement advancedButton;
	
	@FindBy(id = "proceed-link")
	WebElement redirectLink;
		
	public httpErrorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickAdvancedButton() {
		advancedButton.click();
	}
	public void clickRedirectLink() {
		redirectLink.click();
	}
}
