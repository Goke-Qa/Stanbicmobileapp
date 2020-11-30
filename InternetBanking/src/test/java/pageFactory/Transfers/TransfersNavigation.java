package pageFactory.Transfers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransfersNavigation {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"navigateMain\"]/div/div/div[2]/ul/li[2]/strong")
	//@FindBy(xpath="/html/body/app-root/app-default-layout/div/div/main/app-transfer/div/div/div/div/div/div[2]/div/div/div[2]/ul/li[2]/strong")
	WebElement transferToOthers;
	
	public TransfersNavigation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickTrnsferToOthers() {
		transferToOthers.click();
	}
	
}
