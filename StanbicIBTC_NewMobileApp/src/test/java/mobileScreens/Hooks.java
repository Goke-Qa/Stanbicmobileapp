package mobileScreens;

import context.TestContext;
import io.cucumber.java.After;

public class Hooks {

	TestContext testContext = new TestContext();
	 
	 public Hooks(TestContext context) {
	 testContext = context;
	  }
	  
    @After
   public void quitDriverSession() {
   	testContext.getDriverManager().closeDriver();
   }
}
