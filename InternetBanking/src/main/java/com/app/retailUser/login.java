package com.app.retailUser;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class login extends baseClass{

	@Test
	public void loginWithValidCredentials() {
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
		 
		 
	}
	
	public void loginWithInValidCredentials(){
		
		//This test is pending so the account doesn't get locked
		
	}
}
