package managers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.HasSettings;
import io.appium.java_client.MobileElement;
import io.appium.java_client.Setting;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverManager {

	private WebDriver driver;

	public WebDriver getDriver() {
		driver = createDriver();
		return driver;
	}

	private WebDriver createDriver() {
		DesiredCapabilities caps = new DesiredCapabilities();

		/*
		 * Local Emulator settings
		 */
		caps.setCapability("platformName", "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5556");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("waitForIdleTimeout", 200);
		caps.setCapability("appPackage", "com.stanbicibtc.mobile");
		caps.setCapability("appActivity", "com.stanbicibtc.mobile.MainActivity");
			
		URL url = null;
		try {
			url = new URL("http://127.0.0.1:4723/wd/hub");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		driver = new AppiumDriver<MobileElement>(url, caps);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		return driver;
	}

	public void closeDriver() {
	//	driver.close();
	//	driver.quit();
	}
}
