package mobileScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogoutScreen extends DriverFactory {

	By btn_home = By.xpath("//android.view.ViewGroup[@content-desc=\"Home\"]");
	By btn_logout = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ImageView");
	By btn_yes = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView");
	By btn_no = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView");
	
	public void verifyHome() {
		waitVar.until(ExpectedConditions.visibilityOfElementLocated(btn_home));
		
	}
	
	public void clickLogout() {
		waitVar.until(ExpectedConditions.visibilityOfElementLocated(btn_logout));
		driver.findElement(btn_logout).click();
		
	}
	
	public void clickYes() {
		waitVar.until(ExpectedConditions.visibilityOfElementLocated(btn_yes));
		driver.findElement(btn_yes).click();
	}
}
