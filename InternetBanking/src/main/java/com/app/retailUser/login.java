package com.app.retailUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class login extends baseClass{

	@Test
	public void loginWithValidCredentials() throws InterruptedException {
		  driver.get("https://80.248.0.83:3443/");  
		  
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
		WebDriverWait wait = new WebDriverWait(driver, 500);
		WebElement tokenInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtpassCode")));
		tokenInput.sendKeys("12345");
		driver.findElement(By.xpath("//*[@id=\"frmOtp\"]/div[2]/div/button[1]")).click();
	}
	
	public void loginWithInValidCredentials(){
		
		//This test is pending so the account doesn't get locked
		
	}
}
