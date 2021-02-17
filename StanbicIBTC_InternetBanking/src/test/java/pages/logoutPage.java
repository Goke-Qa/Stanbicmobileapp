package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.Controller;

public class logoutPage {
	
	Controller controller;
						
	@FindBy(xpath = "/html/body/app-root/app-default-layout/div/div/div/nav/a[15]")
	WebElement logoutLink;
	
	@FindBy(xpath = "/html/body/app-root/app-default-layout/div/div/div/span")
	WebElement logoWrapper;
	
	@FindBy(id = "mdl-layout__drawer")
	WebElement navBar;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/form/div/div/div/div/div/div[3]/div/div/div/div/mat-dialog-content/div/div[1]/button")
	WebElement btn_surverHappy;

	public logoutPage(Controller controller) {
		this.controller = controller;
		PageFactory.initElements(controller.getDriver(), this);
	}
	
	public void clickLogoutLink() throws InterruptedException {
		Actions action = new Actions(controller.getDriver());
		action.moveToElement(navBar).build().perform();
		Thread.sleep(200);
	//	action.moveToElement(logoutLink).click().perform();
	}
	
	
}
