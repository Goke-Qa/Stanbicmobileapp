package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationLinksPage {
	WebDriver driver;

	@FindBy(xpath = "/html/body/app-root/app-default-layout/div/div/div/nav/a[2]/span")
	WebElement Dashboard;
	
	//@FindBy(xpath = "//*[@id=\"mdl-layout__drawer\"]/nav/a[3]/span")
	@FindBy(xpath="/html/body/app-root/app-default-layout/div/div/div/nav/a[3]/i")
	WebElement Transfers;
		
	@FindBy(xpath = "//*[@id=\"mdl-layout__drawer\"]/nav/a[4]/span")
	WebElement InternationalPayments;
	
	public NavigationLinksPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickTransfersLink() {
		Transfers.click();
	}
	public void clickDashboardLink() {
		Transfers.click();
	}
}
