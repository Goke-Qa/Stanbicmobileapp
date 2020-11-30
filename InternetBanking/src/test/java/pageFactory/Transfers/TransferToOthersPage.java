package pageFactory.Transfers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferToOthersPage {
	WebDriver driver;
	@FindBy(id = "destAccountNo")
	WebElement destAccountNo;
	@FindBy(id = "mat-input-97")
	WebElement Amount;
	@FindBy(id = "mat-select-7")
	// @FindBy(id ="mat-select-36")
	WebElement Bank;
	@FindBy(id = "mat-input-99")
	WebElement recipientName;
	@FindBy(id = "mat-input-100")
	WebElement sendersNarration;
	@FindBy(id = "mat-input-101")
	WebElement receipientsNarration;
	@FindBy(xpath = "//*[@id=\'cdk-step-content-11-0\']/div/div[1]/form/div[6]/div/button[1]")
	WebElement continueButton;

	public TransferToOthersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setDestinationAccount(String destinationAccountNo) {
		destAccountNo.sendKeys(destinationAccountNo);
	}

	public void setAmount(String amount) {
		Amount.sendKeys(amount);
	}

	public void selectBank() {
		for (int i = 0; i < 3; i++) {
			Bank.click();
		}
	}

	public String getRecipientName() {
		String recName = recipientName.getText();
		return recName;
	}

	public void setRecipientNarration(String recpNarration) {
		receipientsNarration.sendKeys(recpNarration);
	}

	public void setSemderNarration(String sendNarration) {
		sendersNarration.sendKeys(sendNarration);
	}

	public void clickContinueButton() {
		continueButton.click();
	}

	public void enterTransferDetails(String destinationAccountNo, String amount, String recpNarration,
			String sendNarration) {
		this.setDestinationAccount(destinationAccountNo);
		this.setAmount(amount);
		this.selectBank();
		this.setSemderNarration(sendNarration);
		this.setRecipientNarration(recpNarration);
	}

}
