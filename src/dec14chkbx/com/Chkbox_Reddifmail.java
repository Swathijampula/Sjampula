package dec14chkbx.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chkbox_Reddifmail {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		WebElement chkbox=driver.findElement(By.id("remember"));
		boolean value=chkbox.isSelected();
		System.out.println(value);
		if(!chkbox.isSelected())
		{
			chkbox.click();
		}
		else
		{
			chkbox.click();
		}
		Thread.sleep(5000);
		driver.close();

	}

}
