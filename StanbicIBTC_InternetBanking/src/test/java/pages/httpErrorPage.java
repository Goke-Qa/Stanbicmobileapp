package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.Controller;

public class httpErrorPage {

	Controller controller;

	@FindBy(id = "details-button")
	WebElement advancedButton;

	@FindBy(id = "proceed-link")
	WebElement redirectLink;

	public httpErrorPage(Controller controller) {
		this.controller = controller;
		PageFactory.initElements(controller.getDriver(), this);
	}
	public void clickAdvancedButton() {
		advancedButton.click();
	}
	public void clickRedirectLink() {
		redirectLink.click();
	}
}
