package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.Controller;

public class loginPage {
	Controller controller;
	httpErrorPage httpErrorPage;
	tokenPage tokenPage;
	
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
		httpErrorPage = new httpErrorPage(controller);
		tokenPage = new tokenPage(controller);
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
	
	// This function handles the full login and token validation process
	public void successfulLogin() throws InterruptedException {
		httpErrorPage.clickAdvancedButton();
		httpErrorPage.clickRedirectLink();
		this.setLoginUserID("0015969269");
		this.setPassword("Test123@4");
		this.clickLoginButton();
		tokenPage.getTokenPageName();
		controller.getDriver().getPageSource().contains("WELCOME");
		tokenPage.setTokenInput("12345");
		tokenPage.clickContinueButton();
		
	}

}
