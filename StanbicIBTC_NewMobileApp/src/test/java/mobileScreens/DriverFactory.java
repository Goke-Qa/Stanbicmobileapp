package mobileScreens;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class DriverFactory {

	public static WebDriver driver;
	public static WebDriverWait waitVar;
	
	public void createDriver() throws MalformedURLException, InterruptedException{
		DesiredCapabilities caps = new DesiredCapabilities(); 
		caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		//caps.setCapability("app", "StanbicIBTC_NewMobileApp//src//test//resources//apps//MobileApp_UAT.apk");
		caps.setCapability("appPackage", "com.stanbicibtc.mobile");
		caps.setCapability("appActivity", "com.stanbicibtc.mobile.MainActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,caps);
		waitVar = new WebDriverWait (driver, 300);
	}
	
	
	public void tearDown() {
		driver.quit();
	}
}
