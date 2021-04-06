package mobileScreens;

import java.lang.ModuleLayer.Controller;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class CreateAccountScreen extends DriverFactory{

	
	By btn_profile = By.xpath("//android.view.ViewGroup[@content-desc=\"Profile\"]");
	By btn_createAccount = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]");
	By btn_home = By.xpath("//android.view.ViewGroup[@content-desc=\"Home\"]");
	By btn_shareapp = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.widget.TextView[1]");
	
	public void verifydashboard() {
		waitVar.until(ExpectedConditions.visibilityOfElementLocated(btn_home));
	}
	
	public void clickprofileButton() {
		waitVar.until(ExpectedConditions.visibilityOfElementLocated(btn_profile));
		driver.findElement(btn_profile).click();
	}
	
	public void verifyProfileScreen() {
		waitVar.until(ExpectedConditions.visibilityOfElementLocated(btn_shareapp));
		
	}
	
	public void clickCreateAccount() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", btn_createAccount);
	}
	
	}

	
