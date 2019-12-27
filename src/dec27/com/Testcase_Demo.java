package dec27.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
//creating TestNG test case without main method
import org.testng.annotations.*;
public class Testcase_Demo {
	static WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		Reporter.log("Running setup",true);
	}
	@Test(description="verify register test",priority=0,invocationCount=2,enabled=true)
	public void registerlink() throws Throwable
	{
		driver.findElement(By.partialLinkText("REG")).click();
		Thread.sleep(4000);
		Reporter.log("Executing register test",true);
	}
	@Test(description="verify hotel test",priority=1,enabled=true)
	public void hotellink() throws Throwable
	{
		driver.findElement(By.partialLinkText("Hot")).click();
		Thread.sleep(4000);
		Reporter.log("Executing hotel test",true);
	}
	@Test(description="verify signon test",priority=2,enabled=true)
	public void signonlink() throws Throwable
	{
		driver.findElement(By.partialLinkText("SIG")).click();
		Thread.sleep(4000);
		Reporter.log("Executing signon test",true);
	}
	@AfterTest
	public void teardown() throws Throwable
	{
		Thread.sleep(4000);
		driver.close();
	}
}
