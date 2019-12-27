package dec14fb.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkingalert_Window {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		String alerttext=driver.switchTo().alert().getText();
		System.out.println(alerttext);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.close();
		
	}

}
