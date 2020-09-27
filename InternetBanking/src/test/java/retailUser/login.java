package retailUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class login extends baseClass{

	@Test
	public static void  loginWithValidCredentials() throws InterruptedException {
			driver.navigate().to("https://80.248.0.83:3443/");
		  
		  /*Click on button to navigate to actual landing page
		  due to expired certificate
		  */
		 driver.findElement(By.id("details-button")) .click();
		 driver.findElement(By.id("proceed-link")).click();
		 
		 // Begins inputting login credentials
		 driver.findElement(By.id("txtusername")).sendKeys("0015969269");
		 driver.findElement(By.id("txtpassword")).sendKeys("Test@12345");
		 driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/div[4]/div/div/div/button")).click();
	
		 // Input token details
		 // Pause test execution at this point since the token page takes a while to load
		 @SuppressWarnings("deprecation")
		 WebDriverWait wait = new WebDriverWait(driver, 100);
		 WebElement tokenInput =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtpassCode")));
		 tokenInput.sendKeys("12345");
		driver.findElement(By.xpath("//*[@id=\"frmOtp\"]/div[2]/div/button[1]")).click();
		/*
		Verify that user has been navigated to the dashboard
		WebElement dashboard =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-default-layout/div/div/div/nav/a[2]/i/svg")));
		Thread.sleep(10000);
		String expectedTitle = "Online Banking";
		String actualTitle = driver.getTitle();
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("User has been logged in");
		else
			System.out.println("There was a problem while logging in");
			*/
	}
	
	@Test
	public void loginWithInValidCredentials(){
		
		System.out.println("The 'Login with Invalid Crdentials' test is pending so the valid account in use does not get locked.");
		
	}
}
