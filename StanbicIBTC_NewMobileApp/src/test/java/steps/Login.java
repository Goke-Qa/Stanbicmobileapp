package steps;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.*;
public class Login {
	 AppiumDriver<MobileElement> driver;
	@Given("user has launched the App")
	public void user_has_launched_the_app() throws MalformedURLException {
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
	}

	@When("user selects the MyBank menu")
	public void user_selects_the_my_bank_menu() {
	 
	}

	@And("clicks on the login arrow")
	public void clicks_on_the_login_arrow() {
	    
	}

	@Then("user is navigated to the login screen")
	public void user_is_navigated_to_the_login_screen() {
	    
	}

	@When("user enters a valid username and password")
	public void user_enters_a_valid_username_and_password() {
	    
	}

	@And("clicks on the login button")
	public void clicks_on_the_login_button() {
	    
	}

	@Then("user is navigated to the dashboard")
	public void user_is_navigated_to_the_dashboard() {
	   
	}
}
