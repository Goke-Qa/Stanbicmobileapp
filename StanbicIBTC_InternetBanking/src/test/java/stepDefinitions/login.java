package stepDefinitions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.loginPage;
import Pages.tokenPage;
import Pages.httpErrorPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login{
	WebDriver driver;
	static httpErrorPage httpErrorPage;
	static loginPage loginPage;
	static tokenPage tokenPage;

	@SuppressWarnings("deprecation")
	@Before
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();  
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

	@Given("user has entered a valid URL")
	public void user_has_entered_a_valid_url() {
		driver.navigate().to("https://80.248.0.83:3443/#/auth/login");
	}

	@When("user clicks on the Advanced button")
	public void user_clicks_on_the_advanced_button() {
		httpErrorPage = new httpErrorPage(driver);
		httpErrorPage.clickAdvancedButton();
	}

	@And("clicks on the proceed button")
	public void clicks_on_the_proceed_button() {
		httpErrorPage.clickRedirectLink();
	}

	@Then("user is navigated to the login page")
	public void user_is_navigated_to_the_login_page() {
		loginPage = new loginPage(driver);
		loginPage.checkLoginButton();
	}

	@When("user enters valid {string} and {string}")
	public void user_enters_valid_and_test(String username, String password) {
		loginPage.setLoginUserID(username);
		loginPage.setPassword(password);

	}

	@And("clicks on the login button")
	public void clicks_on_the_login_button() {
		tokenPage = new tokenPage(driver);
		loginPage.clickLoginButton();
		tokenPage.getTokenPageName();
	}

	@Then("user is directed to the token page")
	public void user_is_directed_to_the_token_page() {
		driver.getPageSource().contains("WELCOME");
	}

	@When("user enters a valid token")
	public void user_enters_a_valid_token() {
		tokenPage.setTokenInput("12345");
	}

	@And("clicks on the continue  button")
	public void clicks_on_the_continue_button() {
		tokenPage.clickContinueButton();
	}

	@Then("user is navigated to the dashboard")
	public void user_is_navigated_to_the_dashboard() {
		tokenPage.checkDashboardPage();
	}


}
