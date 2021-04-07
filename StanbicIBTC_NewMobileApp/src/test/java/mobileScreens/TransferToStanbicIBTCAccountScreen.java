package mobileScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TransferToStanbicIBTCAccountScreen{
	WebDriver driver;
	By btn_transfertostanbicibtcaccount = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView");
	
	public TransferToStanbicIBTCAccountScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickTransfertoStanbicIBTCAccount() {
	//	waitVar.until(ExpectedConditions.visibilityOfElementLocated(btn_transfertostanbicibtcaccount));
		driver.findElement(btn_transfertostanbicibtcaccount).click();
	}

}
