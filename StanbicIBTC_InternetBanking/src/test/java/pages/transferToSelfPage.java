package pages;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class transferToSelfPage {
	WebDriver driver;
	
	
	@FindBy(xpath = "/html/body/app-root/app-default-layout/div/div/div/nav/a[3]/i")
	WebElement navBar;

	@FindBy(xpath = "/html/body/app-root/app-default-layout/div/div/div/nav/a[3]/span")
	WebElement transferslink;


	public transferToSelfPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickTransfersLink() {
	//	Actions action = new Actions(driver);
//		action.moveToElement(transferslink).perform();
//		transferslink.click();
		System.out.println("I am in the transfers link function");
	}

	public void clickTransferToOthersLink() {
		System.out.println("User clicks on transfer to toehrs link");
	}


}
