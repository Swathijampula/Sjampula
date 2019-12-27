package dec26;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class TestCaseDemo {
	
@BeforeTest
 public void beforeTest() {
		  Reporter.log("running before test",true);
	}
  @Test
  public void login() {
	  Reporter.log("executing login test",true);
  }
  
  @Test
  public void compose() {
	  Reporter.log("executing compose test",true);
  }
  @Test
  public void reply() {
	  Reporter.log("executing reply test",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("executing after test",true);  
  }

}
