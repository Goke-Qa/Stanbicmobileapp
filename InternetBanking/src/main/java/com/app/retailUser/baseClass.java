package com.app.retailUser;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class baseClass {
	public static WebDriver driver;  
    
    @BeforeSuite  
    public void initializeWebDriver() throws IOException {  
    	         
    try {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\A239215\\eclipse-workspace\\InternetBanking\\src\\drivers\\chromedriver.exe");  
        driver = new ChromeDriver(); 
        driver.manage().window().maximize();  
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
           	}
    
    	catch (Exception exp) {
    		System.out.println("The cause is: " +exp.getCause());
    		System.out.println("The message is: " +exp.getMessage());
    		exp.printStackTrace();
    		}

    }
  
    @AfterSuite  
    public void quitDriver() {  
         driver.quit();  
    }  
    
}
