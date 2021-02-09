package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDefinitions.Controller;

public class tokenPage {

	Controller controller;

	@FindBy(id ="txtpassCode")
	WebElement tokenInput;

	@FindBy(xpath ="//*[@id=\'frmOtp\']/div[2]/div/button[1]")
	WebElement continueButton;

	@FindBy (xpath = "//*[@id=\'mat-dialog-0\']/div/div/a")
	WebElement dataprivacyExit;

	//@FindBy (xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/div/div/div/div[3]/div/div/div/div[6]/div/div[6]/p/button/span/span[1]")
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/div/div/div/div[3]/div/div/div/div[6]/div/div[6]/p/button")
	WebElement dataprivacySubmit;

	@FindBy(xpath="/html/body/app-root/ng-component/div/div/div/div/div[1]/h5")
	WebElement getTokenPageName;

	@FindBy(className = "account-name-truncate")
	WebElement dashboardName;

	public tokenPage(Controller controller) {
		this.controller = controller;
		PageFactory.initElements(controller.getDriver(), this);
	}
	public void setTokenInput(String token){
		tokenInput.sendKeys(token);
	}
	public void clickContinueButton() throws InterruptedException {
		continueButton.click();
		//This zooms the screen out to 70%		
		JavascriptExecutor js = (JavascriptExecutor)controller.getDriver();
		js.executeScript("document.body.style.zoom = '0.7'");
		Thread.sleep(7000);
	}
	
	public String getTokenPageName() {
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(controller.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtpassCode")));
		return getTokenPageName.getText();
	}

	public String getDashboardName() {
		return (dashboardName.getText());
	}
	
	public void checkTokenPage() {
		controller.getDriver().getPageSource().contains("BVN");
	}

}
