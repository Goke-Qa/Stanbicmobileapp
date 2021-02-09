package mobileScreens;

import java.net.MalformedURLException;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	DriverFactory driverFactory = new DriverFactory();
	
	@Before
    public void createDriverSession() throws MalformedURLException, InterruptedException{
		driverFactory.createDriver();
    }
 
    @After
    public void quitDriverSession() {
    	driverFactory.tearDown();
    }
}
