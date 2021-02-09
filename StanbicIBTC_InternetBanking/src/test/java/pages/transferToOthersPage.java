package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDefinitions.Controller;

public class transferToOthersPage {
	Controller controller;

	@FindBy(className = "mat-card-content")
	WebElement acctSection;

	@FindBy(xpath = "/html/body/app-root/app-default-layout/div/div/div/span")
	WebElement logoWrapper;

	@FindBy(xpath = "/html/body/app-root/app-default-layout/div/div/div/nav/a[0]")
	WebElement dashboardLink;

	@FindBy(xpath = "/html/body/app-root/app-default-layout/div/div/div/nav/a[2]")
	WebElement transfersLink;

	@FindBy(xpath = "/html/body/app-root/app-default-layout/div/div/main/app-transfer/div/div/div/div/div/div[3]/div/div/app-one-time-transfer/mat-card/mat-card-content/div/mat-horizontal-stepper/div[2]/div[1]/div/div[1]/form/div[2]/div[1]/div[1]/mat-form-field/div/div[1]/div/mat-select")
	WebElement select_fromAccount;

	@FindBy(name = "destAccountNo")
	WebElement txt_toAccount;

	@FindBy(xpath = "/html/body/app-root/app-default-layout/div/div/main/app-transfer/div/div/div/div/div/div[3]/div/div/app-one-time-transfer/mat-card/mat-card-content/div/mat-horizontal-stepper/div[2]/div[1]/div/div[1]/form/div[2]/div[2]/div[2]/mat-form-field/div/div[1]/div/mat-select")
	WebElement select_destBank;

	@FindBy(name = "amount")
	WebElement txt_amount;

	@FindBy(name = "beneficiaryName")
	WebElement txt_beneficiaryName;

	@FindBy(name = "benenficiaryRef")
	WebElement txt_senderNarration;

	@FindBy(name = "senderRef")
	WebElement txt_recpNarration;

	@FindBy(xpath = "/html/body/app-root/app-default-layout/div/div/main/app-transfer/div/div/div/div/div/div[3]/div/div/app-one-time-transfer/mat-card/mat-card-content/div/mat-horizontal-stepper/div[2]/div[1]/div/div[1]/form/div[6]/div/button[1]")
	WebElement btn_continueButton;

	@FindBy(name = "cfEdit")
	WebElement chkbx_verify;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/div/mat-dialog-actions/div/div/button[1]")
	WebElement btn_vefContinue;

	@FindBy(name = "oneTimePassCode")
	WebElement txt_OTP;

	@FindBy (xpath = "/html/body/app-root/app-default-layout/div/div/main/app-transfer/div/div/div/div/div/div[3]/div/div/app-one-time-transfer/mat-card/mat-card-content/div/mat-horizontal-stepper/div[2]/div[2]/form/mat-dialog-actions/div/div/button[1]")
	WebElement btn_OTPVerify;

	@FindBy(xpath = "/html/body/app-root/app-default-layout/div/div/main/app-transfer/div/div/div/div/div/div[3]/div/div/app-one-time-transfer/mat-card/mat-card-content/div/mat-horizontal-stepper/div[2]/div[3]/div/div/div[17]/div/button")
	WebElement btn_makeAnotherPayment;


	public transferToOthersPage(Controller controller) {
		this.controller = controller;
		PageFactory.initElements(controller.getDriver(), this);
	}
	public void clickTransfersLink() throws InterruptedException {
		Actions action = new Actions(controller.getDriver());
		action.moveToElement(logoWrapper).build().perform();
		action.moveToElement(transfersLink).click().perform();
		Thread.sleep(10000);
	}

	public void enterAmount() {
		txt_amount.sendKeys("100");
	}

	public void verifyTransferPage() {
		controller.getDriver().getPageSource().contains("Transfer Funds");
	}

	public void enterBeneficiaryName() {
		txt_beneficiaryName.sendKeys("EDET U E");
	}

	public void verifyTrnasfertoOthersPage() {
		controller.getDriver().getPageSource().contains("Transfer To Others");
	}

	public void selectFromAccount() {
		JavascriptExecutor js = (JavascriptExecutor)controller.getDriver();
		js.executeScript("arguments[0].click();", select_fromAccount);
		select_fromAccount.sendKeys(Keys.ARROW_DOWN);
		select_fromAccount.sendKeys(Keys.ENTER);
	}

	public void setDestAccount(String accountNo) {
		txt_toAccount.sendKeys(accountNo);
	}

	public void selectBank() {
		JavascriptExecutor js = (JavascriptExecutor)controller.getDriver();
		js.executeScript("arguments[0].click();", select_destBank);
		select_destBank.sendKeys(Keys.ARROW_DOWN);
		select_destBank.sendKeys(Keys.ENTER);
	}

	public void enterToAccount(String Amount) {
		txt_amount.sendKeys(Amount);
	}

	public void enterNarration() throws InterruptedException {
		txt_senderNarration.sendKeys("auto test narration");
		txt_recpNarration.sendKeys("auto test narration");

	}

	public void clickContinue() {
		JavascriptExecutor js = (JavascriptExecutor)controller.getDriver();
		/* WebDriverWait wait = new WebDriverWait(controller.getDriver(), 150);
		WebElement continueBTN = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-default-layout/div/div/main/app-transfer/div/div/div/div/div/div[3]/div/div/app-one-time-transfer/mat-card/mat-card-content/div/mat-horizontal-stepper/div[2]/div[1]/div/div[1]/form/div[5]/div/button[1]")));
		 */
		js.executeScript("arguments[0].click();", btn_continueButton);
	}

	public void verifyAccountDetails() {
		JavascriptExecutor js = (JavascriptExecutor)controller.getDriver();
		js.executeScript("arguments[0].click();", chkbx_verify);
		js.executeScript("arguments[0].click();", btn_vefContinue);
	}

	public void setOTP(String OTP) {
		JavascriptExecutor js = (JavascriptExecutor)controller.getDriver();
		txt_OTP.sendKeys(OTP);
		js.executeScript("arguments[0].click();", btn_OTPVerify);
	}

	public void verifyReceipt() {
		JavascriptExecutor js = (JavascriptExecutor)controller.getDriver();
		js.executeScript("arguments[0].click();", btn_makeAnotherPayment);
	}
}
