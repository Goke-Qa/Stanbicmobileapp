package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.Controller;

public class transferToSelfPage {
	Controller controller;

	
	@FindBy(xpath = "/html/body/app-root/app-default-layout/div/div/div/nav/a[3]/i")
	WebElement navBar;

	@FindBy(xpath = "/html/body/app-root/app-default-layout/div/div/main/app-transfer/div/div/div/div/div/div[2]/div/div/div[2]/ul/li[3]")
	WebElement transferToSelfLink;

	@FindBy(xpath = "/html/body/app-root/app-default-layout/div/div/main/app-transfer/div/div/div/div/div/div[3]/div/div/app-self-transfer/mat-card/mat-card-content/div/mat-horizontal-stepper/div[2]/div[1]/div/div/form/div[1]/div[1]/div[1]/mat-form-field/div/div[1]/div/mat-select")
	WebElement select_fromAcctNo;

	@FindBy(name = "destinationAccount")
	WebElement select_toAcctNo;

	@FindBy(xpath = "/html/body/app-root/app-default-layout/div/div/main/app-transfer/div/div/div/div/div/div[3]/div/div/app-self-transfer/mat-card/mat-card-content/div/mat-horizontal-stepper/div[2]/div[1]/div/div/form/div[1]/div[1]/div[2]/mat-form-field/div/div[1]/div/input")
	WebElement txt_amount;

	@FindBy(xpath = "/html/body/app-root/app-default-layout/div/div/main/app-transfer/div/div/div/div/div/div[3]/div/div/app-self-transfer/mat-card/mat-card-content/div/mat-horizontal-stepper/div[2]/div[1]/div/div/form/div[2]/div[1]/div/mat-form-field/div/div[1]/div/input")
	WebElement txt_senderNarration;

	@FindBy (xpath = "/html/body/app-root/app-default-layout/div/div/main/app-transfer/div/div/div/div/div/div[3]/div/div/app-self-transfer/mat-card/mat-card-content/div/mat-horizontal-stepper/div[2]/div[1]/div/div/form/div[2]/div[2]/div/mat-form-field/div/div[1]/div/input")
	WebElement txt_recpNarration;

	@FindBy (xpath = "/html/body/app-root/app-default-layout/div/div/main/app-transfer/div/div/div/div/div/div[3]/div/div/app-self-transfer/mat-card/mat-card-content/div/mat-horizontal-stepper/div[2]/div[1]/div/div/form/div[4]/div/button[1]")
	WebElement btn_continueButton;

	@FindBy(xpath ="/html/body/app-root/app-default-layout/div/div/main/app-transfer/div/div/div/div/div/div[3]/div/div/app-self-transfer/mat-card/mat-card-content/div/mat-horizontal-stepper/div[2]/div[2]/div/div[2]/mat-checkbox/label/div")
	WebElement chkbx_confirmButton;

	 @FindBy(xpath = "/html/body/app-root/app-default-layout/div/div/main/app-transfer/div/div/div/div/div/div[3]/div/div/app-self-transfer/mat-card/mat-card-content/div/mat-horizontal-stepper/div[2]/div[2]/div/div[3]/div/button[2]")
	WebElement btn_continueBtn;

	@FindBy(xpath = "/html/body/app-root/app-default-layout/div/div/main/app-transfer/div/div/div/div/div/div[3]/div/div/app-self-transfer/mat-card/mat-card-content/div/mat-horizontal-stepper/div[2]/div[3]/div/div/div[18]/button")
	WebElement btn_makeAnotherPayment;


	public transferToSelfPage(Controller controller) {
		this.controller = controller;
		PageFactory.initElements(controller.getDriver(), this);
	}

	public void clickTransferToSelf() {		
		JavascriptExecutor js = (JavascriptExecutor)controller.getDriver();
		js.executeScript("arguments[0].click();", transferToSelfLink);
	}

	public void selectFromAcct(){		
		JavascriptExecutor js = (JavascriptExecutor)controller.getDriver();
		js.executeScript("arguments[0].click();", select_fromAcctNo);
		select_fromAcctNo.sendKeys(Keys.ARROW_DOWN);
		select_fromAcctNo.sendKeys(Keys.ENTER);
	}

	public void selectToAcct() {		
		JavascriptExecutor js = (JavascriptExecutor)controller.getDriver();
		js.executeScript("arguments[0].click();", select_toAcctNo);
		select_toAcctNo.sendKeys(Keys.ARROW_DOWN);
		select_toAcctNo.sendKeys(Keys.ENTER);
	}

	public void enterAmount() {
		txt_amount.sendKeys("100");
	}

	public void enterNarration() {
		txt_senderNarration.sendKeys("autoTest Narration-sender");
		txt_recpNarration.sendKeys("AutoTest Narration-recipient");
	}

	public void acceptAgreement() {
		JavascriptExecutor js = (JavascriptExecutor)controller.getDriver();
		js.executeScript("arguments[0].click();", chkbx_confirmButton);
		}

	public void clickContinueButton() {
		JavascriptExecutor js = (JavascriptExecutor)controller.getDriver();
		js.executeScript("arguments[0].click();", btn_continueButton);
	}

	public void clickContinueBTN() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)controller.getDriver();
		js.executeScript("arguments[0].click();", btn_continueBtn);
		Thread.sleep(30000);
	}
	public void clickMakeAnotherPayment() {
		
		JavascriptExecutor js = (JavascriptExecutor)controller.getDriver();
		js.executeScript("arguments[0].click();", btn_makeAnotherPayment);
	}

}
