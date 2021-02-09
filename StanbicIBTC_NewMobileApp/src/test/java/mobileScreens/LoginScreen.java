package mobileScreens;

import org.openqa.selenium.By;

public class LoginScreen extends DriverFactory{

	By btn_MyBankMenu = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup");
	By btn_loginButton =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]");
	
	public void clickMyBankMenu() throws InterruptedException {
		//The wait will b e updated to a WebDriverWait later on
		Thread.sleep(10000);
		driver.findElement(btn_MyBankMenu).click();
	}
}
