package dec20.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calander_TbleSpicejet {

	public static void main(String[] args) {
		String doj="20/May/2020";
		String dt,month,year;
		String[] temp=doj.split("/");
		dt=temp[0];
		month=temp[1];
		year=temp[2];
   String calyear,calmonth,caldt;
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
	//click on date picker
	driver.findElement(By.className("ui-datepicker-trigger")).click();
	//calyear=driver.findElement(By.className(""));
	
	
	
	}

}
