package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.Controller;

public class loginPage {
	Controller controller;
	@FindBy(id = "txtusername")
	WebElement LoginUserID;

	@FindBy(id = "txtpassword")
	WebElement password;

	@FindBy(xpath = "/html/body/app-root/ng-component/div/main/div/div/div[1]/div/form/div[4]/div/div/div/button")
	WebElement loginButton;

	@FindBy(xpath = "/html/body/app-root/simple-notifications/div/simple-notification/div/div[1]/div[2]")
	WebElement errorPrompt;

	public loginPage(Controller controller) {
		this.controller = controller;
		PageFactory.initElements(controller.getDriver(), this);
	}
	public void setLoginUserID(String userID) {
		LoginUserID.sendKeys(userID);
	}
	public void setPassword(String userPassword) {
		password.sendKeys(userPassword);
	}
	public void clickLoginButton() {
		loginButton.click();
	}
	public void checkLoginButton() {
		loginButton.isDisplayed();

	}

}
