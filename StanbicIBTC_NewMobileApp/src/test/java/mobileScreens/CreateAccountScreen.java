package mobileScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountScreen{

	WebDriver driver;
	By btn_profile = By.xpath("//android.view.ViewGroup[@content-desc=\"Profile\"]");
	By btn_createAccount = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]");
	By btn_home = By.xpath("//android.view.ViewGroup[@content-desc=\"Home\"]");
	By btn_shareapp = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.widget.TextView[1]");
	
	public CreateAccountScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifydashboard() {
	//	waitVar.until(ExpectedConditions.visibilityOfElementLocated(btn_home));
	}
	
	public void clickprofileButton() {
	//	waitVar.until(ExpectedConditions.visibilityOfElementLocated(btn_profile));
		driver.findElement(btn_profile).click();
	}
	
	public void verifyProfileScreen() {
	//	waitVar.until(ExpectedConditions.visibilityOfElementLocated(btn_shareapp));
		
	}
	
	public void clickCreateAccount() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", btn_createAccount);
	}
	
	}

	
