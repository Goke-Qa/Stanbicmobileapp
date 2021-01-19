package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Controller {
	private WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public void webDriver(WebDriver driver) {
		this.driver = driver;
	}
	@SuppressWarnings("deprecation")
	public void setupController() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.navigate().to("https://80.248.0.83:3443/#/auth/login");
	}
	
	public void teardownControllere() {
		if (driver != null) {
			driver.quit();
		}
	}
}
