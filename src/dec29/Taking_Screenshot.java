package dec29;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Taking_Screenshot {
	WebDriver driver;
	@Test
	public void takescreen() throws Throwable
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//creating java time stamp
		DateFormat df=new SimpleDateFormat("dd_MM_yyyy hh_mm_ss");
		Date d=new Date();
		String datef=df.format(d);
		//take screen shot & store
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//copy screen into local driver
		FileUtils.copyFile(screen,new File("E://swt//screen//"+datef+"homepage.png"));
		Thread.sleep(5000);
		driver.close();
		
	}

}
