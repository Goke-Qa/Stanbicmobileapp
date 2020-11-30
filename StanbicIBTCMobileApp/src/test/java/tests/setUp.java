package tests;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class setUp {
 AppiumDriver<MobileElement> driver;
	@BeforeTest
	public void appSetup() {
		try {
			DesiredCapabilities caps = new DesiredCapabilities(); 
			caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "");
			caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			caps.setCapability(MobileCapabilityType.BROWSER_NAME, "CHROME");
			//caps.setCapability(MobileCapabilityType.APP, "");

			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url,caps);
		}
		catch (Exception exp) {
			System.out.println("The cause is: " +exp.getCause());
			System.out.println("The message is: " +exp.getMessage());
			exp.printStackTrace();
		}
	}
	@Test
	public void sample() {
		System.out.println("Passed");
	}
	
	@AfterSuite
	public void tearDown() {

	}
}
